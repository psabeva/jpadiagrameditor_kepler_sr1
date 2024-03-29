/*******************************************************************************
 * Copyright (c) 2006, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.context.java;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.eclipse.jpt.common.core.resource.java.JavaResourceMember;
import org.eclipse.jpt.common.core.resource.java.JavaResourceType;
import org.eclipse.jpt.common.core.resource.java.NestableAnnotation;
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.common.utility.internal.StringTools;
import org.eclipse.jpt.common.utility.internal.iterable.EmptyIterable;
import org.eclipse.jpt.common.utility.internal.iterable.EmptyListIterable;
import org.eclipse.jpt.common.utility.internal.iterable.IterableTools;
import org.eclipse.jpt.common.utility.internal.iterable.SingleElementListIterable;
import org.eclipse.jpt.common.utility.internal.iterable.SubListIterableWrapper;
import org.eclipse.jpt.common.utility.internal.predicate.PredicateAdapter;
import org.eclipse.jpt.common.utility.iterable.ListIterable;
import org.eclipse.jpt.jpa.core.JpaPlatformVariation.Supported;
import org.eclipse.jpt.jpa.core.MappingKeys;
import org.eclipse.jpt.jpa.core.context.AssociationOverride;
import org.eclipse.jpt.jpa.core.context.AssociationOverrideContainer;
import org.eclipse.jpt.jpa.core.context.AttributeMapping;
import org.eclipse.jpt.jpa.core.context.AttributeOverride;
import org.eclipse.jpt.jpa.core.context.AttributeOverrideContainer;
import org.eclipse.jpt.jpa.core.context.BaseColumn;
import org.eclipse.jpt.jpa.core.context.BaseJoinColumn;
import org.eclipse.jpt.jpa.core.context.DiscriminatorType;
import org.eclipse.jpt.jpa.core.context.Entity;
import org.eclipse.jpt.jpa.core.context.Generator;
import org.eclipse.jpt.jpa.core.context.InheritanceType;
import org.eclipse.jpt.jpa.core.context.JoinColumn;
import org.eclipse.jpt.jpa.core.context.JoinTable;
import org.eclipse.jpt.jpa.core.context.JpaContextModel;
import org.eclipse.jpt.jpa.core.context.NamedColumn;
import org.eclipse.jpt.jpa.core.context.NamedDiscriminatorColumn;
import org.eclipse.jpt.jpa.core.context.OverrideContainer;
import org.eclipse.jpt.jpa.core.context.Override_;
import org.eclipse.jpt.jpa.core.context.PersistentType;
import org.eclipse.jpt.jpa.core.context.Query;
import org.eclipse.jpt.jpa.core.context.SecondaryTable;
import org.eclipse.jpt.jpa.core.context.SpecifiedAssociationOverride;
import org.eclipse.jpt.jpa.core.context.SpecifiedAttributeOverride;
import org.eclipse.jpt.jpa.core.context.SpecifiedColumn;
import org.eclipse.jpt.jpa.core.context.SpecifiedDiscriminatorColumn;
import org.eclipse.jpt.jpa.core.context.SpecifiedPersistentAttribute;
import org.eclipse.jpt.jpa.core.context.SpecifiedPrimaryKeyJoinColumn;
import org.eclipse.jpt.jpa.core.context.SpecifiedRelationship;
import org.eclipse.jpt.jpa.core.context.SpecifiedSecondaryTable;
import org.eclipse.jpt.jpa.core.context.Table;
import org.eclipse.jpt.jpa.core.context.TableColumn;
import org.eclipse.jpt.jpa.core.context.TypeMapping;
import org.eclipse.jpt.jpa.core.context.java.JavaAssociationOverrideContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaAttributeOverrideContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaEntity;
import org.eclipse.jpt.jpa.core.context.java.JavaGeneratorContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaIdClassReference;
import org.eclipse.jpt.jpa.core.context.java.JavaPersistentType;
import org.eclipse.jpt.jpa.core.context.java.JavaQueryContainer;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedDiscriminatorColumn;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedPrimaryKeyJoinColumn;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedSecondaryTable;
import org.eclipse.jpt.jpa.core.context.java.JavaSpecifiedTable;
import org.eclipse.jpt.jpa.core.context.java.JavaTable;
import org.eclipse.jpt.jpa.core.internal.context.JpaValidator;
import org.eclipse.jpt.jpa.core.internal.context.MappingTools;
import org.eclipse.jpt.jpa.core.internal.context.TypeMappingTools;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AssociationOverrideInverseJoinColumnValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AssociationOverrideJoinColumnValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AssociationOverrideJoinTableValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AssociationOverrideValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AttributeOverrideColumnValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AttributeOverrideValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.DiscriminatorColumnValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.EntityPrimaryKeyJoinColumnValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.EntityTableDescriptionProvider;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.GenericEntityPrimaryKeyValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.JoinTableTableDescriptionProvider;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.MappedSuperclassOverrideDescriptionProvider;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.SecondaryTableValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.TableValidator;
import org.eclipse.jpt.jpa.core.internal.resource.java.NullPrimaryKeyJoinColumnAnnotation;
import org.eclipse.jpt.jpa.core.jpa2.context.java.JavaAssociationOverrideContainer2_0;
import org.eclipse.jpt.jpa.core.jpa2.context.java.JavaAttributeOverrideContainer2_0;
import org.eclipse.jpt.jpa.core.jpa2.context.java.JavaEntity2_0;
import org.eclipse.jpt.jpa.core.jpa2.context.java.JavaOverrideContainer2_0;
import org.eclipse.jpt.jpa.core.resource.java.DiscriminatorColumnAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.DiscriminatorValueAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.EntityAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.InheritanceAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.PrimaryKeyJoinColumnAnnotation;
import org.eclipse.jpt.jpa.core.resource.java.SecondaryTableAnnotation;
import org.eclipse.jpt.jpa.core.validation.JptJpaCoreValidationMessages;
import org.eclipse.jpt.jpa.db.Schema;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

/**
 * Java entity
 */
public abstract class AbstractJavaEntity
	extends AbstractJavaTypeMapping<EntityAnnotation>
	implements JavaEntity2_0, JavaGeneratorContainer.Parent, JavaQueryContainer.Parent
{
	protected String specifiedName;
	protected String defaultName;

	protected Entity rootEntity;
	protected final Vector<Entity> descendants = new Vector<Entity>();

	protected final JavaIdClassReference idClassReference;

	protected final JavaSpecifiedTable table;
	protected boolean specifiedTableIsAllowed;
	protected boolean tableIsUndefined;

	protected final ContextListContainer<JavaSpecifiedSecondaryTable, SecondaryTableAnnotation> specifiedSecondaryTableContainer;
	protected final JavaSpecifiedSecondaryTable.ParentAdapter specifiedSecondaryTableParentAdapter;

	protected final PrimaryKeyJoinColumnParentAdapter primaryKeyJoinColumnParentAdapter;
	protected final ContextListContainer<JavaSpecifiedPrimaryKeyJoinColumn, PrimaryKeyJoinColumnAnnotation> specifiedPrimaryKeyJoinColumnContainer;
	protected JavaSpecifiedPrimaryKeyJoinColumn defaultPrimaryKeyJoinColumn;

	protected InheritanceType specifiedInheritanceStrategy;
	protected InheritanceType defaultInheritanceStrategy;

	protected String specifiedDiscriminatorValue;
	protected String defaultDiscriminatorValue;
	protected boolean specifiedDiscriminatorValueIsAllowed;
	protected boolean discriminatorValueIsUndefined;

	protected final JavaSpecifiedDiscriminatorColumn discriminatorColumn;
	protected boolean specifiedDiscriminatorColumnIsAllowed;
	protected boolean discriminatorColumnIsUndefined;

	protected final JavaAttributeOverrideContainer attributeOverrideContainer;
	protected final JavaAssociationOverrideContainer associationOverrideContainer;

	protected final JavaGeneratorContainer generatorContainer;
	protected final JavaQueryContainer queryContainer;


	// ********** construction **********

	protected AbstractJavaEntity(JavaPersistentType parent, EntityAnnotation mappingAnnotation) {
		super(parent, mappingAnnotation);
		this.specifiedName = this.mappingAnnotation.getName();
		this.idClassReference = this.buildIdClassReference();
		this.table = this.buildTable();
		// start with the entity as the root - it will be recalculated in update()
		this.rootEntity = this;
		this.specifiedSecondaryTableParentAdapter = this.buildSpecifiedSecondaryTableParentAdapter();
		this.specifiedSecondaryTableContainer = this.buildSpecifiedSecondaryTableContainer();
		this.primaryKeyJoinColumnParentAdapter = this.buildPrimaryKeyJoinColumnParentAdapter();
		this.specifiedPrimaryKeyJoinColumnContainer = this.buildSpecifiedPrimaryKeyJoinColumnContainer();
		this.specifiedInheritanceStrategy = this.buildSpecifiedInheritanceStrategy();
		this.specifiedDiscriminatorValue = this.getDiscriminatorValueAnnotation().getValue();
		this.discriminatorColumn = this.buildDiscriminatorColumn();
		this.attributeOverrideContainer = this.buildAttributeOverrideContainer();
		this.associationOverrideContainer = this.buildAssociationOverrideContainer();
		this.generatorContainer = this.buildGeneratorContainer();
		this.queryContainer = this.buildQueryContainer();
	}


	// ********** synchronize/update **********

	@Override
	public void synchronizeWithResourceModel() {
		super.synchronizeWithResourceModel();
		this.setSpecifiedName_(this.mappingAnnotation.getName());
		this.idClassReference.synchronizeWithResourceModel();
		this.table.synchronizeWithResourceModel();
		this.syncSpecifiedSecondaryTables();
		this.syncSpecifiedPrimaryKeyJoinColumns();
		this.setSpecifiedInheritanceStrategy_(this.buildSpecifiedInheritanceStrategy());
		this.setSpecifiedDiscriminatorValue_(this.getDiscriminatorValueAnnotation().getValue());
		this.discriminatorColumn.synchronizeWithResourceModel();
		this.attributeOverrideContainer.synchronizeWithResourceModel();
		this.associationOverrideContainer.synchronizeWithResourceModel();
		this.generatorContainer.synchronizeWithResourceModel();
		this.queryContainer.synchronizeWithResourceModel();
	}

	@Override
	public void update() {
		super.update();

		this.setDefaultName(this.buildDefaultName());

		// calculate root entity early - other things depend on it
		this.setRootEntity(this.buildRootEntity());
		this.updateDescendants();

		this.idClassReference.update();

		this.setDefaultInheritanceStrategy(this.buildDefaultInheritanceStrategy());

		this.table.update();
		this.setSpecifiedTableIsAllowed(this.buildSpecifiedTableIsAllowed());
		this.setTableIsUndefined(this.buildTableIsUndefined());

		this.updateModels(this.getSecondaryTables());

		this.updateDefaultPrimaryKeyJoinColumn();
		this.updateModels(this.getPrimaryKeyJoinColumns());

		this.discriminatorColumn.update();
		this.setSpecifiedDiscriminatorColumnIsAllowed(this.buildSpecifiedDiscriminatorColumnIsAllowed());
		this.setDiscriminatorColumnIsUndefined(this.buildDiscriminatorColumnIsUndefined());

		this.setDefaultDiscriminatorValue(this.buildDefaultDiscriminatorValue());
		this.setSpecifiedDiscriminatorValueIsAllowed(this.buildSpecifiedDiscriminatorValueIsAllowed());
		this.setDiscriminatorValueIsUndefined(this.buildDiscriminatorValueIsUndefined());

		this.attributeOverrideContainer.update();
		this.associationOverrideContainer.update();

		this.generatorContainer.update();
		this.queryContainer.update();
	}


	// ********** name **********

	@Override
	public String getName() {
		return (this.specifiedName != null) ? this.specifiedName : this.defaultName;
	}

	public String getSpecifiedName() {
		return this.specifiedName;
	}

	public void setSpecifiedName(String name) {
		this.mappingAnnotation.setName(name);
		this.setSpecifiedName_(name);
	}

	protected void setSpecifiedName_(String name) {
		String old = this.specifiedName;
		this.specifiedName = name;
		this.firePropertyChanged(SPECIFIED_NAME_PROPERTY, old, name);
	}

	public String getDefaultName() {
		return this.defaultName;
	}

	protected void setDefaultName(String name) {
		String old = this.defaultName;
		this.defaultName = name;
		this.firePropertyChanged(DEFAULT_NAME_PROPERTY, old, name);
	}

	protected String buildDefaultName() {
		return this.getJavaResourceType().getName();
	}


	// ********** root entity **********

	@Override
	public Entity getRootEntity() {
		return this.rootEntity;
	}

	protected void setRootEntity(Entity entity) {
		Entity old = this.rootEntity;
		this.rootEntity = entity;
		this.firePropertyChanged(ROOT_ENTITY_PROPERTY, old, entity);
	}

	protected Entity buildRootEntity() {
		Entity root = this;
		for (TypeMapping typeMapping : this.getAncestors()) {
			if (typeMapping instanceof Entity) {
				root = (Entity) typeMapping;
			}
		}
		return root;
	}


	// ********** descendants **********

	public Iterable<Entity> getDescendants() {
		return IterableTools.cloneLive(this.descendants);
	}

	protected void updateDescendants() {
		this.synchronizeCollection(this.buildDescendants(), this.descendants, DESCENDANTS_COLLECTION);
	}

	protected Iterable<Entity> buildDescendants() {
		return this.isRootEntity() ?
				IterableTools.filter(this.getPersistenceUnit().getEntities(), new Entity.IsDescendant(this)) :
				IterableTools.<Entity>emptyIterable();
	}


	// ********** id class **********

	public JavaIdClassReference getIdClassReference() {
		return this.idClassReference;
	}

	protected JavaIdClassReference buildIdClassReference() {
		return new GenericJavaIdClassReference(this);
	}

	public JavaPersistentType getIdClass() {
		return this.idClassReference.getIdClass();
	}


	// ********** table **********

	public JavaSpecifiedTable getTable() {
		return this.table;
	}

	protected JavaSpecifiedTable buildTable() {
		return this.getJpaFactory().buildJavaTable(this.buildTableParentAdapter());  
	}

	protected JavaTable.ParentAdapter buildTableParentAdapter() {
		return new TableParentAdapter();
	}

	public boolean specifiedTableIsAllowed() {
		return this.specifiedTableIsAllowed;
	}

	protected void setSpecifiedTableIsAllowed(boolean specifiedTableIsAllowed) {
		boolean old = this.specifiedTableIsAllowed;
		this.specifiedTableIsAllowed = specifiedTableIsAllowed;
		this.firePropertyChanged(SPECIFIED_TABLE_IS_ALLOWED_PROPERTY, old, specifiedTableIsAllowed);
	}

	protected boolean buildSpecifiedTableIsAllowed() {
		return ! this.isAbstractTablePerClass() && ! this.isSingleTableDescendant();
	}

	public boolean tableIsUndefined() {
		return this.tableIsUndefined;
	}

	protected void setTableIsUndefined(boolean tableIsUndefined) {
		boolean old = this.tableIsUndefined;
		this.tableIsUndefined = tableIsUndefined;
		this.firePropertyChanged(TABLE_IS_UNDEFINED_PROPERTY, old, tableIsUndefined);
	}

	protected boolean buildTableIsUndefined() {
		return this.isAbstractTablePerClass();
	}

	/**
	 * <ul>
	 * <li>If the entity is part of a single table inheritance hierarchy, the table
	 * name defaults to the root entity's table name.
	 * <li>If the entity is abstract and part of a table per class
	 * inheritance hierarchy, the table name defaults to null, as no table applies.
	 * <li>Otherwise, the table name defaults to the entity name.
	 * </ul>
	 */
	public String getDefaultTableName() {
		return this.isSingleTableDescendant() ?
				this.rootEntity.getTable().getName() :
				this.isAbstractTablePerClass() ? null : this.getName();
	}

	/**
	 * @see #getDefaultTableName()
	 */
	public String getDefaultSchema() {
		return this.isSingleTableDescendant() ?
				this.rootEntity.getTable().getSchema() :
				this.isAbstractTablePerClass() ? null : this.getContextDefaultSchema();
	}

	/**
	 * @see #getDefaultTableName()
	 */
	public String getDefaultCatalog() {
		return this.isSingleTableDescendant() ?
				this.rootEntity.getTable().getCatalog() :
				this.isAbstractTablePerClass() ? null : this.getContextDefaultCatalog();
	}


	// ********** secondary tables **********

	public ListIterable<JavaSpecifiedSecondaryTable> getSecondaryTables() {
		return this.getSpecifiedSecondaryTables();
	}

	public int getSecondaryTablesSize() {
		return this.getSpecifiedSecondaryTablesSize();
	}


	// ********** specified secondary tables **********

	public ListIterable<JavaSpecifiedSecondaryTable> getSpecifiedSecondaryTables() {
		return this.specifiedSecondaryTableContainer;
	}

	public int getSpecifiedSecondaryTablesSize() {
		return this.specifiedSecondaryTableContainer.size();
	}

	public JavaSpecifiedSecondaryTable addSpecifiedSecondaryTable() {
		return this.addSpecifiedSecondaryTable(this.getSpecifiedSecondaryTablesSize());
	}

	public JavaSpecifiedSecondaryTable addSpecifiedSecondaryTable(int index) {
		SecondaryTableAnnotation annotation = this.addSecondaryTableAnnotation(index);
		return this.specifiedSecondaryTableContainer.addContextElement(index, annotation);
	}

	protected SecondaryTableAnnotation addSecondaryTableAnnotation(int index) {
		return (SecondaryTableAnnotation) this.getJavaResourceType().addAnnotation(index, SecondaryTableAnnotation.ANNOTATION_NAME);
	}

	public void removeSpecifiedSecondaryTable(SpecifiedSecondaryTable secondaryTable) {
		this.removeSpecifiedSecondaryTable(this.specifiedSecondaryTableContainer.indexOf((JavaSpecifiedSecondaryTable) secondaryTable));
	}

	public void removeSpecifiedSecondaryTable(int index) {
		this.getJavaResourceType().removeAnnotation(index, SecondaryTableAnnotation.ANNOTATION_NAME);
		this.specifiedSecondaryTableContainer.remove(index);
	}

	public void moveSpecifiedSecondaryTable(int targetIndex, int sourceIndex) {
		this.getResourceAnnotatedElement().moveAnnotation(targetIndex, sourceIndex, SecondaryTableAnnotation.ANNOTATION_NAME);
		this.specifiedSecondaryTableContainer.move(targetIndex, sourceIndex);
	}

	protected JavaSpecifiedSecondaryTable buildSecondaryTable(SecondaryTableAnnotation secondaryTableAnnotation) {
		return this.getJpaFactory().buildJavaSecondaryTable(this.specifiedSecondaryTableParentAdapter, secondaryTableAnnotation);
	}

	protected void syncSpecifiedSecondaryTables() {
		this.specifiedSecondaryTableContainer.synchronizeWithResourceModel();
	}

	protected ListIterable<SecondaryTableAnnotation> getSecondaryTableAnnotations() {
		return this.getSecondaryTableAnnotations_();
	}

	protected ListIterable<SecondaryTableAnnotation> getSecondaryTableAnnotations_() {
		return new SubListIterableWrapper<NestableAnnotation, SecondaryTableAnnotation>(this.getNestableSecondaryTableAnnotations_());
	}

	protected ListIterable<NestableAnnotation> getNestableSecondaryTableAnnotations_() {
		return this.getResourceAnnotatedElement().getAnnotations(SecondaryTableAnnotation.ANNOTATION_NAME);
	}

	protected ContextListContainer<JavaSpecifiedSecondaryTable, SecondaryTableAnnotation> buildSpecifiedSecondaryTableContainer() {
		return this.buildSpecifiedContextListContainer(SPECIFIED_SECONDARY_TABLES_LIST, new SpecifiedSecondaryTableContainerAdapter());
	}

	/**
	 * specified secondary table container adapter
	 */
	public class SpecifiedSecondaryTableContainerAdapter
		extends AbstractContainerAdapter<JavaSpecifiedSecondaryTable, SecondaryTableAnnotation>
	{
		public JavaSpecifiedSecondaryTable buildContextElement(SecondaryTableAnnotation resourceElement) {
			return AbstractJavaEntity.this.buildSecondaryTable(resourceElement);
		}
		public ListIterable<SecondaryTableAnnotation> getResourceElements() {
			return AbstractJavaEntity.this.getSecondaryTableAnnotations();
		}
		public SecondaryTableAnnotation extractResourceElement(JavaSpecifiedSecondaryTable contextElement) {
			return contextElement.getTableAnnotation();
		}
	}

	protected JavaSpecifiedSecondaryTable.ParentAdapter buildSpecifiedSecondaryTableParentAdapter() {
		return new SecondaryTableParentAdapter();
	}


	// ********** primary key join columns **********

	public ListIterable<JavaSpecifiedPrimaryKeyJoinColumn> getPrimaryKeyJoinColumns() {
		return this.hasSpecifiedPrimaryKeyJoinColumns() ? this.getSpecifiedPrimaryKeyJoinColumns() : this.getDefaultPrimaryKeyJoinColumns();
	}

	public int getPrimaryKeyJoinColumnsSize() {
		return this.hasSpecifiedPrimaryKeyJoinColumns() ? this.getSpecifiedPrimaryKeyJoinColumnsSize() : this.getDefaultPrimaryKeyJoinColumnsSize();
	}


	// ********** specified primary key join columns **********

	public ListIterable<JavaSpecifiedPrimaryKeyJoinColumn> getSpecifiedPrimaryKeyJoinColumns() {
		return this.specifiedPrimaryKeyJoinColumnContainer;
	}

	public SpecifiedPrimaryKeyJoinColumn getSpecifiedPrimaryKeyJoinColumn(int index) {
		return this.specifiedPrimaryKeyJoinColumnContainer.get(index);
	}

	public int getSpecifiedPrimaryKeyJoinColumnsSize() {
		return this.specifiedPrimaryKeyJoinColumnContainer.size();
	}

	protected boolean hasSpecifiedPrimaryKeyJoinColumns() {
		return this.getSpecifiedPrimaryKeyJoinColumnsSize() != 0;
	}

	public JavaSpecifiedPrimaryKeyJoinColumn addSpecifiedPrimaryKeyJoinColumn() {
		return this.addSpecifiedPrimaryKeyJoinColumn(this.getSpecifiedPrimaryKeyJoinColumnsSize());
	}

	public JavaSpecifiedPrimaryKeyJoinColumn addSpecifiedPrimaryKeyJoinColumn(int index) {
		PrimaryKeyJoinColumnAnnotation annotation = this.addPrimaryKeyJoinColumnAnnotation(index);
		return this.specifiedPrimaryKeyJoinColumnContainer.addContextElement(index, annotation);
	}

	protected PrimaryKeyJoinColumnAnnotation addPrimaryKeyJoinColumnAnnotation(int index) {
		return (PrimaryKeyJoinColumnAnnotation) this.getJavaResourceType().addAnnotation(index, PrimaryKeyJoinColumnAnnotation.ANNOTATION_NAME);
	}

	public void removeSpecifiedPrimaryKeyJoinColumn(SpecifiedPrimaryKeyJoinColumn joinColumn) {
		this.removeSpecifiedPrimaryKeyJoinColumn(this.specifiedPrimaryKeyJoinColumnContainer.indexOf((JavaSpecifiedPrimaryKeyJoinColumn) joinColumn));
	}

	public void convertDefaultPrimaryKeyJoinColumnsToSpecified() {
		// This is for root entities which have no default PK join column
		 SpecifiedPrimaryKeyJoinColumn pkJoinColumn = this.addSpecifiedPrimaryKeyJoinColumn(0);
		 // Add a PK join column by creating a specified one using the default one
		 if (this.defaultPrimaryKeyJoinColumn != null) {
			 String columnName = this.defaultPrimaryKeyJoinColumn.getDefaultName();
			 String referencedColumnName = this.defaultPrimaryKeyJoinColumn.getDefaultReferencedColumnName();
			 pkJoinColumn.setSpecifiedName(columnName);
			 pkJoinColumn.setSpecifiedReferencedColumnName(referencedColumnName);
		 }
	}

	public void clearSpecifiedPrimaryKeyJoinColumns() {
		for (int index = this.getSpecifiedPrimaryKeyJoinColumnsSize(); --index >= 0; ) {
			this.getJavaResourceType().removeAnnotation(index, PrimaryKeyJoinColumnAnnotation.ANNOTATION_NAME);
		}
		this.specifiedPrimaryKeyJoinColumnContainer.clear();
	}

	public void removeSpecifiedPrimaryKeyJoinColumn(int index) {
		this.getJavaResourceType().removeAnnotation(index, PrimaryKeyJoinColumnAnnotation.ANNOTATION_NAME);
		this.specifiedPrimaryKeyJoinColumnContainer.remove(index);
	}

	public void moveSpecifiedPrimaryKeyJoinColumn(int targetIndex, int sourceIndex) {
		this.getJavaResourceType().moveAnnotation(targetIndex, sourceIndex, PrimaryKeyJoinColumnAnnotation.ANNOTATION_NAME);
		this.specifiedPrimaryKeyJoinColumnContainer.move(targetIndex, sourceIndex);
	}

	protected void syncSpecifiedPrimaryKeyJoinColumns() {
		this.specifiedPrimaryKeyJoinColumnContainer.synchronizeWithResourceModel();
	}

	protected ListIterable<PrimaryKeyJoinColumnAnnotation> getPrimaryKeyJoinColumnAnnotations() {
		return getPrimaryKeyJoinColumnAnnotations_();
	}

	protected ListIterable<PrimaryKeyJoinColumnAnnotation> getPrimaryKeyJoinColumnAnnotations_() {
		return new SubListIterableWrapper<NestableAnnotation, PrimaryKeyJoinColumnAnnotation>(this.getNestablePrimaryKeyJoinColumnAnnotations_());
	}

	protected ListIterable<NestableAnnotation> getNestablePrimaryKeyJoinColumnAnnotations_() {
		return this.getResourceAnnotatedElement().getAnnotations(PrimaryKeyJoinColumnAnnotation.ANNOTATION_NAME);
	}

	protected PrimaryKeyJoinColumnParentAdapter buildPrimaryKeyJoinColumnParentAdapter() {
		return new PrimaryKeyJoinColumnParentAdapter();
	}

	protected JavaSpecifiedPrimaryKeyJoinColumn buildSpecifiedPrimaryKeyJoinColumn(PrimaryKeyJoinColumnAnnotation primaryKeyJoinColumnAnnotation) {
		return this.getJpaFactory().buildJavaPrimaryKeyJoinColumn(this.primaryKeyJoinColumnParentAdapter, primaryKeyJoinColumnAnnotation);
	}

	protected ContextListContainer<JavaSpecifiedPrimaryKeyJoinColumn, PrimaryKeyJoinColumnAnnotation> buildSpecifiedPrimaryKeyJoinColumnContainer() {
		return this.buildSpecifiedContextListContainer(SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS_LIST, new SpecifiedPrimaryKeyJoinColumnContainerAdapter());
	}

	/**
	 * specified primary key join column container adapter
	 */
	public class SpecifiedPrimaryKeyJoinColumnContainerAdapter
		extends AbstractContainerAdapter<JavaSpecifiedPrimaryKeyJoinColumn, PrimaryKeyJoinColumnAnnotation>
	{
		public JavaSpecifiedPrimaryKeyJoinColumn buildContextElement(PrimaryKeyJoinColumnAnnotation resourceElement) {
			return AbstractJavaEntity.this.buildSpecifiedPrimaryKeyJoinColumn(resourceElement);
		}
		public ListIterable<PrimaryKeyJoinColumnAnnotation> getResourceElements() {
			return AbstractJavaEntity.this.getPrimaryKeyJoinColumnAnnotations();
		}
		public PrimaryKeyJoinColumnAnnotation extractResourceElement(JavaSpecifiedPrimaryKeyJoinColumn contextElement) {
			return contextElement.getColumnAnnotation();
		}
	}

	// ********** default primary key join column **********

	public JavaSpecifiedPrimaryKeyJoinColumn getDefaultPrimaryKeyJoinColumn() {
		return this.defaultPrimaryKeyJoinColumn;
	}

	protected void setDefaultPrimaryKeyJoinColumn(JavaSpecifiedPrimaryKeyJoinColumn pkJoinColumn) {
		JavaSpecifiedPrimaryKeyJoinColumn old = this.defaultPrimaryKeyJoinColumn;
		this.defaultPrimaryKeyJoinColumn = pkJoinColumn;
		this.firePropertyChanged(DEFAULT_PRIMARY_KEY_JOIN_COLUMN_PROPERTY, old, pkJoinColumn);
	}

	protected ListIterable<JavaSpecifiedPrimaryKeyJoinColumn> getDefaultPrimaryKeyJoinColumns() {
		return (this.defaultPrimaryKeyJoinColumn != null) ?
				new SingleElementListIterable<JavaSpecifiedPrimaryKeyJoinColumn>(this.defaultPrimaryKeyJoinColumn) :
				EmptyListIterable.<JavaSpecifiedPrimaryKeyJoinColumn>instance();
	}

	protected int getDefaultPrimaryKeyJoinColumnsSize() {
		return (this.defaultPrimaryKeyJoinColumn == null) ? 0 : 1;
	}

	protected void updateDefaultPrimaryKeyJoinColumn() {
		if (this.buildsDefaultPrimaryKeyJoinColumn()) {
			if (this.defaultPrimaryKeyJoinColumn == null) {
				this.setDefaultPrimaryKeyJoinColumn(this.buildDefaultPrimaryKeyJoinColumn());
			} else {
				this.defaultPrimaryKeyJoinColumn.update();
			}
		} else {
			this.setDefaultPrimaryKeyJoinColumn(null);
		}
	}

	protected boolean buildsDefaultPrimaryKeyJoinColumn() {
		return ! this.isRootEntity() && ! this.hasSpecifiedPrimaryKeyJoinColumns();
	}

	protected JavaSpecifiedPrimaryKeyJoinColumn buildDefaultPrimaryKeyJoinColumn() {
		return this.buildSpecifiedPrimaryKeyJoinColumn(new NullPrimaryKeyJoinColumnAnnotation(this.getJavaResourceType()));
	}


	// ********** inheritance strategy **********

	@Override
	public InheritanceType getInheritanceStrategy() {
		return (this.specifiedInheritanceStrategy != null) ? this.specifiedInheritanceStrategy : this.defaultInheritanceStrategy;
	}

	public InheritanceType getSpecifiedInheritanceStrategy() {
		return this.specifiedInheritanceStrategy;
	}

	public void setSpecifiedInheritanceStrategy(InheritanceType inheritanceType) {
		if (this.valuesAreDifferent(this.specifiedInheritanceStrategy, inheritanceType)) {
			this.getInheritanceAnnotation().setStrategy(InheritanceType.toJavaResourceModel(inheritanceType));
			this.removeInheritanceAnnotationIfUnset();
			this.setSpecifiedInheritanceStrategy_(inheritanceType);
		}
	}

	protected void setSpecifiedInheritanceStrategy_(InheritanceType inheritanceType) {
		InheritanceType old = this.specifiedInheritanceStrategy;
		this.specifiedInheritanceStrategy = inheritanceType;
		this.firePropertyChanged(SPECIFIED_INHERITANCE_STRATEGY_PROPERTY, old, inheritanceType);
	}

	protected InheritanceType buildSpecifiedInheritanceStrategy() {
		return InheritanceType.fromJavaResourceModel(this.getInheritanceAnnotation().getStrategy());
	}

	public InheritanceType getDefaultInheritanceStrategy() {
		return this.defaultInheritanceStrategy;
	}

	protected void setDefaultInheritanceStrategy(InheritanceType inheritanceType) {
		InheritanceType old = this.defaultInheritanceStrategy;
		this.defaultInheritanceStrategy = inheritanceType;
		this.firePropertyChanged(DEFAULT_INHERITANCE_STRATEGY_PROPERTY, old, inheritanceType);
	}

	protected InheritanceType buildDefaultInheritanceStrategy() {
		return this.isRootEntity() ? InheritanceType.SINGLE_TABLE : this.rootEntity.getInheritanceStrategy();
	}


	// ********** inheritance annotation **********

	protected InheritanceAnnotation getInheritanceAnnotation() {
		return (InheritanceAnnotation) this.getJavaResourceType().getNonNullAnnotation(InheritanceAnnotation.ANNOTATION_NAME);
	}

	protected void removeInheritanceAnnotationIfUnset() {
		if (this.getInheritanceAnnotation().isUnset()) {
			this.removeInheritanceAnnotation();
		}
	}

	protected void removeInheritanceAnnotation() {
		this.getJavaResourceType().removeAnnotation(InheritanceAnnotation.ANNOTATION_NAME);
	}


	// ********** discriminator value **********

	public String getDiscriminatorValue() {
		return (this.specifiedDiscriminatorValue != null) ? this.specifiedDiscriminatorValue : this.defaultDiscriminatorValue;
	}

	public String getSpecifiedDiscriminatorValue() {
		return this.specifiedDiscriminatorValue;
	}

	public void setSpecifiedDiscriminatorValue(String discriminatorValue) {
		if (this.valuesAreDifferent(this.specifiedDiscriminatorValue, discriminatorValue)) {
			this.getDiscriminatorValueAnnotation().setValue(discriminatorValue);
			this.removeDiscriminatorValueAnnotationIfUnset();
			this.setSpecifiedDiscriminatorValue_(discriminatorValue);
		}
	}

	protected void setSpecifiedDiscriminatorValue_(String discriminatorValue) {
		String old = this.specifiedDiscriminatorValue;
		this.specifiedDiscriminatorValue = discriminatorValue;
		this.firePropertyChanged(SPECIFIED_DISCRIMINATOR_VALUE_PROPERTY, old, discriminatorValue);
	}

	public String getDefaultDiscriminatorValue() {
		return this.defaultDiscriminatorValue;
	}

	protected void setDefaultDiscriminatorValue(String discriminatorValue) {
		String old = this.defaultDiscriminatorValue;
		this.defaultDiscriminatorValue = discriminatorValue;
		this.firePropertyChanged(DEFAULT_DISCRIMINATOR_VALUE_PROPERTY, old, discriminatorValue);
	}

	/**
	 * From the Spec:
	 * If the DiscriminatorValue annotation is not specified, a
	 * provider-specific function to generate a value representing
	 * the entity type is used for the value of the discriminator
	 * column. If the DiscriminatorType is STRING, the discriminator
	 * value default is the entity name.
	 */
	// TODO extension point for provider-specific function?
	protected String buildDefaultDiscriminatorValue() {
		if (this.discriminatorValueIsUndefined) {
			return null;
		}
		return (this.getDiscriminatorType() == DiscriminatorType.STRING) ? this.getName() : null;
	}

	protected DiscriminatorType getDiscriminatorType() {
		return this.discriminatorColumn.getDiscriminatorType();
	}

	public boolean specifiedDiscriminatorValueIsAllowed() {
		return this.specifiedDiscriminatorValueIsAllowed;
	}

	protected void setSpecifiedDiscriminatorValueIsAllowed(boolean allowed) {
		boolean old = this.specifiedDiscriminatorValueIsAllowed;
		this.specifiedDiscriminatorValueIsAllowed = allowed;
		this.firePropertyChanged(SPECIFIED_DISCRIMINATOR_VALUE_IS_ALLOWED_PROPERTY, old, allowed);
	}

	protected boolean buildSpecifiedDiscriminatorValueIsAllowed() {
		return ! this.isTablePerClass() && ! this.isAbstract();
	}

	public boolean discriminatorValueIsUndefined() {
		return this.discriminatorValueIsUndefined;
	}

	protected void setDiscriminatorValueIsUndefined(boolean undefined) {
		boolean old = this.discriminatorValueIsUndefined;
		this.discriminatorValueIsUndefined = undefined;
		this.firePropertyChanged(DISCRIMINATOR_VALUE_IS_UNDEFINED_PROPERTY, old, undefined);
	}

	protected boolean buildDiscriminatorValueIsUndefined() {
		return this.isTablePerClass() ||
				this.isAbstract() ||
				this.isRootNoDescendantsNoStrategyDefined();
	}


	// ********** discriminator value annotation **********

	protected DiscriminatorValueAnnotation getDiscriminatorValueAnnotation() {
		return (DiscriminatorValueAnnotation) this.getJavaResourceType().getNonNullAnnotation(DiscriminatorValueAnnotation.ANNOTATION_NAME);
	}

	protected void removeDiscriminatorValueAnnotationIfUnset() {
		if (this.getDiscriminatorValueAnnotation().isUnset()) {
			this.removeDiscriminatorValueAnnotation();
		}
	}

	protected void removeDiscriminatorValueAnnotation() {
		this.getJavaResourceType().removeAnnotation(DiscriminatorValueAnnotation.ANNOTATION_NAME);
	}


	// ********** discriminator column **********

	public JavaSpecifiedDiscriminatorColumn getDiscriminatorColumn() {
		return this.discriminatorColumn;
	}

	protected JavaSpecifiedDiscriminatorColumn buildDiscriminatorColumn() {
		return this.getJpaFactory().buildJavaDiscriminatorColumn(this.buildDiscriminatorColumnParentAdapter());
	}

	protected JavaSpecifiedDiscriminatorColumn.ParentAdapter buildDiscriminatorColumnParentAdapter() {
		return new DiscriminatorColumnParentAdapter();
	}

	public boolean specifiedDiscriminatorColumnIsAllowed() {
		return this.specifiedDiscriminatorColumnIsAllowed;
	}

	protected void setSpecifiedDiscriminatorColumnIsAllowed(boolean allowed) {
		boolean old = this.specifiedDiscriminatorColumnIsAllowed;
		this.specifiedDiscriminatorColumnIsAllowed = allowed;
		this.firePropertyChanged(SPECIFIED_DISCRIMINATOR_COLUMN_IS_ALLOWED_PROPERTY, old, allowed);
	}

	protected boolean buildSpecifiedDiscriminatorColumnIsAllowed() {
		return ! this.isTablePerClass() && this.isRootEntity();
	}

	public boolean discriminatorColumnIsUndefined() {
		return this.discriminatorColumnIsUndefined;
	}

	protected void setDiscriminatorColumnIsUndefined(boolean undefined) {
		boolean old = this.discriminatorColumnIsUndefined;
		this.discriminatorColumnIsUndefined = undefined;
		this.firePropertyChanged(DISCRIMINATOR_COLUMN_IS_UNDEFINED_PROPERTY, old, undefined);
	}

	protected boolean buildDiscriminatorColumnIsUndefined() {
		return this.isTablePerClass() ||
				this.isRootNoDescendantsNoStrategyDefined();
	}


	// ********** discriminator value annotation **********

	protected DiscriminatorColumnAnnotation getDiscriminatorColumnAnnotation() {
		return (DiscriminatorColumnAnnotation) this.getJavaResourceType().getNonNullAnnotation(DiscriminatorColumnAnnotation.ANNOTATION_NAME);
	}

	protected void removeDiscriminatorColumnAnnotation() {
		this.getJavaResourceType().removeAnnotation(DiscriminatorColumnAnnotation.ANNOTATION_NAME);
	}


	// ********** attribute override container **********

	public JavaAttributeOverrideContainer getAttributeOverrideContainer() {
		return this.attributeOverrideContainer;
	}

	protected JavaAttributeOverrideContainer buildAttributeOverrideContainer() {
		return this.getJpaFactory().buildJavaAttributeOverrideContainer(new AttributeOverrideContainerParentAdapter());
	}

	public TypeMapping getOverridableTypeMapping() {
		PersistentType superPersistentType = this.getPersistentType().getSuperPersistentType();
		return (superPersistentType == null) ? null : superPersistentType.getMapping();
	}


	// ********** association override container **********

	public JavaAssociationOverrideContainer getAssociationOverrideContainer() {
		return this.associationOverrideContainer;
	}

	protected JavaAssociationOverrideContainer buildAssociationOverrideContainer() {
		return this.getJpaFactory().buildJavaAssociationOverrideContainer(new AssociationOverrideContainerParentAdapter());
	}

	@Override
	public SpecifiedRelationship resolveOverriddenRelationship(String attributeName) {
		// check for an override before looking at attribute mappings
		SpecifiedAssociationOverride override = this.associationOverrideContainer.getSpecifiedOverrideNamed(attributeName);
		return (override != null) ? override.getRelationship() : super.resolveOverriddenRelationship(attributeName);
	}


	// ********** generator container **********

	public JavaGeneratorContainer getGeneratorContainer() {
		return this.generatorContainer;
	}

	protected JavaGeneratorContainer buildGeneratorContainer() {
		return this.getJpaFactory().buildJavaGeneratorContainer(this);
	}

	@Override
	@SuppressWarnings("unchecked")
	public Iterable<Generator> getGenerators() {
		return IterableTools.concatenate(
					super.getGenerators(),
					this.generatorContainer.getGenerators()
				);
	}


	// ********** generator container parent **********

	public JavaResourceType getResourceAnnotatedElement() {
		return this.getJavaResourceType();
	}

	public boolean supportsGenerators() {
		return true;
	}


	// ********** query container **********

	public JavaQueryContainer getQueryContainer() {
		return this.queryContainer;
	}

	protected JavaQueryContainer buildQueryContainer() {
		return this.getJpaFactory().buildJavaQueryContainer(this);
	}

	public Iterable<Query> getQueries() {
		return this.queryContainer.getQueries();
	}


	// ********** associated tables **********

	@Override
	public Iterable<Table> getAssociatedTables() {
		return IterableTools.<Table>insert(this.table, this.getSecondaryTables());
	}


	// TODO eliminate duplicate tables?
	@Override
	public Iterable<Table> getAllAssociatedTables() {
		return IterableTools.children(this.getInheritanceHierarchy(), TypeMappingTools.ASSOCIATED_TABLES_TRANSFORMER);
	}

	@Override
	public Iterable<String> getAllAssociatedTableNames() {
		return this.convertToNames(this.getAllAssociatedTables());
	}

	/**
	 * strip out <code>null</code> names
	 */
	protected Iterable<String> convertToNames(Iterable<Table> tables) {
		return IterableTools.removeNulls(IterableTools.transform(tables, Table.NAME_TRANSFORMER));
	}

	public boolean tableNameIsInvalid(String tableName) {
		return ! this.tableNameIsValid(tableName);
	}

	protected boolean tableNameIsValid(String tableName) {
		return this.tableIsUndefined || this.tableNameIsValid_(tableName);
	}

	protected boolean tableNameIsValid_(String tableName) {
		return this.connectionProfileIsActive() ?
				(this.resolveDbTable(tableName) != null) :
				this.tableNameIsAssociatedTable(tableName);
	}

	protected boolean tableNameIsAssociatedTable(String tableName) {
		//short-circuit for performance during validation, likely that the table is the primary table
		if (tableName != null && tableName.equals(this.getPrimaryTableName())) {
			return true;
		}
		return IterableTools.contains(this.getAllAssociatedTableNames(), tableName);
	}


	// ********** database **********

	@Override
	public String getPrimaryTableName() {
		return this.table.getName();
	}

	@Override
	public org.eclipse.jpt.jpa.db.Table getPrimaryDbTable() {
		return this.table.getDbTable();
	}

	@Override
	public org.eclipse.jpt.jpa.db.Table resolveDbTable(String tableName) {
		//short-circuit for performance during validation, no reason to build all the iterables in getallAssociatedDbTables()
		//i think the real answer is not to be validating in this case, but i believe that would involve some api changes up in NamedColumnValidator
		if (getDataSource().connectionProfileIsActive()) {
			// matching database objects and identifiers is database platform-specific
			return this.getDataSource().selectTableForIdentifier(this.getAllAssociatedDbTables(), tableName);
		}
		return null;
	}

	/**
	 * strip out null db tables
	 */
	protected Iterable<org.eclipse.jpt.jpa.db.Table> getAllAssociatedDbTables() {
		return IterableTools.removeNulls(IterableTools.transform(this.getAllAssociatedTables(), Table.DB_TABLE_TRANSFORMER));
	}

	@Override
	public Schema getDbSchema() {
		return this.table.getDbSchema();
	}


	// ********** primary key **********

	public String getPrimaryKeyColumnName() {
		return MappingTools.getPrimaryKeyColumnName(this);
	}

	public SpecifiedPersistentAttribute getIdAttribute() {
		Iterator<AttributeMapping> idAttributeMappings = this.getAllAttributeMappings(MappingKeys.ID_ATTRIBUTE_MAPPING_KEY).iterator();
		if (idAttributeMappings.hasNext()) {
			SpecifiedPersistentAttribute attribute = idAttributeMappings.next().getPersistentAttribute();
			return idAttributeMappings.hasNext() ? null /*more than one*/: attribute;
		}
		return null;
	}


	// ********** misc **********

	public String getKey() {
		return MappingKeys.ENTITY_TYPE_MAPPING_KEY;
	}

	public boolean isMapped() {
		return true;
	}


	// ********** attribute mappings **********

	@Override
	public SpecifiedColumn resolveOverriddenColumn(String attributeName) {
		// check for an override before looking at attribute mappings
		SpecifiedAttributeOverride override = this.attributeOverrideContainer.getSpecifiedOverrideNamed(attributeName);
		return (override != null) ? override.getColumn() : super.resolveOverriddenColumn(attributeName);
	}

	@Override
	public Iterable<String> getOverridableAttributeNames() {
		return this.isTablePerClass() ?
				super.getOverridableAttributeNames() :
				EmptyIterable.<String>instance();
	}

	@Override
	public Iterable<String> getOverridableAssociationNames() {
		return this.isTablePerClass() ?
				super.getOverridableAssociationNames() :
				EmptyIterable.<String>instance();
	}

	public AttributeMapping resolveAttributeMapping(String name) {
		for (AttributeMapping attributeMapping : this.getAllAttributeMappings()) {
			AttributeMapping resolvedMapping = attributeMapping.resolveAttributeMapping(name);
			if (resolvedMapping != null) {
				return resolvedMapping;
			}
		}
		return null;
	}


	// ********** inheritance **********

	public Entity getParentEntity() {
		for (TypeMapping typeMapping : this.getAncestors()) {
			if (typeMapping instanceof Entity) {
				return (Entity) typeMapping;
			}
		}
		return null;
	}

	@Override
	public boolean isRootEntity() {
		return this == this.rootEntity;
	}

	/**
	 * Return whether the entity is a descendant in (as opposed to the root of)
	 * an inheritance hierarchy.
	 */
	public boolean isDescendant() {
		return ! this.isRootEntity();
	}

	/**
	 * Return whether the entity is a descendant of the root entity
	 * of a "single table" inheritance hierarchy.
	 */
	protected boolean isSingleTableDescendant() {
		return this.isDescendant() &&
				(this.getInheritanceStrategy() == InheritanceType.SINGLE_TABLE);
	}

	/**
	 * Return whether the entity is the top of an inheritance hierarchy
	 * and has no descendants and no specified inheritance strategy has been defined.
	 */
	public boolean isRootNoDescendantsNoStrategyDefined() {
		return this.isRootEntity() &&
				this.descendants.isEmpty() &&
				(this.specifiedInheritanceStrategy == null);
	}

	/**
	 * Return whether the entity is abstract and is a part of a
	 * "table per class" inheritance hierarchy.
	 */
	protected boolean isAbstractTablePerClass() {
		return this.isAbstract() && this.isTablePerClass();
	}

	/**
	 * Return whether the entity is a part of a "table per class"
	 * inheritance hierarchy.
	 */
	protected boolean isTablePerClass() {
		return this.getInheritanceStrategy() == InheritanceType.TABLE_PER_CLASS;
	}

	/**
	 * Return whether the entity is a part of a "table per class"
	 * inheritance hierarchy.
	 */
	protected boolean isTablePerClassDescendant() {
		return this.isTablePerClass() && this.isDescendant();
	}

	/**
	 * Return whether the type is abstract.
	 */
	protected boolean isAbstract() {
		return this.getJavaResourceType().isAbstract();
	}

	/**
	 * Return whether the entity's type is final.
	 */
	protected boolean isFinal() {
		return this.getJavaResourceType().isFinal();
	}

	/**
	 * Return whether the entity's type is a member of another type.
	 */
	protected boolean isMember() {
		return this.getJavaResourceType().getTypeBinding().isMemberTypeDeclaration();
	}

	/**
	 * Return whether the entity's type is static.
	 */
	protected boolean isStatic() {
		return this.getJavaResourceType().isStatic();
	}


	// ********** Java completion proposals **********

	@Override
	public Iterable<String> getCompletionProposals(int pos) {
		Iterable<String> result = super.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		result = this.table.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		for (JavaSpecifiedSecondaryTable secondaryTable : this.getSecondaryTables()) {
			result = secondaryTable.getCompletionProposals(pos);
			if (result != null) {
				return result;
			}
		}
		for (JavaSpecifiedPrimaryKeyJoinColumn pkJoinColumn : this.getPrimaryKeyJoinColumns()) {
			result = pkJoinColumn.getCompletionProposals(pos);
			if (result != null) {
				return result;
			}
		}
		result = this.attributeOverrideContainer.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		result = this.associationOverrideContainer.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		result = this.discriminatorColumn.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		result = this.generatorContainer.getCompletionProposals(pos);
		if (result != null) {
			return result;
		}
		return null;
	}


	// ********** validation **********

	@Override
	public void validate(List<IMessage> messages, IReporter reporter) {
		super.validate(messages, reporter);

		this.validatePrimaryKey(messages, reporter);
		this.validateTable(messages, reporter);
		for (JavaSpecifiedSecondaryTable secondaryTable : this.getSecondaryTables()) {
			secondaryTable.validate(messages, reporter);
		}
		this.validateInheritance(messages, reporter);
		this.validatePrimaryKeyJoinColumns(messages, reporter);
		this.generatorContainer.validate(messages, reporter);
		this.queryContainer.validate(messages, reporter);
		this.attributeOverrideContainer.validate(messages, reporter);
		this.associationOverrideContainer.validate(messages, reporter);
		this.validateEntityName(messages);
		this.idClassReference.validate(messages, reporter);
	}

	protected void validatePrimaryKeyJoinColumns(List<IMessage> messages, IReporter reporter) {
		if (this.getPrimaryKeyJoinColumnsSize() > 0) {
			if (this.getParentEntity() == null) {
				messages.add(
						this.buildValidationMessage(
								this.getMappingAnnotation().getNameTextRange(),
								JptJpaCoreValidationMessages.ROOT_ENTITY_HAS_PK_JOIN_COLUMN_DEFINED,
								this.getPersistentType().getName()
						)
				);
			} else {
				for (JavaSpecifiedPrimaryKeyJoinColumn pkJoinColumn : this.getPrimaryKeyJoinColumns()) {
					pkJoinColumn.validate(messages, reporter);
				}
			}
		}
	}

	@Override
	public boolean validatesAgainstDatabase() {
		return super.validatesAgainstDatabase() && ! this.isAbstractTablePerClass();
	}

	protected void validateEntityName(List<IMessage> messages) {
		if (StringTools.isBlank(this.getName())){
			messages.add(
					this.buildValidationMessage(
							this.getMappingAnnotation().getNameTextRange(),
							JptJpaCoreValidationMessages.ENTITY_NAME_MISSING,
							this.getPersistentType().getName()
					)
			);
		}
	}

	public boolean supportsValidationMessages() {
		return MappingTools.modelIsInternalSource(this, this.getJavaResourceType());
	}

	public TextRange getNameTextRange() {
		return this.getMappingAnnotation().getNameTextRange();
	}

	protected void validatePrimaryKey(List<IMessage> messages, IReporter reporter) {
		this.buildPrimaryKeyValidator().validate(messages, reporter);
	}

	protected JpaValidator buildPrimaryKeyValidator() {
		return new GenericEntityPrimaryKeyValidator(this);
	}

	protected void validateTable(List<IMessage> messages, IReporter reporter) {
		if (this.isAbstractTablePerClass()) {
			if (this.table.isSpecifiedInResource()) {
				messages.add(
					this.buildValidationMessage(
						this.table.getValidationTextRange(),
						JptJpaCoreValidationMessages.ENTITY_ABSTRACT_TABLE_PER_CLASS_DEFINES_TABLE,
						this.getName()
					)
				);
			}
			return;
		}
		if (this.isSingleTableDescendant() && this.getDataSource().connectionProfileIsActive()) {
			if (this.specifiedTableDoesNotMatchRootTable()) {
				messages.add(
					this.buildValidationMessage(
						this.table.getValidationTextRange(),
						JptJpaCoreValidationMessages.ENTITY_SINGLE_TABLE_DESCENDANT_DEFINES_TABLE,
						this.getName()
					)
				);
			}
			return;
		}
		this.table.validate(messages, reporter);
	}

	/**
	 * Return whether the entity specifies a table and it is a different table
	 * than the root entity's table.
	 */
	protected boolean specifiedTableDoesNotMatchRootTable() {
		return this.table.isSpecifiedInResource() &&
			(this.table.getDbTable() != this.getRootEntity().getTable().getDbTable());
	}

	protected void validateInheritance(List<IMessage> messages, IReporter reporter) {
		this.validateInheritanceStrategy(messages);
		this.validateDiscriminatorColumn(messages, reporter);
		this.validateDiscriminatorValue(messages);
	}

	protected void validateDiscriminatorColumn(List<IMessage> messages, IReporter reporter) {
		if (this.specifiedDiscriminatorColumnIsAllowed && ! this.discriminatorColumnIsUndefined) {
			this.discriminatorColumn.validate(messages, reporter);
		}
		else if (!this.discriminatorColumn.isVirtual()) {
			if (this.isDescendant()) {
				messages.add(
					this.buildValidationMessage(
						this.getDiscriminatorColumnTextRange(),
						JptJpaCoreValidationMessages.ENTITY_NON_ROOT_DISCRIMINATOR_COLUMN_DEFINED,
						this.getName()
					)
				);
			}
			else if (this.isTablePerClass()) {
				messages.add(
					this.buildValidationMessage(
						this.getDiscriminatorColumnTextRange(),
						JptJpaCoreValidationMessages.ENTITY_TABLE_PER_CLASS_DISCRIMINATOR_COLUMN_DEFINED,
						this.getName()
					)
				);
			}
		}
	}

	protected void validateDiscriminatorValue(List<IMessage> messages) {
		if (this.discriminatorValueIsUndefined && (this.specifiedDiscriminatorValue != null)) {
			if (this.isAbstract()) {
				messages.add(
					this.buildValidationMessage(
						this.getDiscriminatorValueTextRange(),
						JptJpaCoreValidationMessages.ENTITY_ABSTRACT_DISCRIMINATOR_VALUE_DEFINED,
						this.getName()
					)
				);
			}
			else if (this.isTablePerClass()) {
				messages.add(
					this.buildValidationMessage(
						this.getDiscriminatorValueTextRange(),
						JptJpaCoreValidationMessages.ENTITY_TABLE_PER_CLASS_DISCRIMINATOR_VALUE_DEFINED,
						this.getName()
					)
				);
			}
		}
	}

	protected void validateInheritanceStrategy(List<IMessage> messages) {
		Supported tablePerConcreteClassInheritanceIsSupported = this.getJpaPlatformVariation().getTablePerConcreteClassInheritanceIsSupported();
		if (tablePerConcreteClassInheritanceIsSupported == Supported.YES) {
			return;
		}
		if ((this.getInheritanceStrategy() == InheritanceType.TABLE_PER_CLASS) && this.isRootEntity()) {
			if (tablePerConcreteClassInheritanceIsSupported == Supported.NO) {
				messages.add(
					this.buildValidationMessage(
						this.getInheritanceStrategyTextRange(),
						JptJpaCoreValidationMessages.ENTITY_TABLE_PER_CLASS_NOT_SUPPORTED_ON_PLATFORM,
						this.getName()
					)
				);
			}
			else {
				messages.add(
					this.buildValidationMessage(
						this.getInheritanceStrategyTextRange(),
						JptJpaCoreValidationMessages.ENTITY_TABLE_PER_CLASS_NOT_PORTABLE_ON_PLATFORM,
						this.getName()
					)
				);
			}
		}
	}

	protected TextRange getDiscriminatorValueTextRange() {
		return this.getValidationTextRange(this.getDiscriminatorValueAnnotation().getTextRange());
	}

	protected TextRange getDiscriminatorColumnTextRange() {
		return this.getValidationTextRange(this.discriminatorColumn.getValidationTextRange());
	}

	protected TextRange getInheritanceStrategyTextRange() {
		return this.getValidationTextRange(this.getInheritanceAnnotation().getStrategyTextRange());
	}


	// ********** override container parent adapter **********

	/**
	 * some common behavior
	 */
	public abstract class OverrideContainerParentAdapter
		implements JavaOverrideContainer2_0.ParentAdapter
	{
		public JpaContextModel getOverrideContainerParent() {
			return AbstractJavaEntity.this;
		}

		public JavaResourceMember getResourceMember() {
			return AbstractJavaEntity.this.getJavaResourceType();
		}

		public AbstractJavaEntity getTypeMapping() {
			return AbstractJavaEntity.this;
		}

		public TextRange getValidationTextRange() {
			return AbstractJavaEntity.this.getValidationTextRange();
		}

		public TypeMapping getOverridableTypeMapping() {
			return AbstractJavaEntity.this.getOverridableTypeMapping();
		}

		public Iterable<String> getAllOverridableNames() {
			TypeMapping overriddenTypeMapping = this.getOverridableTypeMapping();
			return (overriddenTypeMapping != null) ? this.getAllOverridableNames_(overriddenTypeMapping) : EmptyIterable.<String>instance();
		}

		/**
		 * pre-condition: <code>typeMapping</code> is not <code>null</code>
		 */
		protected abstract Iterable<String> getAllOverridableNames_(TypeMapping overriddenTypeMapping);

		public String getDefaultTableName() {
			return AbstractJavaEntity.this.getPrimaryTableName();
		}

		public boolean tableNameIsInvalid(String tableName) {
			return AbstractJavaEntity.this.tableNameIsInvalid(tableName);
		}

		public org.eclipse.jpt.jpa.db.Table resolveDbTable(String tableName) {
			return AbstractJavaEntity.this.resolveDbTable(tableName);
		}

		public Iterable<String> getCandidateTableNames() {
			return AbstractJavaEntity.this.getAllAssociatedTableNames();
		}

		public String getPossiblePrefix() {
			return null;
		}

		public String getWritePrefix() {
			return null;
		}

		// no maps, so all overrides are relevant
		public boolean isRelevant(String overrideName) {
			return true;
		}

	}


	// ********** attribute override container parent adapter **********

	public class AttributeOverrideContainerParentAdapter
		extends OverrideContainerParentAdapter
		implements JavaAttributeOverrideContainer2_0.ParentAdapter
	{
		@Override
		protected Iterable<String> getAllOverridableNames_(TypeMapping overriddenTypeMapping) {
			return IterableTools.filter(overriddenTypeMapping.getAllOverridableAttributeNames(), new AttributeIsDerivedId());
		}

		public class AttributeIsDerivedId
			extends PredicateAdapter<String>
		{
			@Override
			public boolean evaluate(String attributeName) {
				return ! AttributeOverrideContainerParentAdapter.this.getTypeMapping().attributeIsDerivedId(attributeName);
			}
		}

		public SpecifiedColumn resolveOverriddenColumn(String attributeName) {
			return MappingTools.resolveOverriddenColumn(this.getOverridableTypeMapping(), attributeName);
		}

		public JpaValidator buildOverrideValidator(Override_ override, OverrideContainer container) {
			return new AttributeOverrideValidator((AttributeOverride) override, (AttributeOverrideContainer) container, new MappedSuperclassOverrideDescriptionProvider());
		}
		
		public JpaValidator buildColumnValidator(Override_ override, BaseColumn column, TableColumn.ParentAdapter parentAdapter) {
			return new AttributeOverrideColumnValidator((AttributeOverride) override, column, new EntityTableDescriptionProvider());
		}
	}


	// ********** association override container parent adapter **********

	public class AssociationOverrideContainerParentAdapter
		extends OverrideContainerParentAdapter
		implements JavaAssociationOverrideContainer2_0.ParentAdapter
	{
		@Override
		protected Iterable<String> getAllOverridableNames_(TypeMapping overriddenTypeMapping) {
			return overriddenTypeMapping.getAllOverridableAssociationNames();
		}

		public SpecifiedRelationship resolveOverriddenRelationship(String attributeName) {
			return MappingTools.resolveOverriddenRelationship(this.getOverridableTypeMapping(), attributeName);
		}

		public JpaValidator buildOverrideValidator(Override_ override, OverrideContainer container) {
			return new AssociationOverrideValidator((AssociationOverride) override, (AssociationOverrideContainer) container, new MappedSuperclassOverrideDescriptionProvider());
		}

		public JpaValidator buildColumnValidator(Override_ override, BaseColumn column, TableColumn.ParentAdapter parentAdapter) {
			return new AssociationOverrideJoinColumnValidator((AssociationOverride) override, (JoinColumn) column, (JoinColumn.ParentAdapter) parentAdapter, new EntityTableDescriptionProvider());
		}

		public JpaValidator buildJoinTableJoinColumnValidator(AssociationOverride override, JoinColumn column, JoinColumn.ParentAdapter parentAdapter) {
			return new AssociationOverrideJoinColumnValidator(override, column, parentAdapter, new JoinTableTableDescriptionProvider());
		}

		public JpaValidator buildJoinTableInverseJoinColumnValidator(AssociationOverride override, JoinColumn column, JoinColumn.ParentAdapter parentAdapter) {
			return new AssociationOverrideInverseJoinColumnValidator(override, column, parentAdapter, new JoinTableTableDescriptionProvider());
		}

		public JpaValidator buildJoinTableValidator(AssociationOverride override, Table t) {
			return new AssociationOverrideJoinTableValidator(override, (JoinTable) t);
		}
	}


	// ********** named column parent adapter **********

	/**
	 * some common behavior
	 */
	public abstract class NamedColumnParentAdapter
		implements NamedColumn.ParentAdapter
	{
		public String getDefaultTableName() {
			return AbstractJavaEntity.this.getPrimaryTableName();
		}

		public org.eclipse.jpt.jpa.db.Table resolveDbTable(String tableName) {
			return AbstractJavaEntity.this.resolveDbTable(tableName);
		}

		public TextRange getValidationTextRange() {
			return AbstractJavaEntity.this.getValidationTextRange();
		}
	}


	// ********** PK join column parent adapter **********

	public class PrimaryKeyJoinColumnParentAdapter
		extends NamedColumnParentAdapter
		implements BaseJoinColumn.ParentAdapter
	{
		public JpaContextModel getColumnParent() {
			return AbstractJavaEntity.this;
		}

		public org.eclipse.jpt.jpa.db.Table getReferencedColumnDbTable() {
			Entity parentEntity = AbstractJavaEntity.this.getParentEntity();
			return (parentEntity == null) ? null : parentEntity.getPrimaryDbTable();
		}

		public int getJoinColumnsSize() {
			return AbstractJavaEntity.this.getPrimaryKeyJoinColumnsSize();
		}

		public String getDefaultColumnName(NamedColumn column) {
			if (this.getJoinColumnsSize() != 1) {
				return null;
			}
			Entity parentEntity = AbstractJavaEntity.this.getParentEntity();
			return (parentEntity == null) ? AbstractJavaEntity.this.getPrimaryKeyColumnName() : parentEntity.getPrimaryKeyColumnName();
		}

		public JpaValidator buildColumnValidator(NamedColumn column) {
			return new EntityPrimaryKeyJoinColumnValidator((BaseJoinColumn) column, this);
		}
	}


	// ********** discriminator column parent adapter **********

	public class DiscriminatorColumnParentAdapter
		extends NamedColumnParentAdapter
		implements JavaSpecifiedDiscriminatorColumn.ParentAdapter
	{
		public JavaEntity getColumnParent() {
			return AbstractJavaEntity.this;
		}

		public String getDefaultColumnName(NamedColumn column) {
			return this.isDescendant() ?
					this.getRootDiscriminatorColumn().getName() :
					this.discriminatorColumnIsUndefined() ? null : SpecifiedDiscriminatorColumn.DEFAULT_NAME;
		}

		public int getDefaultLength() {
			return this.isDescendant() ?
					this.getRootDiscriminatorColumn().getLength() :
					this.discriminatorColumnIsUndefined() ? 0 : NamedDiscriminatorColumn.DEFAULT_LENGTH;
		}

		public DiscriminatorType getDefaultDiscriminatorType() {
			return this.isDescendant() ?
					this.getRootDiscriminatorColumn().getDiscriminatorType() :
					this.discriminatorColumnIsUndefined() ? null : NamedDiscriminatorColumn.DEFAULT_DISCRIMINATOR_TYPE;
		}

		protected boolean isDescendant() {
			return AbstractJavaEntity.this.isDescendant();
		}

		protected SpecifiedDiscriminatorColumn getRootDiscriminatorColumn() {
			return AbstractJavaEntity.this.rootEntity.getDiscriminatorColumn();
		}

		protected boolean discriminatorColumnIsUndefined() {
			return AbstractJavaEntity.this.discriminatorColumnIsUndefined;
		}

		public JpaValidator buildColumnValidator(NamedColumn column) {
			return new DiscriminatorColumnValidator(column);
		}

		public DiscriminatorColumnAnnotation getColumnAnnotation() {
			return AbstractJavaEntity.this.getDiscriminatorColumnAnnotation();
		}

		public void removeColumnAnnotation() {
			AbstractJavaEntity.this.removeDiscriminatorColumnAnnotation();
		}
	}


	// ********** table parent adapter **********

	public class TableParentAdapter
		implements JavaTable.ParentAdapter
	{
		public JavaEntity getTableParent() {
			return AbstractJavaEntity.this;
		}
		public JpaValidator buildTableValidator(Table t) {
			return new TableValidator(t);
		}
	}


	// ********** secondary table parent adapter **********

	public class SecondaryTableParentAdapter
		implements JavaSpecifiedSecondaryTable.ParentAdapter
	{
		public JavaEntity getTableParent() {
			return AbstractJavaEntity.this;
		}
		public JpaValidator buildTableValidator(Table t) {
			return new SecondaryTableValidator((SecondaryTable) t);
		}
	}
}
