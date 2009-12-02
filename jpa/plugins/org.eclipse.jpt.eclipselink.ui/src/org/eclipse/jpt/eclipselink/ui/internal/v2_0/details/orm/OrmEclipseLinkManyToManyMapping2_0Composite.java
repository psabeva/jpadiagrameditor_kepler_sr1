/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.v2_0.details.orm;

import org.eclipse.jpt.core.context.ManyToManyMapping;
import org.eclipse.jpt.eclipselink.ui.internal.details.EclipseLinkJoinFetchComposite;
import org.eclipse.jpt.eclipselink.ui.internal.details.EclipseLinkManyToManyMappingComposite;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.internal.details.AccessTypeComposite;
import org.eclipse.jpt.ui.internal.details.CascadeComposite;
import org.eclipse.jpt.ui.internal.details.FetchTypeComposite;
import org.eclipse.jpt.ui.internal.details.ManyToManyJoiningStrategyPane;
import org.eclipse.jpt.ui.internal.details.OrderingComposite;
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
 * | | CascadeComposite                                                      | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | OrderingComposite                                                     | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see {@link ManyToManyMapping}
 * @see {@link TargetEntityComposite}
 * @see {@link ManyToManyJoiningStrategyPane}
 * @see {@link FetchTypeComposite}
 * @see {@link CascadeComposite}
 * @see {@link OrderingComposite}
 *
 * @version 2.2
 * @since 2.2
 */
public class OrmEclipseLinkManyToManyMapping2_0Composite extends EclipseLinkManyToManyMappingComposite
{
	/**
	 * Creates a new <code>ManyToManyMappingComposite</code>.
	 *
	 * @param subjectHolder The holder of the subject <code>IManyToManyMapping</code>
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public OrmEclipseLinkManyToManyMapping2_0Composite(PropertyValueModel<? extends ManyToManyMapping> subjectHolder,
	                                  Composite parent,
	                                  WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}
	
	@Override
	protected void initializeLayout(Composite container) {
		int groupBoxMargin = getGroupBoxMargin();
		
		new TargetEntityComposite(this, addPane(container, groupBoxMargin));
		new ManyToManyJoiningStrategyPane(this, buildJoiningHolder(), container);
		new AccessTypeComposite(this, buildAccessHolderHolder(), addPane(container, groupBoxMargin));
		new FetchTypeComposite(this, addPane(container, groupBoxMargin));
		new EclipseLinkJoinFetchComposite(this, buildJoinFetchableHolder(), addPane(container, groupBoxMargin));
		new CascadeComposite(this, buildCascadeHolder(), addSubPane(container, 5));
		new OrderingComposite(this, container);
	}
}