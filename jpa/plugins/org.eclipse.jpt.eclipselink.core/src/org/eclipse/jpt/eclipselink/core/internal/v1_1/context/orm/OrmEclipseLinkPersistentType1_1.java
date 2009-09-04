/*******************************************************************************
 * Copyright (c) 2008, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.v1_1.context.orm;

import java.util.Iterator;
import org.eclipse.jpt.core.context.AccessType;
import org.eclipse.jpt.core.context.orm.OrmPersistentAttribute;
import org.eclipse.jpt.core.internal.context.orm.AbstractOrmPersistentType;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentAttribute;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.core.resource.orm.Attributes;
import org.eclipse.jpt.core.resource.orm.XmlTypeMapping;
import org.eclipse.jpt.eclipselink.core.context.orm.EclipseLinkEntityMappings;
import org.eclipse.jpt.eclipselink.core.v1_1.resource.orm.EclipseLink1_1OrmFactory;

public class OrmEclipseLinkPersistentType1_1 extends AbstractOrmPersistentType
{
	
	public OrmEclipseLinkPersistentType1_1(EclipseLinkEntityMappings parent, XmlTypeMapping resourceMapping) {
		super(parent, resourceMapping);
	}
	
	@Override
	protected Attributes createResourceAttributes() {
		return EclipseLink1_1OrmFactory.eINSTANCE.createAttributes();
	}
	
	@Override
	protected AccessType getAccess(OrmPersistentAttribute ormPersistentAttribute) {
		return ormPersistentAttribute.getAccess();
	}
	
	@Override
	protected Iterator<JavaResourcePersistentAttribute> javaPersistentAttributes(JavaResourcePersistentType resourcePersistentType) {
		AccessType specifiedAccess = getSpecifiedAccess();
		if (specifiedAccess == null && !getMapping().isMetadataComplete()) {
			specifiedAccess = getJavaPersistentType().getSpecifiedAccess();
		}
		return specifiedAccess == null
			? super.javaPersistentAttributes(resourcePersistentType)
			: resourcePersistentType.persistableAttributes(AccessType.toJavaResourceModel(specifiedAccess));
	}

}
