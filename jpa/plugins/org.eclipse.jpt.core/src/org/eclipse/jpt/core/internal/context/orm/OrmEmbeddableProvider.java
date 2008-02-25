/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0, which accompanies this distribution and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.context.orm.OrmTypeMappingProvider;
import org.eclipse.jpt.core.context.orm.OrmPersistentType;
import org.eclipse.jpt.core.context.orm.OrmTypeMapping;
import org.eclipse.jpt.core.internal.platform.base.JpaBaseContextFactory;
import org.eclipse.jpt.core.resource.orm.XmlEmbeddable;


public class OrmEmbeddableProvider implements OrmTypeMappingProvider
{

	public OrmTypeMapping<XmlEmbeddable> buildTypeMapping(JpaBaseContextFactory factory, OrmPersistentType parent) {
		return factory.buildXmlEmbeddable(parent);
	}

	public String key() {
		return MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY;
	}
}
