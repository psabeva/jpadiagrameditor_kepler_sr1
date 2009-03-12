/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.jpt.core.context.java.JavaJoinColumn;
import org.eclipse.jpt.core.context.java.JavaJoinTable;
import org.eclipse.jpt.core.context.java.JavaUniqueConstraint;
import org.eclipse.jpt.core.context.orm.OrmTypeMapping;
import org.eclipse.jpt.core.resource.orm.OrmPackage;
import org.eclipse.jpt.core.resource.orm.XmlJoinColumn;
import org.eclipse.jpt.core.resource.orm.XmlJoinTable;
import org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint;
import org.eclipse.jpt.core.resource.xml.AbstractJpaEObject;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.utility.internal.CollectionTools;

public class VirtualXmlJoinTable extends AbstractJpaEObject implements XmlJoinTable
{
	protected OrmTypeMapping ormTypeMapping;
	protected JavaJoinTable javaJoinTable;	

	protected VirtualXmlJoinTable(OrmTypeMapping ormTypeMapping, JavaJoinTable javaJoinTable) {
		super();
		this.ormTypeMapping = ormTypeMapping;
		this.javaJoinTable = javaJoinTable;
	}
	
	protected boolean isOrmMetadataComplete() {
		return this.ormTypeMapping.isMetadataComplete();
	}
	
	public String getName() {
		if (this.javaJoinTable == null) {
			return null;
		}
		if (this.isOrmMetadataComplete()) {
			return this.javaJoinTable.getDefaultName();
		}
		return this.javaJoinTable.getName();		
	}

	public void setName(@SuppressWarnings("unused") String value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}

	public String getCatalog() {
		if (this.javaJoinTable == null) {
			return null;
		}
		if (this.isOrmMetadataComplete()) {
			return this.javaJoinTable.getDefaultCatalog();
		}
		return this.javaJoinTable.getCatalog();
	}

	public void setCatalog(@SuppressWarnings("unused") String value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}

	public String getSchema() {
		if (this.javaJoinTable == null) {
			return null;
		}
		if (this.isOrmMetadataComplete()) {
			return this.javaJoinTable.getDefaultSchema();
		}
		return this.javaJoinTable.getSchema();
	}

	public void setSchema(@SuppressWarnings("unused") String value) {
		throw new UnsupportedOperationException("cannot set values on a virtual mapping"); //$NON-NLS-1$
	}
	
	//VirtualXmlJoinTable is rebuilt every time, so just rebuilding the joinColumns list as well
	public EList<XmlJoinColumn> getJoinColumns() {
		EList<XmlJoinColumn> joinColumns = new EObjectContainmentEList<XmlJoinColumn>(XmlJoinColumn.class, this, OrmPackage.XML_JOIN_TABLE__JOIN_COLUMNS);
		if (this.javaJoinTable == null) {
			return joinColumns;
		}
		for (JavaJoinColumn joinColumn : CollectionTools.iterable(this.javaJoinTable.specifiedJoinColumns())) {
			XmlJoinColumn xmlJoinColumn = new VirtualXmlJoinColumn(joinColumn, isOrmMetadataComplete());
			joinColumns.add(xmlJoinColumn);
		}
		return joinColumns;
	}
	
	//VirtualXmlJoinTable is rebuilt every time, so just rebuilding the joinColumns list as well
	public EList<XmlJoinColumn> getInverseJoinColumns() {
		EList<XmlJoinColumn> inverseJoinColumns = new EObjectContainmentEList<XmlJoinColumn>(XmlJoinColumn.class, this, OrmPackage.XML_JOIN_TABLE__INVERSE_JOIN_COLUMNS);
		if (this.javaJoinTable == null) {
			return inverseJoinColumns;
		}
		for (JavaJoinColumn joinColumn : CollectionTools.iterable(this.javaJoinTable.specifiedInverseJoinColumns())) {
			XmlJoinColumn xmlJoinColumn = new VirtualXmlJoinColumn(joinColumn, isOrmMetadataComplete());
			inverseJoinColumns.add(xmlJoinColumn);
		}

		return inverseJoinColumns;
	}

	public EList<XmlUniqueConstraint> getUniqueConstraints() {
		EList<XmlUniqueConstraint> xmlUniqueConstraints = new EObjectContainmentEList<XmlUniqueConstraint>(XmlUniqueConstraint.class, this, OrmPackage.XML_JOIN_TABLE__UNIQUE_CONSTRAINTS);
		if (this.javaJoinTable == null) {
			return xmlUniqueConstraints;
		}
		for (JavaUniqueConstraint uniqueConstraint : CollectionTools.iterable(this.javaJoinTable.uniqueConstraints())) {
			XmlUniqueConstraint xmlUniqueConstraint = new VirtualXmlUniqueConstraint(uniqueConstraint, isOrmMetadataComplete());
			xmlUniqueConstraints.add(xmlUniqueConstraint);
		}

		return xmlUniqueConstraints;
	}
	
	public TextRange getNameTextRange() {
		return null;
	}
	
	public TextRange getCatalogTextRange() {
		return null;
	}
	
	public TextRange getSchemaTextRange() {
		return null;
	}

	public boolean isSpecified() {
		return this.javaJoinTable != null;
	}
}
