/*******************************************************************************
 * Copyright (c) 2005, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.details;

import org.eclipse.jpt.common.ui.internal.widgets.Pane;
import org.eclipse.jpt.common.utility.internal.iterable.SuperListIterableWrapper;
import org.eclipse.jpt.common.utility.internal.model.value.ListAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.ListPropertyValueModelAdapter;
import org.eclipse.jpt.common.utility.iterable.ListIterable;
import org.eclipse.jpt.common.utility.model.value.ListValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiablePropertyValueModel;
import org.eclipse.jpt.jpa.core.context.JoinColumn;
import org.eclipse.jpt.jpa.core.context.JoinColumnRelationship;
import org.eclipse.jpt.jpa.core.context.JoinColumnRelationshipStrategy;
import org.eclipse.jpt.jpa.core.context.ReadOnlyJoinColumn;
import org.eclipse.jpt.jpa.core.context.ReadOnlyJoinColumnRelationshipStrategy;
import org.eclipse.jpt.jpa.ui.details.JptJpaUiDetailsMessages;
import org.eclipse.swt.widgets.Composite;

public class JoiningStrategyJoinColumnsWithOverrideOptionComposite 
	extends Pane<ReadOnlyJoinColumnRelationshipStrategy>
{
	
	private JoiningStrategyJoinColumnsComposite joiningStrategyComposite;
	
	public JoiningStrategyJoinColumnsWithOverrideOptionComposite(
			Pane<?> parentPane,
			PropertyValueModel<ReadOnlyJoinColumnRelationshipStrategy> subjectHolder,
			Composite parent) {
		super(parentPane, subjectHolder, parent);
	}


	@Override
	protected void initializeLayout(Composite container) {
		// Override Default Join Columns check box
		addCheckBox(
			container,
			JptJpaUiDetailsMessages.JoiningStrategyJoinColumnsComposite_overrideDefaultJoinColumns,
			buildOverrideDefaultJoinColumnHolder(),
			null
		);
		
		this.joiningStrategyComposite = new JoiningStrategyJoinColumnsComposite(this, container);
	}

	void setSelectedJoinColumn(JoinColumn joinColumn) {
		this.joiningStrategyComposite.setSelectedJoinColumn(joinColumn);
	}

	private ModifiablePropertyValueModel<Boolean> buildOverrideDefaultJoinColumnHolder() {
		return new OverrideDefaultJoinColumnHolder();
	}
	
	ListValueModel<ReadOnlyJoinColumn> buildSpecifiedJoinColumnsListHolder() {
		return new ListAspectAdapter<ReadOnlyJoinColumnRelationshipStrategy, ReadOnlyJoinColumn>(
				getSubjectHolder(), ReadOnlyJoinColumnRelationshipStrategy.SPECIFIED_JOIN_COLUMNS_LIST) {
			@Override
			protected ListIterable<ReadOnlyJoinColumn> getListIterable() {
				return new SuperListIterableWrapper<ReadOnlyJoinColumn>(this.subject.getSpecifiedJoinColumns());
			}

			@Override
			protected int size_() {
				return this.subject.getSpecifiedJoinColumnsSize();
			}
		};
	}
	
	private class OverrideDefaultJoinColumnHolder 
		extends ListPropertyValueModelAdapter<Boolean>
		implements ModifiablePropertyValueModel<Boolean> 
	{
		public OverrideDefaultJoinColumnHolder() {
			super(buildSpecifiedJoinColumnsListHolder());
		}
		
		@Override
		protected Boolean buildValue() {
			return Boolean.valueOf(this.listModel.size() > 0);
		}
		
		public void setValue(Boolean value) {
			updateJoinColumns(value.booleanValue());
		}
		
		private void updateJoinColumns(boolean selected) {
			if (isPopulating()) {
				return;
			}
			
			setPopulating(true);
			
			try {
				JoinColumnRelationshipStrategy subject = (JoinColumnRelationshipStrategy) getSubject();
				if (selected) {
					if (subject.getDefaultJoinColumn() != null) {//TODO can this be null, disable override default check box? or have it checked if there are not default join columns?
						subject.convertDefaultJoinColumnsToSpecified();
						JoiningStrategyJoinColumnsWithOverrideOptionComposite.this.setSelectedJoinColumn(subject.getSpecifiedJoinColumn(0));
					}
				}
				else {
					subject.clearSpecifiedJoinColumns();
				}
			}
			finally {
				setPopulating(false);
			}
		}
	}
}
