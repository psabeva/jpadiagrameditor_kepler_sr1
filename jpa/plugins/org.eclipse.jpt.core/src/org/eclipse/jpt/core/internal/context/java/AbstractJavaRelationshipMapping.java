/*******************************************************************************
 * Copyright (c) 2006, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.java;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.context.AttributeMapping;
import org.eclipse.jpt.core.context.Entity;
import org.eclipse.jpt.core.context.FetchType;
import org.eclipse.jpt.core.context.PersistentAttribute;
import org.eclipse.jpt.core.context.PersistentType;
import org.eclipse.jpt.core.context.RelationshipMapping;
import org.eclipse.jpt.core.context.TypeMapping;
import org.eclipse.jpt.core.context.java.JavaCascade;
import org.eclipse.jpt.core.context.java.JavaPersistentAttribute;
import org.eclipse.jpt.core.context.java.JavaRelationshipMapping;
import org.eclipse.jpt.core.context.java.JavaRelationshipReference;
import org.eclipse.jpt.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.core.internal.validation.JpaValidationMessages;
import org.eclipse.jpt.core.jpa2.context.MetamodelField;
import org.eclipse.jpt.core.resource.java.RelationshipMappingAnnotation;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.utility.Filter;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.jpt.utility.internal.iterators.CompositeIterator;
import org.eclipse.jpt.utility.internal.iterators.EmptyIterator;
import org.eclipse.jpt.utility.internal.iterators.TransformationIterator;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

/**
 * Java relationship mapping
 */
public abstract class AbstractJavaRelationshipMapping<T extends RelationshipMappingAnnotation>
	extends AbstractJavaAttributeMapping<T>
	implements JavaRelationshipMapping
{
	protected String specifiedTargetEntity;
	protected String defaultTargetEntity;
	protected PersistentType resolvedTargetType;
	protected Entity resolvedTargetEntity;

	protected final JavaRelationshipReference relationshipReference;

	protected final JavaCascade cascade;

	protected FetchType specifiedFetch;


	protected AbstractJavaRelationshipMapping(JavaPersistentAttribute parent) {
		super(parent);
		this.relationshipReference = this.buildRelationshipReference();
		this.cascade = this.getJpaFactory().buildJavaCascade(this);
	}

	@Override
	protected void initialize() {
		super.initialize();
		this.defaultTargetEntity = this.buildDefaultTargetEntity();
		this.relationshipReference.initialize();
		this.specifiedFetch = this.getResourceFetch();
		this.cascade.initialize(this.mappingAnnotation);
		this.specifiedTargetEntity = this.getResourceTargetEntity();
		this.resolvedTargetType = this.buildResolvedTargetType();
		this.resolvedTargetEntity = this.buildResolvedTargetEntity();
	}

	@Override
	protected void update() {
		super.update();
		this.setDefaultTargetEntity(this.buildDefaultTargetEntity());
		this.relationshipReference.update();
		this.setSpecifiedFetch_(this.getResourceFetch());
		this.cascade.update(this.mappingAnnotation);
		this.setSpecifiedTargetEntity_(this.getResourceTargetEntity());
		this.resolvedTargetType = this.buildResolvedTargetType();
		this.setResolvedTargetEntity(this.buildResolvedTargetEntity());
	}


	// ********** target entity **********

	public String getTargetEntity() {
		return (this.specifiedTargetEntity != null) ? this.specifiedTargetEntity : this.defaultTargetEntity;
	}

	public String getSpecifiedTargetEntity() {
		return this.specifiedTargetEntity;
	}

	public void setSpecifiedTargetEntity(String targetEntity) {
		String old = this.specifiedTargetEntity;
		this.specifiedTargetEntity = targetEntity;
		this.mappingAnnotation.setTargetEntity(targetEntity);
		this.firePropertyChanged(SPECIFIED_TARGET_ENTITY_PROPERTY, old, targetEntity);
	}

	protected void setSpecifiedTargetEntity_(String targetEntity) {
		String old = this.specifiedTargetEntity;
		this.specifiedTargetEntity = targetEntity;
		this.firePropertyChanged(SPECIFIED_TARGET_ENTITY_PROPERTY, old, targetEntity);
	}

	protected String getResourceTargetEntity() {
		return this.mappingAnnotation.getTargetEntity();
	}

	public String getDefaultTargetEntity() {
		return this.defaultTargetEntity;
	}

	protected void setDefaultTargetEntity(String targetEntity) {
		String old = this.defaultTargetEntity;
		this.defaultTargetEntity = targetEntity;
		this.firePropertyChanged(DEFAULT_TARGET_ENTITY_PROPERTY, old, targetEntity);
	}

	protected abstract String buildDefaultTargetEntity();

	public PersistentType getResolvedTargetType() {
		return this.resolvedTargetType;
	}

	protected PersistentType buildResolvedTargetType() {
		String targetEntityClassName = (this.specifiedTargetEntity == null) ?
						this.defaultTargetEntity :
						this.mappingAnnotation.getFullyQualifiedTargetEntityClassName();
		return (targetEntityClassName == null) ? null : this.getPersistenceUnit().getPersistentType(targetEntityClassName);
	}
	
	public Entity getResolvedTargetEntity() {
		return this.resolvedTargetEntity;
	}

	protected void setResolvedTargetEntity(Entity entity) {
		Entity old = this.resolvedTargetEntity;
		this.resolvedTargetEntity = entity;
		this.firePropertyChanged(RESOLVED_TARGET_ENTITY_PROPERTY, old, entity);
	}

	protected Entity buildResolvedTargetEntity() {
		if (this.resolvedTargetType == null) {
			return null;
		}
		TypeMapping typeMapping = this.resolvedTargetType.getMapping();
		return (typeMapping instanceof Entity) ? (Entity) typeMapping : null;
	}

	public Iterator<String> allTargetEntityAttributeNames() {
		return new CompositeIterator<String>(
			new TransformationIterator<AttributeMapping, Iterator<String>>(this.allTargetEntityAttributeMappings()) {
				@Override
				protected Iterator<String> transform(AttributeMapping mapping) {
					return mapping.allMappingNames();
				}
		});
	}

	protected Iterator<AttributeMapping> allTargetEntityAttributeMappings() {
		return (this.resolvedTargetEntity != null) ?
				this.resolvedTargetEntity.allAttributeMappings() :
				EmptyIterator.<AttributeMapping> instance();
	}

	protected String getTargetEntityIdAttributeName() {
		PersistentAttribute attribute = this.getTargetEntityIdAttribute();
		return (attribute == null) ? null : attribute.getName();
	}

	protected PersistentAttribute getTargetEntityIdAttribute() {
		return (this.resolvedTargetEntity == null) ? null : this.resolvedTargetEntity.getIdAttribute();
	}

	public char getTargetEntityEnclosingTypeSeparator() {
		return '.';
	}


	// ********** relationship reference **********  

	public JavaRelationshipReference getRelationshipReference() {
		return this.relationshipReference;
	}

	protected abstract JavaRelationshipReference buildRelationshipReference();

	@Override
	public boolean isRelationshipOwner() {
		return this.relationshipReference.isRelationshipOwner();
	}

	public RelationshipMapping getRelationshipOwner() {
		Entity targetEntity = this.getResolvedTargetEntity();
		if (targetEntity == null) {
			return null;
		}
		for (PersistentAttribute each : 
			CollectionTools.iterable(
				targetEntity.getPersistentType().allAttributes())) {
			if (this.isOwnedBy(each.getMapping())) {
				return (RelationshipMapping) each.getMapping();
			}
		}
		return null;
	}

	@Override
	public boolean isOwnedBy(AttributeMapping mapping) {
		if (mapping.isRelationshipOwner()) {
			return this.relationshipReference.isOwnedBy((RelationshipMapping) mapping);
		}
		return false;
	}

	@Override
	public boolean isOverridableAssociationMapping() {
		return this.relationshipReference.isOverridableAssociation();
	}


	// ********** cascade **********  

	public JavaCascade getCascade() {
		return this.cascade;
	}


	// ********** fetch **********  

	public FetchType getFetch() {
		return (this.specifiedFetch != null) ? this.specifiedFetch : this.getDefaultFetch();
	}

	public FetchType getSpecifiedFetch() {
		return this.specifiedFetch;
	}

	public void setSpecifiedFetch(FetchType fetch) {
		FetchType old = this.specifiedFetch;
		this.specifiedFetch = fetch;
		this.mappingAnnotation.setFetch(FetchType.toJavaResourceModel(fetch));
		this.firePropertyChanged(SPECIFIED_FETCH_PROPERTY, old, fetch);
	}

	protected void setSpecifiedFetch_(FetchType fetch) {
		FetchType old = this.specifiedFetch;
		this.specifiedFetch = fetch;
		this.firePropertyChanged(SPECIFIED_FETCH_PROPERTY, old, fetch);
	}

	protected FetchType getResourceFetch() {
		return FetchType.fromJavaResourceModel(this.mappingAnnotation.getFetch());
	}


	// ********** Java completion proposals **********  

	@Override
	public Iterator<String> javaCompletionProposals(int pos, Filter<String> filter, CompilationUnit astRoot) {
		Iterator<String> result = super.javaCompletionProposals(pos, filter, astRoot);
		if (result != null) {
			return result;
		}
		return this.relationshipReference.javaCompletionProposals(pos, filter, astRoot);
	}


	// ********** validation **********  

	@Override
	public void validate(List<IMessage> messages, IReporter reporter, CompilationUnit astRoot) {
		super.validate(messages, reporter, astRoot);
		this.validateTargetEntity(messages, astRoot);
		this.relationshipReference.validate(messages, reporter, astRoot);
	}

	protected void validateTargetEntity(List<IMessage> messages, CompilationUnit astRoot) {
		if (this.getTargetEntity() == null) {
			messages.add(
				DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					JpaValidationMessages.TARGET_ENTITY_NOT_DEFINED,
					new String[] {this.getName()}, 
					this, 
					this.getValidationTextRange(astRoot)
				)
			);
		}
		else if (this.resolvedTargetEntity == null) {
			messages.add(
				DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					JpaValidationMessages.TARGET_ENTITY_IS_NOT_AN_ENTITY,
					new String[] {this.getTargetEntity(), this.getName()}, 
					this, 
					this.getTargetEntityTextRange(astRoot)
				)
			);
		}
	}

	protected TextRange getTargetEntityTextRange(CompilationUnit astRoot) {
		return this.getTextRange(this.mappingAnnotation.getTargetEntityTextRange(astRoot), astRoot);
	}

	protected TextRange getTextRange(TextRange textRange, CompilationUnit astRoot) {
		return (textRange != null) ? textRange : this.getParent().getValidationTextRange(astRoot);
	}


	// ********** metamodel ********** 

	@Override
	public String getMetamodelTypeName() {
		String targetEntity = this.getTargetEntity();
		return (targetEntity != null) ? targetEntity : MetamodelField.DEFAULT_TYPE_NAME;
	}

}
