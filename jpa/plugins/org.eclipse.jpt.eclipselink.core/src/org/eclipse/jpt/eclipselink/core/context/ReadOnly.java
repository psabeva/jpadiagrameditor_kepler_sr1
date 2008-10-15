/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.context;

import org.eclipse.jpt.core.context.JpaContextNode;

/**
 * 
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
public interface ReadOnly extends JpaContextNode
{
	boolean isReadOnly();
	
	boolean isDefaultReadOnly();
		String DEFAULT_READ_ONLY_PROPERTY = "defaultReadOnly"; //$NON-NLS-1$
		boolean DEFAULT_READ_ONLY = false;
	Boolean getSpecifiedReadOnly();
	void setSpecifiedReadOnly(Boolean newSpecifiedReadOnly);
		String SPECIFIED_READ_ONLY_PROPERTY = "specifiedReadOnly"; //$NON-NLS-1$
}
