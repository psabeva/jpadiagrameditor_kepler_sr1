/*******************************************************************************
 * Copyright (c) 2006, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.details.orm;

import java.util.Collection;

import org.eclipse.jpt.common.ui.internal.utility.swt.SWTTools;
import org.eclipse.jpt.common.ui.internal.widgets.EnumFormComboViewer;
import org.eclipse.jpt.common.ui.internal.widgets.Pane;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.TransformationPropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.common.utility.model.value.ModifiablePropertyValueModel;
import org.eclipse.jpt.jpa.core.JptJpaCorePlugin;
import org.eclipse.jpt.jpa.core.context.orm.OrmPersistenceUnitDefaults;
import org.eclipse.jpt.jpa.core.context.orm.OrmPersistenceUnitMetadata;
import org.eclipse.jpt.jpa.core.jpa2.context.orm.OrmPersistenceUnitDefaults2_0;
import org.eclipse.jpt.jpa.db.SchemaContainer;
import org.eclipse.jpt.jpa.ui.internal.JpaHelpContextIds;
import org.eclipse.jpt.jpa.ui.internal.JptUiMessages;
import org.eclipse.jpt.jpa.ui.internal.details.AccessTypeComboViewer;
import org.eclipse.jpt.jpa.ui.internal.details.db.CatalogCombo;
import org.eclipse.jpt.jpa.ui.internal.details.db.SchemaCombo;
import org.eclipse.jpt.jpa.ui.internal.jpa2.Jpa2_0XmlFlagModel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * Here the layout of this pane:
 * <pre>
 * -----------------------------------------------------------------------------
 * |                                                                           |
 * | - Persistence Unit ------------------------------------------------------ |
 * |                                                                           |
 * | x XML Mapping Metadata Complete                                           |
 * |                                                                           |
 * | x Cascade Persist                                                         |
 * |                                                                           |
 * |              ------------------------------------------------------------ |
 * | Schema:      | SchemaCombo                                              | |
 * |              ------------------------------------------------------------ |
 * |              ------------------------------------------------------------ |
 * | Catalog:     | CatalogCombo                                             | |
 * |              ------------------------------------------------------------ |
 * |              ------------------------------------------------------------ |
 * | Access Type: |                                                        |v| |
 * |              ------------------------------------------------------------ |
 * -----------------------------------------------------------------------------</pre>
 *
 * @see PersistenceUnitMetadata
 * @see OrmPersistenceUnitDefaults
 * @see EntityMappingsDetailsPage - The parent container
 * @see CatalogCombo
 * @see SchemaCombo
 * @see EnumFormComboViewer
 *
 * @version 2.0
 * @since 2.0
 */
public class PersistenceUnitMetadataComposite extends Pane<OrmPersistenceUnitMetadata>
{
	PropertyValueModel<OrmPersistenceUnitDefaults> persistenceUnitDefaultsHolder;

	/**
	 * Creates a new <code>PersistenceUnitMetadataComposite</code>.
	 *
	 * @param parentPane The parent container of this one
	 * @param subjectHolder The holder of this pane's subject
	 * @param parent The parent container
	 */
	public PersistenceUnitMetadataComposite(Pane<?> parentPane,
	                                        PropertyValueModel<? extends OrmPersistenceUnitMetadata> subjectHolder,
	                                        Composite parent) {

		super(parentPane, subjectHolder, parent);
	}

	@Override
	protected void initialize() {
		super.initialize();
		this.persistenceUnitDefaultsHolder = this.buildPersistenceUnitDefaultsHolder();
	}

	protected PropertyValueModel<OrmPersistenceUnitDefaults> getPersistenceUnitDefaultsHolder() {
		return this.persistenceUnitDefaultsHolder;
	}

	protected ModifiablePropertyValueModel<Boolean> buildCascadePersistHolder() {
		return new PropertyAspectAdapter<OrmPersistenceUnitDefaults, Boolean>(getPersistenceUnitDefaultsHolder(), OrmPersistenceUnitDefaults.CASCADE_PERSIST_PROPERTY) {
			@Override
			protected Boolean buildValue_() {
				return Boolean.valueOf(this.subject.isCascadePersist());
			}

			@Override
			protected void setValue_(Boolean value) {
				this.subject.setCascadePersist(value.booleanValue());
			}
		};
	}

	protected CatalogCombo<OrmPersistenceUnitDefaults> addCatalogCombo(Composite container) {

		return new CatalogCombo<OrmPersistenceUnitDefaults>(this, getPersistenceUnitDefaultsHolder(), container) {

			@Override
			protected void addPropertyNames(Collection<String> propertyNames) {
				super.addPropertyNames(propertyNames);
				propertyNames.add(OrmPersistenceUnitDefaults.DEFAULT_CATALOG_PROPERTY);
				propertyNames.add(OrmPersistenceUnitDefaults.SPECIFIED_CATALOG_PROPERTY);
			}

			@Override
			protected String getDefaultValue() {
				return getSubject().getDefaultCatalog();
			}

			@Override
			protected void setValue(String value) {
				getSubject().setSpecifiedCatalog(value);
			}

			@Override
			protected String getValue() {
				return getSubject().getSpecifiedCatalog();
			}

			@Override
			protected String getHelpId() {
				return JpaHelpContextIds.ENTITY_ORM_CATALOG;
			}

			@Override
			public String toString() {
				return "PersistenceUnitMetadataComposite.catalogCombo"; //$NON-NLS-1$
			}
		};
	}

	private PropertyValueModel<OrmPersistenceUnitDefaults> buildPersistenceUnitDefaultsHolder() {
		return new TransformationPropertyValueModel<OrmPersistenceUnitMetadata, OrmPersistenceUnitDefaults>(getSubjectHolder()) {
			@Override
			protected OrmPersistenceUnitDefaults transform_(OrmPersistenceUnitMetadata value) {
				return value.getPersistenceUnitDefaults();
			}
		};
	}

	protected SchemaCombo<OrmPersistenceUnitDefaults> addSchemaCombo(Composite container) {

		return new SchemaCombo<OrmPersistenceUnitDefaults>(this, getPersistenceUnitDefaultsHolder(), container) {

			@Override
			protected void addPropertyNames(Collection<String> propertyNames) {
				super.addPropertyNames(propertyNames);
				propertyNames.add(OrmPersistenceUnitDefaults.DEFAULT_SCHEMA_PROPERTY);
				propertyNames.add(OrmPersistenceUnitDefaults.SPECIFIED_SCHEMA_PROPERTY);
			}

			@Override
			protected String getDefaultValue() {
				return getSubject().getDefaultSchema();
			}

			@Override
			protected void setValue(String value) {
				getSubject().setSpecifiedSchema(value);
			}

			@Override
			protected String getValue() {
				return getSubject().getSpecifiedSchema();
			}

			@Override
			protected SchemaContainer getDbSchemaContainer_() {
				return this.getSubject().getDbSchemaContainer();
			}

			@Override
			protected String getHelpId() {
				return JpaHelpContextIds.ENTITY_ORM_SCHEMA;
			}

			@Override
			public String toString() {
				return "PersistenceUnitMetadataComposite.schemaCombo"; //$NON-NLS-1$
			}
		};
	}

	protected ModifiablePropertyValueModel<Boolean> buildXmlMappingMetadataCompleteHolder() {
		return new PropertyAspectAdapter<OrmPersistenceUnitMetadata, Boolean>(getSubjectHolder(), OrmPersistenceUnitMetadata.XML_MAPPING_METADATA_COMPLETE_PROPERTY) {
			@Override
			protected Boolean buildValue_() {
				return Boolean.valueOf(this.subject.isXmlMappingMetadataComplete());
			}

			@Override
			protected void setValue_(Boolean value) {
				this.subject.setXmlMappingMetadataComplete(value.booleanValue());
			}
		};
	}

	protected ModifiablePropertyValueModel<Boolean> buildDelimitedIdentifiersHolder() {
		return new PropertyAspectAdapter<OrmPersistenceUnitDefaults, Boolean>(getPersistenceUnitDefaultsHolder(), OrmPersistenceUnitDefaults2_0.DELIMITED_IDENTIFIERS_PROPERTY) {
			@Override
			protected Boolean buildValue_() {
				return Boolean.valueOf(this.buildBooleanValue_());
			}

			protected boolean buildBooleanValue_() {
				return JptJpaCorePlugin.nodeIsJpa2_0Compatible(this.subject) &&
						((OrmPersistenceUnitDefaults2_0) this.subject).isDelimitedIdentifiers();
			}

			@Override
			protected void setValue_(Boolean value) {
				if (JptJpaCorePlugin.nodeIsJpa2_0Compatible(this.subject)) {
					((OrmPersistenceUnitDefaults2_0) this.subject).setDelimitedIdentifiers(value.booleanValue());
				}
			}
		};
	}

	@Override
	protected Composite addComposite(Composite container) {
		return this.addSubPane(container, 2, 0, 0, 0, 0);
	}

	@Override
	protected void initializeLayout(Composite container) {
		// XML mapping metadata complete check box
		Button metadataCompleteCheckBox = addCheckBox(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_xmlMappingMetadataCompleteCheckBox,
			buildXmlMappingMetadataCompleteHolder(),
			JpaHelpContextIds.ENTITY_ORM_XML
		);
		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		metadataCompleteCheckBox.setLayoutData(gridData);

		// Cascade Persist check-box
		Button cascadePersistCheckBox = addCheckBox(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_cascadePersistCheckBox,
			buildCascadePersistHolder(),
			JpaHelpContextIds.ENTITY_ORM_CASCADE
		);
		gridData = new GridData();
		gridData.horizontalSpan = 2;
		cascadePersistCheckBox.setLayoutData(gridData);


		// Schema widgets
		this.addLabel(container, JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_schema);
		this.addSchemaCombo(container);

		// Catalog widgets
		this.addLabel(container, JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_catalog);
		this.addCatalogCombo(container);

		// Access type widgets
		this.addLabel(container, JptUiMessages.AccessTypeComposite_access);
		new AccessTypeComboViewer(this, getPersistenceUnitDefaultsHolder(), container);

		// Delimited Identifiers check-box
		Button diCheckBox = this.addCheckBox(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_delimitedIdentifiersCheckBox,
			this.buildDelimitedIdentifiersHolder(),
			JpaHelpContextIds.ENTITY_ORM_DELIMITED_IDENTIFIERS
		);
		gridData = new GridData();
		gridData.horizontalSpan = 2;
		diCheckBox.setLayoutData(gridData);
		
		SWTTools.controlVisibleState(new Jpa2_0XmlFlagModel<OrmPersistenceUnitMetadata>(this.getSubjectHolder()), diCheckBox);
	}
}
