/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.context;

import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jpt.core.context.persistence.MappingFileRef;
import org.eclipse.jpt.core.resource.xml.JpaXmlResource;

/**
 * A JpaPlatform can support multiple mapping files.  Each will
 * have a unique content type and must be defined with a mapping file definition.
 * The mapping file object will be built using the buildMappingFile() method.  
 * Use the xml context node factory to build the objects that are a 
 * part of the mapping file.
 *
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface MappingFileDefinition
{
	/**
	 * Return the associated mapping file content type.
	 */
	IContentType getContentType();

	/**
	 * Return the factory for building xml context nodes
	 */
	XmlContextNodeFactory getFactory();
	
	/**
	 * Build a mapping with the specified parent and resource.
	 */
	MappingFile buildMappingFile(MappingFileRef parent, JpaXmlResource resource);

}
