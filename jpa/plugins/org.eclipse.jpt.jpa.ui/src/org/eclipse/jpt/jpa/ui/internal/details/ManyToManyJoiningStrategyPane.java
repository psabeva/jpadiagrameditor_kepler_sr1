/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.details;

import org.eclipse.jpt.common.ui.internal.widgets.Pane;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.SimplePropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiablePropertyValueModel;
import org.eclipse.jpt.jpa.core.context.JoinTableRelationship;
import org.eclipse.jpt.jpa.core.context.ManyToManyMapping;
import org.eclipse.jpt.jpa.core.context.ManyToManyRelationship;
import org.eclipse.jpt.jpa.core.context.MappedByRelationship;
import org.eclipse.jpt.jpa.core.context.ReadOnlyRelationship;
import org.eclipse.swt.widgets.Composite;

/**
 * Here is the layout of this pane:  
 * <pre>
 * -----------------------------------------------------------------------------
 * | - Joining Strategy ------------------------------------------------------ |
 * | |                                                                       | |
 * | | o MappedByJoiningStrategyPane _______________________________________ | |
 * | | |                                                                   | | |
 * | | |                                                                   | | |
 * | | --------------------------------------------------------------------- | |
 * | | o JoinTableStrategyPane _____________________________________________ | |
 * | | |                                                                   | | |
 * | | |                                                                   | | |
 * | | --------------------------------------------------------------------- | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see {@link ManyToManyMapping}
 * @see {@link ManyToManyRelationship}
 * @see {@link ManyToManyMappingComposite}
 * @see {@link MappedByStrategyPane}
 * @see {@link JoinTableStrategyPane}
 *
 * @version 2.3
 * @since 2.1
 */
public class ManyToManyJoiningStrategyPane 
	extends Pane<ManyToManyRelationship>
{
	public ManyToManyJoiningStrategyPane(
			Pane<?> parentPane, 
			PropertyValueModel<? extends ManyToManyRelationship> subjectHolder, 
			Composite parent) {
		
		super(parentPane, subjectHolder, parent);
	}

	@Override
	protected Composite addComposite(Composite container) {
		return addCollapsibleSection(
			container,
			JptUiDetailsMessages.Joining_title,
			new SimplePropertyValueModel<Boolean>(Boolean.TRUE));
	}

	@Override
	protected void initializeLayout(Composite container) {
		addRadioButton(
			container,
			JptUiDetailsMessages.Joining_mappedByLabel,
			MappedByJoiningStrategyPane.buildUsesMappedByJoiningStrategyHolder(getSubjectHolder()),
			null);

		new MappedByJoiningStrategyPane(this, container);
		
		addRadioButton(
			container,
			JptUiDetailsMessages.Joining_joinTableJoiningLabel,
			JoinTableJoiningStrategyPane.buildUsesJoinTableJoiningStrategyHolder(getSubjectHolder()),
			null);

		new JoinTableJoiningStrategyPane(this, container);
	}

	protected ModifiablePropertyValueModel<Boolean> buildUsesMappedByStrategyHolder() {
		return new PropertyAspectAdapter<MappedByRelationship, Boolean>(
				this.getSubjectHolder(), ReadOnlyRelationship.STRATEGY_PROPERTY) {
			@Override
			protected Boolean buildValue() {
				return (this.subject == null) ? Boolean.FALSE :
					Boolean.valueOf(this.subject.strategyIsMappedBy());
			}
			
			@Override
			protected void setValue_(Boolean value) {
				if (value == Boolean.TRUE) {
					this.subject.setStrategyToMappedBy();
				}
				//value == FALSE - selection of another radio button causes this strategy to get unset
			}
		};
	}

	protected ModifiablePropertyValueModel<Boolean> buildUsesJoinTableStrategyHolder() {
		return new PropertyAspectAdapter<JoinTableRelationship, Boolean>(
				this.getSubjectHolder(), ReadOnlyRelationship.STRATEGY_PROPERTY) {
			@Override
			protected Boolean buildValue() {
				return (this.subject == null) ? Boolean.FALSE :
					Boolean.valueOf(this.subject.strategyIsJoinTable());
			}
			
			@Override
			protected void setValue_(Boolean value) {
				if (value == Boolean.TRUE) {
					this.subject.setStrategyToJoinTable();
				}
				//value == FALSE - selection of another radio button causes this strategy to get unset
			}
		};
	}
}
