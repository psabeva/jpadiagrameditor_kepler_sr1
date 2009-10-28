/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.v2_0.context.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jpt.core.context.orm.OrmTypeMapping;
import org.eclipse.jpt.core.internal.jpa2.context.orm.VirtualXmlElementCollection2_0;
import org.eclipse.jpt.core.jpa2.context.java.JavaElementCollectionMapping2_0;
import org.eclipse.jpt.core.resource.orm.AccessType;
import org.eclipse.jpt.core.resource.orm.EnumType;
import org.eclipse.jpt.core.resource.orm.TemporalType;
import org.eclipse.jpt.core.resource.orm.XmlColumn;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlAccessMethods;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlElementCollection;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlProperty;

/**
 * VirtualBasic is an implementation of Basic used when there is 
 * no tag in the orm.xml and an underlying javaBasicMapping exists.
 */
public class VirtualEclipseLinkXmlElementCollection2_0 extends XmlElementCollection
{
	protected OrmTypeMapping ormTypeMapping;
	
	protected final JavaElementCollectionMapping2_0 javaAttributeMapping;

	protected final VirtualXmlElementCollection2_0 virtualXmlElementCollection;
	
	public VirtualEclipseLinkXmlElementCollection2_0(OrmTypeMapping ormTypeMapping, JavaElementCollectionMapping2_0 javaMapping) {
		super();
		this.ormTypeMapping = ormTypeMapping;
		this.javaAttributeMapping = javaMapping;
		this.virtualXmlElementCollection = new VirtualXmlElementCollection2_0(ormTypeMapping, javaMapping);
	}
	
	protected boolean isOrmMetadataComplete() {
		return this.ormTypeMapping.isMetadataComplete();
	}
	
	@Override
	public String getMappingKey() {
		return this.virtualXmlElementCollection.getMappingKey();
	}
	
	@Override
	public String getName() {
		return this.virtualXmlElementCollection.getName();
	}

	@Override
	public void setName(String newName) {
		this.virtualXmlElementCollection.setName(newName);
	}
	
	@Override
	public TextRange getNameTextRange() {
		return this.virtualXmlElementCollection.getNameTextRange();
	}

	@Override
	public XmlColumn getColumn() {
		return this.virtualXmlElementCollection.getColumn();
	}

	@Override
	public void setColumn(XmlColumn value) {
		this.virtualXmlElementCollection.setColumn(value);
	}

	@Override
	public TemporalType getTemporal() {
		return this.virtualXmlElementCollection.getTemporal();
	}

	@Override
	public void setTemporal(TemporalType newTemporal){
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	@Override
	public EnumType getEnumerated() {
		return this.virtualXmlElementCollection.getEnumerated();
	}
	
	@Override
	public void setEnumerated(EnumType value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	@Override
	public boolean isLob() {
		return this.virtualXmlElementCollection.isLob();
	}
	
	@Override
	public void setLob(boolean value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}	
	
	@Override
	public TextRange getEnumeratedTextRange() {
		return this.virtualXmlElementCollection.getEnumeratedTextRange();
	}
	
	@Override
	public TextRange getLobTextRange() {
		return this.virtualXmlElementCollection.getLobTextRange();
	}
	
	@Override
	public TextRange getTemporalTextRange() {
		return this.virtualXmlElementCollection.getTemporalTextRange();
	}
	
	@Override
	public XmlAccessMethods getAccessMethods() {
		return null;
	}
	
	@Override
	public void setAccessMethods(XmlAccessMethods value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$		
	}
	
	@Override
	public EList<XmlProperty> getProperties() {
		// TODO get from java annotations
		return null;
	}	
	
	@Override
	public AccessType getAccess() {
		return this.virtualXmlElementCollection.getAccess();
	}
	
	@Override
	public void setAccess(AccessType value) {
		this.virtualXmlElementCollection.setAccess(value);
	}
}