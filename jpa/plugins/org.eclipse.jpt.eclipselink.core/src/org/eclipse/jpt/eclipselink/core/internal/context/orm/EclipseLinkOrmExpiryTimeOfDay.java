/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.context.orm;

import org.eclipse.jpt.core.internal.context.AbstractXmlContextNode;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.eclipselink.core.context.ExpiryTimeOfDay;
import org.eclipse.jpt.eclipselink.core.context.orm.XmlCaching;
import org.eclipse.jpt.eclipselink.core.resource.orm.XmlTimeOfDay;

public class EclipseLinkOrmExpiryTimeOfDay extends AbstractXmlContextNode
	implements ExpiryTimeOfDay
{
	
	protected Integer hour;
	protected Integer minute;
	protected Integer second;
	protected Integer millisecond;
	
	protected XmlTimeOfDay resourceTimeOfDay;
	
	public EclipseLinkOrmExpiryTimeOfDay(XmlCaching parent) {
		super(parent);
	}
	
	
	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer newHour) {
		Integer oldHour = this.hour;
		this.hour = newHour;
		this.resourceTimeOfDay.setHour(newHour);
		firePropertyChanged(HOUR_PROPERTY, oldHour, newHour);
	}

	protected void setHour_(Integer newHour) {
		Integer oldHour = this.hour;
		this.hour = newHour;
		firePropertyChanged(HOUR_PROPERTY, oldHour, newHour);
	}

	public Integer getMinute() {
		return this.minute;
	}

	public void setMinute(Integer newMinute) {
		Integer oldMinute = this.minute;
		this.minute = newMinute;
		this.resourceTimeOfDay.setMinute(newMinute);
		firePropertyChanged(MINUTE_PROPERTY, oldMinute, newMinute);
	}

	protected void setMinute_(Integer newMinute) {
		Integer oldMinute = this.minute;
		this.minute = newMinute;
		firePropertyChanged(MINUTE_PROPERTY, oldMinute, newMinute);
	}

	public Integer getSecond() {
		return this.second;
	}

	public void setSecond(Integer newSecond) {
		Integer oldSecond = this.second;
		this.second = newSecond;
		this.resourceTimeOfDay.setSecond(newSecond);
		firePropertyChanged(SECOND_PROPERTY, oldSecond, newSecond);
	}
	
	protected void setSecond_(Integer newSecond) {
		Integer oldSecond = this.second;
		this.second = newSecond;
		firePropertyChanged(SECOND_PROPERTY, oldSecond, newSecond);
	}

	public Integer getMillisecond() {
		return this.millisecond;
	}

	public void setMillisecond(Integer newMillisecond) {
		Integer oldMillisecond = this.millisecond;
		this.millisecond = newMillisecond;
		this.resourceTimeOfDay.setMillisecond(newMillisecond);
		firePropertyChanged(MILLISECOND_PROPERTY, oldMillisecond, newMillisecond);
	}
	
	protected void setMillisecond_(Integer newMillisecond) {
		Integer oldMillisecond = this.millisecond;
		this.millisecond = newMillisecond;
		firePropertyChanged(MILLISECOND_PROPERTY, oldMillisecond, newMillisecond);
	}

	public TextRange getValidationTextRange() {
		return this.resourceTimeOfDay.getValidationTextRange();
	}
	
	public void initialize(XmlTimeOfDay resource) {
		this.resourceTimeOfDay = resource;
		this.hour = getResourceHour();
		this.minute = getResourceMinute();
		this.second = getResourceSecond();
		this.millisecond = getResourceMillisecond();
	}
	
	public void update(XmlTimeOfDay resource) {
		this.resourceTimeOfDay = resource;
		this.setHour_(getResourceHour());
		this.setMinute_(getResourceMinute());
		this.setSecond_(getResourceSecond());
		this.setMillisecond_(getResourceMillisecond());
	}
	
	protected Integer getResourceHour() {
		return this.resourceTimeOfDay.getHour();
	}
	
	protected Integer getResourceMinute() {
		return this.resourceTimeOfDay.getMinute();
	}
	
	protected Integer getResourceSecond() {
		return this.resourceTimeOfDay.getSecond();
	}
	
	protected Integer getResourceMillisecond() {
		return this.resourceTimeOfDay.getMillisecond();
	}
}
