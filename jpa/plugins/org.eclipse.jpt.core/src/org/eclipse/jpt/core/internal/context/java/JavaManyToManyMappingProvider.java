/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.java;

import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.context.java.JavaAttributeMapping;
import org.eclipse.jpt.core.context.java.JavaAttributeMappingProvider;
import org.eclipse.jpt.core.context.java.JavaPersistentAttribute;
import org.eclipse.jpt.core.internal.platform.base.JpaBaseContextFactory;
import org.eclipse.jpt.core.resource.java.ManyToMany;

public class JavaManyToManyMappingProvider
	implements JavaAttributeMappingProvider
{

	// singleton
	private static final JavaManyToManyMappingProvider INSTANCE = new JavaManyToManyMappingProvider();

	/**
	 * Return the singleton.
	 */
	public static JavaAttributeMappingProvider instance() {
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private JavaManyToManyMappingProvider() {
		super();
	}

	public String key() {
		return MappingKeys.MANY_TO_MANY_ATTRIBUTE_MAPPING_KEY;
	}
	
	public String annotationName() {
		return ManyToMany.ANNOTATION_NAME;
	}

	public JavaAttributeMapping buildMapping(JavaPersistentAttribute parent, JpaBaseContextFactory factory) {
		return factory.buildJavaManyToManyMapping(parent);
	}
}
