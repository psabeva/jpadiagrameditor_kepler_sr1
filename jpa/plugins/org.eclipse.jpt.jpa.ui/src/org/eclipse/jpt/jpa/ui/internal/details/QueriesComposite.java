/*******************************************************************************
 * Copyright (c) 2008, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.details;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.parser.Entity;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.jpt.common.ui.internal.util.ControlSwitcher;
import org.eclipse.jpt.common.ui.internal.widgets.AddRemoveListPane;
import org.eclipse.jpt.common.ui.internal.widgets.AddRemovePane.Adapter;
import org.eclipse.jpt.common.ui.internal.widgets.Pane;
import org.eclipse.jpt.common.utility.internal.CollectionTools;
import org.eclipse.jpt.common.utility.internal.Transformer;
import org.eclipse.jpt.common.utility.internal.iterables.ListIterable;
import org.eclipse.jpt.common.utility.internal.iterables.SuperListIterableWrapper;
import org.eclipse.jpt.common.utility.internal.model.value.CollectionPropertyValueModelAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.CompositeListValueModel;
import org.eclipse.jpt.common.utility.internal.model.value.ItemPropertyListValueModelAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.ListAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.SimpleCollectionValueModel;
import org.eclipse.jpt.common.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.CollectionValueModel;
import org.eclipse.jpt.common.utility.model.value.ListValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiableCollectionValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.NamedNativeQuery;
import org.eclipse.jpt.jpa.core.context.NamedQuery;
import org.eclipse.jpt.jpa.core.context.Query;
import org.eclipse.jpt.jpa.core.context.QueryContainer;
import org.eclipse.jpt.jpa.ui.internal.JpaHelpContextIds;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.PageBook;

/**
 * This pane shows the list of named queries and named native queries.
 * <p>
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | AddRemoveListPane                                                     | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | NamedQueryPropertyComposite or NamedNativeQueryPropertyComposite      | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see Entity
 * @see Query
 * @see NamedNativeQuery
 * @see NamedQuery
 * @see AbstractEntityComposite - The parent container
 * @see NamedNativeQueryPropertyComposite
 * @see NamedQueryPropertyComposite
 *
 * @version 2.0
 * @since 2.0
 */
public class QueriesComposite extends Pane<QueryContainer>
{
	Pane<? extends NamedNativeQuery> namedNativeQueryPane; //lazy initialized to avoid unnecessary handles 
	Pane<? extends NamedQuery> namedQueryPane; //lazy initialized to avoid unnecessary handles

	private ModifiableCollectionValueModel<Query> selectedQueriesModel;
	private PropertyValueModel<Query> selectedQueryModel;


	public QueriesComposite(
		Pane<?> parentPane, 
		PropertyValueModel<? extends QueryContainer> subjectHolder,
		Composite parent) {

			super(parentPane, subjectHolder, parent);
	}

	@Override
	protected void initialize() {
		super.initialize();
		this.selectedQueriesModel = this.buildSelectedQueriesModel();
		this.selectedQueryModel = this.buildSelectedQueryModel(this.selectedQueriesModel);
	}

	private ModifiableCollectionValueModel<Query> buildSelectedQueriesModel() {
		return new SimpleCollectionValueModel<Query>();
	}

	private PropertyValueModel<Query> buildSelectedQueryModel(CollectionValueModel<Query> selectedQueriesModel) {
		return new CollectionPropertyValueModelAdapter<Query, Query>(selectedQueriesModel) {
			@Override
			protected Query buildValue() {
				if (this.collectionModel.size() == 1) {
					return this.collectionModel.iterator().next();
				}
				return null;
			}
		};
	}

	protected PropertyValueModel<Query> getSelectedQueryModel() {
		return this.selectedQueryModel;
	}

	@Override
	protected void initializeLayout(Composite container) {

		// List pane
		this.addListPane(container);

		// Property pane
		PageBook pageBook = new PageBook(container, SWT.NULL);
		pageBook.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		installPaneSwitcher(pageBook);
	}
	
	private AddRemoveListPane<QueryContainer, Query> addListPane(Composite container) {

		return new AddRemoveListPane<QueryContainer, Query>(
			this,
			container,
			buildQueriesAdapter(),
			buildDisplayableQueriesListHolder(),
			this.selectedQueriesModel,
			buildQueriesListLabelProvider(),
			JpaHelpContextIds.MAPPING_NAMED_QUERIES
		);
	}


	private void installPaneSwitcher(PageBook pageBook) {
		new ControlSwitcher(this.getSelectedQueryModel(), this.buildPaneTransformer(pageBook), pageBook);
	}

	Query addQuery() {
		return addQueryFromDialog(buildAddQueryDialog());
	}

	protected AddQueryDialog buildAddQueryDialog() {
		return new AddQueryDialog(getShell(), this.getSubject().getPersistenceUnit());
	}

	protected Query addQueryFromDialog(AddQueryDialog dialog) {
		if (dialog.open() != Window.OK) {
			return null;
		}
		String queryType = dialog.getQueryType();
		Query query;
		if (queryType == AddQueryDialog.NAMED_QUERY) {
			query = this.getSubject().addNamedQuery();
		}
		else if (queryType == AddQueryDialog.NAMED_NATIVE_QUERY) {
			query = this.getSubject().addNamedNativeQuery();
		}
		else {
			throw new IllegalArgumentException();
		}
		query.setName(dialog.getName());
		return query;
	}

	private ListValueModel<Query> buildDisplayableQueriesListHolder() {
		return new ItemPropertyListValueModelAdapter<Query>(
			buildQueriesListHolder(),
			Query.NAME_PROPERTY
		);
	}

	private ListValueModel<NamedNativeQuery> buildNamedNativeQueriesListHolder() {
		return new ListAspectAdapter<QueryContainer, NamedNativeQuery>(
			getSubjectHolder(),
			QueryContainer.NAMED_NATIVE_QUERIES_LIST)
		{
			@Override
			protected ListIterable<NamedNativeQuery> getListIterable() {
				return new SuperListIterableWrapper<NamedNativeQuery>(this.subject.getNamedNativeQueries());
			}

			@Override
			protected int size_() {
				return this.subject.getNamedNativeQueriesSize();
			}
		};
	}

	private PropertyValueModel<NamedNativeQuery> buildSelectedNamedNativeQueryModel() {
		return new TransformationPropertyValueModel<Query, NamedNativeQuery>(this.getSelectedQueryModel()) {
			@Override
			protected NamedNativeQuery transform_(Query value) {
				return (value instanceof NamedNativeQuery) ? (NamedNativeQuery) value : null;
			}
		};
	}

	private ListValueModel<NamedQuery> buildNamedQueriesListHolder() {
		return new ListAspectAdapter<QueryContainer, NamedQuery>(
			getSubjectHolder(),
			QueryContainer.NAMED_QUERIES_LIST)
		{
			@Override
			protected ListIterable<NamedQuery> getListIterable() {
				return new SuperListIterableWrapper<NamedQuery>(this.subject.getNamedQueries());
			}

			@Override
			protected int size_() {
				return this.subject.getNamedQueriesSize();
			}
		};
	}

	private PropertyValueModel<NamedQuery> buildSelectedNamedQueryModel() {
		return new TransformationPropertyValueModel<Query, NamedQuery>(this.getSelectedQueryModel()) {
			@Override
			protected NamedQuery transform_(Query value) {
				return (value instanceof NamedQuery) ? (NamedQuery) value : null;
			}
		};
	}

	private Transformer<Query, Control> buildPaneTransformer(final PageBook pageBook) {
		return new Transformer<Query, Control>() {
			public Control transform(Query query) {

				if (query == null) {
					return null;
				}

				if (query instanceof NamedNativeQuery) {
					return QueriesComposite.this.getNamedNativeQueryPropertyComposite(pageBook).getControl();
				}

				return QueriesComposite.this.getNamedQueryPropertyComposite(pageBook).getControl();
			}
		};
	}
	
	private Adapter<Query> buildQueriesAdapter() {

		return new AddRemoveListPane.AbstractAdapter<Query>() {

			public Query addNewItem() {
				return addQuery();
			}

			@Override
			public PropertyValueModel<Boolean> buildRemoveButtonEnabledModel(CollectionValueModel<Query> selectedItemsModel) {
				//enable the remove button only when 1 item is selected, same as the optional button
				return this.buildSingleSelectedItemEnabledModel(selectedItemsModel);
			}

			public void removeSelectedItems(CollectionValueModel<Query> selectedItemsModel) {
				//assume only 1 item since remove button is disabled otherwise
				Query item = selectedItemsModel.iterator().next();
				if (item instanceof NamedQuery) {
					getSubject().removeNamedQuery((NamedQuery) item);
				}
				else {
					getSubject().removeNamedNativeQuery((NamedNativeQuery) item);
				}
			}
		};
	}

	private ListValueModel<Query> buildQueriesListHolder() {
		List<ListValueModel<? extends Query>> list = new ArrayList<ListValueModel<? extends Query>>();
		list.add(buildNamedQueriesListHolder());
		list.add(buildNamedNativeQueriesListHolder());
		return new CompositeListValueModel<ListValueModel<? extends Query>, Query>(list);
	}

	private ILabelProvider buildQueriesListLabelProvider() {
		return new LabelProvider() {
			@Override
			public String getText(Object element) {
				Query query = (Query) element;
				String name = query.getName();

				if (name == null) {
					int index = -1;

					if (query instanceof NamedQuery) {
						index = CollectionTools.indexOf(getSubject().getNamedQueries(), query);
					}
					else {
						index = CollectionTools.indexOf(getSubject().getNamedNativeQueries(), query);
					}

					name = NLS.bind(JptUiDetailsMessages.QueriesComposite_displayString, Integer.valueOf(index));
				}

				return name;
			}
		};
	}

	protected Pane<? extends NamedQuery> getNamedQueryPropertyComposite(PageBook pageBook) {
		if (this.namedQueryPane == null) {
			this.namedQueryPane = this.buildNamedQueryPropertyComposite(pageBook);
		}
		return this.namedQueryPane;
	}

	protected Pane<? extends NamedQuery> buildNamedQueryPropertyComposite(PageBook pageBook) {
		return new NamedQueryPropertyComposite<NamedQuery>(
			this,
			this.buildSelectedNamedQueryModel(),
			pageBook
		);
	}
	
	protected Pane<? extends NamedNativeQuery> getNamedNativeQueryPropertyComposite(PageBook pageBook) {
		if (this.namedNativeQueryPane == null) {
			this.namedNativeQueryPane = this.buildNamedNativeQueryPropertyComposite(pageBook);
		}
		return this.namedNativeQueryPane;
	}

	protected Pane<? extends NamedNativeQuery> buildNamedNativeQueryPropertyComposite(PageBook pageBook) {
		return new NamedNativeQueryPropertyComposite(
			this,
			this.buildSelectedNamedNativeQueryModel(),
			pageBook
		);
	}
}