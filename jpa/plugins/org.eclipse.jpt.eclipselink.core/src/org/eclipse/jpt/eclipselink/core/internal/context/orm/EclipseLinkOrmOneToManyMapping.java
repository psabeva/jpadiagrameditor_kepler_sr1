/*******************************************************************************
 *  Copyright (c) 2008  Oracle. 
 *  All rights reserved.  This program and the accompanying materials are 
 *  made available under the terms of the Eclipse Public License v1.0 which 
 *  accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.context.orm;

import java.util.List;
import org.eclipse.jpt.core.context.orm.OrmPersistentAttribute;
import org.eclipse.jpt.core.internal.context.orm.GenericOrmOneToManyMapping;
import org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping;
import org.eclipse.jpt.core.resource.orm.XmlAttributeMapping;
import org.eclipse.jpt.eclipselink.core.context.EclipseLinkOneToManyMapping;
import org.eclipse.jpt.eclipselink.core.context.JoinFetch;
import org.eclipse.jpt.eclipselink.core.context.PrivateOwned;
import org.eclipse.jpt.eclipselink.core.resource.orm.EclipseLinkOrmFactory;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlJoinFetch;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlOneToMany;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlPrivateOwned;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;

public class EclipseLinkOrmOneToManyMapping extends GenericOrmOneToManyMapping
	implements EclipseLinkOneToManyMapping
{
	protected EclipseLinkOrmPrivateOwned privateOwned;
	
	protected EclipseLinkOrmJoinFetch joinFetch;
	
	
	public EclipseLinkOrmOneToManyMapping(OrmPersistentAttribute parent) {
		super(parent);
		this.privateOwned = new EclipseLinkOrmPrivateOwned(this);
		this.joinFetch = new EclipseLinkOrmJoinFetch(this);
	}
	
	
	public PrivateOwned getPrivateOwned() {
		return this.privateOwned;
	}
	
	public JoinFetch getJoinFetch() {
		return this.joinFetch;
	}
	
	
	// **************** resource-context interaction ***************************
	
	@Override
	public XmlOneToMany addToResourceModel(AbstractXmlTypeMapping typeMapping) {
		XmlOneToMany oneToMany = EclipseLinkOrmFactory.eINSTANCE.createXmlOneToManyImpl();
		getPersistentAttribute().initialize(oneToMany);
		typeMapping.getAttributes().getOneToManys().add(oneToMany);
		return oneToMany;
	}
	
	@Override
	public void initialize(XmlAttributeMapping attributeMapping) {
		super.initialize(attributeMapping);	
		this.privateOwned.initialize((XmlPrivateOwned) this.resourceAttributeMapping);
		this.joinFetch.initialize((XmlJoinFetch) this.resourceAttributeMapping);
	}
	
	@Override
	public void update() {
		super.update();
		this.privateOwned.update();
		this.joinFetch.update();
	}
	
	
	// **************** validation **************************************
	
	@Override
	public void validate(List<IMessage> messages) {
		super.validate(messages);
		// TODO - private owned, join fetch validation
	}
}