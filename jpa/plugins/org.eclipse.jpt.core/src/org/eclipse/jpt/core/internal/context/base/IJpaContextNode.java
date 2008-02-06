/*******************************************************************************
 *  Copyright (c) 2007 Oracle. 
 *  All rights reserved.  This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.internal.context.base;

import org.eclipse.jpt.core.internal.IJpaNode;
import org.eclipse.jpt.core.internal.ITextRange;
import org.eclipse.jpt.core.internal.context.orm.EntityMappings;
import org.eclipse.jpt.core.internal.context.orm.XmlPersistentType;

public interface IJpaContextNode extends IJpaNode
{
	IPersistenceUnit persistenceUnit();
	
	/**
	 * Return the EntityMappings if this contextNode is within an orm.xml context
	 * Return null otherwise.
	 */
	EntityMappings entityMappings();

	//TODO interface for this
	XmlPersistentType xmlPersistentType();
	
	ITextRange selectionTextRange();
	
	/**
	 * return the context node at the given offset.  This context node
	 * should be a *structural* context node, ie it should be available
	 * in the structure view
	 */
	IJpaContextNode contextNode(int offset);

}
