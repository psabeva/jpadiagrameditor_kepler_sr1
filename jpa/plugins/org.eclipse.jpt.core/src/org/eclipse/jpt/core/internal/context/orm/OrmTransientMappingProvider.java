/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.context.orm.OrmAttributeMappingProvider;
import org.eclipse.jpt.core.internal.platform.base.JpaBaseContextFactory;

public class OrmTransientMappingProvider implements OrmAttributeMappingProvider
{
	// singleton
	private static final OrmTransientMappingProvider INSTANCE = new OrmTransientMappingProvider();

	/**
	 * Return the singleton.
	 */
	public static OrmAttributeMappingProvider instance() {
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private OrmTransientMappingProvider() {
		super();
	}
	
	public String key() {
		return MappingKeys.TRANSIENT_ATTRIBUTE_MAPPING_KEY;
	}
	
	public GenericOrmTransientMapping buildAttributeMapping(JpaBaseContextFactory factory, OrmPersistentAttribute parent) {
		return new GenericOrmTransientMapping(parent);
	}
}
