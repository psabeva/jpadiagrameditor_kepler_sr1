/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jpt.core.internal.IJpaProject;
import org.eclipse.jpt.ui.internal.details.IJpaDetailsProvider;
import org.eclipse.jpt.ui.internal.generic.EntitiesGenerator;
import org.eclipse.jpt.ui.internal.java.details.JavaDetailsProvider;
import org.eclipse.jpt.ui.internal.java.structure.JavaStructureProvider;
import org.eclipse.jpt.ui.internal.structure.IJpaStructureProvider;
import org.eclipse.jpt.ui.internal.xml.details.XmlDetailsProvider;
import org.eclipse.jpt.ui.internal.xml.structure.XmlStructureProvider;

public abstract class BaseJpaPlatformUi implements IJpaPlatformUi
{
	private Collection<IJpaDetailsProvider> detailsProviders;
	private Collection<IJpaStructureProvider> structureProviders;
	
	protected BaseJpaPlatformUi() {
		super();
	}

	// ********** behavior **********
	
	public Collection<IJpaDetailsProvider> detailsProviders() {
		if (this.detailsProviders == null) {
			this.detailsProviders = this.buildJpaDetailsProvider();
		}
		return this.detailsProviders;
	}
		
	protected Collection<IJpaDetailsProvider> buildJpaDetailsProvider() {
		Collection<IJpaDetailsProvider> detailsProviders = new ArrayList<IJpaDetailsProvider>();
		detailsProviders.add(new JavaDetailsProvider());
		detailsProviders.add(new XmlDetailsProvider());
		return detailsProviders;
	}
	
	public Collection<IJpaStructureProvider> structureProviders() {
		if (this.structureProviders == null) {
			this.structureProviders = this.buildJpaStructureProvider();
		}
		return this.structureProviders;
	}
	
	protected Collection<IJpaStructureProvider> buildJpaStructureProvider() {
		Collection<IJpaStructureProvider> structureProviders = new ArrayList<IJpaStructureProvider>();
		structureProviders.add(new JavaStructureProvider());
		structureProviders.add(new XmlStructureProvider());
		return structureProviders;
	}

	public void generateEntities(IJpaProject project, IStructuredSelection selection) {

		EntitiesGenerator.generate(project, selection);
	}
	
}
