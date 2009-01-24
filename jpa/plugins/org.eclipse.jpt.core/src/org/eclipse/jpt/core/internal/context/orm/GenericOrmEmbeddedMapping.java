/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.context.orm.OrmAttributeMapping;
import org.eclipse.jpt.core.context.orm.OrmEmbeddedMapping;
import org.eclipse.jpt.core.context.orm.OrmPersistentAttribute;
import org.eclipse.jpt.core.resource.orm.OrmFactory;
import org.eclipse.jpt.core.resource.orm.XmlEmbedded;
import org.eclipse.jpt.core.resource.orm.XmlTypeMapping;


public class GenericOrmEmbeddedMapping extends AbstractOrmBaseEmbeddedMapping<XmlEmbedded> implements OrmEmbeddedMapping
{
	
	public GenericOrmEmbeddedMapping(OrmPersistentAttribute parent) {
		super(parent);
	}

	public void initializeOn(OrmAttributeMapping newMapping) {
		newMapping.initializeFromOrmEmbeddedMapping(this);
	}

	public int getXmlSequence() {
		return 80;
	}

	public String getKey() {
		return MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY;
	}

	public XmlEmbedded addToResourceModel(XmlTypeMapping typeMapping) {
		XmlEmbedded embedded = OrmFactory.eINSTANCE.createXmlEmbeddedImpl();
		getPersistentAttribute().initialize(embedded);
		typeMapping.getAttributes().getEmbeddeds().add(embedded);
		return embedded;
	}

	public void removeFromResourceModel(XmlTypeMapping typeMapping) {
		typeMapping.getAttributes().getEmbeddeds().remove(this.resourceAttributeMapping);
	}
}
