/*******************************************************************************
* Copyright (c) 2009, 2012 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.ui.internal.details.orm;

import org.eclipse.jpt.common.ui.WidgetFactory;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.AccessHolder;
import org.eclipse.jpt.jpa.core.context.OneToManyMapping;
import org.eclipse.jpt.jpa.core.jpa2.context.OrphanRemovable2_0;
import org.eclipse.jpt.jpa.core.jpa2.context.OrphanRemovalHolder2_0;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.details.EclipseLinkJoinFetchComboViewer;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.details.EclipseLinkOneToManyMappingComposite;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.details.EclipseLinkPrivateOwnedCheckBox;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.details.EclipseLinkUiDetailsMessages;
import org.eclipse.jpt.jpa.ui.internal.JptUiMessages;
import org.eclipse.jpt.jpa.ui.internal.details.AccessTypeComboViewer;
import org.eclipse.jpt.jpa.ui.internal.details.FetchTypeComboViewer;
import org.eclipse.jpt.jpa.ui.internal.details.JptUiDetailsMessages;
import org.eclipse.jpt.jpa.ui.internal.details.TargetEntityClassChooser;
import org.eclipse.jpt.jpa.ui.internal.details.orm.JptUiDetailsOrmMessages;
import org.eclipse.jpt.jpa.ui.internal.details.orm.OrmMappingNameText;
import org.eclipse.jpt.jpa.ui.internal.jpa2.details.CascadePane2_0;
import org.eclipse.jpt.jpa.ui.internal.jpa2.details.Ordering2_0Composite;
import org.eclipse.jpt.jpa.ui.internal.jpa2.details.OrphanRemoval2_0TriStateCheckBox;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.Hyperlink;


public class OrmEclipseLinkOneToManyMapping2_0Composite
	extends EclipseLinkOneToManyMappingComposite<OneToManyMapping>
{
	public OrmEclipseLinkOneToManyMapping2_0Composite(
			PropertyValueModel<? extends OneToManyMapping> subjectHolder,
			PropertyValueModel<Boolean> enabledModel,
			Composite parent,
			WidgetFactory widgetFactory) {
		
		super(subjectHolder, enabledModel, parent, widgetFactory);
	}
	

	@Override
	protected void initializeLayout(Composite container) {
		initializeOneToManyCollapsibleSection(container);
		initializeJoiningStrategyCollapsibleSection(container);
		initializeConvertersCollapsibleSection(container);
		initializeOrderingCollapsibleSection(container);
	}
	
	@Override
	protected Control initializeOneToManySection(Composite container) {
		container = this.addSubPane(container, 2, 0, 0, 0, 0);

		// Target entity widgets
		Hyperlink targetEntityHyperlink = this.addHyperlink(container, JptUiDetailsMessages.TargetEntityChooser_label);
		new TargetEntityClassChooser(this, container, targetEntityHyperlink);

		// Name widgets
		this.addLabel(container, JptUiDetailsOrmMessages.OrmMappingNameChooser_name);
		new OrmMappingNameText(this, getSubjectHolder(), container);

		// Attribute type widgets
		Hyperlink attributeTypeHyperlink = this.addHyperlink(container, EclipseLinkUiDetailsMessages.OrmAttributeTypeComposite_attributeType);
		new OrmAttributeTypeClassChooser(this, getSubjectHolder(), container, attributeTypeHyperlink);

		// Access type widgets
		this.addLabel(container, JptUiMessages.AccessTypeComposite_access);
		new AccessTypeComboViewer(this, this.buildAccessHolderHolder(), container);

		// Fetch type widgets
		this.addLabel(container, JptUiDetailsMessages.BasicGeneralSection_fetchLabel);
		new FetchTypeComboViewer(this, container);

		// Join fetch widgets
		this.addLabel(container, EclipseLinkUiDetailsMessages.EclipseLinkJoinFetchComposite_label);
		new EclipseLinkJoinFetchComboViewer(this, this.buildJoinFetchableHolder(), container);

		// Private owned widgets
		EclipseLinkPrivateOwnedCheckBox privateOwnedCheckBox = new EclipseLinkPrivateOwnedCheckBox(this, buildPrivateOwnableHolder(), container);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		privateOwnedCheckBox.getControl().setLayoutData(gridData);

		// Orphan removal widgets
		OrphanRemoval2_0TriStateCheckBox orphanRemovalCheckBox = new OrphanRemoval2_0TriStateCheckBox(this, buildOrphanRemovableHolder(), container);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		orphanRemovalCheckBox.getControl().setLayoutData(gridData);

		// Cascade widgets
		CascadePane2_0 cascadePane = new CascadePane2_0(this, this.buildCascadeHolder(), container);
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		cascadePane.getControl().setLayoutData(gridData);

		return container;
	}
	
	@Override
	protected Control initializeOrderingSection(Composite container) {
		return new Ordering2_0Composite(this, container).getControl();
	}

	protected PropertyValueModel<AccessHolder> buildAccessHolderHolder() {
		return new PropertyAspectAdapter<OneToManyMapping, AccessHolder>(this.getSubjectHolder()) {
			@Override
			protected AccessHolder buildValue_() {
				return this.subject.getPersistentAttribute();
			}
		};
	}
	
	protected PropertyValueModel<OrphanRemovable2_0> buildOrphanRemovableHolder() {
		return new PropertyAspectAdapter<OneToManyMapping, OrphanRemovable2_0>(this.getSubjectHolder()) {
			@Override
			protected OrphanRemovable2_0 buildValue_() {
				return ((OrphanRemovalHolder2_0) this.subject).getOrphanRemoval();
			}
		};
	}
}
