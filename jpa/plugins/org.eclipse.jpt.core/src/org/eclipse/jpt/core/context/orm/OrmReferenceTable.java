/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.context.orm;

import java.util.ListIterator;
import org.eclipse.jpt.core.context.ReferenceTable;
import org.eclipse.jpt.core.context.XmlContextNode;

/**
 * orm.xml join table and collection table
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface OrmReferenceTable
	extends ReferenceTable, XmlContextNode
{
	// ********** covariant overrides **********
	
	@SuppressWarnings("unchecked")
	ListIterator<OrmJoinColumn> joinColumns();

	OrmJoinColumn getDefaultJoinColumn();
	
	@SuppressWarnings("unchecked")
	ListIterator<OrmJoinColumn> specifiedJoinColumns();

	OrmJoinColumn addSpecifiedJoinColumn(int index);
	
	@SuppressWarnings("unchecked")
	ListIterator<OrmUniqueConstraint> uniqueConstraints();
	
	OrmUniqueConstraint addUniqueConstraint(int index);

}