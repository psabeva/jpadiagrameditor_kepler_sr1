/*******************************************************************************
 * Copyright (c) 2006, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.content.java.mappings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.IPersistentType;
import org.eclipse.jpt.core.internal.ITextRange;
import org.eclipse.jpt.core.internal.ITypeMapping;
import org.eclipse.jpt.core.internal.JpaCorePackage;
import org.eclipse.jpt.core.internal.content.java.IJavaTypeMapping;
import org.eclipse.jpt.core.internal.content.java.JavaEObject;
import org.eclipse.jpt.core.internal.jdtutility.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.internal.jdtutility.Type;
import org.eclipse.jpt.db.internal.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.jpt.core.internal.content.java.mappings.JpaJavaMappingsPackage#getJavaTypeMapping()
 * @model kind="class" abstract="true"
 * @generated
 */
//TODO need a way to morph between mapping types to save any information that is
//comming to the different TypeMappings.  For java, we do not know the other types
//of mappings since they are defined in an extension point so we can do this the same
//way as xml.
public abstract class JavaTypeMapping extends JavaEObject
	implements IJavaTypeMapping
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	private Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTypeMapping() {
		super();
	}

	protected JavaTypeMapping(Type type) {
		super();
		this.type = type;
	}

	/**
	 * Return the declaration adapter for the mapping's annotation.
	 */
	protected abstract DeclarationAnnotationAdapter declarationAnnotationAdapter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JpaJavaMappingsPackage.Literals.JAVA_TYPE_MAPPING;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.jpt.core.internal.content.java.mappings.JpaJavaMappingsPackage#getITypeMapping_Name()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public String getName() {
		return getType().getName();
	}

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see org.eclipse.jpt.core.internal.content.java.mappings.JpaJavaMappingsPackage#getITypeMapping_TableName()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public String getTableName() {
		return getType().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated NOT
	 */
	public IPersistentType getPersistentType() {
		return (IPersistentType) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__NAME :
				return getName();
			case JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__TABLE_NAME :
				return getTableName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__NAME :
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__TABLE_NAME :
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITypeMapping.class) {
			switch (derivedFeatureID) {
				case JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__NAME :
					return JpaCorePackage.ITYPE_MAPPING__NAME;
				case JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__TABLE_NAME :
					return JpaCorePackage.ITYPE_MAPPING__TABLE_NAME;
				default :
					return -1;
			}
		}
		if (baseClass == IJavaTypeMapping.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITypeMapping.class) {
			switch (baseFeatureID) {
				case JpaCorePackage.ITYPE_MAPPING__NAME :
					return JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__NAME;
				case JpaCorePackage.ITYPE_MAPPING__TABLE_NAME :
					return JpaJavaMappingsPackage.JAVA_TYPE_MAPPING__TABLE_NAME;
				default :
					return -1;
			}
		}
		if (baseClass == IJavaTypeMapping.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public void updateFromJava(CompilationUnit astRoot) {
		// do nothing
	}

	public Type getType() {
		return this.type;
	}

	public ITextRange getTextRange() {
		ITextRange textRange = type.annotationTextRange(declarationAnnotationAdapter());
		return (textRange == null) ? getPersistentType().getTextRange() : textRange;
	}

	public Table primaryDbTable() {
		return null;
	}

	public Table dbTable(String tableName) {
		return null;
	}

	/**
	 * @see ITypeMapping#attributeMappingKeyAllowed(String)
	 * 
	 * Default implementation:  override where needed
	 */
	public boolean attributeMappingKeyAllowed(String attributeMappingKey) {
		return true;
	}
}
