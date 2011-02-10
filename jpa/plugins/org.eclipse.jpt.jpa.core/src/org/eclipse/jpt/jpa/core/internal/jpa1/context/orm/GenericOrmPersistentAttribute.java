/*******************************************************************************
 * Copyright (c) 2006, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa1.context.orm;

import java.util.List;
import org.eclipse.jpt.jpa.core.context.AccessType;
import org.eclipse.jpt.jpa.core.context.java.JavaPersistentType;
import org.eclipse.jpt.jpa.core.context.orm.OrmPersistentType;
import org.eclipse.jpt.jpa.core.internal.context.JptValidator;
import org.eclipse.jpt.jpa.core.internal.context.orm.SpecifiedOrmPersistentAttribute;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.GenericPersistentAttributeValidator;
import org.eclipse.jpt.jpa.core.internal.validation.DefaultJpaValidationMessages;
import org.eclipse.jpt.jpa.core.internal.validation.JpaValidationMessages;
import org.eclipse.jpt.jpa.core.resource.orm.XmlAttributeMapping;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

/**
 * <code>orm.xml</code> persistent attribute
 */
public class GenericOrmPersistentAttribute
	extends SpecifiedOrmPersistentAttribute
{
	public GenericOrmPersistentAttribute(OrmPersistentType parent, XmlAttributeMapping xmlMapping) {
		super(parent, xmlMapping);
	}


	// ********** access **********

	/**
	 * JPA 1.0 does not support a specified access for attributes.
	 */
	@Override
	public AccessType getSpecifiedAccess() {
		return null;
	}

	public void setSpecifiedAccess(AccessType access) {
		throw new UnsupportedOperationException("A specified access is not supported in JPA 1.0: " + this); //$NON-NLS-1$
	}


	// ********** validation **********

	@Override
	protected void validateAttribute(List<IMessage> messages, IReporter reporter) {
		super.validateAttribute(messages, reporter);
		if (this.javaPersistentAttribute != null) {
			JavaPersistentType javaPersistentType = this.getOwningPersistentType().getJavaPersistentType();
			if ((javaPersistentType != null) && (javaPersistentType.getAttributeNamed(this.javaPersistentAttribute.getName()) == null)) {
				messages.add(
						DefaultJpaValidationMessages.buildMessage(
							IMessage.NORMAL_SEVERITY,
							JpaValidationMessages.PERSISTENT_ATTRIBUTE_INHERITED_ATTRIBUTES_NOT_SUPPORTED,
							new String[] {
								this.getName(),
								this.getOwningPersistentType().getMapping().getClass_()
							},
							this.mapping,
							this.mapping.getNameTextRange()
						)
					);
			}
		}
	}

	@Override
	protected JptValidator buildAttibuteValidator() {
		return new GenericPersistentAttributeValidator(this, getJavaPersistentAttribute(), buildTextRangeResolver());
	}
}