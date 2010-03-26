/*******************************************************************************
 * Copyright (c) 2007, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.details.orm;

import org.eclipse.jpt.core.context.OneToOneMapping;
import org.eclipse.jpt.core.context.OneToOneRelationshipReference;
import org.eclipse.jpt.core.context.orm.OrmOneToOneMapping;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.internal.details.AbstractOneToOneMappingComposite;
import org.eclipse.jpt.ui.internal.details.CascadeComposite;
import org.eclipse.jpt.ui.internal.details.FetchTypeComposite;
import org.eclipse.jpt.ui.internal.details.OptionalComposite;
import org.eclipse.jpt.ui.internal.details.TargetEntityComposite;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | TargetEntityComposite                                                 | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | JoiningStrategyComposite                                              | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | FetchTypeComposite                                                    | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | OptionalComposite                                                     | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | CascadeComposite                                                      | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see OneToOneMapping
 * @see TargetEntityComposite
 * @see JoiningStrategyComposite
 * @see FetchTypeComposite
 * @see OptionalComposite
 * @see CascadeComposite
 *
 * @version 2.3
 * @since 1.0
 */
public class OrmOneToOneMappingComposite 
	extends AbstractOneToOneMappingComposite<OrmOneToOneMapping, OneToOneRelationshipReference>
{
	/**
	 * Creates a new <code>OneToOneMappingComposite</code>.
	 *
	 * @param subjectHolder The holder of the subject <code>IOneToOneMapping</code>
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public OrmOneToOneMappingComposite(PropertyValueModel<? extends OrmOneToOneMapping> subjectHolder,
	                                Composite parent,
	                                WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}	

	@Override
	protected void initializeOneToOneSection(Composite container) {
		new TargetEntityComposite(this, container);
		new OrmMappingNameChooser(this, getSubjectHolder(), container);
		new FetchTypeComposite(this, container);
		new OptionalComposite(this, container);
		new CascadeComposite(this, buildCascadeHolder(),  addSubPane(container, 5));
	}


}