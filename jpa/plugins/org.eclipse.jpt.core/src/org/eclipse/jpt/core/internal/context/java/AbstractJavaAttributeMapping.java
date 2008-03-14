/*******************************************************************************
 * Copyright (c) 2006, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.java;

import java.util.List;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.TextRange;
import org.eclipse.jpt.core.context.TypeMapping;
import org.eclipse.jpt.core.context.java.JavaAttributeMapping;
import org.eclipse.jpt.core.context.java.JavaPersistentAttribute;
import org.eclipse.jpt.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.core.internal.validation.JpaValidationMessages;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentAttribute;
import org.eclipse.jpt.db.Table;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;


public abstract class AbstractJavaAttributeMapping<T extends JavaResourceNode> extends AbstractJavaJpaContextNode
	implements JavaAttributeMapping
{
	protected JavaResourcePersistentAttribute resourcePersistentAttribute;
	

	protected AbstractJavaAttributeMapping(JavaPersistentAttribute parent) {
		super(parent);
	}
	
	@SuppressWarnings("unchecked")
	protected T mappingResource() {
		if (isDefault()) {
			return (T) this.resourcePersistentAttribute.nullMappingAnnotation(annotationName());
		}
		return (T) this.resourcePersistentAttribute.mappingAnnotation(annotationName());
	}
	
	public GenericJavaPersistentAttribute persistentAttribute() {
		return (GenericJavaPersistentAttribute) this.parent();
	}

	protected JavaResourcePersistentAttribute getResourcePersistentAttribute() {
		return this.resourcePersistentAttribute;
	}
	
	/**
	 * the persistent attribute can tell whether there is a "specified" mapping
	 * or a "default" one
	 */
	public boolean isDefault() {
		return this.persistentAttribute().mappingIsDefault(this);
	}

	protected boolean embeddableOwned() {
		return this.typeMapping().getKey() == MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY;
	}
	
	protected boolean entityOwned() {
		return this.typeMapping().getKey() == MappingKeys.ENTITY_TYPE_MAPPING_KEY;
	}
	
	public TypeMapping typeMapping() {
		return this.persistentAttribute().typeMapping();
	}

	public String attributeName() {
		return this.persistentAttribute().getName();
	}
	
	public Table dbTable(String tableName) {
		return typeMapping().dbTable(tableName);
	}
	
	public TextRange validationTextRange(CompilationUnit astRoot) {
		TextRange textRange = this.mappingResource().textRange(astRoot);
		return (textRange != null) ? textRange : this.persistentAttribute().validationTextRange(astRoot);
	}
	
	public String primaryKeyColumnName() {
		return null;
	}

	public boolean isOverridableAttributeMapping() {
		return false;
	}

	public boolean isOverridableAssociationMapping() {
		return false;
	}

	public boolean isIdMapping() {
		return false;
	}

	public void initializeFromResource(JavaResourcePersistentAttribute resourcePersistentAttribute) {
		this.resourcePersistentAttribute = resourcePersistentAttribute;
		initialize(mappingResource());
	}

	protected void initialize(T mappingResource) {
		
	}

	public void update(JavaResourcePersistentAttribute resourcePersistentAttribute) {
		this.resourcePersistentAttribute = resourcePersistentAttribute;
		this.update(mappingResource());
	}
	
	protected void update(T mappingResource) {
		
	}

	
	//************ Validation *************************
	
	@Override
	public void addToMessages(List<IMessage> messages, CompilationUnit astRoot) {
		super.addToMessages(messages, astRoot);
		
		addModifierMessages(messages, astRoot);
		addInvalidMappingMessage(messages, astRoot);
		
	}
	
	protected void addModifierMessages(List<IMessage> messages, CompilationUnit astRoot) {
		GenericJavaPersistentAttribute attribute = this.persistentAttribute();
		if (attribute.getMapping().getKey() != MappingKeys.TRANSIENT_ATTRIBUTE_MAPPING_KEY
				&& this.resourcePersistentAttribute.isForField()) {
			int flags;
			
			try {
				flags = this.resourcePersistentAttribute.getMember().getJdtMember().getFlags();
			} catch (JavaModelException jme) { 
				/* no error to log, in that case */ 
				return;
			}
			
			if (Flags.isFinal(flags)) {
				messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.PERSISTENT_ATTRIBUTE_FINAL_FIELD,
						new String[] {attribute.getName()},
						attribute, attribute.validationTextRange(astRoot))
				);
			}
			
			if (Flags.isPublic(flags)) {
				messages.add(
					DefaultJpaValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JpaValidationMessages.PERSISTENT_ATTRIBUTE_PUBLIC_FIELD,
						new String[] {attribute.getName()},
						attribute, attribute.validationTextRange(astRoot))
				);
				
			}
		}
	}
	
	protected void addInvalidMappingMessage(List<IMessage> messages, CompilationUnit astRoot) {
		if (! typeMapping().attributeMappingKeyAllowed(this.getKey())) {
			messages.add(
				DefaultJpaValidationMessages.buildMessage(
					IMessage.HIGH_SEVERITY,
					JpaValidationMessages.PERSISTENT_ATTRIBUTE_INVALID_MAPPING,
					new String[] {this.persistentAttribute().getName()},
					this, this.validationTextRange(astRoot))
			);
		}
	}
	
}
