/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.details.orm;

import org.eclipse.jpt.common.ui.WidgetFactory;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.EmbeddedMapping;
import org.eclipse.jpt.jpa.ui.internal.details.AbstractEmbeddedMappingComposite;
import org.eclipse.jpt.jpa.ui.internal.details.EmbeddedMappingOverridesComposite;
import org.eclipse.jpt.jpa.ui.internal.details.java.BaseJavaUiFactory;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | EmbeddedAttributeOverridesComposite                                   | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see EmbeddedMapping
 * @see BaseJavaUiFactory - The factory creating this pane
 *
 * @version 2.3
 * @since 2.2
 */
public class OrmEmbeddedMappingComposite
	extends AbstractEmbeddedMappingComposite<EmbeddedMapping>
{
	/**
	 * Creates a new <code>EmbeddedMappingComposite</code>.
	 *
	 * @param subjectHolder The holder of the subject <code>EmbeddedMapping</code>
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public OrmEmbeddedMappingComposite(PropertyValueModel<? extends EmbeddedMapping> subjectHolder,
									PropertyValueModel<Boolean> enabledModel,
									Composite parent,
	                                WidgetFactory widgetFactory) {

		super(subjectHolder, enabledModel, parent, widgetFactory);
	}
	
	@Override
	protected Control initializeEmbeddedSection(Composite container) {
		container = this.addSubPane(container, 2, 0, 0, 0, 0);

		// Name widgets
		this.addLabel(container, JptUiDetailsOrmMessages.OrmMappingNameChooser_name);
		new OrmMappingNameText(this, getSubjectHolder(), container);

		// Overrides widgets
		EmbeddedMappingOverridesComposite overridesComposite = new EmbeddedMappingOverridesComposite(
				this,
				container);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		overridesComposite.getControl().setLayoutData(gridData);

		return container;
	}	

}