/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.resource.orm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.internal.resource.xml.translators.SimpleTranslator;
import org.eclipse.wst.common.internal.emf.resource.Translator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embeddable</b></em>'.
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddable()
 * @model kind="class"
 * @generated
 */
public class XmlEmbeddable extends AbstractXmlTypeMapping
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlEmbeddable()
	{
		super();
	}
	
	public String getMappingKey() {
		return MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY;
	}
	
	public XmlEntityMappings getEntityMappings() {
		return (XmlEntityMappings) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return OrmPackage.Literals.XML_EMBEDDABLE;
	}
	
	// ********** translators **********

	public static Translator buildTranslator(String elementName, EStructuralFeature structuralFeature) {
		return new SimpleTranslator(elementName, structuralFeature, buildTranslatorChildren());
	}

	private static Translator[] buildTranslatorChildren() {
		return new Translator[] {
			buildClassTranslator(),
			buildAccessTranslator(),
			buildMetadataCompleteTranslator(),
			buildDescriptionTranslator(),
			buildAttributesTranslator()
		};
	}

	protected static Translator buildNameTranslator() {
		return new Translator(JPA.NAME, OrmPackage.eINSTANCE.getXmlEntity_Name(), Translator.DOM_ATTRIBUTE);
	}
	
	protected static Translator buildAccessTranslator() {
		return new Translator(JPA.ACCESS, OrmPackage.eINSTANCE.getXmlAccessHolder_Access(), Translator.DOM_ATTRIBUTE);
	}

} // Embeddable
