/*******************************************************************************
 *  Copyright (c) 2008 Oracle. All rights reserved. This
 *  program and the accompanying materials are made available under the terms of
 *  the Eclipse Public License v1.0 which accompanies this distribution, and is
 *  available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: Oracle. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.eclipselink.core.internal.resource.orm.translators;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.wst.common.internal.emf.resource.Translator;

public class StructConverterTranslator extends Translator
	implements EclipseLinkOrmXmlMapper
{	
	private Translator[] children;	
	
	
	public StructConverterTranslator(String domNameAndPath, EStructuralFeature aFeature) {
		super(domNameAndPath, aFeature);
	}
	
	@Override
	public Translator[] getChildren(@SuppressWarnings("unused") Object target, @SuppressWarnings("unused") int versionID) {
		if (this.children == null) {
			this.children = createChildren();
		}
		return this.children;
	}
		
	protected Translator[] createChildren() {
		return new Translator[] {
			createNameTranslator(),
			createConverterTranslator(),
		};
	}
	
	protected Translator createNameTranslator() {
		return new Translator(STRUCT_CONVERTER__NAME, ECLIPSELINK_ORM_PKG.getXmlStructConverter_Name(), DOM_ATTRIBUTE);
	}
	
	protected Translator createConverterTranslator() {
		return new Translator(STRUCT_CONVERTER__CONVERTER, ECLIPSELINK_ORM_PKG.getXmlStructConverter_Converter(), DOM_ATTRIBUTE);
	}

}
