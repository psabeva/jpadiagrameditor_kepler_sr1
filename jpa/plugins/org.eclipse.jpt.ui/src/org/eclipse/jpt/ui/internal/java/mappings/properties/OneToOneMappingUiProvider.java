/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.java.mappings.properties;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.jpt.core.internal.IMappingKeys;
import org.eclipse.jpt.ui.internal.IJpaUiFactory;
import org.eclipse.jpt.ui.internal.details.IJpaComposite;
import org.eclipse.jpt.ui.internal.java.details.IAttributeMappingUiProvider;
import org.eclipse.jpt.ui.internal.mappings.JptUiMappingsMessages;
import org.eclipse.jpt.ui.internal.mappings.details.OneToOneComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public class OneToOneMappingUiProvider
	implements IAttributeMappingUiProvider
{
	
	// singleton
	private static final OneToOneMappingUiProvider INSTANCE = new OneToOneMappingUiProvider();

	/**
	 * Return the singleton.
	 */
	public static IAttributeMappingUiProvider instance() {
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private OneToOneMappingUiProvider() {
		super();
	}

	public String attributeMappingKey() {
		return IMappingKeys.ONE_TO_ONE_ATTRIBUTE_MAPPING_KEY;
	}
	
	public String label() {
		return JptUiMappingsMessages.PersistentAttributePage_OneToOneLabel;
	}
	
	public IJpaComposite buildAttributeMappingComposite(IJpaUiFactory factory, Composite parent, CommandStack commandStack, TabbedPropertySheetWidgetFactory widgetFactory) {
		return factory.createOneToOneMappingComposite(parent, commandStack, widgetFactory);
	}
}