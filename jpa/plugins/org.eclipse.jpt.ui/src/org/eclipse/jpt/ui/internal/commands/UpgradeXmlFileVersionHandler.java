/*******************************************************************************
 *  Copyright (c) 2009  Oracle. 
 *  All rights reserved.  This program and the accompanying materials are 
 *  made available under the terms of the Eclipse Public License v1.0 which 
 *  accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.ui.internal.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jpt.core.context.XmlFile;
import org.eclipse.jpt.core.resource.xml.JpaRootEObject;
import org.eclipse.jpt.core.resource.xml.JpaXmlResource;
import org.eclipse.ui.handlers.HandlerUtil;

public class UpgradeXmlFileVersionHandler extends AbstractHandler
{
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection 
			= (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		
		// only applies for a singly selected objects that adapt to JpaXmlResource or XmlFile
		Object selectedObject = selection.getFirstElement();
		JpaXmlResource xmlResource = 
				(JpaXmlResource) Platform.getAdapterManager().getAdapter(selectedObject, JpaXmlResource.class);
		if (xmlResource == null) {
			XmlFile xmlFile = 
				(XmlFile) Platform.getAdapterManager().getAdapter(selectedObject, XmlFile.class);
			if (xmlFile != null) {
				xmlResource = xmlFile.getXmlResource();
			}
		}
		if (xmlResource == null) {
			return null;
		}
		
		final JpaRootEObject root = xmlResource.getRootObject();
		IContentType contentType = xmlResource.getContentType();
		final String newVersion = 
				xmlResource.getJpaProject().getJpaPlatform().getMostRecentSupportedResourceType(contentType).getVersion();
		
		xmlResource.modify(
			new Runnable() {
				public void run() {
					root.setVersion(newVersion);
				}
			});
		
		return null;
	}
}