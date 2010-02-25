/*******************************************************************************
 *  Copyright (c) 2009, 2010  Oracle. 
 *  All rights reserved.  This program and the accompanying materials are 
 *  made available under the terms of the Eclipse Public License v1.0 which 
 *  accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.internal.context.orm;

import java.util.List;
import org.eclipse.jpt.core.context.JoinColumn;
import org.eclipse.jpt.core.context.RelationshipMapping;
import org.eclipse.jpt.core.context.orm.OrmJoinColumn;
import org.eclipse.jpt.core.context.orm.OrmJoinColumnEnabledRelationshipReference;
import org.eclipse.jpt.core.context.orm.OrmJoinColumnJoiningStrategy;
import org.eclipse.jpt.core.context.orm.OrmJoinTableJoiningStrategy;
import org.eclipse.jpt.core.context.orm.OrmManyToOneMapping;
import org.eclipse.jpt.core.context.orm.OrmRelationshipReference;
import org.eclipse.jpt.core.jpa2.context.orm.OrmManyToOneRelationshipReference2_0;
import org.eclipse.jpt.core.resource.orm.XmlManyToOne;
import org.eclipse.jpt.utility.internal.CollectionTools;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

public abstract class AbstractOrmManyToOneRelationshipReference
	extends AbstractOrmRelationshipReference
	implements OrmManyToOneRelationshipReference2_0
{
	protected OrmJoinColumnJoiningStrategy joinColumnJoiningStrategy;
	
	protected OrmJoinTableJoiningStrategy joinTableJoiningStrategy;
	
	protected AbstractOrmManyToOneRelationshipReference(
			OrmManyToOneMapping parent, XmlManyToOne resource) {
		super(parent, resource);
	}
	
	
	@Override
	protected void initializeJoiningStrategies() {
		this.joinTableJoiningStrategy = buildJoinTableJoiningStrategy();
		this.joinColumnJoiningStrategy = buildJoinColumnJoiningStrategy();
	}
	
	protected OrmJoinColumnJoiningStrategy buildJoinColumnJoiningStrategy() {
		return new GenericOrmJoinColumnJoiningStrategy(this, getResourceMapping());
	}
	
	protected abstract OrmJoinTableJoiningStrategy buildJoinTableJoiningStrategy();
	
	public void initializeOn(OrmRelationshipReference newRelationshipReference) {
		newRelationshipReference.initializeFromJoinColumnEnabledRelationshipReference(this);
	}
	
	@Override
	public void initializeFromJoinColumnEnabledRelationshipReference(
			OrmJoinColumnEnabledRelationshipReference oldRelationshipReference) {
		int index = 0;
		for (JoinColumn joinColumn : 
				CollectionTools.iterable(
					oldRelationshipReference.getJoinColumnJoiningStrategy().specifiedJoinColumns())) {
			OrmJoinColumn newJoinColumn = getJoinColumnJoiningStrategy().addSpecifiedJoinColumn(index++);
			newJoinColumn.initializeFrom(joinColumn);
		}
	}
	
	@Override
	public OrmManyToOneMapping getRelationshipMapping() {
		return (OrmManyToOneMapping) getParent();
	}
	
	public XmlManyToOne getResourceMapping() {
		return getRelationshipMapping().getResourceAttributeMapping();
	}
	
	public boolean isRelationshipOwner() {
		return true;
	}
	
	public boolean isOwnedBy(RelationshipMapping mapping) {
		return false;
	}
	
	
	// **************** join columns *******************************************
	
	public OrmJoinColumnJoiningStrategy getJoinColumnJoiningStrategy() {
		return this.joinColumnJoiningStrategy;
	}
	
	public boolean usesJoinColumnJoiningStrategy() {
		return getPredominantJoiningStrategy() == this.joinColumnJoiningStrategy;
	}
	
	public void setJoinColumnJoiningStrategy() {
		this.joinTableJoiningStrategy.removeStrategy();
		// join columns are default (only strategy in fact) so no need to add to resource
		setPredominantJoiningStrategy();
	}
	
	public void unsetJoinColumnJoiningStrategy() {
		this.joinColumnJoiningStrategy.removeStrategy();
		setPredominantJoiningStrategy();
	}
	
	public boolean mayHaveDefaultJoinColumn() {
		return this.getJoinTableJoiningStrategy().getJoinTable() == null;
	}

	// **************** join table *********************************************
	
	public OrmJoinTableJoiningStrategy getJoinTableJoiningStrategy() {
		return this.joinTableJoiningStrategy;
	}
	
	public boolean usesJoinTableJoiningStrategy() {
		return getPredominantJoiningStrategy() == this.joinTableJoiningStrategy;
	}
	
	public final void setJoinTableJoiningStrategy() {
		this.joinTableJoiningStrategy.addStrategy();
		this.joinColumnJoiningStrategy.removeStrategy();
		setPredominantJoiningStrategy();
	}
	
	public final void unsetJoinTableJoiningStrategy() {
		unsetJoinTableJoiningStrategy_();
		setPredominantJoiningStrategy();
	}
	
	protected void unsetJoinTableJoiningStrategy_() {
		this.joinTableJoiningStrategy.removeStrategy();
	}
	
	public boolean mayHaveDefaultJoinTable() {
		return false;
	}
	
	
	// **************** resource => context ************************************
	
	@Override
	protected void updateJoiningStrategies() {
		this.joinTableJoiningStrategy.update();
		this.joinColumnJoiningStrategy.update();
	}
	
	
	// **************** Validation *********************************************
	
	@Override
	public void validate(List<IMessage> messages, IReporter reporter) {
		super.validate(messages, reporter);
		this.joinColumnJoiningStrategy.validate(messages, reporter);
		this.joinTableJoiningStrategy.validate(messages, reporter);
	}
}