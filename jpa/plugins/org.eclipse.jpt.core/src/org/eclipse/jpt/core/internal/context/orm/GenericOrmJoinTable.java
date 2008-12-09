/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.eclipse.jpt.core.context.AttributeMapping;
import org.eclipse.jpt.core.context.BaseJoinColumn;
import org.eclipse.jpt.core.context.Entity;
import org.eclipse.jpt.core.context.JoinColumn;
import org.eclipse.jpt.core.context.JoinTable;
import org.eclipse.jpt.core.context.NonOwningMapping;
import org.eclipse.jpt.core.context.PersistentAttribute;
import org.eclipse.jpt.core.context.RelationshipMapping;
import org.eclipse.jpt.core.context.TypeMapping;
import org.eclipse.jpt.core.context.orm.OrmJoinColumn;
import org.eclipse.jpt.core.context.orm.OrmJoinTable;
import org.eclipse.jpt.core.context.orm.OrmRelationshipMapping;
import org.eclipse.jpt.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.core.internal.validation.JpaValidationMessages;
import org.eclipse.jpt.core.resource.orm.OrmFactory;
import org.eclipse.jpt.core.resource.orm.XmlJoinColumn;
import org.eclipse.jpt.core.resource.orm.XmlJoinTable;
import org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.iterators.CloneListIterator;
import org.eclipse.jpt.utility.internal.iterators.EmptyListIterator;
import org.eclipse.jpt.utility.internal.iterators.SingleElementListIterator;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;

/**
 * 
 */
public class GenericOrmJoinTable
	extends AbstractOrmTable
	implements OrmJoinTable
{

	protected final List<OrmJoinColumn> specifiedJoinColumns;
	protected OrmJoinColumn defaultJoinColumn;

	protected final List<OrmJoinColumn> specifiedInverseJoinColumns;
	protected OrmJoinColumn defaultInverseJoinColumn;
	
	protected XmlRelationshipMapping relationshipMappingResource;
	

	public GenericOrmJoinTable(OrmRelationshipMapping parent) {
		super(parent);
		this.specifiedJoinColumns = new ArrayList<OrmJoinColumn>();
		this.specifiedInverseJoinColumns = new ArrayList<OrmJoinColumn>();
	}
	
	@Override
	public OrmRelationshipMapping getParent() {
		return (OrmRelationshipMapping) super.getParent();
	}
	
	public OrmRelationshipMapping getRelationshipMapping() {
		return getParent();
	}

	public void initializeFrom(JoinTable oldJoinTable) {
		super.initializeFrom(oldJoinTable);
		int index = 0;
		for (JoinColumn joinColumn : CollectionTools.iterable(oldJoinTable.specifiedJoinColumns())) {
			OrmJoinColumn newJoinColumn = addSpecifiedJoinColumn(index++);
			newJoinColumn.initializeFrom(joinColumn);
		}
		index = 0;
		for (JoinColumn joinColumn : CollectionTools.iterable(oldJoinTable.specifiedInverseJoinColumns())) {
			OrmJoinColumn newJoinColumn = addSpecifiedInverseJoinColumn(index++);
			newJoinColumn.initializeFrom(joinColumn);
		}
	}
	
	//******************* AbstractOrmTable implementation *****************
	
	@Override
	protected String buildDefaultName() {
		return this.getRelationshipMapping().getJoinTableDefaultName();
	}
	
	/**
	 * if the join table is on the "mappedBy" side, it's bogus;
	 * so don't give it a default schema
	 */
	@Override
	protected String buildDefaultSchema() {
		return this.getRelationshipMapping().isRelationshipOwner() ? this.getContextDefaultSchema() : null;
	}

	/**
	 * if the join table is on the "mappedBy" side, it's bogus;
	 * so don't give it a default catalog
	 */
	@Override
	protected String buildDefaultCatalog() {
		return this.getRelationshipMapping().isRelationshipOwner() ? this.getContextDefaultCatalog() : null;
	}
	
	@Override
	protected XmlJoinTable getResourceTable() {
		return this.relationshipMappingResource.getJoinTable();
	}

	@Override
	protected XmlJoinTable addResourceTable() {
		XmlJoinTable resourceTable = OrmFactory.eINSTANCE.createXmlJoinTableImpl();
		this.relationshipMappingResource.setJoinTable(resourceTable);
		return resourceTable;
	}

	@Override
	protected void removeResourceTable() {
		this.relationshipMappingResource.setJoinTable(null);
	}
	
	
	//******************* JoinTable implementation *****************

	//****************** join columns **********************
	public ListIterator<OrmJoinColumn> joinColumns() {
		return this.containsSpecifiedJoinColumns() ? this.specifiedJoinColumns() : this.defaultJoinColumns();
	}
	
	public int joinColumnsSize() {
		return this.containsSpecifiedJoinColumns() ? this.specifiedJoinColumnsSize() : this.defaultJoinColumnsSize();
	}

	public ListIterator<OrmJoinColumn> specifiedJoinColumns() {
		return new CloneListIterator<OrmJoinColumn>(this.specifiedJoinColumns);
	}

	public int specifiedJoinColumnsSize() {
		return this.specifiedJoinColumns.size();
	}
	
	protected ListIterator<OrmJoinColumn> defaultJoinColumns() {
		if (this.defaultJoinColumn != null) {
			return new SingleElementListIterator<OrmJoinColumn>(this.defaultJoinColumn);
		}
		return EmptyListIterator.instance();
	}
	
	protected int defaultJoinColumnsSize() {
		return (this.defaultJoinColumn == null) ? 0 : 1;
	}
	
	public OrmJoinColumn getDefaultJoinColumn() {
		return this.defaultJoinColumn;
	}
	
	protected void setDefaultJoinColumn(OrmJoinColumn newJoinColumn) {
		OrmJoinColumn oldJoinColumn = this.defaultJoinColumn;
		this.defaultJoinColumn = newJoinColumn;
		firePropertyChanged(JoinTable.DEFAULT_JOIN_COLUMN, oldJoinColumn, newJoinColumn);
	}

	public boolean containsSpecifiedJoinColumns() {
		return !this.specifiedJoinColumns.isEmpty();
	}

	public OrmJoinColumn addSpecifiedJoinColumn(int index) {
		if (getResourceTable() == null) {
			addResourceTable();
		}
		XmlJoinColumn resourceJoinColumn = OrmFactory.eINSTANCE.createXmlJoinColumnImpl();
		OrmJoinColumn contextJoinColumn = buildJoinColumn(resourceJoinColumn);
		this.specifiedJoinColumns.add(index, contextJoinColumn);
		this.getResourceTable().getJoinColumns().add(index, resourceJoinColumn);
		this.fireItemAdded(JoinTable.SPECIFIED_JOIN_COLUMNS_LIST, index, contextJoinColumn);
		return contextJoinColumn;
	}

	protected void addSpecifiedJoinColumn(int index, OrmJoinColumn joinColumn) {
		addItemToList(index, joinColumn, this.specifiedJoinColumns, JoinTable.SPECIFIED_JOIN_COLUMNS_LIST);
	}

	protected void addSpecifiedJoinColumn(OrmJoinColumn joinColumn) {
		this.addSpecifiedJoinColumn(this.specifiedJoinColumns.size(), joinColumn);
	}

	public void removeSpecifiedJoinColumn(JoinColumn joinColumn) {
		this.removeSpecifiedJoinColumn(this.specifiedJoinColumns.indexOf(joinColumn));
	}
	
	public void removeSpecifiedJoinColumn(int index) {
		OrmJoinColumn removedJoinColumn = this.specifiedJoinColumns.remove(index);
		if (!containsSpecifiedJoinColumns()) {
			//create the defaultJoinColumn now or this will happen during project update 
			//after removing the join column from the resource model. That causes problems 
			//in the UI because the change notifications end up in the wrong order.
			this.defaultJoinColumn = buildJoinColumn(null);
		}
		this.getResourceTable().getJoinColumns().remove(index);
		fireItemRemoved(JoinTable.SPECIFIED_JOIN_COLUMNS_LIST, index, removedJoinColumn);
		if (this.defaultJoinColumn != null) {
			//fire change notification if a defaultJoinColumn was created above
			this.firePropertyChanged(JoinTable.DEFAULT_JOIN_COLUMN, null, this.defaultJoinColumn);
		}
	}

	protected void removeSpecifiedJoinColumn_(OrmJoinColumn joinColumn) {
		removeItemFromList(joinColumn, this.specifiedJoinColumns, JoinTable.SPECIFIED_JOIN_COLUMNS_LIST);
	}
	
	public void moveSpecifiedJoinColumn(int targetIndex, int sourceIndex) {
		CollectionTools.move(this.specifiedJoinColumns, targetIndex, sourceIndex);
		this.getResourceTable().getJoinColumns().move(targetIndex, sourceIndex);
		fireItemMoved(JoinTable.SPECIFIED_JOIN_COLUMNS_LIST, targetIndex, sourceIndex);		
	}
	
	
	//****************** inverse join columns **********************

	public ListIterator<OrmJoinColumn> inverseJoinColumns() {
		return this.containsSpecifiedInverseJoinColumns() ? this.specifiedInverseJoinColumns() : this.defaultInverseJoinColumns();
	}
	
	public int inverseJoinColumnsSize() {
		return this.containsSpecifiedInverseJoinColumns() ? this.specifiedInverseJoinColumnsSize() : this.defaultInverseJoinColumnsSize();
	}

	public ListIterator<OrmJoinColumn> specifiedInverseJoinColumns() {
		return new CloneListIterator<OrmJoinColumn>(this.specifiedInverseJoinColumns);
	}

	public int specifiedInverseJoinColumnsSize() {
		return this.specifiedInverseJoinColumns.size();
	}
	
	protected ListIterator<OrmJoinColumn> defaultInverseJoinColumns() {
		if (this.defaultInverseJoinColumn != null) {
			return new SingleElementListIterator<OrmJoinColumn>(this.defaultInverseJoinColumn);
		}
		return EmptyListIterator.instance();
	}
	
	protected int defaultInverseJoinColumnsSize() {
		return (this.defaultInverseJoinColumn == null) ? 0 : 1;
	}

	public OrmJoinColumn getDefaultInverseJoinColumn() {
		return this.defaultInverseJoinColumn;
	}
	
	protected void setDefaultInverseJoinColumn(OrmJoinColumn newJoinColumn) {
		OrmJoinColumn oldJoinColumn = this.defaultInverseJoinColumn;
		this.defaultInverseJoinColumn = newJoinColumn;
		firePropertyChanged(JoinTable.DEFAULT_INVERSE_JOIN_COLUMN, oldJoinColumn, newJoinColumn);
	}
	
	public boolean containsSpecifiedInverseJoinColumns() {
		return !this.specifiedInverseJoinColumns.isEmpty();
	}

	public OrmJoinColumn addSpecifiedInverseJoinColumn(int index) {
		if (getResourceTable() == null) {
			addResourceTable();
		}
		XmlJoinColumn resourceJoinColumn = OrmFactory.eINSTANCE.createXmlJoinColumnImpl();
		OrmJoinColumn contextJoinColumn = buildInverseJoinColumn(resourceJoinColumn);
		this.specifiedInverseJoinColumns.add(index, contextJoinColumn);
		this.getResourceTable().getInverseJoinColumns().add(index, resourceJoinColumn);
		this.fireItemAdded(JoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST, index, contextJoinColumn);
		return contextJoinColumn;
	}
	
	protected void addSpecifiedInverseJoinColumn(int index, OrmJoinColumn joinColumn) {
		addItemToList(index, joinColumn, this.specifiedInverseJoinColumns, JoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST);
	}

	protected void addSpecifiedInverseJoinColumn(OrmJoinColumn joinColumn) {
		this.addSpecifiedInverseJoinColumn(this.specifiedInverseJoinColumns.size(), joinColumn);
	}

	public void removeSpecifiedInverseJoinColumn(JoinColumn joinColumn) {
		this.removeSpecifiedInverseJoinColumn(this.specifiedInverseJoinColumns.indexOf(joinColumn));
	}
	
	public void removeSpecifiedInverseJoinColumn(int index) {
		OrmJoinColumn removedJoinColumn = this.specifiedInverseJoinColumns.remove(index);
		if (!containsSpecifiedInverseJoinColumns()) {
			//create the defaultInverseJoinColumn now or this will happen during project update 
			//after removing the join column from the resource model. That causes problems 
			//in the UI because the change notifications end up in the wrong order.
			this.defaultInverseJoinColumn = buildInverseJoinColumn(null);
		}
		this.getResourceTable().getInverseJoinColumns().remove(index);
		fireItemRemoved(JoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST, index, removedJoinColumn);
		if (this.defaultInverseJoinColumn != null) {
			//fire change notification if a defaultJoinColumn was created above
			this.firePropertyChanged(JoinTable.DEFAULT_INVERSE_JOIN_COLUMN, null, this.defaultInverseJoinColumn);
		}
	}

	protected void removeSpecifiedInverseJoinColumn_(OrmJoinColumn joinColumn) {
		removeItemFromList(joinColumn, this.specifiedInverseJoinColumns, JoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST);
	}
	
	public void moveSpecifiedInverseJoinColumn(int targetIndex, int sourceIndex) {
		CollectionTools.move(this.specifiedInverseJoinColumns, targetIndex, sourceIndex);
		this.getResourceTable().getInverseJoinColumns().move(targetIndex, sourceIndex);
		fireItemMoved(JoinTable.SPECIFIED_INVERSE_JOIN_COLUMNS_LIST, targetIndex, sourceIndex);		
	}
	
	
	// ****************** OrmJoinTable implementation *****************
	public boolean isSpecified() {
		return this.getResourceTable() != null && getResourceTable().isSpecified();
	}	
	
	public void initialize(XmlRelationshipMapping relationshipMapping) {
		this.relationshipMappingResource = relationshipMapping;
		this.initialize(this.getResourceTable());
	}
	
	public void update() {
		this.update(this.getResourceTable());
	}

	protected void initialize(XmlJoinTable joinTable) {
		super.initialize(joinTable);
		this.initializeSpecifiedJoinColumns(joinTable);
		this.initializeDefaultJoinColumn();
		this.initializeSpecifiedInverseJoinColumns(joinTable);
		this.initializeDefaultInverseJoinColumn();
	}
	
	protected void initializeSpecifiedJoinColumns(XmlJoinTable joinTable) {
		if (joinTable == null) {
			return;
		}
		for (XmlJoinColumn joinColumn : joinTable.getJoinColumns()) {
			this.specifiedJoinColumns.add(buildJoinColumn(joinColumn));
		}
	}
	
	protected void initializeDefaultJoinColumn() {
		if (!shouldBuildDefaultJoinColumn()) {
			return;
		}
		this.defaultJoinColumn = buildJoinColumn(null);
	}	

	protected void initializeSpecifiedInverseJoinColumns(XmlJoinTable joinTable) {
		if (joinTable == null) {
			return;
		}
		for (XmlJoinColumn joinColumn : joinTable.getInverseJoinColumns()) {
			this.specifiedInverseJoinColumns.add(buildInverseJoinColumn(joinColumn));
		}
	}
	
	protected void initializeDefaultInverseJoinColumn() {
		if (!shouldBuildDefaultInverseJoinColumn()) {
			return;
		}
		this.defaultInverseJoinColumn = buildInverseJoinColumn(null);
	}	
	
	protected void update(XmlJoinTable joinTable) {
		super.update(joinTable);
		this.updateSpecifiedJoinColumns(joinTable);
		this.updateDefaultJoinColumn();
		this.updateSpecifiedInverseJoinColumns(joinTable);
		this.updateDefaultInverseJoinColumn();
	}
		
	protected void updateSpecifiedJoinColumns(XmlJoinTable joinTable) {
		ListIterator<OrmJoinColumn> contextJoinColumns = specifiedJoinColumns();
		ListIterator<XmlJoinColumn> resourceJoinColumns = EmptyListIterator.instance();
		if (joinTable != null) {
			resourceJoinColumns = new CloneListIterator<XmlJoinColumn>(joinTable.getJoinColumns());//prevent ConcurrentModificiationException
		}
		
		while (contextJoinColumns.hasNext()) {
			OrmJoinColumn joinColumn = contextJoinColumns.next();
			if (resourceJoinColumns.hasNext()) {
				joinColumn.update(resourceJoinColumns.next());
			}
			else {
				removeSpecifiedJoinColumn_(joinColumn);
			}
		}
		
		while (resourceJoinColumns.hasNext()) {
			addSpecifiedJoinColumn(buildJoinColumn(resourceJoinColumns.next()));
		}
	}
	
	protected boolean shouldBuildDefaultJoinColumn() {
		return !containsSpecifiedJoinColumns();
	}

	protected void updateDefaultJoinColumn() {
		if (!shouldBuildDefaultJoinColumn()) {
			setDefaultJoinColumn(null);
			return;
		}
		if (getDefaultJoinColumn() == null) {
			this.setDefaultJoinColumn(buildJoinColumn(null));
		}
		else {
			this.defaultJoinColumn.update(null);
		}
	}	

	protected void updateSpecifiedInverseJoinColumns(XmlJoinTable joinTable) {
		ListIterator<OrmJoinColumn> contextJoinColumns = specifiedInverseJoinColumns();
		ListIterator<XmlJoinColumn> resourceJoinColumns = EmptyListIterator.instance();
		if (joinTable != null) {
			resourceJoinColumns = new CloneListIterator<XmlJoinColumn>(joinTable.getInverseJoinColumns());//prevent ConcurrentModificiationException
		}
		
		while (contextJoinColumns.hasNext()) {
			OrmJoinColumn joinColumn = contextJoinColumns.next();
			if (resourceJoinColumns.hasNext()) {
				joinColumn.update(resourceJoinColumns.next());
			}
			else {
				removeSpecifiedInverseJoinColumn_(joinColumn);
			}
		}
		
		while (resourceJoinColumns.hasNext()) {
			addSpecifiedInverseJoinColumn(buildInverseJoinColumn(resourceJoinColumns.next()));
		}
	}
	
	protected boolean shouldBuildDefaultInverseJoinColumn() {
		return !containsSpecifiedInverseJoinColumns();
	}

	protected void updateDefaultInverseJoinColumn() {
		if (!shouldBuildDefaultInverseJoinColumn()) {
			setDefaultInverseJoinColumn(null);
			return;
		}
		if (getDefaultInverseJoinColumn() == null) {
			this.setDefaultInverseJoinColumn(buildInverseJoinColumn(null));
		}
		else {
			this.defaultInverseJoinColumn.update(null);
		}
	}	
	
	protected OrmJoinColumn buildJoinColumn(XmlJoinColumn resourceJoinColumn) {
		return getJpaFactory().buildOrmJoinColumn(this, new JoinColumnOwner(), resourceJoinColumn);
	}
	
	protected OrmJoinColumn buildInverseJoinColumn(XmlJoinColumn resourceJoinColumn) {
		return getJpaFactory().buildOrmJoinColumn(this, new InverseJoinColumnOwner(), resourceJoinColumn);
	}


	// ************************** validation ***********************

	@Override
	public void validate(List<IMessage> messages) {
		super.validate(messages);
		if (this.connectionProfileIsActive()) {
			this.validateAgainstDatabase(messages);
		}
	}

	protected void validateAgainstDatabase(List<IMessage> messages) {
		OrmRelationshipMapping mapping = this.getRelationshipMapping();

		if ( ! this.hasResolvedCatalog()) {
			if (mapping.getPersistentAttribute().isVirtual()) {
				messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_CATALOG,
						new String[] {mapping.getName(), this.getCatalog(), this.getName()}, 
						this,
						this.getCatalogTextRange()
					)
				);
				
			} else {
				messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.JOIN_TABLE_UNRESOLVED_CATALOG,
						new String[] {this.getCatalog(), this.getName()}, 
						this,
						this.getCatalogTextRange()
					)
				);
			}
			return;
		}
		
		if ( ! this.hasResolvedSchema()) {
			if (mapping.getPersistentAttribute().isVirtual()) {
				messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_SCHEMA,
						new String[] {mapping.getName(), this.getSchema(), this.getName()}, 
						this,
						this.getSchemaTextRange()
					)
				);
			} else {
				messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.JOIN_TABLE_UNRESOLVED_SCHEMA,
						new String[] {this.getSchema(), this.getName()}, 
						this,
						this.getSchemaTextRange()
					)
				);
			}
			return;
		}
		if ( ! this.isResolved()) {
			if (getName() != null) { //if name is null, the validation will be handled elsewhere, such as the target entity is not defined
				if (mapping.getPersistentAttribute().isVirtual()) {
					messages.add(
						DefaultJpaValidationMessages.buildMessage(
							IMessage.HIGH_SEVERITY,
							JpaValidationMessages.VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_NAME,
							new String[] {mapping.getName(), this.getName()}, 
							this,
							this.getNameTextRange()
						)
					);
				} 
				else {
					messages.add(
						DefaultJpaValidationMessages.buildMessage(
								IMessage.HIGH_SEVERITY,
								JpaValidationMessages.JOIN_TABLE_UNRESOLVED_NAME,
								new String[] {this.getName()}, 
								this, 
								this.getNameTextRange())
						);				
				}
			}
			return;
		}

		this.validateJoinColumns(this.joinColumns(), messages);
		this.validateJoinColumns(this.inverseJoinColumns(), messages);
	}

	protected void validateJoinColumns(Iterator<OrmJoinColumn> joinColumns, List<IMessage> messages) {
		while (joinColumns.hasNext()) {
			joinColumns.next().validate(messages);
		}
	}

	/**
	 * just a little common behavior
	 */
	abstract class AbstractJoinColumnOwner implements OrmJoinColumn.Owner
	{
		AbstractJoinColumnOwner() {
			super();
		}

		public TypeMapping getTypeMapping() {
			return getRelationshipMapping().getTypeMapping();
		}
		
		public RelationshipMapping getRelationshipMapping() {
			return GenericOrmJoinTable.this.getRelationshipMapping();
		}

		/**
		 * the default table name is always valid and a specified table name
		 * is prohibited (which will be handled elsewhere)
		 */
		public boolean tableNameIsInvalid(String tableName) {
			return false;
		}

		/**
		 * the join column can only be on the join table itself
		 */
		public boolean tableIsAllowed() {
			return false;
		}

		public org.eclipse.jpt.db.Table getDbTable(String tableName) {
			if (GenericOrmJoinTable.this.getName() == null) {
				return null;
			}
			return (GenericOrmJoinTable.this.getName().equals(tableName)) ? GenericOrmJoinTable.this.getDbTable() : null;
		}
		
		/**
		 * by default, the join column is, obviously, in the join table;
		 * not sure whether it can be anywhere else...
		 */
		public String getDefaultTableName() {
			return GenericOrmJoinTable.this.getName();
		}

		public TextRange getValidationTextRange() {
			return GenericOrmJoinTable.this.getValidationTextRange();
		}
	}


	/**
	 * owner for "forward-pointer" JoinColumns;
	 * these point at the target/inverse entity
	 */
	class InverseJoinColumnOwner extends AbstractJoinColumnOwner
	{
		public InverseJoinColumnOwner() {
			super();
		}

		public Entity getTargetEntity() {
			return GenericOrmJoinTable.this.getRelationshipMapping().getResolvedTargetEntity();
		}

		public String getAttributeName() {
			return GenericOrmJoinTable.this.getRelationshipMapping().getName();
		}

		@Override
		public org.eclipse.jpt.db.Table getDbTable(String tableName) {
			org.eclipse.jpt.db.Table dbTable = super.getDbTable(tableName);
			if (dbTable != null) {
				return dbTable;
			}
			Entity targetEntity = getTargetEntity();
			return (targetEntity == null) ? null : targetEntity.getDbTable(tableName);
		}

		public org.eclipse.jpt.db.Table getReferencedColumnDbTable() {
			Entity targetEntity = getTargetEntity();
			return (targetEntity == null) ? null : targetEntity.getPrimaryDbTable();
		}
		
		public boolean isVirtual(BaseJoinColumn joinColumn) {
			return GenericOrmJoinTable.this.defaultInverseJoinColumn == joinColumn;
		}
		
		public String getDefaultColumnName() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int joinColumnsSize() {
			return GenericOrmJoinTable.this.inverseJoinColumnsSize();
		}
		
	}


	/**
	 * owner for "back-pointer" JoinColumns;
	 * these point at the source/owning entity
	 */
	class JoinColumnOwner extends AbstractJoinColumnOwner
	{
		public JoinColumnOwner() {
			super();
		}

		public Entity getTargetEntity() {
			return GenericOrmJoinTable.this.getRelationshipMapping().getEntity();
		}

		public String getAttributeName() {
			Entity targetEntity = GenericOrmJoinTable.this.getRelationshipMapping().getResolvedTargetEntity();
			if (targetEntity == null) {
				return null;
			}
			String attributeName = GenericOrmJoinTable.this.getRelationshipMapping().getName();
			for (Iterator<PersistentAttribute> stream = targetEntity.getPersistentType().allAttributes(); stream.hasNext();) {
				PersistentAttribute attribute = stream.next();
				AttributeMapping mapping = attribute.getMapping();
				if (mapping instanceof NonOwningMapping) {
					String mappedBy = ((NonOwningMapping) mapping).getMappedBy();
					if ((mappedBy != null) && mappedBy.equals(attributeName)) {
						return attribute.getName();
					}
				}
			}
			return null;
		}

		@Override
		public org.eclipse.jpt.db.Table getDbTable(String tableName) {
			org.eclipse.jpt.db.Table dbTable = super.getDbTable(tableName);
			return (dbTable != null) ? dbTable : getTypeMapping().getDbTable(tableName);
		}

		public org.eclipse.jpt.db.Table getReferencedColumnDbTable() {
			return getTypeMapping().getPrimaryDbTable();
		}
		
		public boolean isVirtual(BaseJoinColumn joinColumn) {
			return GenericOrmJoinTable.this.defaultJoinColumn == joinColumn;
		}
		
		public String getDefaultColumnName() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int joinColumnsSize() {
			return GenericOrmJoinTable.this.joinColumnsSize();
		}
	}
	
}
