/*******************************************************************************
 * Copyright (c) 2012, 2013 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.ui.internal.persistence;

import java.util.List;
import org.eclipse.jpt.common.core.JptResourceType;
import org.eclipse.jpt.jpa.core.internal.jpa2_1.context.persistence.GenericPersistenceXmlDefinition2_1;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.persistence.connection.EclipseLinkPersistenceUnitConnectionEditorPageDefinition;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.persistence.general.EclipseLinkPersistenceUnitGeneralEditorPageDefinition;
import org.eclipse.jpt.jpa.ui.JavaManagedTypeUiDefinition;
import org.eclipse.jpt.jpa.ui.PersistenceResourceUiDefinition;
import org.eclipse.jpt.jpa.ui.ResourceUiDefinition;
import org.eclipse.jpt.jpa.ui.editors.JpaEditorPageDefinition;
import org.eclipse.jpt.jpa.ui.internal.AbstractPersistenceResourceUiDefinition;
import org.eclipse.jpt.jpa.ui.internal.jpa2_1.JavaConverterTypeUiDefinition2_1;
import org.eclipse.jpt.jpa.ui.internal.persistence.PersistenceUnitPropertiesEditorPageDefinition;

public class EclipseLinkPersistenceXmlUiDefinition2_5
	extends AbstractPersistenceResourceUiDefinition
{
	// singleton
	private static final PersistenceResourceUiDefinition INSTANCE = new EclipseLinkPersistenceXmlUiDefinition2_5();

	/**
	 * Return the singleton
	 */
	public static ResourceUiDefinition instance() {
		return INSTANCE;
	}


	/**
	 * Enforce singleton usage
	 */
	private EclipseLinkPersistenceXmlUiDefinition2_5() {
		super();
	}

	@Override
	protected void addEditorPageDefinitionsTo(List<JpaEditorPageDefinition> definitions) {
		definitions.add(EclipseLinkPersistenceUnitGeneralEditorPageDefinition.instance());
		definitions.add(EclipseLinkPersistenceUnitConnectionEditorPageDefinition.instance());
		definitions.add(EclipseLinkPersistenceUnitCustomization2_0EditorPageDefinition.instance());
		definitions.add(EclipseLinkPersistenceUnitCaching2_0EditorPageDefinition.instance());
		definitions.add(EclipseLinkPersistenceUnitOptionsEditorPageDefinition2_5.instance());
		definitions.add(EclipseLinkPersistenceUnitSchemaGenerationEditorPageDefinition2_5.instance());
		definitions.add(PersistenceUnitPropertiesEditorPageDefinition.instance());
	}

	public boolean providesUi(JptResourceType resourceType) {
		return resourceType.equals(GenericPersistenceXmlDefinition2_1.instance().getResourceType());
	}

	@Override
	protected void addJavaManagedTypeUiDefinitionsTo(List<JavaManagedTypeUiDefinition> definitions) {
		super.addJavaManagedTypeUiDefinitionsTo(definitions);
		definitions.add(JavaConverterTypeUiDefinition2_1.instance());
	}
}
