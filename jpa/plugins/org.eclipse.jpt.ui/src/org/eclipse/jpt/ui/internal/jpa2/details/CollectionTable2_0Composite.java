/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.jpa2.details;

import org.eclipse.jpt.core.jpa2.context.CollectionTable2_0;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.internal.JpaHelpContextIds;
import org.eclipse.jpt.ui.internal.details.JoinColumnsComposite;
import org.eclipse.jpt.ui.internal.details.ReferenceTableComposite;
import org.eclipse.jpt.ui.internal.details.db.CatalogCombo;
import org.eclipse.jpt.ui.internal.details.db.SchemaCombo;
import org.eclipse.jpt.ui.internal.details.db.TableCombo;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/**
 * The layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * |            ------------------------------------------------------------   |
 * |   Name:    |                                                        |v|   |
 * |            ------------------------------------------------------------   |
 * |            ------------------------------------------------------------   |
 * |   Schema:  |                                                        |v|   |
 * |            ------------------------------------------------------------   |
 * |            ------------------------------------------------------------   |
 * |   Catalog: |                                                        |v|   |
 * |            ------------------------------------------------------------   |
 * |                                                                           |
 * | - Join Columns ---------------------------------------------------------- |
 * | |                                                                       | |
 * | | x Override Default                                                    | |
 * | |                                                                       | |
 * | | --------------------------------------------------------------------- | |
 * | | |                                                                   | | |
 * | | | JoinColumnsComposite                                              | | |
 * | | |                                                                   | | |
 * | | --------------------------------------------------------------------- | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see {@link CollectionTable2_0}
 * @see {@link JoinColumnsComposite
 *
 * @version 3.0
 * @since 3.0
 */
public class CollectionTable2_0Composite extends ReferenceTableComposite<CollectionTable2_0>
{
	/**
	 * Creates a new <code>CollectionTable2_0Composite</code>.
	 *
	 * @param parentPane The parent container of this one
	 * @param subjectHolder The holder of this pane's subject
	 * @param parent The parent container
	 */
	public CollectionTable2_0Composite(
			FormPane<?> parentPane,
			PropertyValueModel<? extends CollectionTable2_0> subjectHolder,
			Composite parent) {

		super(parentPane, subjectHolder, parent);
	}

	/**
	 * Creates a new <code>CollectionTable2_0Composite</code>.
	 *
	 * @param subjectHolder The holder of the subject <code>CollectionTable2_0</code>
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	public CollectionTable2_0Composite(PropertyValueModel<? extends CollectionTable2_0> subjectHolder,
	                          Composite parent,
	                          WidgetFactory widgetFactory) {

		super(subjectHolder, parent, widgetFactory);
	}

	@Override
	protected void initializeLayout(Composite container) {
		// collection table group pane
		container = addTitledGroup(
			container,
			JptUiDetailsMessages2_0.CollectionTable2_0Composite_title
		);

		int groupBoxMargin = getGroupBoxMargin();

		// Name widgets
		TableCombo<CollectionTable2_0> tableCombo = addTableCombo(container);
		Composite tablePane = addPane(container, groupBoxMargin);
		addLabeledComposite(
				tablePane,
			JptUiDetailsMessages2_0.CollectionTable2_0Composite_name,
			tableCombo.getControl(),
			JpaHelpContextIds.MAPPING_COLLECTION_TABLE_NAME
		);
		
		// schema widgets
		SchemaCombo<CollectionTable2_0> schemaCombo = addSchemaCombo(container);

		addLabeledComposite(
			tablePane,
			JptUiDetailsMessages2_0.CollectionTable2_0Composite_schema,
			schemaCombo.getControl(),
			JpaHelpContextIds.MAPPING_COLLECTION_TABLE_SCHEMA
		);
		
		// catalog widgets
		CatalogCombo<CollectionTable2_0> catalogCombo = addCatalogCombo(container);

		addLabeledComposite(
			tablePane,
			JptUiDetailsMessages2_0.CollectionTable2_0Composite_catalog,
			catalogCombo.getControl(),
			JpaHelpContextIds.MAPPING_COLLECTION_TABLE_CATALOG
		);

		// Join Columns group pane
		Group joinColumnGroupPane = addTitledGroup(
			container,
			JptUiDetailsMessages2_0.CollectionTable2_0Composite_joinColumn
		);

		// Override Default Join Columns check box
		this.overrideDefaultJoinColumnsCheckBox = addCheckBox(
			addSubPane(joinColumnGroupPane, 8),
			JptUiDetailsMessages2_0.CollectionTable2_0Composite_overrideDefaultJoinColumns,
			buildOverrideDefaultJoinColumnHolder(),
			null
		);

		this.joinColumnsComposite = new JoinColumnsComposite<CollectionTable2_0>(
			this,
			joinColumnGroupPane,
			buildJoinColumnsEditor()
		);

		installJoinColumnsPaneEnabler(this.joinColumnsComposite);
	}
	
	@Override
	protected boolean isParentVirtual(CollectionTable2_0 collectionTable) {
		return collectionTable.getPersistentAttribute().isVirtual();
	}
}