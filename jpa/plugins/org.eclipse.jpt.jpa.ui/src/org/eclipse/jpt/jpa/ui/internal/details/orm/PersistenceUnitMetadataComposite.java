/*******************************************************************************
 * Copyright (c) 2006, 2010 Oracle. All rights reserved.
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
import org.eclipse.jpt.common.utility.model.value.WritablePropertyValueModel;
import org.eclipse.jpt.jpa.core.JptJpaCorePlugin;
import org.eclipse.jpt.jpa.core.context.AccessType;
import org.eclipse.jpt.jpa.core.context.orm.OrmPersistenceUnitDefaults;
import org.eclipse.jpt.jpa.core.context.orm.OrmPersistenceUnitMetadata;
import org.eclipse.jpt.jpa.core.jpa2.context.orm.OrmPersistenceUnitDefaults2_0;
import org.eclipse.jpt.jpa.db.SchemaContainer;
import org.eclipse.jpt.jpa.ui.internal.JpaHelpContextIds;
import org.eclipse.jpt.jpa.ui.internal.details.db.CatalogCombo;
import org.eclipse.jpt.jpa.ui.internal.details.db.SchemaCombo;
import org.eclipse.jpt.jpa.ui.internal.jpa2.Jpa2_0ProjectFlagModel;
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

		super(parentPane, subjectHolder, parent, false);
	}

	private EnumFormComboViewer<OrmPersistenceUnitDefaults, AccessType> addAccessTypeCombo(Composite container) {

		return new EnumFormComboViewer<OrmPersistenceUnitDefaults, AccessType>(this, buildPersistenceUnitDefaultsHolder(), container) {

			@Override
			protected void addPropertyNames(Collection<String> propertyNames) {
				super.addPropertyNames(propertyNames);
				propertyNames.add(OrmPersistenceUnitDefaults.ACCESS_PROPERTY);
			}

			@Override
			protected AccessType[] getChoices() {
				return AccessType.values();
			}

			@Override
			protected AccessType getDefaultValue() {
				return null;
			}

			@Override
			protected String displayString(AccessType value) {
				return buildDisplayString(
					JptUiDetailsOrmMessages.class,
					PersistenceUnitMetadataComposite.this,
					value
				);
			}

			@Override
			protected AccessType getValue() {
				return getSubject().getAccess();
			}

			@Override
			protected void setValue(AccessType value) {
				getSubject().setAccess(value);
			}
		};
	}

	private WritablePropertyValueModel<Boolean> buildCascadePersistHolder() {
		return new PropertyAspectAdapter<OrmPersistenceUnitDefaults, Boolean>(buildPersistenceUnitDefaultsHolder(), OrmPersistenceUnitDefaults.CASCADE_PERSIST_PROPERTY) {
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

	private CatalogCombo<OrmPersistenceUnitDefaults> addCatalogCombo(Composite container) {

		return new CatalogCombo<OrmPersistenceUnitDefaults>(this, buildPersistenceUnitDefaultsHolder(), container) {

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

	private SchemaCombo<OrmPersistenceUnitDefaults> addSchemaCombo(Composite container) {

		return new SchemaCombo<OrmPersistenceUnitDefaults>(this, buildPersistenceUnitDefaultsHolder(), container) {

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

		};
	}

	private WritablePropertyValueModel<Boolean> buildXmlMappingMetadataCompleteHolder() {
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

	private WritablePropertyValueModel<Boolean> buildDelimitedIdentifiersHolder() {
		return new PropertyAspectAdapter<OrmPersistenceUnitDefaults, Boolean>(buildPersistenceUnitDefaultsHolder(), OrmPersistenceUnitDefaults2_0.DELIMITED_IDENTIFIERS_PROPERTY) {
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
	protected void initializeLayout(Composite container) {

		// Section
		container = addCollapsibleSection(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_persistenceUnitSection
		);

		// XML mapping metadata complete check box
		addCheckBox(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_xmlMappingMetadataCompleteCheckBox,
			buildXmlMappingMetadataCompleteHolder(),
			JpaHelpContextIds.ENTITY_ORM_XML
		);

		// Cascade Persist check-box
		addCheckBox(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_cascadePersistCheckBox,
			buildCascadePersistHolder(),
			JpaHelpContextIds.ENTITY_ORM_CASCADE
		);

		// Schema widgets
		addLabeledComposite(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_schema,
			addSchemaCombo(container),
			JpaHelpContextIds.ENTITY_ORM_SCHEMA
		);

		// Catalog widgets
		addLabeledComposite(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_catalog,
			addCatalogCombo(container),
			JpaHelpContextIds.ENTITY_ORM_CATALOG
		);

		// Access Type widgets
		addLabeledComposite(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_access,
			addAccessTypeCombo(container),
			JpaHelpContextIds.ENTITY_ORM_ACCESS
		);

		// Delimited Identifiers check-box
		Button diCheckBox = this.addCheckBox(
			container,
			JptUiDetailsOrmMessages.PersistenceUnitMetadataComposite_delimitedIdentifiersCheckBox,
			this.buildDelimitedIdentifiersHolder(),
			JpaHelpContextIds.ENTITY_ORM_DELIMITED_IDENTIFIERS
		);
		
		SWTTools.controlVisibleState(new Jpa2_0ProjectFlagModel<OrmPersistenceUnitMetadata>(this.getSubjectHolder()), diCheckBox);

	}
}