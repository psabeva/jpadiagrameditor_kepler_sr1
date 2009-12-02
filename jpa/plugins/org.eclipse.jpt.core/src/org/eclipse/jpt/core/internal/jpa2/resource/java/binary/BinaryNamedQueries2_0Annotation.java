/*******************************************************************************
* Copyright (c) 2009 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.core.internal.jpa2.resource.java.binary;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.core.internal.resource.java.binary.BinaryNamedQueriesAnnotation;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.NamedQueryAnnotation;

/**
 * javax.persistence.NamedQueries
 */
public final class BinaryNamedQueries2_0Annotation
	extends BinaryNamedQueriesAnnotation
{
	public BinaryNamedQueries2_0Annotation(JavaResourceNode parent, IAnnotation jdtAnnotation) {
		super(parent, jdtAnnotation);
	}

	@Override
	protected NamedQueryAnnotation buildNamedQuery(Object jdtQuery) {
		return new BinaryNamedQuery2_0Annotation(this, (IAnnotation) jdtQuery);
	}

}