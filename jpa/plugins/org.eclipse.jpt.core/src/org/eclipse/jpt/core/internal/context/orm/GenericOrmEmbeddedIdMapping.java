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
import org.eclipse.jpt.core.context.orm.OrmEmbeddedIdMapping;
import org.eclipse.jpt.core.context.orm.OrmPersistentAttribute;
import org.eclipse.jpt.core.resource.orm.OrmFactory;
import org.eclipse.jpt.core.resource.orm.XmlEmbeddedId;
import org.eclipse.jpt.core.resource.orm.XmlTypeMapping;


public class GenericOrmEmbeddedIdMapping extends AbstractOrmBaseEmbeddedMapping<XmlEmbeddedId> implements OrmEmbeddedIdMapping
{

	public GenericOrmEmbeddedIdMapping(OrmPersistentAttribute parent) {
		super(parent);
	}

	public void initializeOn(OrmAttributeMapping newMapping) {
		newMapping.initializeFromOrmEmbeddedIdMapping(this);
	}
	
	public int getXmlSequence() {
		return 10;
	}
	
	//*************** AttributeMapping implementation *********************
	
	public String getKey() {
		return MappingKeys.EMBEDDED_ID_ATTRIBUTE_MAPPING_KEY;
	}
	
	@Override
	public boolean isIdMapping() {
		return true;
	}

	public XmlEmbeddedId addToResourceModel(XmlTypeMapping typeMapping) {
		XmlEmbeddedId embeddedId = OrmFactory.eINSTANCE.createXmlEmbeddedIdImpl();
		getPersistentAttribute().initialize(embeddedId);
		typeMapping.getAttributes().getEmbeddedIds().add(embeddedId);
		return embeddedId;
	}
	
	public void removeFromResourceModel(XmlTypeMapping typeMapping) {
		typeMapping.getAttributes().getEmbeddedIds().remove(this.resourceAttributeMapping);
	}
}
