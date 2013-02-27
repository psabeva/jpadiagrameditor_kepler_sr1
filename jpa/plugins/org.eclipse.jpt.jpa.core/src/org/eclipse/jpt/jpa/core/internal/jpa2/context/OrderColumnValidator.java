/*******************************************************************************
 * Copyright (c) 2010, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.jpa2.context;

import org.eclipse.jpt.common.core.utility.ValidationMessage;
import org.eclipse.jpt.jpa.core.context.PersistentAttribute;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.AbstractNamedColumnValidator;
import org.eclipse.jpt.jpa.core.jpa2.context.ModifiableOrderColumn2_0;
import org.eclipse.jpt.jpa.core.validation.JptJpaCoreValidationMessages;

public class OrderColumnValidator
	extends AbstractNamedColumnValidator<ModifiableOrderColumn2_0>
{
	public OrderColumnValidator(
				PersistentAttribute persistentAttribute,
				ModifiableOrderColumn2_0 column) {
		super(persistentAttribute, column);
	}

	@Override
	protected ValidationMessage getUnresolvedNameMessage() {
		return JptJpaCoreValidationMessages.ORDER_COLUMN_UNRESOLVED_NAME;
	}

	@Override
	protected ValidationMessage getVirtualAttributeUnresolvedNameMessage() {
		return JptJpaCoreValidationMessages.VIRTUAL_ATTRIBUTE_ORDER_COLUMN_UNRESOLVED_NAME;
	}
}
