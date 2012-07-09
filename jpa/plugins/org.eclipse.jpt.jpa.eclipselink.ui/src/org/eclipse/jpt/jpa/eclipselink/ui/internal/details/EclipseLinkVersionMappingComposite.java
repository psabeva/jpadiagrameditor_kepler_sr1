/*******************************************************************************
 * Copyright (c) 2008, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.ui.internal.details;

import org.eclipse.jpt.common.ui.WidgetFactory;
import org.eclipse.jpt.common.utility.internal.model.value.CompositeBooleanPropertyValueModel;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.Converter;
import org.eclipse.jpt.jpa.core.context.ConvertibleMapping;
import org.eclipse.jpt.jpa.core.context.BaseTemporalConverter;
import org.eclipse.jpt.jpa.core.context.VersionMapping;
import org.eclipse.jpt.jpa.eclipselink.core.context.EclipseLinkConvert;
import org.eclipse.jpt.jpa.eclipselink.core.context.EclipseLinkConverterContainer;
import org.eclipse.jpt.jpa.eclipselink.core.context.EclipseLinkMutable;
import org.eclipse.jpt.jpa.eclipselink.core.context.EclipseLinkVersionMapping;
import org.eclipse.jpt.jpa.ui.internal.details.AbstractVersionMappingComposite;
import org.eclipse.jpt.jpa.ui.internal.details.ColumnComposite;
import org.eclipse.jpt.jpa.ui.internal.details.JptUiDetailsMessages;
import org.eclipse.jpt.jpa.ui.internal.details.TemporalTypeCombo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | ColumnComposite                                                       | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | MutableComposite                                                      | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * | ------------------------------------------------------------------------- |
 * | |                                                                       | |
 * | | TemporalTypeComposite                                                 | |
 * | |                                                                       | |
 * | ------------------------------------------------------------------------- |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see VersionMapping
 * @see ColumnComposite
 * @see TemporalTypeCombo
 *
 * @version 3.2
 * @since 2.1
 */
public abstract class EclipseLinkVersionMappingComposite<T extends VersionMapping>
	extends AbstractVersionMappingComposite<T>
{
	/**
	 * Creates a new <code>VersionMappingComposite</code>.
	 *
	 * @param subjectHolder The holder of the subject <code>IVersionMapping</code>
	 * @param parent The parent container
	 * @param widgetFactory The factory used to create various common widgets
	 */
	protected EclipseLinkVersionMappingComposite(PropertyValueModel<? extends T> subjectHolder,
									PropertyValueModel<Boolean> enabledModel,
									Composite parent,
									WidgetFactory widgetFactory) {

		super(subjectHolder, enabledModel, parent, widgetFactory);
	}
	
	@Override
	protected Control initializeVersionSection(Composite container) {
		container = this.addSubPane(container);

		new ColumnComposite(this, buildColumnHolder(), container);
		new EclipseLinkMutableTriStateCheckBox(this, buildMutableHolder(), container);

		return container;
	}
	
	@Override
	protected Control initializeTypeSection(Composite container) {
		container = this.addSubPane(container, 2, 0, 0, 0, 0);

		// No converter
		Button noConverterButton = addRadioButton(
			container, 
			JptUiDetailsMessages.TypeSection_default, 
			buildConverterBooleanHolder(null), 
			null);
		((GridData) noConverterButton.getLayoutData()).horizontalSpan = 2;
				
		PropertyValueModel<Converter> converterHolder = buildConverterHolder();
		// Temporal
		addRadioButton(
			container, 
			JptUiDetailsMessages.TypeSection_temporal, 
			buildConverterBooleanHolder(BaseTemporalConverter.class), 
			null);
		registerSubPane(new TemporalTypeCombo(buildTemporalConverterHolder(converterHolder), getEnabledModel(), container, getWidgetFactory()));

		// EclipseLink Converter
		Button elConverterButton = addRadioButton(
			container, 
			EclipseLinkUiDetailsMessages.TypeSection_converted, 
			buildConverterBooleanHolder(EclipseLinkConvert.class), 
			null);
		((GridData) elConverterButton.getLayoutData()).horizontalSpan = 2;

		PropertyValueModel<EclipseLinkConvert> convertHolder = buildEclipseLinkConverterHolder(converterHolder);
		PropertyValueModel<Boolean> convertEnabledModel = CompositeBooleanPropertyValueModel.and(getEnabledModel(), buildEclipseLinkConvertBooleanHolder(convertHolder));
		Label convertLabel = this.addLabel(container, EclipseLinkUiDetailsMessages.EclipseLinkConvertComposite_converterNameLabel, convertEnabledModel);
		GridData gridData = new GridData();
		gridData.horizontalIndent = 20;
		convertLabel.setLayoutData(gridData);
		registerSubPane(new EclipseLinkConvertCombo(convertHolder, convertEnabledModel, container, getWidgetFactory()));

		return container;
	}


	protected PropertyValueModel<EclipseLinkConvert> buildEclipseLinkConverterHolder(PropertyValueModel<Converter> converterHolder) {
		return new TransformationPropertyValueModel<Converter, EclipseLinkConvert>(converterHolder) {
			@Override
			protected EclipseLinkConvert transform_(Converter converter) {
				return (converter != null && converter.getType() == EclipseLinkConvert.class) ? (EclipseLinkConvert) converter : null;
			}
		};
	}

	protected PropertyValueModel<Converter> buildConverterHolder() {
		return new PropertyAspectAdapter<T, Converter>(getSubjectHolder(), ConvertibleMapping.CONVERTER_PROPERTY) {
			@Override
			protected Converter buildValue_() {
				return this.subject.getConverter();
			}
		};
	}

	protected PropertyValueModel<Boolean> buildEclipseLinkConvertBooleanHolder(PropertyValueModel<EclipseLinkConvert> convertHolder) {
		return new TransformationPropertyValueModel<EclipseLinkConvert, Boolean>(convertHolder) {
			@Override
			protected Boolean transform(EclipseLinkConvert value) {
				return Boolean.valueOf(value != null);
			}
		};
	}
	
	protected PropertyValueModel<BaseTemporalConverter> buildTemporalConverterHolder(PropertyValueModel<Converter> converterHolder) {
		return new TransformationPropertyValueModel<Converter, BaseTemporalConverter>(converterHolder) {
			@Override
			protected BaseTemporalConverter transform_(Converter converter) {
				return converter.getType() == BaseTemporalConverter.class ? (BaseTemporalConverter) converter : null;
			}
		};
	}
	
	protected PropertyValueModel<EclipseLinkMutable> buildMutableHolder() {
		return new PropertyAspectAdapter<T, EclipseLinkMutable>(getSubjectHolder()) {
			@Override
			protected EclipseLinkMutable buildValue_() {
				return ((EclipseLinkVersionMapping) this.subject).getMutable();
			}
		};
	}

	protected void initializeConvertersCollapsibleSection(Composite container) {
		final Section section = this.getWidgetFactory().createSection(container, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE);
		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		section.setText(EclipseLinkUiDetailsMessages.EclipseLinkTypeMappingComposite_converters);
		section.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanging(ExpansionEvent e) {
				if (e.getState() && section.getClient() == null) {
					section.setClient(EclipseLinkVersionMappingComposite.this.initializeConvertersSection(section));
				}
			}
		});
		section.setClient(initializeConvertersSection(section));
	}

	protected Control initializeConvertersSection(Composite container) {
		return new EclipseLinkConvertersComposite(this, this.buildConverterHolderValueModel(), container).getControl();
	}

	protected PropertyValueModel<EclipseLinkConverterContainer> buildConverterHolderValueModel() {
		return new PropertyAspectAdapter<VersionMapping, EclipseLinkConverterContainer>(getSubjectHolder()) {
			@Override
			protected EclipseLinkConverterContainer buildValue_() {
				return ((EclipseLinkVersionMapping) this.subject).getConverterContainer();
			}
		};
	}
}