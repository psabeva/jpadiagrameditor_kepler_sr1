/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.platform;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jpt.core.JpaProject;
import org.eclipse.jpt.eclipselink.ui.internal.ddlgen.EclipseLinkDDLGeneratorUi;
import org.eclipse.jpt.ui.JpaPlatformUiProvider;
import org.eclipse.jpt.ui.JpaUiFactory;
import org.eclipse.jpt.ui.internal.platform.base.BaseJpaPlatformUi;
import org.eclipse.jpt.ui.navigator.JpaNavigatorProvider;
import org.eclipse.jpt.ui.structure.JpaStructureProvider;

public class EclipseLinkJpaPlatformUi
	extends BaseJpaPlatformUi
{
	public EclipseLinkJpaPlatformUi(
		JpaUiFactory jpaUiFactory,
		JpaNavigatorProvider navigatorProvider,
		JpaStructureProvider persistenceStructureProvider, 
		JpaStructureProvider javaStructureProvider,
		JpaPlatformUiProvider... platformUiProviders) 
	{
		super(jpaUiFactory, navigatorProvider, persistenceStructureProvider, javaStructureProvider, platformUiProviders);
	}

	// ********** DDL generation **********

	public void generateDDL(JpaProject project, IStructuredSelection selection) {
		EclipseLinkDDLGeneratorUi.generate(project);
	}

}
