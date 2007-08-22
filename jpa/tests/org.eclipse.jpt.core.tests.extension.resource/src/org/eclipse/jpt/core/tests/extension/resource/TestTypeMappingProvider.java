/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.tests.extension.resource;

import org.eclipse.jpt.core.internal.IJpaFactory;
import org.eclipse.jpt.core.internal.IMappingKeys;
import org.eclipse.jpt.core.internal.content.java.IJavaTypeMapping;
import org.eclipse.jpt.core.internal.content.java.IJavaTypeMappingProvider;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.Type;

/**
 * 
 */
public class TestTypeMappingProvider
	implements IJavaTypeMappingProvider
{

	// singleton
	private static final TestTypeMappingProvider INSTANCE = new TestTypeMappingProvider();

	/**
	 * Return the singleton.
	 */
	public static IJavaTypeMappingProvider instance() {
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private TestTypeMappingProvider() {
		super();
	}

	public String key() {
		return "test";
	}

	public IJavaTypeMapping buildMapping(Type type, IJpaFactory factory) {
		return ((TestJpaFactory) factory).createTestTypeMapping(type);
	}

	public DeclarationAnnotationAdapter declarationAnnotationAdapter() {
		return null;
	}

}
