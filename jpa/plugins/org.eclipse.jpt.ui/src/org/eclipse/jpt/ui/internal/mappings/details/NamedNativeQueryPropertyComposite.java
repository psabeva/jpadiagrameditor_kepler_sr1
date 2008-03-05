/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.jpt.core.context.NamedNativeQuery;
import org.eclipse.jpt.ui.internal.mappings.JptUiMappingsMessages;
import org.eclipse.jpt.ui.internal.widgets.AbstractFormPane;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.utility.model.value.WritablePropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * |        ------------------------------------------------------------------ |
 * | Query: | I                                                              | |
 * |        |                                                                | |
 * |        |                                                                | |
 * |        ------------------------------------------------------------------ |
 * |                                                                           |
 * | - Query Hints ----------------------------------------------------------- |
 * | | --------------------------------------------------------------------- | |
 * | | |                                                                   | | |
 * | | | QueryHintsComposite                                               | | |
 * | | |                                                                   | | |
 * | | --------------------------------------------------------------------- | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see NamedNativeQuery
 * @see NamedNativeQueriesComposite - The parent container
 *
 * @version 2.0
 * @since 2.0
 */
public class NamedNativeQueryPropertyComposite extends AbstractFormPane<NamedNativeQuery>
{
	/**
	 * Creates a new <code>NamedNativeQueryPropertyComposite</code>.
	 *
	 * @param parentPane The parent container of this one
	 * @param subjectHolder The holder of this pane's subject
	 * @param parent The parent container
	 */
	public NamedNativeQueryPropertyComposite(AbstractFormPane<?> parentPane,
	                                         PropertyValueModel<? extends NamedNativeQuery> subjectHolder,
	                                         Composite parent) {

		super(parentPane, subjectHolder, parent);
	}

	private WritablePropertyValueModel<String> buildQueryHolder() {
		return new PropertyAspectAdapter<NamedNativeQuery, String>(getSubjectHolder(), NamedNativeQuery.QUERY_PROPERTY) {
			@Override
			protected String buildValue_() {
				return subject.getQuery();
			}

			@Override
			protected void setValue_(String value) {
				subject.setQuery(value);
			}
		};
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected void initializeLayout(Composite container) {

		int groupBoxMargin = groupBoxMargin();

		// Query text area
		buildLabeledMultiLineText(
			buildSubPane(container, 0, groupBoxMargin, 0, groupBoxMargin),
			JptUiMappingsMessages.NamedQueryPropertyComposite_query,
			buildQueryHolder(),
			4
		);

		// Query Hints pane
		container = buildTitledPane(
			container,
			JptUiMappingsMessages.NamedQueryPropertyComposite_queryHintsGroupBox
		);

		new QueryHintsComposite(this, container);
	}
}
