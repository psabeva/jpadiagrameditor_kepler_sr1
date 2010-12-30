/*******************************************************************************
 * Copyright (c) 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jaxb.core.internal.context.java;

import org.eclipse.jpt.jaxb.core.context.JaxbPersistentAttribute;
import org.eclipse.jpt.jaxb.core.context.JaxbPersistentClass;
import org.eclipse.jpt.jaxb.core.internal.context.AbstractJaxbContextNode;

public abstract class GenericJavaPersistentAttribute
		extends AbstractJaxbContextNode
		implements JaxbPersistentAttribute {



	protected GenericJavaPersistentAttribute(JaxbPersistentClass parent) {
		super(parent);
	}

	public void synchronizeWithResourceModel() {
		
	}

	public void update() {
		
	}
}
