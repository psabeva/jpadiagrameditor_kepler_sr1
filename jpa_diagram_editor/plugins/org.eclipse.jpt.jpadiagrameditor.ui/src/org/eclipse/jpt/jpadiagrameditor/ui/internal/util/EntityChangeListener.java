/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2012 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stefan Dimov - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.jpt.jpadiagrameditor.ui.internal.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jpt.jpa.core.JpaPreferences;
import org.eclipse.jpt.jpa.core.context.MappedByRelationship;
import org.eclipse.jpt.jpa.core.context.MappedByRelationshipStrategy;
import org.eclipse.jpt.jpa.core.context.PersistentType;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeMapping;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedPersistentAttribute;
import org.eclipse.jpt.jpa.core.context.java.JavaPersistentType;
import org.eclipse.jpt.jpa.core.context.java.JavaRelationshipMapping;
import org.eclipse.jpt.jpa.core.context.persistence.PersistenceUnit;
import org.eclipse.jpt.jpa.core.internal.context.java.JavaNullTypeMapping;
import org.eclipse.jpt.jpa.core.resource.java.OwnableRelationshipMappingAnnotation;
import org.eclipse.jpt.jpadiagrameditor.ui.internal.JPADiagramEditorPlugin;
import org.eclipse.jpt.jpadiagrameditor.ui.internal.feature.RemoveAndSaveEntityFeature;
import org.eclipse.jpt.jpadiagrameditor.ui.internal.provider.IJPAEditorFeatureProvider;
import org.eclipse.swt.widgets.Display;


@SuppressWarnings("restriction")
public class EntityChangeListener extends Thread {

	private final static int PAUSE_DURATION = 250;
	private boolean goOn = true;
	private JPASolver solver;
	private IJPAEditorFeatureProvider featureProvider;
	private Set<String> jptsToUpdate = new HashSet<String>(); 
	private Hashtable<String, PersistenceUnit> attribsToUpdate = new Hashtable<String, PersistenceUnit>(); 
	public final static String SEPARATOR = ";";		//$NON-NLS-1$
	
	EntityChangeListener(JPASolver solver) {
		this.solver = solver;
	}
	
	public void setFeatureProvider(IJPAEditorFeatureProvider featureProvider) {
		this.featureProvider = featureProvider;
	}
				
	@Override
	public void run() {
		UpdateFromModel taskClass = new UpdateFromModel();
		while (goOn) {
			try {
				Thread.sleep(PAUSE_DURATION);
			} catch (InterruptedException e) {
				JPADiagramEditorPlugin.logError("Thread sleep interruprted", e); //$NON-NLS-1$				
			}
			Display.getDefault().asyncExec(taskClass);
		}
		solver = null;
		featureProvider = null;
	}
	
	public void stopThread() {
		goOn = false;
	}
	
	public void addJPTForUpdate(String jptName) {
		synchronized (jptsToUpdate) {
			jptsToUpdate.add(jptName);
		}
	}
			
	public void addAttribForUpdate(PersistenceUnit pu, String entAtMappedBy) {
		synchronized (attribsToUpdate) {
			attribsToUpdate.put(entAtMappedBy, pu);
		}
	}
			
	private class UpdateFromModel implements Runnable {
		public void run() {
			exec();
		}

		
		private void exec() {
			try {
				synchronized (jptsToUpdate) {
					Iterator<String> itr = jptsToUpdate.iterator();
					if (itr.hasNext()) {
						String jptName = itr.next();
						JavaPersistentType jpt = (JavaPersistentType)featureProvider.getBusinessObjectForKey(jptName);
						try {
							JpaArtifactFactory.instance().remakeRelations(featureProvider, null, jpt);
							jptsToUpdate.remove(jptName);
						} catch (RuntimeException e) {} 
					}
				}
				Collection<Object> vals = solver.getVisualizedObjects();
				Iterator<Object> it = vals.iterator();
				while (it.hasNext()) {
					Object o = it.next();
					if (o instanceof JavaPersistentType) {
						JavaPersistentType jpt = (JavaPersistentType)o;
						final ContainerShape entShape = (ContainerShape)featureProvider.getPictogramElementForBusinessObject(o);
						if (entShape == null) 
							continue;
						PersistenceUnit pu = JpaArtifactFactory.instance().getPersistenceUnit(jpt);
						PersistentType pt = pu.getPersistentType(jpt.getName());
						
						if ((pt == null) || !JpaArtifactFactory.instance().hasAnyAnnotationType(jpt)) {
														
							JpaArtifactFactory.instance().forceSaveEntityClass(jpt, featureProvider);
							
							if(jpt.getMapping() == null || (jpt.getMapping() instanceof JavaNullTypeMapping)) {
								if (! JpaPreferences.getDiscoverAnnotatedClasses(jpt.getJpaProject().getProject())) {
									JPAEditorUtil.createUnregisterEntityFromXMLJob(jpt.getJpaProject(), jpt.getName());
								}
							}
							
							RemoveContext ctx = new RemoveContext(entShape);
							RemoveAndSaveEntityFeature ft = new RemoveAndSaveEntityFeature(featureProvider);
							ft.remove(ctx);
							break;
						}
					}
				}		
				synchronized (attribsToUpdate) {
					Set<String> atSet = attribsToUpdate.keySet();
					Iterator<String> iter = atSet.iterator();
					while (iter.hasNext()) {
						String jptAtMB = iter.next();
						String[] jptAndAttrib = jptAtMB.split(SEPARATOR); 
						PersistenceUnit pu = attribsToUpdate.get(jptAtMB);
						String entityName = jptAndAttrib[0];
						String attribName = jptAndAttrib[1];
						String mappedBy = jptAndAttrib[2];
						String oldMappedBy = jptAndAttrib[3];
						JavaPersistentType jpt = (JavaPersistentType)pu.getPersistentType(entityName);
						if (jpt != null) {
							JavaSpecifiedPersistentAttribute jpa = jpt.getAttributeNamed(attribName);
							if (jpa != null) {
								JavaAttributeMapping mapping = jpa.getMapping();
								if (OwnableRelationshipMappingAnnotation.class.isInstance(mapping.getMappingAnnotation())) {
									JavaRelationshipMapping relationshipMapping = (JavaRelationshipMapping)mapping; 
									MappedByRelationship ownableRef = (MappedByRelationship)relationshipMapping.getRelationship();
									if (!ownableRef.strategyIsMappedBy()) {
									    ownableRef.setStrategyToMappedBy();
									}
									MappedByRelationshipStrategy mappedByStrategy = ownableRef.getMappedByStrategy();
									String mappedByAttr = mappedByStrategy.getMappedByAttribute();
																		
									String[] mappedByAttrs = mappedByAttr.split("\\."); //$NON-NLS-1$
									if(mappedByAttrs.length > 1){
										if(mappedByAttrs[0].equals(oldMappedBy)){
											mappedByAttr = mappedBy + "." + mappedByAttrs[1]; //$NON-NLS-1$
										} else if(mappedByAttrs[1].equals(oldMappedBy)){
											mappedByAttr = mappedByAttrs[0] + "." + mappedBy; //$NON-NLS-1$
										}
									} else {
										mappedByAttr = mappedBy;
									}
									mappedByStrategy.setMappedByAttribute(mappedByAttr);
									
									
//									if(mappedByAttrs.length > 1){
//										if(mappedByAttrs[0].equals(oldAt.getName())){
//											mappedBy = newAt.getName() + "." + mappedByAttrs[1];
//										} else if(mappedByAttrs[1].equals(oldAt.getName())){
//											mappedBy = mappedByAttrs[0] + "." + newAt.getName();
//										}
//									} else {
//										mappedBy = newAt.getName();
									jpt.update();
									attribsToUpdate.remove(jptAtMB);
								}
							}
						}
					}
				}
			} catch(Exception e) {
				//ignore 
			}			
		}
	}
}
