/*******************************************************************************
 * Copyright (c) 2008, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.jpa.eclipselink.ui.internal.persistencexml.details;

import java.util.ArrayList;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.common.utility.internal.model.value.PropertyCollectionValueModelAdapter;
import org.eclipse.jpt.common.utility.model.value.CollectionValueModel;
import org.eclipse.jpt.common.utility.model.value.PropertyValueModel;
import org.eclipse.jpt.jpa.core.context.JpaContextNode;
import org.eclipse.jpt.jpa.core.context.MappingFile;
import org.eclipse.jpt.jpa.core.context.persistence.MappingFileRef;
import org.eclipse.jpt.jpa.eclipselink.core.context.persistence.EclipseLinkPersistenceUnit;
import org.eclipse.jpt.jpa.eclipselink.ui.internal.structure.EclipseLinkPersistenceUnitItemContentProvider.ImpliedEclipseLinkMappingFileRefModel;
import org.eclipse.jpt.jpa.ui.internal.platform.generic.PersistenceUnitItemContentProvider;

/**
 * Item content provider for project explorer.
 */
public class EclipseLinkPersistenceUnitItemContentProvider 
	extends PersistenceUnitItemContentProvider
{
	public EclipseLinkPersistenceUnitItemContentProvider(EclipseLinkPersistenceUnit persistenceUnit, Manager manager) {
		super(persistenceUnit, manager);
	}
	
	@Override
	protected void addChildrenModelsTo(ArrayList<CollectionValueModel<? extends JpaContextNode>> list) {
		super.addChildrenModelsTo(list);
		// add after the implied mapping file
		list.add(3, this.buildImpliedEclipseLinkMappingFilesModel());
	}


	// ********** implied EclipseLink mapping file **********

	/**
	 * No need to filter this list model as it will be empty if the wrapped
	 * property model is <code>null</code>.
	 */
	protected CollectionValueModel<MappingFile> buildImpliedEclipseLinkMappingFilesModel() {
		return new PropertyCollectionValueModelAdapter<MappingFile>(this.buildImpliedEclipseLinkMappingFileModel());
	}

	protected PropertyValueModel<MappingFile> buildImpliedEclipseLinkMappingFileModel() {
		return new ImpliedEclipseLinkMappingFileModel(this.buildImpliedEclipseLinkMappingFileRefModel());
	}

	public static class ImpliedEclipseLinkMappingFileModel
		extends PropertyAspectAdapter<MappingFileRef, MappingFile>
	{
		public ImpliedEclipseLinkMappingFileModel(PropertyValueModel<MappingFileRef> refModel) {
			super(refModel, MappingFileRef.MAPPING_FILE_PROPERTY);
		}
		@Override
		protected MappingFile buildValue_() {
			return this.subject.getMappingFile();
		}
	}

	protected PropertyValueModel<MappingFileRef> buildImpliedEclipseLinkMappingFileRefModel() {
		return new ImpliedEclipseLinkMappingFileRefModel((EclipseLinkPersistenceUnit) this.item);
	}
}
