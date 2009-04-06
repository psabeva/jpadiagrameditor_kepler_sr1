/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.context;

/**
 * Corresponds to a StructConverter resource model object
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.1
 * @since 2.1
 */
public interface StructConverter extends EclipseLinkConverter
{
	String getConverterClass();	
	void setConverterClass(String converterClass);
		String CONVERTER_CLASS_PROPERTY = "converterClass"; //$NON-NLS-1$
		String ECLIPSELINK_STRUCT_CONVERTER_CLASS_NAME = "org.eclipse.persistence.platform.database.converters.StructConverter"; //$NON-NLS-1$

}
