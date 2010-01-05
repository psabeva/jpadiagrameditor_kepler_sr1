/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.jpa2.context.java;

import java.util.ListIterator;
import org.eclipse.jpt.core.context.java.JavaJoinColumn;
import org.eclipse.jpt.core.context.java.JavaReferenceTable;
import org.eclipse.jpt.core.context.java.JavaUniqueConstraint;
import org.eclipse.jpt.core.jpa2.context.CollectionTable2_0;
import org.eclipse.jpt.core.jpa2.resource.java.CollectionTable2_0Annotation;

/**
 * Java collection table
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface JavaCollectionTable2_0
	extends CollectionTable2_0, JavaReferenceTable
{
	void initialize(CollectionTable2_0Annotation collectionTableAnnotation);

	void update(CollectionTable2_0Annotation collectionTableAnnotation);

	// ********** covariant overrides **********

	ListIterator<JavaJoinColumn> joinColumns();

	JavaJoinColumn getDefaultJoinColumn();

	ListIterator<JavaJoinColumn> specifiedJoinColumns();

	JavaJoinColumn addSpecifiedJoinColumn(int index);

	ListIterator<JavaUniqueConstraint> uniqueConstraints();

	JavaUniqueConstraint addUniqueConstraint(int index);

}