/*******************************************************************************
 * Copyright (c) 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.jpa2.context.java;

import org.eclipse.jpt.core.context.java.JavaPersistentAttribute;
import org.eclipse.jpt.core.internal.context.java.AbstractJavaOneToOneMapping;
import org.eclipse.jpt.core.jpa2.context.java.JavaOneToOneRelationshipReference2_0;


public class GenericJavaOneToOneMapping2_0
	extends AbstractJavaOneToOneMapping
{
	public GenericJavaOneToOneMapping2_0(JavaPersistentAttribute parent) {
		super(parent);
	}

	@Override
	protected JavaOneToOneRelationshipReference2_0 buildRelationshipReference() {
		return new GenericJavaOneToOneRelationshipReference2_0(this);
	}

}