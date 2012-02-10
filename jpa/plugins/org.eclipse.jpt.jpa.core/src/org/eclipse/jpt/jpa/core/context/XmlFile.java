/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.context;

import org.eclipse.jpt.common.utility.internal.Tools;
import org.eclipse.jpt.jpa.core.JpaStructureNode;
import org.eclipse.jpt.jpa.core.resource.xml.JpaXmlResource;

/**
 * Context representation of any JPA XML file.
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.3
 * @since 2.3
 */
public interface XmlFile
	extends XmlContextNode, JpaStructureNode
{
	/**
	 * Return the resource model object
	 */
	JpaXmlResource getXmlResource();

	/**
	 * Return whether the XML file's version is the latest supported by its
	 * JPA platform.
	 */
	boolean isLatestSupportedVersion();


	/**
	 * Common implementations.
	 */
	class XmlFile_ {

		/**
		 * @see #isLatestSupportedVersion()
		 */
		public static boolean isLatestSupportedVersion(XmlFile xmlFile) {
			String xmlFileVersion = xmlFile.getXmlResource().getVersion();
			String latestVersion = xmlFile.getJpaProject().getJpaPlatform().getMostRecentSupportedResourceType(xmlFile.getXmlResource().getContentType()).getVersion();
			return Tools.valuesAreEqual(xmlFileVersion, latestVersion);
		}

		private XmlFile_() {
			super();
			throw new UnsupportedOperationException();
		}
	}
}
