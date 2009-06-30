/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java.binary;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.NestableAssociationOverrideAnnotation;

/**
 * javax.persistence.AssociationOverrides
 */
public final class BinaryAssociationOverrides1_0Annotation
	extends BinaryAssociationOverridesAnnotation
{

	public BinaryAssociationOverrides1_0Annotation(JavaResourceNode parent, IAnnotation jdtAnnotation) {
		super(parent, jdtAnnotation);
	}

	@Override
	protected NestableAssociationOverrideAnnotation buildAssociationOverride(Object jdtAssociationOverride) {
		return new BinaryAssociationOverride1_0Annotation(this, (IAnnotation) jdtAssociationOverride);
	}

}
