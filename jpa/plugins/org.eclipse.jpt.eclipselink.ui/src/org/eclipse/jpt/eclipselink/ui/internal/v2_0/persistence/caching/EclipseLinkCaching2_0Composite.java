/*******************************************************************************
* Copyright (c) 2009 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.v2_0.persistence.caching;

import org.eclipse.jpt.core.jpa2.context.persistence.PersistenceUnit2_0;
import org.eclipse.jpt.eclipselink.core.context.persistence.caching.Caching;
import org.eclipse.jpt.eclipselink.ui.internal.persistence.caching.EclipseLinkCachingComposite;
import org.eclipse.jpt.eclipselink.ui.internal.v2_0.persistence.caching.CacheDefaults2_0Composite;
import org.eclipse.jpt.ui.internal.jpa2.persistence.options.SharedCacheModeComposite;
import org.eclipse.jpt.ui.internal.widgets.FormPane;
import org.eclipse.jpt.utility.internal.model.value.PropertyAspectAdapter;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

/**
 *  EclipseLinkCaching2_0Composite
 */
public class EclipseLinkCaching2_0Composite extends EclipseLinkCachingComposite<Caching>
{
	public EclipseLinkCaching2_0Composite(
			FormPane<Caching> subjectHolder, 
			Composite container) {
		super(subjectHolder, container);
	}

	@Override
	protected void initializeCacheDefaultsComposite(Composite parent) {

		// SharedCacheMode
		new SharedCacheModeComposite(this, this.buildPersistenceUnit2_0Holder(), parent);
		
		new CacheDefaults2_0Composite(this, parent);
	}

	private PropertyValueModel<PersistenceUnit2_0> buildPersistenceUnit2_0Holder() {
		return new PropertyAspectAdapter<Caching, PersistenceUnit2_0>(this.getSubjectHolder()) {
			@Override
			protected PersistenceUnit2_0 buildValue_() {
				return (PersistenceUnit2_0) this.subject.getPersistenceUnit();
			}
		};
	}
	
}