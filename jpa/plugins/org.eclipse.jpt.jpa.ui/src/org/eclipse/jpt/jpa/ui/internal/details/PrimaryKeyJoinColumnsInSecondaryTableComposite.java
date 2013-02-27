/*******************************************************************************
 * Copyright (c) 2007, 2013 Oracle. All rights reserved.
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
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jpt.common.ui.internal.widgets.AddRemoveListPane;
import org.eclipse.jpt.common.ui.internal.widgets.AddRemovePane;
import org.eclipse.jpt.common.ui.internal.widgets.Pane;
import org.eclipse.jpt.common.utility.internal.iterable.SuperListIterableWrapper;
import org.eclipse.jpt.common.utility.internal.model.value.CompositeListValueModel;
import org.eclipse.jpt.common.utility.internal.model.value.ItemPropertyListValueModelAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.ListAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.ListPropertyValueModelAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyListValueModelAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.SimpleCollectionValueModel;
import org.eclipse.jpt.common.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.common.utility.iterable.ListIterable;
import org.eclipse.jpt.common.utility.model.value.CollectionValueModel;
import org.eclipse.jpt.common.utility.model.value.ListValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiableCollectionValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiablePropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.ModifiableBaseJoinColumn;
import org.eclipse.jpt.jpa.core.context.ModifiablePrimaryKeyJoinColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlyBaseJoinColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlyNamedColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlyPrimaryKeyJoinColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlySecondaryTable;
import org.eclipse.jpt.jpa.core.context.SecondaryTable;
import org.eclipse.jpt.jpa.ui.details.JptJpaUiDetailsMessages;
import org.eclipse.jpt.jpa.ui.internal.JpaHelpContextIds;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class PrimaryKeyJoinColumnsInSecondaryTableComposite
	extends Pane<ReadOnlySecondaryTable>
{
	private ModifiableCollectionValueModel<ModifiablePrimaryKeyJoinColumn> selectedPkJoinColumnsModel;


	public PrimaryKeyJoinColumnsInSecondaryTableComposite(
			Pane<?> parent,
			PropertyValueModel<? extends ReadOnlySecondaryTable> tableModel,
			Composite parentComposite) {
		super(parent, tableModel, parentComposite);
	}

	ModifiablePrimaryKeyJoinColumn addJoinColumn(PrimaryKeyJoinColumnInSecondaryTableStateObject stateObject) {

		SecondaryTable secondaryTable = (SecondaryTable) stateObject.getOwner();
		int index = secondaryTable.getSpecifiedPrimaryKeyJoinColumnsSize();

		ModifiablePrimaryKeyJoinColumn joinColumn = secondaryTable.addSpecifiedPrimaryKeyJoinColumn(index);
		stateObject.updateJoinColumn(joinColumn);

		return joinColumn;
	}

	ModifiablePrimaryKeyJoinColumn addPrimaryKeyJoinColumn() {
		PrimaryKeyJoinColumnInSecondaryTableDialog dialog = new PrimaryKeyJoinColumnInSecondaryTableDialog(this.getShell(), this.getResourceManager(), this.getSubject());
		dialog.setBlockOnOpen(true);
		dialog.open();
		return (dialog.wasConfirmed()) ? this.addJoinColumn(dialog.getSubject()) : null;
	}

	private PropertyValueModel<Boolean> buildControlBooleanHolder() {
		return new TransformationPropertyValueModel<ReadOnlySecondaryTable, Boolean>(getSubjectHolder()) {
			@Override
			protected Boolean transform(ReadOnlySecondaryTable value) {
				if (value == null) {
					return Boolean.FALSE;
				}
				return Boolean.valueOf(!value.isVirtual());
			}
		};
	}

	private PropertyValueModel<ReadOnlyPrimaryKeyJoinColumn> buildDefaultJoinColumnHolder() {
		return new PropertyAspectAdapter<ReadOnlySecondaryTable, ReadOnlyPrimaryKeyJoinColumn>(getSubjectHolder(), ReadOnlySecondaryTable.DEFAULT_PRIMARY_KEY_JOIN_COLUMN) {
			@Override
			protected ReadOnlyPrimaryKeyJoinColumn buildValue_() {
				return this.subject.getDefaultPrimaryKeyJoinColumn();
			}
		};
	}

	private ListValueModel<ReadOnlyPrimaryKeyJoinColumn> buildDefaultJoinColumnListHolder() {
		return new PropertyListValueModelAdapter<ReadOnlyPrimaryKeyJoinColumn>(
			buildDefaultJoinColumnHolder()
		);
	}

	String buildJoinColumnLabel(ReadOnlyPrimaryKeyJoinColumn joinColumn) {

		if (joinColumn.isVirtual()) {
			return NLS.bind(
				JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_mappingBetweenTwoParamsDefault,
				joinColumn.getName(),
				joinColumn.getReferencedColumnName()
			);
		}

		if (joinColumn.getSpecifiedName() == null) {
			if (joinColumn.getSpecifiedReferencedColumnName() == null) {
				return NLS.bind(
					JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_mappingBetweenTwoParamsBothDefault,
					joinColumn.getName(),
					joinColumn.getReferencedColumnName()
				);
			}

			return NLS.bind(
				JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_mappingBetweenTwoParamsFirstDefault,
				joinColumn.getName(),
				joinColumn.getReferencedColumnName()
			);
		}

		if (joinColumn.getSpecifiedReferencedColumnName() == null) {
			return NLS.bind(
				JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_mappingBetweenTwoParamsSecDefault,
				joinColumn.getName(),
				joinColumn.getReferencedColumnName()
			);
		}

		return NLS.bind(
			JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_mappingBetweenTwoParams,
			joinColumn.getName(),
			joinColumn.getReferencedColumnName()
		);
	}

	private ILabelProvider buildJoinColumnsListLabelProvider() {
		return new LabelProvider() {
			@Override
			public String getText(Object element) {
				ReadOnlyPrimaryKeyJoinColumn joinColumn = (ReadOnlyPrimaryKeyJoinColumn) element;
				return buildJoinColumnLabel(joinColumn);
			}
		};
	}

	private ModifiablePropertyValueModel<Boolean> buildOverrideDefaultJoinColumnHolder() {
		return new OverrideDefaultJoinColumnHolder();
	}

	private AddRemovePane.Adapter<ModifiablePrimaryKeyJoinColumn> buildPrimaryKeyJoinColumnAdapter() {
		return new AddRemovePane.AbstractAdapter<ModifiablePrimaryKeyJoinColumn>() {

			public ModifiablePrimaryKeyJoinColumn addNewItem() {
				return addPrimaryKeyJoinColumn();
			}

			@Override
			public PropertyValueModel<Boolean> buildRemoveButtonEnabledModel(CollectionValueModel<ModifiablePrimaryKeyJoinColumn> selectedItemsModel) {
				//enable the remove button only when 1 item is selected, same as the optional button
				return this.buildSingleSelectedItemEnabledModel(selectedItemsModel);
			}

			public void removeSelectedItems(CollectionValueModel<ModifiablePrimaryKeyJoinColumn> selectedItemsModel) {
				ModifiablePrimaryKeyJoinColumn pkJoinColumn = selectedItemsModel.iterator().next();
				((SecondaryTable) getSubject()).removeSpecifiedPrimaryKeyJoinColumn(pkJoinColumn);
			}

			@Override
			public boolean hasOptionalButton() {
				return true;
			}

			@Override
			public String optionalButtonText() {
				return JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_edit;
			}

			@Override
			public void optionOnSelection(CollectionValueModel<ModifiablePrimaryKeyJoinColumn> selectedItemsModel) {
				editPrimaryKeyJoinColumn(selectedItemsModel.iterator().next());
			}
		};
	}

	private ModifiableCollectionValueModel<ModifiablePrimaryKeyJoinColumn> buildSelectedPkJoinColumnsModel() {
		return new SimpleCollectionValueModel<ModifiablePrimaryKeyJoinColumn>();
	}

	private ListValueModel<ReadOnlyPrimaryKeyJoinColumn> buildPrimaryKeyJoinColumnsListHolder() {
		List<ListValueModel<ReadOnlyPrimaryKeyJoinColumn>> list = new ArrayList<ListValueModel<ReadOnlyPrimaryKeyJoinColumn>>();
		list.add(buildSpecifiedJoinColumnsListHolder());
		list.add(buildDefaultJoinColumnListHolder());
		return CompositeListValueModel.forModels(list);
	}

	private ListValueModel<ReadOnlyPrimaryKeyJoinColumn> buildPrimaryKeyJoinColumnsListModel() {
		return new ItemPropertyListValueModelAdapter<ReadOnlyPrimaryKeyJoinColumn>(
			buildPrimaryKeyJoinColumnsListHolder(),
			ReadOnlyNamedColumn.SPECIFIED_NAME_PROPERTY,
			ReadOnlyNamedColumn.DEFAULT_NAME_PROPERTY,
			ReadOnlyBaseJoinColumn.SPECIFIED_REFERENCED_COLUMN_NAME_PROPERTY,
			ReadOnlyBaseJoinColumn.DEFAULT_REFERENCED_COLUMN_NAME_PROPERTY
		);
	}

	ListValueModel<ReadOnlyPrimaryKeyJoinColumn> buildSpecifiedJoinColumnsListHolder() {
		return new ListAspectAdapter<ReadOnlySecondaryTable, ReadOnlyPrimaryKeyJoinColumn>(getSubjectHolder(), ReadOnlySecondaryTable.SPECIFIED_PRIMARY_KEY_JOIN_COLUMNS_LIST) {
			@Override
			protected ListIterable<ReadOnlyPrimaryKeyJoinColumn> getListIterable() {
				return new SuperListIterableWrapper<ReadOnlyPrimaryKeyJoinColumn>(subject.getSpecifiedPrimaryKeyJoinColumns());
			}

			@Override
			protected int size_() {
				return subject.getSpecifiedPrimaryKeyJoinColumnsSize();
			}
		};
	}

	void editPrimaryKeyJoinColumn(ModifiablePrimaryKeyJoinColumn joinColumn) {
		PrimaryKeyJoinColumnInSecondaryTableDialog dialog = new PrimaryKeyJoinColumnInSecondaryTableDialog(this.getShell(), this.getResourceManager(), this.getSubject(), joinColumn);
		dialog.setBlockOnOpen(true);
		dialog.open();
		if (dialog.wasConfirmed()) {
			editPrimaryKeyJoinColumn(dialog.getSubject());
		}
	}

	void editPrimaryKeyJoinColumn(PrimaryKeyJoinColumnInSecondaryTableStateObject stateObject) {
		stateObject.updateJoinColumn((ModifiableBaseJoinColumn) stateObject.getJoinColumn());
	}

	@Override
	protected void initialize() {
		super.initialize();
		this.selectedPkJoinColumnsModel = buildSelectedPkJoinColumnsModel();
	}

	@Override
	protected Composite addComposite(Composite parent) {
		return addTitledGroup(
			parent,
			JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_primaryKeyJoinColumn
		);
	}

	@Override
	protected void initializeLayout(Composite container) {
		// Override Default check box
		Button overrideDefaultCheckBox = addCheckBox(
			container,
			JptJpaUiDetailsMessages.PrimaryKeyJoinColumnsComposite_overrideDefaultPrimaryKeyJoinColumns,
			buildOverrideDefaultJoinColumnHolder(),
			null,
			buildControlBooleanHolder()
		);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.verticalIndent = 8;
		overrideDefaultCheckBox.setLayoutData(gridData);

		// Primary Key Join Columns list pane
		new AddRemoveListPane<ReadOnlySecondaryTable, ModifiablePrimaryKeyJoinColumn>(
			this,
			container,
			buildPrimaryKeyJoinColumnAdapter(),
			buildPrimaryKeyJoinColumnsListModel(),
			this.selectedPkJoinColumnsModel,
			buildJoinColumnsListLabelProvider(),
			buildOverrideDefaultJoinColumnHolder(),
			JpaHelpContextIds.MAPPING_JOIN_TABLE_COLUMNS
		);
	}

	void updatePrimaryKeyJoinColumns(boolean selected) {
		if (this.isPopulating()) {
			return;
		}

		SecondaryTable secondaryTable =  (SecondaryTable) this.getSubject();

		this.setPopulating(true);

		try {
			if (selected) {
				if (secondaryTable.getDefaultPrimaryKeyJoinColumn() != null) { //TODO can this be null?
					secondaryTable.convertDefaultPrimaryKeyJoinColumnsToSpecified();
				}
			} else {
				secondaryTable.clearSpecifiedPrimaryKeyJoinColumns();
			}
		} finally {
			this.setPopulating(false);
		}
	}

	private class OverrideDefaultJoinColumnHolder extends ListPropertyValueModelAdapter<Boolean>
	                                              implements ModifiablePropertyValueModel<Boolean> {

		public OverrideDefaultJoinColumnHolder() {
			super(buildSpecifiedJoinColumnsListHolder());
		}

		@Override
		protected Boolean buildValue() {
			return Boolean.valueOf(this.buildValue_());
		}

		protected boolean buildValue_() {
			ReadOnlySecondaryTable table = getSubject();
			return (table != null) && ! table.isVirtual() && listModel.size() > 0;
		}

		public void setValue(Boolean value) {
			updatePrimaryKeyJoinColumns(value.booleanValue());
		}
	}
}