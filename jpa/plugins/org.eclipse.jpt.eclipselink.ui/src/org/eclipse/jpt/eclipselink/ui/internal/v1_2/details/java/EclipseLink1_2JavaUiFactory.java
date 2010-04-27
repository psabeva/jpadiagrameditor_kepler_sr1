/*******************************************************************************
 * Copyright (c) 2009, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.ui.internal.v1_2.details.java;

import org.eclipse.jpt.core.context.java.JavaEmbeddable;
import org.eclipse.jpt.core.context.java.JavaEntity;
import org.eclipse.jpt.core.context.java.JavaMappedSuperclass;
import org.eclipse.jpt.eclipselink.ui.internal.details.java.EclipseLinkJavaUiFactory;
import org.eclipse.jpt.eclipselink.ui.internal.v1_2.details.java.JavaEclipseLinkEmbeddable1_2Composite;
import org.eclipse.jpt.eclipselink.ui.internal.v1_2.details.java.JavaEclipseLinkEntity1_2Composite;
import org.eclipse.jpt.eclipselink.ui.internal.v1_2.details.java.JavaEclipseLinkMappedSuperclass1_2Composite;
import org.eclipse.jpt.ui.WidgetFactory;
import org.eclipse.jpt.ui.details.JpaComposite;
import org.eclipse.jpt.utility.model.value.PropertyValueModel;
import org.eclipse.swt.widgets.Composite;

public class EclipseLink1_2JavaUiFactory extends EclipseLinkJavaUiFactory
{
	public EclipseLink1_2JavaUiFactory() {
		super();
	}


	// **************** java type mapping composites ***************************

	@Override
	public JpaComposite createJavaMappedSuperclassComposite(
			PropertyValueModel<JavaMappedSuperclass> subjectHolder,
			Composite parent, WidgetFactory widgetFactory) {
		return new JavaEclipseLinkMappedSuperclass1_2Composite(subjectHolder, parent, widgetFactory);
	}

	@Override
	public JpaComposite createJavaEntityComposite(
			PropertyValueModel<JavaEntity> subjectHolder,
			Composite parent, WidgetFactory widgetFactory) {
		return new JavaEclipseLinkEntity1_2Composite(subjectHolder, parent, widgetFactory);
	}

	@Override
	public JpaComposite createJavaEmbeddableComposite(
			PropertyValueModel<JavaEmbeddable> subjectHolder,
			Composite parent, WidgetFactory widgetFactory) {
		return new JavaEclipseLinkEmbeddable1_2Composite(subjectHolder, parent, widgetFactory);
	}
}