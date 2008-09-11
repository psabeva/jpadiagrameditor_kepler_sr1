/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import org.eclipse.jpt.core.context.Converter;
import org.eclipse.jpt.core.context.orm.OrmAttributeMapping;
import org.eclipse.jpt.core.context.orm.OrmConverter;
import org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping;
import org.eclipse.jpt.core.utility.TextRange;

public class GenericOrmNullConverter extends AbstractOrmJpaContextNode
	implements OrmConverter
{
	
	public GenericOrmNullConverter(OrmAttributeMapping parent) {
		super(parent);
	}
	
	@Override
	public OrmAttributeMapping getParent() {
		return (OrmAttributeMapping) super.getParent();
	}
	
	public String getType() {
		return Converter.NO_CONVERTER;
	}
	
	public TextRange getValidationTextRange() {
		return null;
	}
	
	public void update(XmlConvertibleMapping resourceConvertableMapping) {
		// do nothing, null implementation		
	}
	
	public void addToResourceModel() {
		// do nothing, null implementation
	}
	
	public void removeFromResourceModel() {
		// do nothing, null implementation		
	}
}
