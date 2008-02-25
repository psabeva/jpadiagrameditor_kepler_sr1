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
import org.eclipse.jpt.core.context.java.JavaPersistentType;
import org.eclipse.jpt.core.context.java.JavaTypeMapping;
import org.eclipse.jpt.core.context.java.JavaTypeMappingProvider;
import org.eclipse.jpt.core.internal.platform.base.JpaBaseContextFactory;
import org.eclipse.jpt.core.resource.java.EntityAnnotation;

/**
 * 
 */
public class JavaEntityProvider
	implements JavaTypeMappingProvider
{

	// singleton
	private static final JavaEntityProvider INSTANCE = new JavaEntityProvider();

	/**
	 * Return the singleton.
	 */
	public static JavaTypeMappingProvider instance() {
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private JavaEntityProvider() {
		super();
	}

	public String key() {
		return MappingKeys.ENTITY_TYPE_MAPPING_KEY;
	}
	
	public String annotationName() {
		return EntityAnnotation.ANNOTATION_NAME;
	}

	public JavaTypeMapping buildMapping(JavaPersistentType parent, JpaBaseContextFactory factory) {
		return factory.buildJavaEntity(parent);
	}

}
