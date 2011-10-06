/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.core.internal.v2_3.context.orm;

import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.jpa.core.context.XmlContextNode;
import org.eclipse.jpt.jpa.core.internal.context.NamedColumnTextRangeResolver;
import org.eclipse.jpt.jpa.core.internal.context.orm.AbstractOrmVirtualNamedDiscriminatorColumn;
import org.eclipse.jpt.jpa.core.internal.context.orm.OrmTableColumnTextRangeResolver;
import org.eclipse.jpt.jpa.eclipselink.core.v2_3.context.ReadOnlyTenantDiscriminatorColumn;
import org.eclipse.jpt.jpa.eclipselink.core.v2_3.context.orm.OrmReadOnlyTenantDiscriminatorColumn;
import org.eclipse.jpt.jpa.eclipselink.core.v2_3.context.orm.OrmVirtualTenantDiscriminatorColumn;

/**
 * <code>orm.xml</code> virtual tenant discriminator column
 */
public class GenericOrmVirtualTenantDiscriminatorColumn
	extends AbstractOrmVirtualNamedDiscriminatorColumn<OrmReadOnlyTenantDiscriminatorColumn.Owner, ReadOnlyTenantDiscriminatorColumn>
	implements OrmVirtualTenantDiscriminatorColumn
{
	protected final ReadOnlyTenantDiscriminatorColumn overriddenColumn;

	protected String specifiedTable;
	protected String defaultTable;

	protected String specifiedContextProperty;
	protected String defaultContextProperty;

	protected Boolean specifiedPrimaryKey;
	protected boolean defaultPrimaryKey;


	public GenericOrmVirtualTenantDiscriminatorColumn(XmlContextNode parent, OrmReadOnlyTenantDiscriminatorColumn.Owner owner, ReadOnlyTenantDiscriminatorColumn overridenColumn) {
		super(parent, owner);
		this.overriddenColumn = overridenColumn;
	}


	// ********** synchronize/update **********

	@Override
	public void update() {
		super.update();

		this.setSpecifiedTable(this.buildSpecifiedTable());
		this.setDefaultTable(this.buildDefaultTable());

		this.setSpecifiedContextProperty(this.buildSpecifiedContextProperty());
		this.setDefaultContextProperty(this.buildDefaultContextProperty());

		this.setSpecifiedPrimaryKey(this.buildSpecifiedPrimaryKey());
		this.setDefaultPrimaryKey(this.buildDefaultPrimaryKey());
	}


	// ********** column **********

	@Override
	public ReadOnlyTenantDiscriminatorColumn getOverriddenColumn() {
		return this.overriddenColumn;
	}

	@Override
	public boolean isVirtual() {
		return true;
	}


	// ********** table **********

	public String getTable() {
		return (this.specifiedTable != null) ? this.specifiedTable : this.defaultTable;
	}

	public String getSpecifiedTable() {
		return this.specifiedTable;
	}

	protected void setSpecifiedTable(String table) {
		String old = this.specifiedTable;
		this.specifiedTable = table;
		this.firePropertyChanged(SPECIFIED_TABLE_PROPERTY, old, table);
	}

	protected String buildSpecifiedTable() {
		return this.getOverriddenColumn().getSpecifiedTable();
	}

	public String getDefaultTable() {
		return this.defaultTable;
	}

	protected void setDefaultTable(String table) {
		String old = this.defaultTable;
		this.defaultTable = table;
		this.firePropertyChanged(DEFAULT_TABLE_PROPERTY, old, table);
	}

	protected String buildDefaultTable() {
		return this.owner.getDefaultTableName();
	}

	// ********** context property **********

	public String getContextProperty() {
		return (this.specifiedContextProperty != null) ? this.specifiedContextProperty : this.defaultContextProperty;
	}

	public String getSpecifiedContextProperty() {
		return this.specifiedContextProperty;
	}

	protected void setSpecifiedContextProperty(String contextProperty) {
		String old = this.specifiedContextProperty;
		this.specifiedContextProperty = contextProperty;
		this.firePropertyChanged(SPECIFIED_CONTEXT_PROPERTY_PROPERTY, old, contextProperty);
	}

	protected String buildSpecifiedContextProperty() {
		return this.getOverriddenColumn().getSpecifiedContextProperty();
	}

	public String getDefaultContextProperty() {
		return this.defaultContextProperty;
	}

	protected void setDefaultContextProperty(String contextProperty) {
		String old = this.defaultContextProperty;
		this.defaultContextProperty = contextProperty;
		this.firePropertyChanged(DEFAULT_CONTEXT_PROPERTY_PROPERTY, old, contextProperty);
	}

	protected String buildDefaultContextProperty() {
		return this.owner.getDefaultContextPropertyName();
	}


	// ********** primary key **********

	public boolean isPrimaryKey() {
		return (this.specifiedPrimaryKey != null) ? this.specifiedPrimaryKey.booleanValue() : this.defaultPrimaryKey;
	}

	public Boolean getSpecifiedPrimaryKey() {
		return this.specifiedPrimaryKey;
	}

	protected void setSpecifiedPrimaryKey(Boolean primaryKey) {
		Boolean old = this.specifiedPrimaryKey;
		this.specifiedPrimaryKey = primaryKey;
		this.firePropertyChanged(SPECIFIED_PRIMARY_KEY_PROPERTY, old, primaryKey);
	}

	protected Boolean buildSpecifiedPrimaryKey() {
		return this.getOverriddenColumn().getSpecifiedPrimaryKey();
	}

	public boolean isDefaultPrimaryKey() {
		return this.defaultPrimaryKey;
	}

	protected void setDefaultPrimaryKey(boolean primaryKey) {
		boolean old = this.defaultPrimaryKey;
		this.defaultPrimaryKey = primaryKey;
		this.firePropertyChanged(DEFAULT_PRIMARY_KEY_PROPERTY, old, primaryKey);
	}

	protected boolean buildDefaultPrimaryKey() {
		return this.owner.getDefaultPrimaryKey();
	}


	// ********** misc **********

	public boolean tableNameIsInvalid() {
		return this.owner.tableNameIsInvalid(this.getTable());
	}

	public Iterable<String> getCandidateTableNames() {
		return this.owner.getCandidateTableNames();
	}


	// ********** validation **********

	public TextRange getTableTextRange() {
		return this.getValidationTextRange();
	}

	@Override
	protected NamedColumnTextRangeResolver buildTextRangeResolver() {
		return new OrmTableColumnTextRangeResolver(this);
	}
}