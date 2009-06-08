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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.jpt.core.resource.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * <!-- end-user-doc -->
 * @see org.eclipse.jpt.core.resource.orm.OrmFactory
 * @model kind="package"
 * @generated
 */
public class OrmPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "orm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "jpt.orm.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.jpt.core.resource.orm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrmPackage eINSTANCE = org.eclipse.jpt.core.resource.orm.OrmPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlQueryContainer <em>Xml Query Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryContainer
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlQueryContainer()
	 * @generated
	 */
	public static final int XML_QUERY_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_CONTAINER__NAMED_QUERIES = 0;

	/**
	 * The feature id for the '<em><b>Named Native Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_CONTAINER__NAMED_NATIVE_QUERIES = 1;

	/**
	 * The number of structural features of the '<em>Xml Query Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings <em>Xml Entity Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEntityMappings()
	 * @generated
	 */
	public static final int XML_ENTITY_MAPPINGS = 0;

	/**
	 * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__NAMED_QUERIES = XML_QUERY_CONTAINER__NAMED_QUERIES;

	/**
	 * The feature id for the '<em><b>Named Native Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__NAMED_NATIVE_QUERIES = XML_QUERY_CONTAINER__NAMED_NATIVE_QUERIES;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__VERSION = XML_QUERY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__DESCRIPTION = XML_QUERY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__PERSISTENCE_UNIT_METADATA = XML_QUERY_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__PACKAGE = XML_QUERY_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__SCHEMA = XML_QUERY_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__CATALOG = XML_QUERY_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__ACCESS = XML_QUERY_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__SEQUENCE_GENERATORS = XML_QUERY_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Table Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__TABLE_GENERATORS = XML_QUERY_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__SQL_RESULT_SET_MAPPINGS = XML_QUERY_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mapped Superclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__MAPPED_SUPERCLASSES = XML_QUERY_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__ENTITIES = XML_QUERY_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Embeddables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS__EMBEDDABLES = XML_QUERY_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Xml Entity Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_MAPPINGS_FEATURE_COUNT = XML_QUERY_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata <em>Xml Persistence Unit Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlPersistenceUnitMetadata()
	 * @generated
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Xml Mapping Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = 1;

	/**
	 * The number of structural features of the '<em>Xml Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults <em>Xml Persistence Unit Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlPersistenceUnitDefaults()
	 * @generated
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = 3;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = 4;

	/**
	 * The number of structural features of the '<em>Xml Persistence Unit Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PERSISTENCE_UNIT_DEFAULTS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping <em>Xml Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTypeMapping()
	 * @generated
	 */
	public static final int XML_TYPE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_MAPPING__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_MAPPING__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_MAPPING__METADATA_COMPLETE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_MAPPING__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_MAPPING__ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Xml Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping <em>Abstract Xml Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAbstractXmlTypeMapping()
	 * @generated
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING__CLASS_NAME = XML_TYPE_MAPPING__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING__ACCESS = XML_TYPE_MAPPING__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING__METADATA_COMPLETE = XML_TYPE_MAPPING__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING__DESCRIPTION = XML_TYPE_MAPPING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING__ATTRIBUTES = XML_TYPE_MAPPING__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Abstract Xml Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT = XML_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlMappedSuperclass()
	 * @generated
	 */
	public static final int XML_MAPPED_SUPERCLASS = 5;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__CLASS_NAME = ABSTRACT_XML_TYPE_MAPPING__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ACCESS = ABSTRACT_XML_TYPE_MAPPING__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__METADATA_COMPLETE = ABSTRACT_XML_TYPE_MAPPING__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__DESCRIPTION = ABSTRACT_XML_TYPE_MAPPING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ATTRIBUTES = ABSTRACT_XML_TYPE_MAPPING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ID_CLASS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__ENTITY_LISTENERS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PRE_PERSIST = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_PERSIST = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PRE_REMOVE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_REMOVE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__PRE_UPDATE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_UPDATE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS__POST_LOAD = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Xml Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_SUPERCLASS_FEATURE_COUNT = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEntity <em>Xml Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEntity()
	 * @generated
	 */
	public static final int XML_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__CLASS_NAME = ABSTRACT_XML_TYPE_MAPPING__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ACCESS = ABSTRACT_XML_TYPE_MAPPING__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__METADATA_COMPLETE = ABSTRACT_XML_TYPE_MAPPING__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__DESCRIPTION = ABSTRACT_XML_TYPE_MAPPING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ATTRIBUTES = ABSTRACT_XML_TYPE_MAPPING__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAMED_QUERIES = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Named Native Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAMED_NATIVE_QUERIES = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__SEQUENCE_GENERATOR = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__TABLE_GENERATOR = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__NAME = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__TABLE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Secondary Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__SECONDARY_TABLES = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRIMARY_KEY_JOIN_COLUMNS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ID_CLASS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__INHERITANCE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__DISCRIMINATOR_VALUE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__DISCRIMINATOR_COLUMN = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__SQL_RESULT_SET_MAPPINGS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__EXCLUDE_DEFAULT_LISTENERS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ENTITY_LISTENERS = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRE_PERSIST = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_PERSIST = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRE_REMOVE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_REMOVE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__PRE_UPDATE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_UPDATE = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__POST_LOAD = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ATTRIBUTE_OVERRIDES = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Association Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY__ASSOCIATION_OVERRIDES = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Xml Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ENTITY_FEATURE_COUNT = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddable <em>Xml Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddable
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddable()
	 * @generated
	 */
	public static final int XML_EMBEDDABLE = 7;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__CLASS_NAME = ABSTRACT_XML_TYPE_MAPPING__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__ACCESS = ABSTRACT_XML_TYPE_MAPPING__ACCESS;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__METADATA_COMPLETE = ABSTRACT_XML_TYPE_MAPPING__METADATA_COMPLETE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__DESCRIPTION = ABSTRACT_XML_TYPE_MAPPING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE__ATTRIBUTES = ABSTRACT_XML_TYPE_MAPPING__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Xml Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDABLE_FEATURE_COUNT = ABSTRACT_XML_TYPE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer <em>Xml Generator Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlGeneratorContainer()
	 * @generated
	 */
	public static final int XML_GENERATOR_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR_CONTAINER__SEQUENCE_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR_CONTAINER__TABLE_GENERATOR = 1;

	/**
	 * The number of structural features of the '<em>Xml Generator Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.Attributes <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.Attributes
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAttributes()
	 * @generated
	 */
	public static final int ATTRIBUTES = 10;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__IDS = 0;

	/**
	 * The feature id for the '<em><b>Embedded Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__EMBEDDED_IDS = 1;

	/**
	 * The feature id for the '<em><b>Basics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__BASICS = 2;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__VERSIONS = 3;

	/**
	 * The feature id for the '<em><b>Many To Ones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__MANY_TO_ONES = 4;

	/**
	 * The feature id for the '<em><b>One To Manys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__ONE_TO_MANYS = 5;

	/**
	 * The feature id for the '<em><b>One To Ones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__ONE_TO_ONES = 6;

	/**
	 * The feature id for the '<em><b>Many To Manys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__MANY_TO_MANYS = 7;

	/**
	 * The feature id for the '<em><b>Embeddeds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__EMBEDDEDS = 8;

	/**
	 * The feature id for the '<em><b>Transients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES__TRANSIENTS = 9;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTES_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeMapping <em>Xml Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAttributeMapping()
	 * @generated
	 */
	public static final int XML_ATTRIBUTE_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ATTRIBUTE_MAPPING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Xml Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ATTRIBUTE_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.AbstractXmlAttributeMapping <em>Abstract Xml Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.AbstractXmlAttributeMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAbstractXmlAttributeMapping()
	 * @generated
	 */
	public static final int ABSTRACT_XML_ATTRIBUTE_MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Xml Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlNullAttributeMapping <em>Xml Null Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlNullAttributeMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNullAttributeMapping()
	 * @generated
	 */
	public static final int XML_NULL_ATTRIBUTE_MAPPING = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NULL_ATTRIBUTE_MAPPING__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The number of structural features of the '<em>Xml Null Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NULL_ATTRIBUTE_MAPPING_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.ColumnMapping <em>Column Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.ColumnMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getColumnMapping()
	 * @generated
	 */
	public static final int COLUMN_MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_MAPPING__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Column Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping <em>Xml Relationship Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlRelationshipMapping()
	 * @generated
	 */
	public static final int XML_RELATIONSHIP_MAPPING = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_RELATIONSHIP_MAPPING__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_RELATIONSHIP_MAPPING__TARGET_ENTITY = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_RELATIONSHIP_MAPPING__FETCH = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_RELATIONSHIP_MAPPING__CASCADE = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Relationship Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_RELATIONSHIP_MAPPING_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlMappedByMapping <em>Xml Mapped By Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedByMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlMappedByMapping()
	 * @generated
	 */
	public static final int XML_MAPPED_BY_MAPPING = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_BY_MAPPING__NAME = XML_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_BY_MAPPING__TARGET_ENTITY = XML_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_BY_MAPPING__FETCH = XML_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_BY_MAPPING__CASCADE = XML_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_BY_MAPPING__MAPPED_BY = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Mapped By Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MAPPED_BY_MAPPING_FEATURE_COUNT = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping <em>Xml Join Columns Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinColumnsMapping()
	 * @generated
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING__NAME = XML_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING__TARGET_ENTITY = XML_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING__FETCH = XML_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING__CASCADE = XML_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING__JOIN_COLUMNS = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Join Columns Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMNS_MAPPING_FEATURE_COUNT = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping <em>Xml Join Table Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinTableMapping()
	 * @generated
	 */
	public static final int XML_JOIN_TABLE_MAPPING = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_MAPPING__NAME = XML_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_MAPPING__TARGET_ENTITY = XML_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_MAPPING__FETCH = XML_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_MAPPING__CASCADE = XML_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_MAPPING__JOIN_TABLE = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Join Table Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_MAPPING_FEATURE_COUNT = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping <em>Xml Multi Relationship Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlMultiRelationshipMapping()
	 * @generated
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping <em>Xml Single Relationship Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlSingleRelationshipMapping()
	 * @generated
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlId <em>Xml Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlId
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlId()
	 * @generated
	 */
	public static final int XML_ID = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlIdImpl <em>Xml Id Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlIdImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlIdImpl()
	 * @generated
	 */
	public static final int XML_ID_IMPL = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded <em>Base Xml Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getBaseXmlEmbedded()
	 * @generated
	 */
	public static final int BASE_XML_EMBEDDED = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedId <em>Xml Embedded Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedId
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddedId()
	 * @generated
	 */
	public static final int XML_EMBEDDED_ID = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedIdImpl <em>Xml Embedded Id Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedIdImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddedIdImpl()
	 * @generated
	 */
	public static final int XML_EMBEDDED_ID_IMPL = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlBasic <em>Xml Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlBasic
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlBasic()
	 * @generated
	 */
	public static final int XML_BASIC = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlBasicImpl <em>Xml Basic Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlBasicImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlBasicImpl()
	 * @generated
	 */
	public static final int XML_BASIC_IMPL = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlVersion <em>Xml Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlVersion
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlVersion()
	 * @generated
	 */
	public static final int XML_VERSION = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlVersionImpl <em>Xml Version Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlVersionImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlVersionImpl()
	 * @generated
	 */
	public static final int XML_VERSION_IMPL = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToOne
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToOne()
	 * @generated
	 */
	public static final int XML_MANY_TO_ONE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToOneImpl <em>Xml Many To One Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToOneImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToOneImpl()
	 * @generated
	 */
	public static final int XML_MANY_TO_ONE_IMPL = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToMany
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToMany()
	 * @generated
	 */
	public static final int XML_ONE_TO_MANY = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToManyImpl <em>Xml One To Many Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToManyImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToManyImpl()
	 * @generated
	 */
	public static final int XML_ONE_TO_MANY_IMPL = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOne
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToOne()
	 * @generated
	 */
	public static final int XML_ONE_TO_ONE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOneImpl <em>Xml One To One Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOneImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToOneImpl()
	 * @generated
	 */
	public static final int XML_ONE_TO_ONE_IMPL = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToMany
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToMany()
	 * @generated
	 */
	public static final int XML_MANY_TO_MANY = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToManyImpl <em>Xml Many To Many Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToManyImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToManyImpl()
	 * @generated
	 */
	public static final int XML_MANY_TO_MANY_IMPL = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbedded <em>Xml Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbedded
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbedded()
	 * @generated
	 */
	public static final int XML_EMBEDDED = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedImpl <em>Xml Embedded Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddedImpl()
	 * @generated
	 */
	public static final int XML_EMBEDDED_IMPL = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping <em>Xml Convertible Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlConvertibleMapping()
	 * @generated
	 */
	public static final int XML_CONVERTIBLE_MAPPING = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlTransient <em>Xml Transient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlTransient
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTransient()
	 * @generated
	 */
	public static final int XML_TRANSIENT = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlTransientImpl <em>Xml Transient Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlTransientImpl
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTransientImpl()
	 * @generated
	 */
	public static final int XML_TRANSIENT_IMPL = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlAssociationOverride <em>Xml Association Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlAssociationOverride
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAssociationOverride()
	 * @generated
	 */
	public static final int XML_ASSOCIATION_OVERRIDE = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeOverride <em>Xml Attribute Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeOverride
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAttributeOverride()
	 * @generated
	 */
	public static final int XML_ATTRIBUTE_OVERRIDE = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.CascadeType <em>Cascade Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getCascadeType()
	 * @generated
	 */
	public static final int CASCADE_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlNamedColumn <em>Xml Named Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedColumn
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNamedColumn()
	 * @generated
	 */
	public static final int XML_NAMED_COLUMN = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn <em>Xml Abstract Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAbstractColumn()
	 * @generated
	 */
	public static final int XML_ABSTRACT_COLUMN = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlColumn <em>Xml Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlColumn
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlColumn()
	 * @generated
	 */
	public static final int XML_COLUMN = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.ColumnResult <em>Column Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.ColumnResult
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getColumnResult()
	 * @generated
	 */
	public static final int COLUMN_RESULT = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn <em>Xml Discriminator Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlDiscriminatorColumn()
	 * @generated
	 */
	public static final int XML_DISCRIMINATOR_COLUMN = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.EntityListeners <em>Entity Listeners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.EntityListeners
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEntityListeners()
	 * @generated
	 */
	public static final int ENTITY_LISTENERS = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.EntityListener <em>Entity Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEntityListener()
	 * @generated
	 */
	public static final int ENTITY_LISTENER = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.EntityResult <em>Entity Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.EntityResult
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEntityResult()
	 * @generated
	 */
	public static final int ENTITY_RESULT = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.FieldResult <em>Field Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.FieldResult
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getFieldResult()
	 * @generated
	 */
	public static final int FIELD_RESULT = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.Inheritance <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.Inheritance
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getInheritance()
	 * @generated
	 */
	public static final int INHERITANCE = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.Lob <em>Lob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.Lob
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getLob()
	 * @generated
	 */
	public static final int LOB = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.MapKey <em>Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.MapKey
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getMapKey()
	 * @generated
	 */
	public static final int MAP_KEY = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.EventMethod <em>Event Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.EventMethod
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEventMethod()
	 * @generated
	 */
	public static final int EVENT_METHOD = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratedValue <em>Xml Generated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratedValue
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlGeneratedValue()
	 * @generated
	 */
	public static final int XML_GENERATED_VALUE = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlIdClass <em>Xml Id Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlIdClass
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlIdClass()
	 * @generated
	 */
	public static final int XML_ID_CLASS = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumn <em>Xml Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumn
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinColumn()
	 * @generated
	 */
	public static final int XML_JOIN_COLUMN = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable <em>Xml Base Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlBaseTable()
	 * @generated
	 */
	public static final int XML_BASE_TABLE = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTable <em>Xml Join Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTable
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinTable()
	 * @generated
	 */
	public static final int XML_JOIN_TABLE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__NAME = XML_MAPPED_BY_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__TARGET_ENTITY = XML_MAPPED_BY_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__FETCH = XML_MAPPED_BY_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__CASCADE = XML_MAPPED_BY_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__MAPPED_BY = XML_MAPPED_BY_MAPPING__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__JOIN_TABLE = XML_MAPPED_BY_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__ORDER_BY = XML_MAPPED_BY_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING__MAP_KEY = XML_MAPPED_BY_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Multi Relationship Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MULTI_RELATIONSHIP_MAPPING_FEATURE_COUNT = XML_MAPPED_BY_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__NAME = XML_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__TARGET_ENTITY = XML_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__FETCH = XML_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__CASCADE = XML_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__JOIN_TABLE = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__JOIN_COLUMNS = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING__OPTIONAL = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Single Relationship Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SINGLE_RELATIONSHIP_MAPPING_FEATURE_COUNT = XML_RELATIONSHIP_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__COLUMN = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__LOB = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TEMPORAL = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__ENUMERATED = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__SEQUENCE_GENERATOR = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__TABLE_GENERATOR = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID__GENERATED_VALUE = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Xml Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__COLUMN = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__LOB = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__TEMPORAL = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__ENUMERATED = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__SEQUENCE_GENERATOR = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__TABLE_GENERATOR = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL__GENERATED_VALUE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Xml Id Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_XML_EMBEDDED__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_XML_EMBEDDED__ATTRIBUTE_OVERRIDES = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Xml Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_XML_EMBEDDED_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID__ATTRIBUTE_OVERRIDES = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL__ATTRIBUTE_OVERRIDES = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Embedded Id Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_ID_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED__NAME = BASE_XML_EMBEDDED__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED__ATTRIBUTE_OVERRIDES = BASE_XML_EMBEDDED__ATTRIBUTE_OVERRIDES;

	/**
	 * The number of structural features of the '<em>Xml Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_FEATURE_COUNT = BASE_XML_EMBEDDED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Overrides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL__ATTRIBUTE_OVERRIDES = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Embedded Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_EMBEDDED_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__LOB = 0;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__TEMPORAL = 1;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING__ENUMERATED = 2;

	/**
	 * The number of structural features of the '<em>Xml Convertible Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_CONVERTIBLE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__COLUMN = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__LOB = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__TEMPORAL = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__ENUMERATED = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__FETCH = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC__OPTIONAL = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Xml Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__COLUMN = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__LOB = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__TEMPORAL = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__ENUMERATED = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__FETCH = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL__OPTIONAL = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Xml Basic Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASIC_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__COLUMN = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__LOB = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__TEMPORAL = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION__ENUMERATED = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__COLUMN = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__LOB = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__TEMPORAL = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL__ENUMERATED = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml Version Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_VERSION_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__NAME = XML_SINGLE_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__TARGET_ENTITY = XML_SINGLE_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__FETCH = XML_SINGLE_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__CASCADE = XML_SINGLE_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_TABLE = XML_SINGLE_RELATIONSHIP_MAPPING__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__JOIN_COLUMNS = XML_SINGLE_RELATIONSHIP_MAPPING__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE__OPTIONAL = XML_SINGLE_RELATIONSHIP_MAPPING__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Xml Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_FEATURE_COUNT = XML_SINGLE_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__TARGET_ENTITY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__FETCH = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__CASCADE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__JOIN_TABLE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__JOIN_COLUMNS = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL__OPTIONAL = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Xml Many To One Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_ONE_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__NAME = XML_MULTI_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__TARGET_ENTITY = XML_MULTI_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__FETCH = XML_MULTI_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__CASCADE = XML_MULTI_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__MAPPED_BY = XML_MULTI_RELATIONSHIP_MAPPING__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_TABLE = XML_MULTI_RELATIONSHIP_MAPPING__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__ORDER_BY = XML_MULTI_RELATIONSHIP_MAPPING__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__MAP_KEY = XML_MULTI_RELATIONSHIP_MAPPING__MAP_KEY;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY__JOIN_COLUMNS = XML_MULTI_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_FEATURE_COUNT = XML_MULTI_RELATIONSHIP_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__TARGET_ENTITY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__FETCH = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__CASCADE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__MAPPED_BY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__JOIN_TABLE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__ORDER_BY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__MAP_KEY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL__JOIN_COLUMNS = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml One To Many Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_MANY_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__NAME = XML_SINGLE_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__TARGET_ENTITY = XML_SINGLE_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__FETCH = XML_SINGLE_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__CASCADE = XML_SINGLE_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_TABLE = XML_SINGLE_RELATIONSHIP_MAPPING__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__JOIN_COLUMNS = XML_SINGLE_RELATIONSHIP_MAPPING__JOIN_COLUMNS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__OPTIONAL = XML_SINGLE_RELATIONSHIP_MAPPING__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__MAPPED_BY = XML_SINGLE_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMNS = XML_SINGLE_RELATIONSHIP_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_FEATURE_COUNT = XML_SINGLE_RELATIONSHIP_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__TARGET_ENTITY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__FETCH = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__CASCADE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__JOIN_TABLE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__JOIN_COLUMNS = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__OPTIONAL = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__MAPPED_BY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL__PRIMARY_KEY_JOIN_COLUMNS = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Xml One To One Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ONE_TO_ONE_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__NAME = XML_MULTI_RELATIONSHIP_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__TARGET_ENTITY = XML_MULTI_RELATIONSHIP_MAPPING__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__FETCH = XML_MULTI_RELATIONSHIP_MAPPING__FETCH;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__CASCADE = XML_MULTI_RELATIONSHIP_MAPPING__CASCADE;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__MAPPED_BY = XML_MULTI_RELATIONSHIP_MAPPING__MAPPED_BY;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__JOIN_TABLE = XML_MULTI_RELATIONSHIP_MAPPING__JOIN_TABLE;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__ORDER_BY = XML_MULTI_RELATIONSHIP_MAPPING__ORDER_BY;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY__MAP_KEY = XML_MULTI_RELATIONSHIP_MAPPING__MAP_KEY;

	/**
	 * The number of structural features of the '<em>Xml Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_FEATURE_COUNT = XML_MULTI_RELATIONSHIP_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__TARGET_ENTITY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__FETCH = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__CASCADE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__MAPPED_BY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__JOIN_TABLE = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__ORDER_BY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL__MAP_KEY = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Xml Many To Many Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_MANY_TO_MANY_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSIENT__NAME = XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The number of structural features of the '<em>Xml Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSIENT_FEATURE_COUNT = XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSIENT_IMPL__NAME = ABSTRACT_XML_ATTRIBUTE_MAPPING__NAME;

	/**
	 * The number of structural features of the '<em>Xml Transient Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TRANSIENT_IMPL_FEATURE_COUNT = ABSTRACT_XML_ATTRIBUTE_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ASSOCIATION_OVERRIDE__JOIN_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ASSOCIATION_OVERRIDE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Xml Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ASSOCIATION_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ATTRIBUTE_OVERRIDE__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ATTRIBUTE_OVERRIDE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Xml Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ATTRIBUTE_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Cascade All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_TYPE__CASCADE_ALL = 0;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_TYPE__CASCADE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Cascade Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_TYPE__CASCADE_MERGE = 2;

	/**
	 * The feature id for the '<em><b>Cascade Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_TYPE__CASCADE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Cascade Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_TYPE__CASCADE_REFRESH = 4;

	/**
	 * The number of structural features of the '<em>Cascade Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_COLUMN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Xml Named Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_COLUMN_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__COLUMN_DEFINITION = XML_NAMED_COLUMN__COLUMN_DEFINITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__NAME = XML_NAMED_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__INSERTABLE = XML_NAMED_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__NULLABLE = XML_NAMED_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__TABLE = XML_NAMED_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__UNIQUE = XML_NAMED_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN__UPDATABLE = XML_NAMED_COLUMN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Xml Abstract Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ABSTRACT_COLUMN_FEATURE_COUNT = XML_NAMED_COLUMN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__COLUMN_DEFINITION = XML_ABSTRACT_COLUMN__COLUMN_DEFINITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__NAME = XML_ABSTRACT_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__INSERTABLE = XML_ABSTRACT_COLUMN__INSERTABLE;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__NULLABLE = XML_ABSTRACT_COLUMN__NULLABLE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__TABLE = XML_ABSTRACT_COLUMN__TABLE;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__UNIQUE = XML_ABSTRACT_COLUMN__UNIQUE;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__UPDATABLE = XML_ABSTRACT_COLUMN__UPDATABLE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__LENGTH = XML_ABSTRACT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__PRECISION = XML_ABSTRACT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN__SCALE = XML_ABSTRACT_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xml Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_COLUMN_FEATURE_COUNT = XML_ABSTRACT_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_RESULT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_RESULT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = XML_NAMED_COLUMN__COLUMN_DEFINITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_DISCRIMINATOR_COLUMN__NAME = XML_NAMED_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = XML_NAMED_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_DISCRIMINATOR_COLUMN__LENGTH = XML_NAMED_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_DISCRIMINATOR_COLUMN_FEATURE_COUNT = XML_NAMED_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENERS__ENTITY_LISTENERS = 0;

	/**
	 * The number of structural features of the '<em>Entity Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENERS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__PRE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__POST_PERSIST = 2;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__PRE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__POST_REMOVE = 4;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__PRE_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__POST_UPDATE = 6;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER__POST_LOAD = 7;

	/**
	 * The number of structural features of the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_LISTENER_FEATURE_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_RESULT__DISCRIMINATOR_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_RESULT__ENTITY_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Field Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_RESULT__FIELD_RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_RESULT_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_METHOD__METHOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_METHOD_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_RESULT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_RESULT__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_RESULT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATED_VALUE__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATED_VALUE__STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Xml Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_CLASS__CLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Xml Id Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_ID_CLASS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INHERITANCE__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INHERITANCE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__COLUMN_DEFINITION = XML_ABSTRACT_COLUMN__COLUMN_DEFINITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__NAME = XML_ABSTRACT_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__INSERTABLE = XML_ABSTRACT_COLUMN__INSERTABLE;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__NULLABLE = XML_ABSTRACT_COLUMN__NULLABLE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__TABLE = XML_ABSTRACT_COLUMN__TABLE;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__UNIQUE = XML_ABSTRACT_COLUMN__UNIQUE;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__UPDATABLE = XML_ABSTRACT_COLUMN__UPDATABLE;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN__REFERENCED_COLUMN_NAME = XML_ABSTRACT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_COLUMN_FEATURE_COUNT = XML_ABSTRACT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASE_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASE_TABLE__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASE_TABLE__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASE_TABLE__UNIQUE_CONSTRAINTS = 3;

	/**
	 * The number of structural features of the '<em>Xml Base Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_BASE_TABLE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE__NAME = XML_BASE_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE__CATALOG = XML_BASE_TABLE__CATALOG;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE__SCHEMA = XML_BASE_TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE__UNIQUE_CONSTRAINTS = XML_BASE_TABLE__UNIQUE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE__JOIN_COLUMNS = XML_BASE_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE__INVERSE_JOIN_COLUMNS = XML_BASE_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Join Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_JOIN_TABLE_FEATURE_COUNT = XML_BASE_TABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOB_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP_KEY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP_KEY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlQuery <em>Xml Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlQuery
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlQuery()
	 * @generated
	 */
	public static final int XML_QUERY = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY__HINTS = 2;

	/**
	 * The number of structural features of the '<em>Xml Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery <em>Xml Named Native Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNamedNativeQuery()
	 * @generated
	 */
	public static final int XML_NAMED_NATIVE_QUERY = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_NATIVE_QUERY__NAME = XML_QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_NATIVE_QUERY__QUERY = XML_QUERY__QUERY;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_NATIVE_QUERY__HINTS = XML_QUERY__HINTS;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_NATIVE_QUERY__RESULT_CLASS = XML_QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = XML_QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xml Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_NATIVE_QUERY_FEATURE_COUNT = XML_QUERY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlNamedQuery <em>Xml Named Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedQuery
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNamedQuery()
	 * @generated
	 */
	public static final int XML_NAMED_QUERY = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_QUERY__NAME = XML_QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_QUERY__QUERY = XML_QUERY__QUERY;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_QUERY__HINTS = XML_QUERY__HINTS;

	/**
	 * The number of structural features of the '<em>Xml Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_NAMED_QUERY_FEATURE_COUNT = XML_QUERY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PostLoad <em>Post Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PostLoad
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostLoad()
	 * @generated
	 */
	public static final int POST_LOAD = 66;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_LOAD__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_LOAD_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PostPersist <em>Post Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PostPersist
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostPersist()
	 * @generated
	 */
	public static final int POST_PERSIST = 67;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_PERSIST__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_PERSIST_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PostRemove <em>Post Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PostRemove
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostRemove()
	 * @generated
	 */
	public static final int POST_REMOVE = 68;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_REMOVE__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_REMOVE_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PostUpdate <em>Post Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PostUpdate
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostUpdate()
	 * @generated
	 */
	public static final int POST_UPDATE = 69;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_UPDATE__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POST_UPDATE_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PrePersist <em>Pre Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PrePersist
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPrePersist()
	 * @generated
	 */
	public static final int PRE_PERSIST = 70;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_PERSIST__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_PERSIST_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PreRemove <em>Pre Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PreRemove
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPreRemove()
	 * @generated
	 */
	public static final int PRE_REMOVE = 71;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_REMOVE__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_REMOVE_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.PreUpdate <em>Pre Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.PreUpdate
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPreUpdate()
	 * @generated
	 */
	public static final int PRE_UPDATE = 72;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_UPDATE__METHOD_NAME = EVENT_METHOD__METHOD_NAME;

	/**
	 * The number of structural features of the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_UPDATE_FEATURE_COUNT = EVENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn <em>Xml Primary Key Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlPrimaryKeyJoinColumn()
	 * @generated
	 */
	public static final int XML_PRIMARY_KEY_JOIN_COLUMN = 73;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = XML_NAMED_COLUMN__COLUMN_DEFINITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PRIMARY_KEY_JOIN_COLUMN__NAME = XML_NAMED_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = XML_NAMED_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_PRIMARY_KEY_JOIN_COLUMN_FEATURE_COUNT = XML_NAMED_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlQueryHint <em>Xml Query Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryHint
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlQueryHint()
	 * @generated
	 */
	public static final int XML_QUERY_HINT = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_HINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_HINT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Xml Query Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_QUERY_HINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlTable <em>Xml Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlTable
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTable()
	 * @generated
	 */
	public static final int XML_TABLE = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE__NAME = XML_BASE_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE__CATALOG = XML_BASE_TABLE__CATALOG;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE__SCHEMA = XML_BASE_TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE__UNIQUE_CONSTRAINTS = XML_BASE_TABLE__UNIQUE_CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>Xml Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_FEATURE_COUNT = XML_BASE_TABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlSecondaryTable <em>Xml Secondary Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlSecondaryTable
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlSecondaryTable()
	 * @generated
	 */
	public static final int XML_SECONDARY_TABLE = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SECONDARY_TABLE__NAME = XML_BASE_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SECONDARY_TABLE__CATALOG = XML_BASE_TABLE__CATALOG;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SECONDARY_TABLE__SCHEMA = XML_BASE_TABLE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SECONDARY_TABLE__UNIQUE_CONSTRAINTS = XML_BASE_TABLE__UNIQUE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Key Join Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS = XML_BASE_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Secondary Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SECONDARY_TABLE_FEATURE_COUNT = XML_BASE_TABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlGenerator <em>Xml Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlGenerator
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlGenerator()
	 * @generated
	 */
	public static final int XML_GENERATOR = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR__INITIAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR__ALLOCATION_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Xml Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_GENERATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator <em>Xml Sequence Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlSequenceGenerator()
	 * @generated
	 */
	public static final int XML_SEQUENCE_GENERATOR = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SEQUENCE_GENERATOR__NAME = XML_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SEQUENCE_GENERATOR__INITIAL_VALUE = XML_GENERATOR__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SEQUENCE_GENERATOR__ALLOCATION_SIZE = XML_GENERATOR__ALLOCATION_SIZE;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SEQUENCE_GENERATOR__SEQUENCE_NAME = XML_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_SEQUENCE_GENERATOR_FEATURE_COUNT = XML_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.SqlResultSetMapping <em>Sql Result Set Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.SqlResultSetMapping
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getSqlResultSetMapping()
	 * @generated
	 */
	public static final int SQL_RESULT_SET_MAPPING = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_RESULT_SET_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_RESULT_SET_MAPPING__ENTITY_RESULTS = 1;

	/**
	 * The feature id for the '<em><b>Column Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_RESULT_SET_MAPPING__COLUMN_RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQL_RESULT_SET_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator <em>Xml Table Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTableGenerator()
	 * @generated
	 */
	public static final int XML_TABLE_GENERATOR = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__NAME = XML_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__INITIAL_VALUE = XML_GENERATOR__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__ALLOCATION_SIZE = XML_GENERATOR__ALLOCATION_SIZE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__TABLE = XML_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__CATALOG = XML_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__SCHEMA = XML_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pk Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__PK_COLUMN_NAME = XML_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__VALUE_COLUMN_NAME = XML_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pk Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__PK_COLUMN_VALUE = XML_GENERATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR__UNIQUE_CONSTRAINTS = XML_GENERATOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Xml Table Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_TABLE_GENERATOR_FEATURE_COUNT = XML_GENERATOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint <em>Xml Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlUniqueConstraint()
	 * @generated
	 */
	public static final int XML_UNIQUE_CONSTRAINT = 82;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_UNIQUE_CONSTRAINT__COLUMN_NAMES = 0;

	/**
	 * The number of structural features of the '<em>Xml Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int XML_UNIQUE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.AccessType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAccessType()
	 * @generated
	 */
	public static final int ACCESS_TYPE = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.DiscriminatorType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getDiscriminatorType()
	 * @generated
	 */
	public static final int DISCRIMINATOR_TYPE = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.EnumType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEnumType()
	 * @generated
	 */
	public static final int ENUM_TYPE = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.FetchType <em>Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.FetchType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getFetchType()
	 * @generated
	 */
	public static final int FETCH_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.GenerationType <em>Generation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.GenerationType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getGenerationType()
	 * @generated
	 */
	public static final int GENERATION_TYPE = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.InheritanceType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getInheritanceType()
	 * @generated
	 */
	public static final int INHERITANCE_TYPE = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.jpt.core.resource.orm.TemporalType <em>Temporal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jpt.core.resource.orm.TemporalType
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getTemporalType()
	 * @generated
	 */
	public static final int TEMPORAL_TYPE = 89;

	/**
	 * The meta object id for the '<em>Discriminator Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getDiscriminatorValue()
	 * @generated
	 */
	public static final int DISCRIMINATOR_VALUE = 90;

	/**
	 * The meta object id for the '<em>Enumerated</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEnumerated()
	 * @generated
	 */
	public static final int ENUMERATED = 91;

	/**
	 * The meta object id for the '<em>Order By</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getOrderBy()
	 * @generated
	 */
	public static final int ORDER_BY = 92;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getVersionType()
	 * @generated
	 */
	public static final int VERSION_TYPE = 93;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEntityMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPersistenceUnitMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPersistenceUnitDefaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractXmlTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlMappedSuperclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlQueryContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlGeneratorContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractXmlAttributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNullAttributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlRelationshipMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlMappedByMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlJoinColumnsMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlJoinTableMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlMultiRelationshipMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlSingleRelationshipMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlIdImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseXmlEmbeddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedIdImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBasicImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlVersionImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlManyToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlManyToOneImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOneToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOneToManyImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlOneToOneImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlManyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlManyToManyImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEmbeddedImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlConvertibleMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTransientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTransientImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAssociationOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttributeOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cascadeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNamedColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAbstractColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlDiscriminatorColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityListenersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlGeneratedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlIdClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlJoinColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlJoinTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNamedNativeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNamedQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postPersistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prePersistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPrimaryKeyJoinColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlQueryHintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlBaseTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlSecondaryTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlSequenceGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlResultSetMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTableGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlUniqueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum discriminatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType discriminatorValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumeratedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderByEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrmPackage()
	{
		super(eNS_URI, OrmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OrmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrmPackage init()
	{
		if (isInited) return (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

		// Obtain or create and register package
		OrmPackage theOrmPackage = (OrmPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrmPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrmPackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PersistencePackage thePersistencePackage = (PersistencePackage)(EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackage ? EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI) : PersistencePackage.eINSTANCE);

		// Create package meta-data objects
		theOrmPackage.createPackageContents();
		thePersistencePackage.createPackageContents();

		// Initialize created meta-data
		theOrmPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrmPackage.eNS_URI, theOrmPackage);
		return theOrmPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings <em>Xml Entity Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Entity Mappings</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings
	 * @generated
	 */
	public EClass getXmlEntityMappings()
	{
		return xmlEntityMappingsEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getVersion()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EAttribute getXmlEntityMappings_Version()
	{
		return (EAttribute)xmlEntityMappingsEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getDescription()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EAttribute getXmlEntityMappings_Description()
	{
		return (EAttribute)xmlEntityMappingsEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Metadata</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getPersistenceUnitMetadata()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_PersistenceUnitMetadata()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getPackage()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EAttribute getXmlEntityMappings_Package()
	{
		return (EAttribute)xmlEntityMappingsEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getSchema()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EAttribute getXmlEntityMappings_Schema()
	{
		return (EAttribute)xmlEntityMappingsEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getCatalog()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EAttribute getXmlEntityMappings_Catalog()
	{
		return (EAttribute)xmlEntityMappingsEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getAccess()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EAttribute getXmlEntityMappings_Access()
	{
		return (EAttribute)xmlEntityMappingsEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getSequenceGenerators <em>Sequence Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Generators</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getSequenceGenerators()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_SequenceGenerators()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getTableGenerators <em>Table Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Generators</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getTableGenerators()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_TableGenerators()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getSqlResultSetMappings <em>Sql Result Set Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mappings</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getSqlResultSetMappings()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_SqlResultSetMappings()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getMappedSuperclasses <em>Mapped Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Superclasses</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getMappedSuperclasses()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_MappedSuperclasses()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getEntities()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_Entities()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getEmbeddables <em>Embeddables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embeddables</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings#getEmbeddables()
	 * @see #getXmlEntityMappings()
	 * @generated
	 */
	public EReference getXmlEntityMappings_Embeddables()
	{
		return (EReference)xmlEntityMappingsEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata <em>Xml Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Persistence Unit Metadata</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata
	 * @generated
	 */
	public EClass getXmlPersistenceUnitMetadata()
	{
		return xmlPersistenceUnitMetadataEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata#isXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Mapping Metadata Complete</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata#isXmlMappingMetadataComplete()
	 * @see #getXmlPersistenceUnitMetadata()
	 * @generated
	 */
	public EAttribute getXmlPersistenceUnitMetadata_XmlMappingMetadataComplete()
	{
		return (EAttribute)xmlPersistenceUnitMetadataEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Defaults</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata#getPersistenceUnitDefaults()
	 * @see #getXmlPersistenceUnitMetadata()
	 * @generated
	 */
	public EReference getXmlPersistenceUnitMetadata_PersistenceUnitDefaults()
	{
		return (EReference)xmlPersistenceUnitMetadataEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults <em>Xml Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Persistence Unit Defaults</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults
	 * @generated
	 */
	public EClass getXmlPersistenceUnitDefaults()
	{
		return xmlPersistenceUnitDefaultsEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getSchema()
	 * @see #getXmlPersistenceUnitDefaults()
	 * @generated
	 */
	public EAttribute getXmlPersistenceUnitDefaults_Schema()
	{
		return (EAttribute)xmlPersistenceUnitDefaultsEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getCatalog()
	 * @see #getXmlPersistenceUnitDefaults()
	 * @generated
	 */
	public EAttribute getXmlPersistenceUnitDefaults_Catalog()
	{
		return (EAttribute)xmlPersistenceUnitDefaultsEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getAccess()
	 * @see #getXmlPersistenceUnitDefaults()
	 * @generated
	 */
	public EAttribute getXmlPersistenceUnitDefaults_Access()
	{
		return (EAttribute)xmlPersistenceUnitDefaultsEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#isCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#isCascadePersist()
	 * @see #getXmlPersistenceUnitDefaults()
	 * @generated
	 */
	public EAttribute getXmlPersistenceUnitDefaults_CascadePersist()
	{
		return (EAttribute)xmlPersistenceUnitDefaultsEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults#getEntityListeners()
	 * @see #getXmlPersistenceUnitDefaults()
	 * @generated
	 */
	public EReference getXmlPersistenceUnitDefaults_EntityListeners()
	{
		return (EReference)xmlPersistenceUnitDefaultsEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping <em>Xml Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Type Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping
	 * @generated
	 */
	public EClass getXmlTypeMapping()
	{
		return xmlTypeMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getClassName()
	 * @see #getXmlTypeMapping()
	 * @generated
	 */
	public EAttribute getXmlTypeMapping_ClassName()
	{
		return (EAttribute)xmlTypeMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getAccess()
	 * @see #getXmlTypeMapping()
	 * @generated
	 */
	public EAttribute getXmlTypeMapping_Access()
	{
		return (EAttribute)xmlTypeMappingEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getMetadataComplete()
	 * @see #getXmlTypeMapping()
	 * @generated
	 */
	public EAttribute getXmlTypeMapping_MetadataComplete()
	{
		return (EAttribute)xmlTypeMappingEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getDescription()
	 * @see #getXmlTypeMapping()
	 * @generated
	 */
	public EAttribute getXmlTypeMapping_Description()
	{
		return (EAttribute)xmlTypeMappingEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping#getAttributes()
	 * @see #getXmlTypeMapping()
	 * @generated
	 */
	public EReference getXmlTypeMapping_Attributes()
	{
		return (EReference)xmlTypeMappingEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping <em>Abstract Xml Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Xml Type Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping
	 * @generated
	 */
	public EClass getAbstractXmlTypeMapping()
	{
		return abstractXmlTypeMappingEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Mapped Superclass</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass
	 * @generated
	 */
	public EClass getXmlMappedSuperclass()
	{
		return xmlMappedSuperclassEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getIdClass()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_IdClass()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#isExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#isExcludeDefaultListeners()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EAttribute getXmlMappedSuperclass_ExcludeDefaultListeners()
	{
		return (EAttribute)xmlMappedSuperclassEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#isExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Superclass Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#isExcludeSuperclassListeners()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EAttribute getXmlMappedSuperclass_ExcludeSuperclassListeners()
	{
		return (EAttribute)xmlMappedSuperclassEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getEntityListeners()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_EntityListeners()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPrePersist()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PrePersist()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostPersist()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PostPersist()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPreRemove()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PreRemove()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostRemove()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PostRemove()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPreUpdate()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PreUpdate()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostUpdate()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PostUpdate()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass#getPostLoad()
	 * @see #getXmlMappedSuperclass()
	 * @generated
	 */
	public EReference getXmlMappedSuperclass_PostLoad()
	{
		return (EReference)xmlMappedSuperclassEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEntity <em>Xml Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Entity</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity
	 * @generated
	 */
	public EClass getXmlEntity()
	{
		return xmlEntityEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getName()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EAttribute getXmlEntity_Name()
	{
		return (EAttribute)xmlEntityEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getTable()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_Table()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getSecondaryTables <em>Secondary Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Tables</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getSecondaryTables()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_SecondaryTables()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPrimaryKeyJoinColumns()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PrimaryKeyJoinColumns()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getIdClass()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_IdClass()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getInheritance()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_Inheritance()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getDiscriminatorValue()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EAttribute getXmlEntity_DiscriminatorValue()
	{
		return (EAttribute)xmlEntityEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getDiscriminatorColumn()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_DiscriminatorColumn()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getSqlResultSetMappings <em>Sql Result Set Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mappings</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getSqlResultSetMappings()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_SqlResultSetMappings()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#isExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#isExcludeDefaultListeners()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EAttribute getXmlEntity_ExcludeDefaultListeners()
	{
		return (EAttribute)xmlEntityEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#isExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Superclass Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#isExcludeSuperclassListeners()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EAttribute getXmlEntity_ExcludeSuperclassListeners()
	{
		return (EAttribute)xmlEntityEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getEntityListeners()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_EntityListeners()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPrePersist()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PrePersist()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPostPersist()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PostPersist()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(13);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPreRemove()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PreRemove()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(14);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPostRemove()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PostRemove()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(15);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPreUpdate()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PreUpdate()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(16);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPostUpdate()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PostUpdate()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(17);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getPostLoad()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_PostLoad()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(18);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getAttributeOverrides <em>Attribute Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Overrides</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getAttributeOverrides()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_AttributeOverrides()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(19);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlEntity#getAssociationOverrides <em>Association Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Overrides</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEntity#getAssociationOverrides()
	 * @see #getXmlEntity()
	 * @generated
	 */
	public EReference getXmlEntity_AssociationOverrides()
	{
		return (EReference)xmlEntityEClass.getEStructuralFeatures().get(20);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddable <em>Xml Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embeddable</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddable
	 * @generated
	 */
	public EClass getXmlEmbeddable()
	{
		return xmlEmbeddableEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlQueryContainer <em>Xml Query Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Query Container</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryContainer
	 * @generated
	 */
	public EClass getXmlQueryContainer()
	{
		return xmlQueryContainerEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlQueryContainer#getNamedQueries <em>Named Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Queries</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryContainer#getNamedQueries()
	 * @see #getXmlQueryContainer()
	 * @generated
	 */
	public EReference getXmlQueryContainer_NamedQueries()
	{
		return (EReference)xmlQueryContainerEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlQueryContainer#getNamedNativeQueries <em>Named Native Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Queries</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryContainer#getNamedNativeQueries()
	 * @see #getXmlQueryContainer()
	 * @generated
	 */
	public EReference getXmlQueryContainer_NamedNativeQueries()
	{
		return (EReference)xmlQueryContainerEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer <em>Xml Generator Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Generator Container</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer
	 * @generated
	 */
	public EClass getXmlGeneratorContainer()
	{
		return xmlGeneratorContainerEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer#getSequenceGenerator()
	 * @see #getXmlGeneratorContainer()
	 * @generated
	 */
	public EReference getXmlGeneratorContainer_SequenceGenerator()
	{
		return (EReference)xmlGeneratorContainerEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer#getTableGenerator()
	 * @see #getXmlGeneratorContainer()
	 * @generated
	 */
	public EReference getXmlGeneratorContainer_TableGenerator()
	{
		return (EReference)xmlGeneratorContainerEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes
	 * @generated
	 */
	public EClass getAttributes()
	{
		return attributesEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ids</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getIds()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_Ids()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getEmbeddedIds <em>Embedded Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Ids</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getEmbeddedIds()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_EmbeddedIds()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getBasics <em>Basics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basics</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getBasics()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_Basics()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getVersions()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_Versions()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getManyToOnes <em>Many To Ones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Ones</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getManyToOnes()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_ManyToOnes()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getOneToManys <em>One To Manys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Manys</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getOneToManys()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_OneToManys()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getOneToOnes <em>One To Ones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Ones</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getOneToOnes()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_OneToOnes()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getManyToManys <em>Many To Manys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Manys</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getManyToManys()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_ManyToManys()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getEmbeddeds <em>Embeddeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embeddeds</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getEmbeddeds()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_Embeddeds()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.Attributes#getTransients <em>Transients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transients</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Attributes#getTransients()
	 * @see #getAttributes()
	 * @generated
	 */
	public EReference getAttributes_Transients()
	{
		return (EReference)attributesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeMapping <em>Xml Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Attribute Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeMapping
	 * @generated
	 */
	public EClass getXmlAttributeMapping()
	{
		return xmlAttributeMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeMapping#getName()
	 * @see #getXmlAttributeMapping()
	 * @generated
	 */
	public EAttribute getXmlAttributeMapping_Name()
	{
		return (EAttribute)xmlAttributeMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.AbstractXmlAttributeMapping <em>Abstract Xml Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Xml Attribute Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.AbstractXmlAttributeMapping
	 * @generated
	 */
	public EClass getAbstractXmlAttributeMapping()
	{
		return abstractXmlAttributeMappingEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlNullAttributeMapping <em>Xml Null Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Null Attribute Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNullAttributeMapping
	 * @generated
	 */
	public EClass getXmlNullAttributeMapping()
	{
		return xmlNullAttributeMappingEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.ColumnMapping <em>Column Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.ColumnMapping
	 * @generated
	 */
	public EClass getColumnMapping()
	{
		return columnMappingEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.ColumnMapping#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.ColumnMapping#getColumn()
	 * @see #getColumnMapping()
	 * @generated
	 */
	public EReference getColumnMapping_Column()
	{
		return (EReference)columnMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping <em>Xml Relationship Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Relationship Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping
	 * @generated
	 */
	public EClass getXmlRelationshipMapping()
	{
		return xmlRelationshipMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping#getTargetEntity()
	 * @see #getXmlRelationshipMapping()
	 * @generated
	 */
	public EAttribute getXmlRelationshipMapping_TargetEntity()
	{
		return (EAttribute)xmlRelationshipMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping#getFetch()
	 * @see #getXmlRelationshipMapping()
	 * @generated
	 */
	public EAttribute getXmlRelationshipMapping_Fetch()
	{
		return (EAttribute)xmlRelationshipMappingEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping#getCascade()
	 * @see #getXmlRelationshipMapping()
	 * @generated
	 */
	public EReference getXmlRelationshipMapping_Cascade()
	{
		return (EReference)xmlRelationshipMappingEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlMappedByMapping <em>Xml Mapped By Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Mapped By Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedByMapping
	 * @generated
	 */
	public EClass getXmlMappedByMapping()
	{
		return xmlMappedByMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlMappedByMapping#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMappedByMapping#getMappedBy()
	 * @see #getXmlMappedByMapping()
	 * @generated
	 */
	public EAttribute getXmlMappedByMapping_MappedBy()
	{
		return (EAttribute)xmlMappedByMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping <em>Xml Join Columns Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Join Columns Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping
	 * @generated
	 */
	public EClass getXmlJoinColumnsMapping()
	{
		return xmlJoinColumnsMappingEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping#getJoinColumns()
	 * @see #getXmlJoinColumnsMapping()
	 * @generated
	 */
	public EReference getXmlJoinColumnsMapping_JoinColumns()
	{
		return (EReference)xmlJoinColumnsMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping <em>Xml Join Table Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Join Table Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping
	 * @generated
	 */
	public EClass getXmlJoinTableMapping()
	{
		return xmlJoinTableMappingEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping#getJoinTable()
	 * @see #getXmlJoinTableMapping()
	 * @generated
	 */
	public EReference getXmlJoinTableMapping_JoinTable()
	{
		return (EReference)xmlJoinTableMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping <em>Xml Multi Relationship Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Multi Relationship Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping
	 * @generated
	 */
	public EClass getXmlMultiRelationshipMapping()
	{
		return xmlMultiRelationshipMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping#getOrderBy()
	 * @see #getXmlMultiRelationshipMapping()
	 * @generated
	 */
	public EAttribute getXmlMultiRelationshipMapping_OrderBy()
	{
		return (EAttribute)xmlMultiRelationshipMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping#getMapKey()
	 * @see #getXmlMultiRelationshipMapping()
	 * @generated
	 */
	public EReference getXmlMultiRelationshipMapping_MapKey()
	{
		return (EReference)xmlMultiRelationshipMappingEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping <em>Xml Single Relationship Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Single Relationship Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping
	 * @generated
	 */
	public EClass getXmlSingleRelationshipMapping()
	{
		return xmlSingleRelationshipMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping#getOptional()
	 * @see #getXmlSingleRelationshipMapping()
	 * @generated
	 */
	public EAttribute getXmlSingleRelationshipMapping_Optional()
	{
		return (EAttribute)xmlSingleRelationshipMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlId <em>Xml Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Id</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlId
	 * @generated
	 */
	public EClass getXmlId()
	{
		return xmlIdEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlId#getGeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Value</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlId#getGeneratedValue()
	 * @see #getXmlId()
	 * @generated
	 */
	public EReference getXmlId_GeneratedValue()
	{
		return (EReference)xmlIdEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlIdImpl <em>Xml Id Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Id Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlIdImpl
	 * @generated
	 */
	public EClass getXmlIdImpl()
	{
		return xmlIdImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded <em>Base Xml Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Xml Embedded</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded
	 * @generated
	 */
	public EClass getBaseXmlEmbedded()
	{
		return baseXmlEmbeddedEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded#getAttributeOverrides <em>Attribute Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Overrides</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded#getAttributeOverrides()
	 * @see #getBaseXmlEmbedded()
	 * @generated
	 */
	public EReference getBaseXmlEmbedded_AttributeOverrides()
	{
		return (EReference)baseXmlEmbeddedEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedId <em>Xml Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded Id</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedId
	 * @generated
	 */
	public EClass getXmlEmbeddedId()
	{
		return xmlEmbeddedIdEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedIdImpl <em>Xml Embedded Id Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded Id Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedIdImpl
	 * @generated
	 */
	public EClass getXmlEmbeddedIdImpl()
	{
		return xmlEmbeddedIdImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlBasic <em>Xml Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBasic
	 * @generated
	 */
	public EClass getXmlBasic()
	{
		return xmlBasicEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlBasic#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBasic#getFetch()
	 * @see #getXmlBasic()
	 * @generated
	 */
	public EAttribute getXmlBasic_Fetch()
	{
		return (EAttribute)xmlBasicEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlBasic#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBasic#getOptional()
	 * @see #getXmlBasic()
	 * @generated
	 */
	public EAttribute getXmlBasic_Optional()
	{
		return (EAttribute)xmlBasicEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlBasicImpl <em>Xml Basic Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Basic Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBasicImpl
	 * @generated
	 */
	public EClass getXmlBasicImpl()
	{
		return xmlBasicImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlVersion <em>Xml Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Version</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlVersion
	 * @generated
	 */
	public EClass getXmlVersion()
	{
		return xmlVersionEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlVersionImpl <em>Xml Version Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Version Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlVersionImpl
	 * @generated
	 */
	public EClass getXmlVersionImpl()
	{
		return xmlVersionImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To One</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToOne
	 * @generated
	 */
	public EClass getXmlManyToOne()
	{
		return xmlManyToOneEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlManyToOneImpl <em>Xml Many To One Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To One Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToOneImpl
	 * @generated
	 */
	public EClass getXmlManyToOneImpl()
	{
		return xmlManyToOneImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To Many</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToMany
	 * @generated
	 */
	public EClass getXmlOneToMany()
	{
		return xmlOneToManyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlOneToManyImpl <em>Xml One To Many Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To Many Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToManyImpl
	 * @generated
	 */
	public EClass getXmlOneToManyImpl()
	{
		return xmlOneToManyImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To One</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOne
	 * @generated
	 */
	public EClass getXmlOneToOne()
	{
		return xmlOneToOneEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOne#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOne#getPrimaryKeyJoinColumns()
	 * @see #getXmlOneToOne()
	 * @generated
	 */
	public EReference getXmlOneToOne_PrimaryKeyJoinColumns()
	{
		return (EReference)xmlOneToOneEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOneImpl <em>Xml One To One Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml One To One Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOneImpl
	 * @generated
	 */
	public EClass getXmlOneToOneImpl()
	{
		return xmlOneToOneImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To Many</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToMany
	 * @generated
	 */
	public EClass getXmlManyToMany()
	{
		return xmlManyToManyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlManyToManyImpl <em>Xml Many To Many Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Many To Many Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlManyToManyImpl
	 * @generated
	 */
	public EClass getXmlManyToManyImpl()
	{
		return xmlManyToManyImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEmbedded <em>Xml Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbedded
	 * @generated
	 */
	public EClass getXmlEmbedded()
	{
		return xmlEmbeddedEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedImpl <em>Xml Embedded Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Embedded Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedImpl
	 * @generated
	 */
	public EClass getXmlEmbeddedImpl()
	{
		return xmlEmbeddedImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping <em>Xml Convertible Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Convertible Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping
	 * @generated
	 */
	public EClass getXmlConvertibleMapping()
	{
		return xmlConvertibleMappingEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping#isLob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lob</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping#isLob()
	 * @see #getXmlConvertibleMapping()
	 * @generated
	 */
	public EAttribute getXmlConvertibleMapping_Lob()
	{
		return (EAttribute)xmlConvertibleMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping#getTemporal()
	 * @see #getXmlConvertibleMapping()
	 * @generated
	 */
	public EAttribute getXmlConvertibleMapping_Temporal()
	{
		return (EAttribute)xmlConvertibleMappingEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping#getEnumerated()
	 * @see #getXmlConvertibleMapping()
	 * @generated
	 */
	public EAttribute getXmlConvertibleMapping_Enumerated()
	{
		return (EAttribute)xmlConvertibleMappingEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlTransient <em>Xml Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Transient</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTransient
	 * @generated
	 */
	public EClass getXmlTransient()
	{
		return xmlTransientEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlTransientImpl <em>Xml Transient Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Transient Impl</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTransientImpl
	 * @generated
	 */
	public EClass getXmlTransientImpl()
	{
		return xmlTransientImplEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlAssociationOverride <em>Xml Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Association Override</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAssociationOverride
	 * @generated
	 */
	public EClass getXmlAssociationOverride()
	{
		return xmlAssociationOverrideEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlAssociationOverride#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAssociationOverride#getJoinColumns()
	 * @see #getXmlAssociationOverride()
	 * @generated
	 */
	public EReference getXmlAssociationOverride_JoinColumns()
	{
		return (EReference)xmlAssociationOverrideEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAssociationOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAssociationOverride#getName()
	 * @see #getXmlAssociationOverride()
	 * @generated
	 */
	public EAttribute getXmlAssociationOverride_Name()
	{
		return (EAttribute)xmlAssociationOverrideEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeOverride <em>Xml Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Attribute Override</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeOverride
	 * @generated
	 */
	public EClass getXmlAttributeOverride()
	{
		return xmlAttributeOverrideEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeOverride#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeOverride#getColumn()
	 * @see #getXmlAttributeOverride()
	 * @generated
	 */
	public EReference getXmlAttributeOverride_Column()
	{
		return (EReference)xmlAttributeOverrideEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeOverride#getName()
	 * @see #getXmlAttributeOverride()
	 * @generated
	 */
	public EAttribute getXmlAttributeOverride_Name()
	{
		return (EAttribute)xmlAttributeOverrideEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.CascadeType <em>Cascade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType
	 * @generated
	 */
	public EClass getCascadeType()
	{
		return cascadeTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeAll <em>Cascade All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade All</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeAll()
	 * @see #getCascadeType()
	 * @generated
	 */
	public EAttribute getCascadeType_CascadeAll()
	{
		return (EAttribute)cascadeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.CascadeType#isCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType#isCascadePersist()
	 * @see #getCascadeType()
	 * @generated
	 */
	public EAttribute getCascadeType_CascadePersist()
	{
		return (EAttribute)cascadeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeMerge <em>Cascade Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade Merge</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeMerge()
	 * @see #getCascadeType()
	 * @generated
	 */
	public EAttribute getCascadeType_CascadeMerge()
	{
		return (EAttribute)cascadeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeRemove <em>Cascade Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeRemove()
	 * @see #getCascadeType()
	 * @generated
	 */
	public EAttribute getCascadeType_CascadeRemove()
	{
		return (EAttribute)cascadeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeRefresh <em>Cascade Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade Refresh</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.CascadeType#isCascadeRefresh()
	 * @see #getCascadeType()
	 * @generated
	 */
	public EAttribute getCascadeType_CascadeRefresh()
	{
		return (EAttribute)cascadeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlNamedColumn <em>Xml Named Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Named Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedColumn
	 * @generated
	 */
	public EClass getXmlNamedColumn()
	{
		return xmlNamedColumnEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlNamedColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedColumn#getColumnDefinition()
	 * @see #getXmlNamedColumn()
	 * @generated
	 */
	public EAttribute getXmlNamedColumn_ColumnDefinition()
	{
		return (EAttribute)xmlNamedColumnEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlNamedColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedColumn#getName()
	 * @see #getXmlNamedColumn()
	 * @generated
	 */
	public EAttribute getXmlNamedColumn_Name()
	{
		return (EAttribute)xmlNamedColumnEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn <em>Xml Abstract Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Abstract Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn
	 * @generated
	 */
	public EClass getXmlAbstractColumn()
	{
		return xmlAbstractColumnEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getInsertable()
	 * @see #getXmlAbstractColumn()
	 * @generated
	 */
	public EAttribute getXmlAbstractColumn_Insertable()
	{
		return (EAttribute)xmlAbstractColumnEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getNullable()
	 * @see #getXmlAbstractColumn()
	 * @generated
	 */
	public EAttribute getXmlAbstractColumn_Nullable()
	{
		return (EAttribute)xmlAbstractColumnEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getTable()
	 * @see #getXmlAbstractColumn()
	 * @generated
	 */
	public EAttribute getXmlAbstractColumn_Table()
	{
		return (EAttribute)xmlAbstractColumnEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getUnique()
	 * @see #getXmlAbstractColumn()
	 * @generated
	 */
	public EAttribute getXmlAbstractColumn_Unique()
	{
		return (EAttribute)xmlAbstractColumnEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn#getUpdatable()
	 * @see #getXmlAbstractColumn()
	 * @generated
	 */
	public EAttribute getXmlAbstractColumn_Updatable()
	{
		return (EAttribute)xmlAbstractColumnEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlColumn <em>Xml Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlColumn
	 * @generated
	 */
	public EClass getXmlColumn()
	{
		return xmlColumnEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlColumn#getLength()
	 * @see #getXmlColumn()
	 * @generated
	 */
	public EAttribute getXmlColumn_Length()
	{
		return (EAttribute)xmlColumnEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlColumn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlColumn#getPrecision()
	 * @see #getXmlColumn()
	 * @generated
	 */
	public EAttribute getXmlColumn_Precision()
	{
		return (EAttribute)xmlColumnEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlColumn#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlColumn#getScale()
	 * @see #getXmlColumn()
	 * @generated
	 */
	public EAttribute getXmlColumn_Scale()
	{
		return (EAttribute)xmlColumnEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.ColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Result</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.ColumnResult
	 * @generated
	 */
	public EClass getColumnResult()
	{
		return columnResultEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.ColumnResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.ColumnResult#getName()
	 * @see #getColumnResult()
	 * @generated
	 */
	public EAttribute getColumnResult_Name()
	{
		return (EAttribute)columnResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn <em>Xml Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Discriminator Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn
	 * @generated
	 */
	public EClass getXmlDiscriminatorColumn()
	{
		return xmlDiscriminatorColumnEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn#getDiscriminatorType()
	 * @see #getXmlDiscriminatorColumn()
	 * @generated
	 */
	public EAttribute getXmlDiscriminatorColumn_DiscriminatorType()
	{
		return (EAttribute)xmlDiscriminatorColumnEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn#getLength()
	 * @see #getXmlDiscriminatorColumn()
	 * @generated
	 */
	public EAttribute getXmlDiscriminatorColumn_Length()
	{
		return (EAttribute)xmlDiscriminatorColumnEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.EntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListeners
	 * @generated
	 */
	public EClass getEntityListeners()
	{
		return entityListenersEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.EntityListeners#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Listeners</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListeners#getEntityListeners()
	 * @see #getEntityListeners()
	 * @generated
	 */
	public EReference getEntityListeners_EntityListeners()
	{
		return (EReference)entityListenersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.EntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listener</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener
	 * @generated
	 */
	public EClass getEntityListener()
	{
		return entityListenerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getClassName()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EAttribute getEntityListener_ClassName()
	{
		return (EAttribute)entityListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPrePersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PrePersist()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPostPersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PostPersist()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPreRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PreRemove()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPostRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PostRemove()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPreUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PreUpdate()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPostUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PostUpdate()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jpt.core.resource.orm.EntityListener#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityListener#getPostLoad()
	 * @see #getEntityListener()
	 * @generated
	 */
	public EReference getEntityListener_PostLoad()
	{
		return (EReference)entityListenerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.EntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Result</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityResult
	 * @generated
	 */
	public EClass getEntityResult()
	{
		return entityResultEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityResult#getDiscriminatorColumn()
	 * @see #getEntityResult()
	 * @generated
	 */
	public EAttribute getEntityResult_DiscriminatorColumn()
	{
		return (EAttribute)entityResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.EntityResult#getEntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Class</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityResult#getEntityClass()
	 * @see #getEntityResult()
	 * @generated
	 */
	public EAttribute getEntityResult_EntityClass()
	{
		return (EAttribute)entityResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.EntityResult#getFieldResults <em>Field Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Results</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EntityResult#getFieldResults()
	 * @see #getEntityResult()
	 * @generated
	 */
	public EReference getEntityResult_FieldResults()
	{
		return (EReference)entityResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.FieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Result</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.FieldResult
	 * @generated
	 */
	public EClass getFieldResult()
	{
		return fieldResultEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.FieldResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.FieldResult#getName()
	 * @see #getFieldResult()
	 * @generated
	 */
	public EAttribute getFieldResult_Name()
	{
		return (EAttribute)fieldResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.FieldResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.FieldResult#getColumn()
	 * @see #getFieldResult()
	 * @generated
	 */
	public EAttribute getFieldResult_Column()
	{
		return (EAttribute)fieldResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratedValue <em>Xml Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Generated Value</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratedValue
	 * @generated
	 */
	public EClass getXmlGeneratedValue()
	{
		return xmlGeneratedValueEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratedValue#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratedValue#getGenerator()
	 * @see #getXmlGeneratedValue()
	 * @generated
	 */
	public EAttribute getXmlGeneratedValue_Generator()
	{
		return (EAttribute)xmlGeneratedValueEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratedValue#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratedValue#getStrategy()
	 * @see #getXmlGeneratedValue()
	 * @generated
	 */
	public EAttribute getXmlGeneratedValue_Strategy()
	{
		return (EAttribute)xmlGeneratedValueEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlIdClass <em>Xml Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Id Class</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlIdClass
	 * @generated
	 */
	public EClass getXmlIdClass()
	{
		return xmlIdClassEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlIdClass#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlIdClass#getClassName()
	 * @see #getXmlIdClass()
	 * @generated
	 */
	public EAttribute getXmlIdClass_ClassName()
	{
		return (EAttribute)xmlIdClassEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Inheritance
	 * @generated
	 */
	public EClass getInheritance()
	{
		return inheritanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.Inheritance#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Inheritance#getStrategy()
	 * @see #getInheritance()
	 * @generated
	 */
	public EAttribute getInheritance_Strategy()
	{
		return (EAttribute)inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumn <em>Xml Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Join Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumn
	 * @generated
	 */
	public EClass getXmlJoinColumn()
	{
		return xmlJoinColumnEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumn#getReferencedColumnName()
	 * @see #getXmlJoinColumn()
	 * @generated
	 */
	public EAttribute getXmlJoinColumn_ReferencedColumnName()
	{
		return (EAttribute)xmlJoinColumnEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTable <em>Xml Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Join Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTable
	 * @generated
	 */
	public EClass getXmlJoinTable()
	{
		return xmlJoinTableEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTable#getJoinColumns <em>Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTable#getJoinColumns()
	 * @see #getXmlJoinTable()
	 * @generated
	 */
	public EReference getXmlJoinTable_JoinColumns()
	{
		return (EReference)xmlJoinTableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTable#getInverseJoinColumns <em>Inverse Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverse Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTable#getInverseJoinColumns()
	 * @see #getXmlJoinTable()
	 * @generated
	 */
	public EReference getXmlJoinTable_InverseJoinColumns()
	{
		return (EReference)xmlJoinTableEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.Lob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lob</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.Lob
	 * @generated
	 */
	public EClass getLob()
	{
		return lobEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.MapKey
	 * @generated
	 */
	public EClass getMapKey()
	{
		return mapKeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.MapKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.MapKey#getName()
	 * @see #getMapKey()
	 * @generated
	 */
	public EAttribute getMapKey_Name()
	{
		return (EAttribute)mapKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlQuery <em>Xml Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Query</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQuery
	 * @generated
	 */
	public EClass getXmlQuery()
	{
		return xmlQueryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQuery#getName()
	 * @see #getXmlQuery()
	 * @generated
	 */
	public EAttribute getXmlQuery_Name()
	{
		return (EAttribute)xmlQueryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQuery#getQuery()
	 * @see #getXmlQuery()
	 * @generated
	 */
	public EAttribute getXmlQuery_Query()
	{
		return (EAttribute)xmlQueryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlQuery#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQuery#getHints()
	 * @see #getXmlQuery()
	 * @generated
	 */
	public EReference getXmlQuery_Hints()
	{
		return (EReference)xmlQueryEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery <em>Xml Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Named Native Query</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery
	 * @generated
	 */
	public EClass getXmlNamedNativeQuery()
	{
		return xmlNamedNativeQueryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery#getResultClass()
	 * @see #getXmlNamedNativeQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedNativeQuery_ResultClass()
	{
		return (EAttribute)xmlNamedNativeQueryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery#getResultSetMapping()
	 * @see #getXmlNamedNativeQuery()
	 * @generated
	 */
	public EAttribute getXmlNamedNativeQuery_ResultSetMapping()
	{
		return (EAttribute)xmlNamedNativeQueryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlNamedQuery <em>Xml Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Named Query</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlNamedQuery
	 * @generated
	 */
	public EClass getXmlNamedQuery()
	{
		return xmlNamedQueryEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.EventMethod <em>Event Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Method</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EventMethod
	 * @generated
	 */
	public EClass getEventMethod()
	{
		return eventMethodEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.EventMethod#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EventMethod#getMethodName()
	 * @see #getEventMethod()
	 * @generated
	 */
	public EAttribute getEventMethod_MethodName()
	{
		return (EAttribute)eventMethodEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Load</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PostLoad
	 * @generated
	 */
	public EClass getPostLoad()
	{
		return postLoadEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PostPersist
	 * @generated
	 */
	public EClass getPostPersist()
	{
		return postPersistEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PostRemove
	 * @generated
	 */
	public EClass getPostRemove()
	{
		return postRemoveEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PostUpdate
	 * @generated
	 */
	public EClass getPostUpdate()
	{
		return postUpdateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Persist</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PrePersist
	 * @generated
	 */
	public EClass getPrePersist()
	{
		return prePersistEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Remove</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PreRemove
	 * @generated
	 */
	public EClass getPreRemove()
	{
		return preRemoveEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.PreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Update</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.PreUpdate
	 * @generated
	 */
	public EClass getPreUpdate()
	{
		return preUpdateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn <em>Xml Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Primary Key Join Column</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn
	 * @generated
	 */
	public EClass getXmlPrimaryKeyJoinColumn()
	{
		return xmlPrimaryKeyJoinColumnEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn#getReferencedColumnName()
	 * @see #getXmlPrimaryKeyJoinColumn()
	 * @generated
	 */
	public EAttribute getXmlPrimaryKeyJoinColumn_ReferencedColumnName()
	{
		return (EAttribute)xmlPrimaryKeyJoinColumnEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlQueryHint <em>Xml Query Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Query Hint</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryHint
	 * @generated
	 */
	public EClass getXmlQueryHint()
	{
		return xmlQueryHintEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlQueryHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryHint#getName()
	 * @see #getXmlQueryHint()
	 * @generated
	 */
	public EAttribute getXmlQueryHint_Name()
	{
		return (EAttribute)xmlQueryHintEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlQueryHint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlQueryHint#getValue()
	 * @see #getXmlQueryHint()
	 * @generated
	 */
	public EAttribute getXmlQueryHint_Value()
	{
		return (EAttribute)xmlQueryHintEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable <em>Xml Base Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Base Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable
	 * @generated
	 */
	public EClass getXmlBaseTable()
	{
		return xmlBaseTableEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable#getName()
	 * @see #getXmlBaseTable()
	 * @generated
	 */
	public EAttribute getXmlBaseTable_Name()
	{
		return (EAttribute)xmlBaseTableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable#getCatalog()
	 * @see #getXmlBaseTable()
	 * @generated
	 */
	public EAttribute getXmlBaseTable_Catalog()
	{
		return (EAttribute)xmlBaseTableEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable#getSchema()
	 * @see #getXmlBaseTable()
	 * @generated
	 */
	public EAttribute getXmlBaseTable_Schema()
	{
		return (EAttribute)xmlBaseTableEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable#getUniqueConstraints()
	 * @see #getXmlBaseTable()
	 * @generated
	 */
	public EReference getXmlBaseTable_UniqueConstraints()
	{
		return (EReference)xmlBaseTableEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlTable <em>Xml Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTable
	 * @generated
	 */
	public EClass getXmlTable()
	{
		return xmlTableEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlSecondaryTable <em>Xml Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Secondary Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlSecondaryTable
	 * @generated
	 */
	public EClass getXmlSecondaryTable()
	{
		return xmlSecondaryTableEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlSecondaryTable#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Columns</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlSecondaryTable#getPrimaryKeyJoinColumns()
	 * @see #getXmlSecondaryTable()
	 * @generated
	 */
	public EReference getXmlSecondaryTable_PrimaryKeyJoinColumns()
	{
		return (EReference)xmlSecondaryTableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlGenerator <em>Xml Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Generator</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGenerator
	 * @generated
	 */
	public EClass getXmlGenerator()
	{
		return xmlGeneratorEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGenerator#getName()
	 * @see #getXmlGenerator()
	 * @generated
	 */
	public EAttribute getXmlGenerator_Name()
	{
		return (EAttribute)xmlGeneratorEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGenerator#getInitialValue()
	 * @see #getXmlGenerator()
	 * @generated
	 */
	public EAttribute getXmlGenerator_InitialValue()
	{
		return (EAttribute)xmlGeneratorEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlGenerator#getAllocationSize()
	 * @see #getXmlGenerator()
	 * @generated
	 */
	public EAttribute getXmlGenerator_AllocationSize()
	{
		return (EAttribute)xmlGeneratorEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator <em>Xml Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Sequence Generator</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator
	 * @generated
	 */
	public EClass getXmlSequenceGenerator()
	{
		return xmlSequenceGeneratorEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator#getSequenceName()
	 * @see #getXmlSequenceGenerator()
	 * @generated
	 */
	public EAttribute getXmlSequenceGenerator_SequenceName()
	{
		return (EAttribute)xmlSequenceGeneratorEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.SqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Set Mapping</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.SqlResultSetMapping
	 * @generated
	 */
	public EClass getSqlResultSetMapping()
	{
		return sqlResultSetMappingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.SqlResultSetMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.SqlResultSetMapping#getName()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	public EAttribute getSqlResultSetMapping_Name()
	{
		return (EAttribute)sqlResultSetMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.SqlResultSetMapping#getEntityResults <em>Entity Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Results</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.SqlResultSetMapping#getEntityResults()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	public EReference getSqlResultSetMapping_EntityResults()
	{
		return (EReference)sqlResultSetMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.SqlResultSetMapping#getColumnResults <em>Column Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Results</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.SqlResultSetMapping#getColumnResults()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	public EReference getSqlResultSetMapping_ColumnResults()
	{
		return (EReference)sqlResultSetMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator <em>Xml Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Table Generator</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator
	 * @generated
	 */
	public EClass getXmlTableGenerator()
	{
		return xmlTableGeneratorEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getTable()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EAttribute getXmlTableGenerator_Table()
	{
		return (EAttribute)xmlTableGeneratorEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getCatalog()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EAttribute getXmlTableGenerator_Catalog()
	{
		return (EAttribute)xmlTableGeneratorEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getSchema()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EAttribute getXmlTableGenerator_Schema()
	{
		return (EAttribute)xmlTableGeneratorEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getPkColumnName <em>Pk Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getPkColumnName()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EAttribute getXmlTableGenerator_PkColumnName()
	{
		return (EAttribute)xmlTableGeneratorEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getValueColumnName <em>Value Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Column Name</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getValueColumnName()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EAttribute getXmlTableGenerator_ValueColumnName()
	{
		return (EAttribute)xmlTableGeneratorEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getPkColumnValue <em>Pk Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Value</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getPkColumnValue()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EAttribute getXmlTableGenerator_PkColumnValue()
	{
		return (EAttribute)xmlTableGeneratorEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator#getUniqueConstraints()
	 * @see #getXmlTableGenerator()
	 * @generated
	 */
	public EReference getXmlTableGenerator_UniqueConstraints()
	{
		return (EReference)xmlTableGeneratorEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint <em>Xml Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Unique Constraint</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint
	 * @generated
	 */
	public EClass getXmlUniqueConstraint()
	{
		return xmlUniqueConstraintEClass;
	}


	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint#getColumnNames()
	 * @see #getXmlUniqueConstraint()
	 * @generated
	 */
	public EAttribute getXmlUniqueConstraint_ColumnNames()
	{
		return (EAttribute)xmlUniqueConstraintEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.AccessType
	 * @generated
	 */
	public EEnum getAccessType()
	{
		return accessTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.DiscriminatorType
	 * @generated
	 */
	public EEnum getDiscriminatorType()
	{
		return discriminatorTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.EnumType
	 * @generated
	 */
	public EEnum getEnumType()
	{
		return enumTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.FetchType <em>Fetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.FetchType
	 * @generated
	 */
	public EEnum getFetchType()
	{
		return fetchTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.GenerationType <em>Generation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.GenerationType
	 * @generated
	 */
	public EEnum getGenerationType()
	{
		return generationTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.InheritanceType
	 * @generated
	 */
	public EEnum getInheritanceType()
	{
		return inheritanceTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jpt.core.resource.orm.TemporalType <em>Temporal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Type</em>'.
	 * @see org.eclipse.jpt.core.resource.orm.TemporalType
	 * @generated
	 */
	public EEnum getTemporalType()
	{
		return temporalTypeEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Discriminator Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	public EDataType getDiscriminatorValue()
	{
		return discriminatorValueEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enumerated</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	public EDataType getEnumerated()
	{
		return enumeratedEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Order By</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	public EDataType getOrderBy()
	{
		return orderByEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	public EDataType getVersionType()
	{
		return versionTypeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public OrmFactory getOrmFactory()
	{
		return (OrmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xmlEntityMappingsEClass = createEClass(XML_ENTITY_MAPPINGS);
		createEAttribute(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__VERSION);
		createEAttribute(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__DESCRIPTION);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__PERSISTENCE_UNIT_METADATA);
		createEAttribute(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__PACKAGE);
		createEAttribute(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__SCHEMA);
		createEAttribute(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__CATALOG);
		createEAttribute(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__ACCESS);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__SEQUENCE_GENERATORS);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__TABLE_GENERATORS);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__SQL_RESULT_SET_MAPPINGS);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__MAPPED_SUPERCLASSES);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__ENTITIES);
		createEReference(xmlEntityMappingsEClass, XML_ENTITY_MAPPINGS__EMBEDDABLES);

		xmlPersistenceUnitMetadataEClass = createEClass(XML_PERSISTENCE_UNIT_METADATA);
		createEAttribute(xmlPersistenceUnitMetadataEClass, XML_PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE);
		createEReference(xmlPersistenceUnitMetadataEClass, XML_PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS);

		xmlPersistenceUnitDefaultsEClass = createEClass(XML_PERSISTENCE_UNIT_DEFAULTS);
		createEAttribute(xmlPersistenceUnitDefaultsEClass, XML_PERSISTENCE_UNIT_DEFAULTS__SCHEMA);
		createEAttribute(xmlPersistenceUnitDefaultsEClass, XML_PERSISTENCE_UNIT_DEFAULTS__CATALOG);
		createEAttribute(xmlPersistenceUnitDefaultsEClass, XML_PERSISTENCE_UNIT_DEFAULTS__ACCESS);
		createEAttribute(xmlPersistenceUnitDefaultsEClass, XML_PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST);
		createEReference(xmlPersistenceUnitDefaultsEClass, XML_PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS);

		xmlTypeMappingEClass = createEClass(XML_TYPE_MAPPING);
		createEAttribute(xmlTypeMappingEClass, XML_TYPE_MAPPING__CLASS_NAME);
		createEAttribute(xmlTypeMappingEClass, XML_TYPE_MAPPING__ACCESS);
		createEAttribute(xmlTypeMappingEClass, XML_TYPE_MAPPING__METADATA_COMPLETE);
		createEAttribute(xmlTypeMappingEClass, XML_TYPE_MAPPING__DESCRIPTION);
		createEReference(xmlTypeMappingEClass, XML_TYPE_MAPPING__ATTRIBUTES);

		abstractXmlTypeMappingEClass = createEClass(ABSTRACT_XML_TYPE_MAPPING);

		xmlMappedSuperclassEClass = createEClass(XML_MAPPED_SUPERCLASS);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__ID_CLASS);
		createEAttribute(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS);
		createEAttribute(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__ENTITY_LISTENERS);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__PRE_PERSIST);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__POST_PERSIST);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__PRE_REMOVE);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__POST_REMOVE);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__PRE_UPDATE);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__POST_UPDATE);
		createEReference(xmlMappedSuperclassEClass, XML_MAPPED_SUPERCLASS__POST_LOAD);

		xmlEntityEClass = createEClass(XML_ENTITY);
		createEAttribute(xmlEntityEClass, XML_ENTITY__NAME);
		createEReference(xmlEntityEClass, XML_ENTITY__TABLE);
		createEReference(xmlEntityEClass, XML_ENTITY__SECONDARY_TABLES);
		createEReference(xmlEntityEClass, XML_ENTITY__PRIMARY_KEY_JOIN_COLUMNS);
		createEReference(xmlEntityEClass, XML_ENTITY__ID_CLASS);
		createEReference(xmlEntityEClass, XML_ENTITY__INHERITANCE);
		createEAttribute(xmlEntityEClass, XML_ENTITY__DISCRIMINATOR_VALUE);
		createEReference(xmlEntityEClass, XML_ENTITY__DISCRIMINATOR_COLUMN);
		createEReference(xmlEntityEClass, XML_ENTITY__SQL_RESULT_SET_MAPPINGS);
		createEAttribute(xmlEntityEClass, XML_ENTITY__EXCLUDE_DEFAULT_LISTENERS);
		createEAttribute(xmlEntityEClass, XML_ENTITY__EXCLUDE_SUPERCLASS_LISTENERS);
		createEReference(xmlEntityEClass, XML_ENTITY__ENTITY_LISTENERS);
		createEReference(xmlEntityEClass, XML_ENTITY__PRE_PERSIST);
		createEReference(xmlEntityEClass, XML_ENTITY__POST_PERSIST);
		createEReference(xmlEntityEClass, XML_ENTITY__PRE_REMOVE);
		createEReference(xmlEntityEClass, XML_ENTITY__POST_REMOVE);
		createEReference(xmlEntityEClass, XML_ENTITY__PRE_UPDATE);
		createEReference(xmlEntityEClass, XML_ENTITY__POST_UPDATE);
		createEReference(xmlEntityEClass, XML_ENTITY__POST_LOAD);
		createEReference(xmlEntityEClass, XML_ENTITY__ATTRIBUTE_OVERRIDES);
		createEReference(xmlEntityEClass, XML_ENTITY__ASSOCIATION_OVERRIDES);

		xmlEmbeddableEClass = createEClass(XML_EMBEDDABLE);

		xmlQueryContainerEClass = createEClass(XML_QUERY_CONTAINER);
		createEReference(xmlQueryContainerEClass, XML_QUERY_CONTAINER__NAMED_QUERIES);
		createEReference(xmlQueryContainerEClass, XML_QUERY_CONTAINER__NAMED_NATIVE_QUERIES);

		xmlGeneratorContainerEClass = createEClass(XML_GENERATOR_CONTAINER);
		createEReference(xmlGeneratorContainerEClass, XML_GENERATOR_CONTAINER__SEQUENCE_GENERATOR);
		createEReference(xmlGeneratorContainerEClass, XML_GENERATOR_CONTAINER__TABLE_GENERATOR);

		attributesEClass = createEClass(ATTRIBUTES);
		createEReference(attributesEClass, ATTRIBUTES__IDS);
		createEReference(attributesEClass, ATTRIBUTES__EMBEDDED_IDS);
		createEReference(attributesEClass, ATTRIBUTES__BASICS);
		createEReference(attributesEClass, ATTRIBUTES__VERSIONS);
		createEReference(attributesEClass, ATTRIBUTES__MANY_TO_ONES);
		createEReference(attributesEClass, ATTRIBUTES__ONE_TO_MANYS);
		createEReference(attributesEClass, ATTRIBUTES__ONE_TO_ONES);
		createEReference(attributesEClass, ATTRIBUTES__MANY_TO_MANYS);
		createEReference(attributesEClass, ATTRIBUTES__EMBEDDEDS);
		createEReference(attributesEClass, ATTRIBUTES__TRANSIENTS);

		xmlAttributeMappingEClass = createEClass(XML_ATTRIBUTE_MAPPING);
		createEAttribute(xmlAttributeMappingEClass, XML_ATTRIBUTE_MAPPING__NAME);

		abstractXmlAttributeMappingEClass = createEClass(ABSTRACT_XML_ATTRIBUTE_MAPPING);

		xmlNullAttributeMappingEClass = createEClass(XML_NULL_ATTRIBUTE_MAPPING);

		columnMappingEClass = createEClass(COLUMN_MAPPING);
		createEReference(columnMappingEClass, COLUMN_MAPPING__COLUMN);

		xmlRelationshipMappingEClass = createEClass(XML_RELATIONSHIP_MAPPING);
		createEAttribute(xmlRelationshipMappingEClass, XML_RELATIONSHIP_MAPPING__TARGET_ENTITY);
		createEAttribute(xmlRelationshipMappingEClass, XML_RELATIONSHIP_MAPPING__FETCH);
		createEReference(xmlRelationshipMappingEClass, XML_RELATIONSHIP_MAPPING__CASCADE);

		xmlMappedByMappingEClass = createEClass(XML_MAPPED_BY_MAPPING);
		createEAttribute(xmlMappedByMappingEClass, XML_MAPPED_BY_MAPPING__MAPPED_BY);

		xmlJoinColumnsMappingEClass = createEClass(XML_JOIN_COLUMNS_MAPPING);
		createEReference(xmlJoinColumnsMappingEClass, XML_JOIN_COLUMNS_MAPPING__JOIN_COLUMNS);

		xmlJoinTableMappingEClass = createEClass(XML_JOIN_TABLE_MAPPING);
		createEReference(xmlJoinTableMappingEClass, XML_JOIN_TABLE_MAPPING__JOIN_TABLE);

		xmlMultiRelationshipMappingEClass = createEClass(XML_MULTI_RELATIONSHIP_MAPPING);
		createEAttribute(xmlMultiRelationshipMappingEClass, XML_MULTI_RELATIONSHIP_MAPPING__ORDER_BY);
		createEReference(xmlMultiRelationshipMappingEClass, XML_MULTI_RELATIONSHIP_MAPPING__MAP_KEY);

		xmlSingleRelationshipMappingEClass = createEClass(XML_SINGLE_RELATIONSHIP_MAPPING);
		createEAttribute(xmlSingleRelationshipMappingEClass, XML_SINGLE_RELATIONSHIP_MAPPING__OPTIONAL);

		xmlIdEClass = createEClass(XML_ID);
		createEReference(xmlIdEClass, XML_ID__GENERATED_VALUE);

		xmlIdImplEClass = createEClass(XML_ID_IMPL);

		baseXmlEmbeddedEClass = createEClass(BASE_XML_EMBEDDED);
		createEReference(baseXmlEmbeddedEClass, BASE_XML_EMBEDDED__ATTRIBUTE_OVERRIDES);

		xmlEmbeddedIdEClass = createEClass(XML_EMBEDDED_ID);

		xmlEmbeddedIdImplEClass = createEClass(XML_EMBEDDED_ID_IMPL);

		xmlEmbeddedEClass = createEClass(XML_EMBEDDED);

		xmlEmbeddedImplEClass = createEClass(XML_EMBEDDED_IMPL);

		xmlConvertibleMappingEClass = createEClass(XML_CONVERTIBLE_MAPPING);
		createEAttribute(xmlConvertibleMappingEClass, XML_CONVERTIBLE_MAPPING__LOB);
		createEAttribute(xmlConvertibleMappingEClass, XML_CONVERTIBLE_MAPPING__TEMPORAL);
		createEAttribute(xmlConvertibleMappingEClass, XML_CONVERTIBLE_MAPPING__ENUMERATED);

		xmlBasicEClass = createEClass(XML_BASIC);
		createEAttribute(xmlBasicEClass, XML_BASIC__FETCH);
		createEAttribute(xmlBasicEClass, XML_BASIC__OPTIONAL);

		xmlBasicImplEClass = createEClass(XML_BASIC_IMPL);

		xmlVersionEClass = createEClass(XML_VERSION);

		xmlVersionImplEClass = createEClass(XML_VERSION_IMPL);

		xmlManyToOneEClass = createEClass(XML_MANY_TO_ONE);

		xmlManyToOneImplEClass = createEClass(XML_MANY_TO_ONE_IMPL);

		xmlOneToManyEClass = createEClass(XML_ONE_TO_MANY);

		xmlOneToManyImplEClass = createEClass(XML_ONE_TO_MANY_IMPL);

		xmlOneToOneEClass = createEClass(XML_ONE_TO_ONE);
		createEReference(xmlOneToOneEClass, XML_ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMNS);

		xmlOneToOneImplEClass = createEClass(XML_ONE_TO_ONE_IMPL);

		xmlManyToManyEClass = createEClass(XML_MANY_TO_MANY);

		xmlManyToManyImplEClass = createEClass(XML_MANY_TO_MANY_IMPL);

		xmlTransientEClass = createEClass(XML_TRANSIENT);

		xmlTransientImplEClass = createEClass(XML_TRANSIENT_IMPL);

		xmlAssociationOverrideEClass = createEClass(XML_ASSOCIATION_OVERRIDE);
		createEReference(xmlAssociationOverrideEClass, XML_ASSOCIATION_OVERRIDE__JOIN_COLUMNS);
		createEAttribute(xmlAssociationOverrideEClass, XML_ASSOCIATION_OVERRIDE__NAME);

		xmlAttributeOverrideEClass = createEClass(XML_ATTRIBUTE_OVERRIDE);
		createEReference(xmlAttributeOverrideEClass, XML_ATTRIBUTE_OVERRIDE__COLUMN);
		createEAttribute(xmlAttributeOverrideEClass, XML_ATTRIBUTE_OVERRIDE__NAME);

		cascadeTypeEClass = createEClass(CASCADE_TYPE);
		createEAttribute(cascadeTypeEClass, CASCADE_TYPE__CASCADE_ALL);
		createEAttribute(cascadeTypeEClass, CASCADE_TYPE__CASCADE_PERSIST);
		createEAttribute(cascadeTypeEClass, CASCADE_TYPE__CASCADE_MERGE);
		createEAttribute(cascadeTypeEClass, CASCADE_TYPE__CASCADE_REMOVE);
		createEAttribute(cascadeTypeEClass, CASCADE_TYPE__CASCADE_REFRESH);

		xmlNamedColumnEClass = createEClass(XML_NAMED_COLUMN);
		createEAttribute(xmlNamedColumnEClass, XML_NAMED_COLUMN__COLUMN_DEFINITION);
		createEAttribute(xmlNamedColumnEClass, XML_NAMED_COLUMN__NAME);

		xmlAbstractColumnEClass = createEClass(XML_ABSTRACT_COLUMN);
		createEAttribute(xmlAbstractColumnEClass, XML_ABSTRACT_COLUMN__INSERTABLE);
		createEAttribute(xmlAbstractColumnEClass, XML_ABSTRACT_COLUMN__NULLABLE);
		createEAttribute(xmlAbstractColumnEClass, XML_ABSTRACT_COLUMN__TABLE);
		createEAttribute(xmlAbstractColumnEClass, XML_ABSTRACT_COLUMN__UNIQUE);
		createEAttribute(xmlAbstractColumnEClass, XML_ABSTRACT_COLUMN__UPDATABLE);

		xmlColumnEClass = createEClass(XML_COLUMN);
		createEAttribute(xmlColumnEClass, XML_COLUMN__LENGTH);
		createEAttribute(xmlColumnEClass, XML_COLUMN__PRECISION);
		createEAttribute(xmlColumnEClass, XML_COLUMN__SCALE);

		columnResultEClass = createEClass(COLUMN_RESULT);
		createEAttribute(columnResultEClass, COLUMN_RESULT__NAME);

		xmlDiscriminatorColumnEClass = createEClass(XML_DISCRIMINATOR_COLUMN);
		createEAttribute(xmlDiscriminatorColumnEClass, XML_DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE);
		createEAttribute(xmlDiscriminatorColumnEClass, XML_DISCRIMINATOR_COLUMN__LENGTH);

		entityListenersEClass = createEClass(ENTITY_LISTENERS);
		createEReference(entityListenersEClass, ENTITY_LISTENERS__ENTITY_LISTENERS);

		entityListenerEClass = createEClass(ENTITY_LISTENER);
		createEAttribute(entityListenerEClass, ENTITY_LISTENER__CLASS_NAME);
		createEReference(entityListenerEClass, ENTITY_LISTENER__PRE_PERSIST);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_PERSIST);
		createEReference(entityListenerEClass, ENTITY_LISTENER__PRE_REMOVE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_REMOVE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__PRE_UPDATE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_UPDATE);
		createEReference(entityListenerEClass, ENTITY_LISTENER__POST_LOAD);

		entityResultEClass = createEClass(ENTITY_RESULT);
		createEAttribute(entityResultEClass, ENTITY_RESULT__DISCRIMINATOR_COLUMN);
		createEAttribute(entityResultEClass, ENTITY_RESULT__ENTITY_CLASS);
		createEReference(entityResultEClass, ENTITY_RESULT__FIELD_RESULTS);

		eventMethodEClass = createEClass(EVENT_METHOD);
		createEAttribute(eventMethodEClass, EVENT_METHOD__METHOD_NAME);

		fieldResultEClass = createEClass(FIELD_RESULT);
		createEAttribute(fieldResultEClass, FIELD_RESULT__NAME);
		createEAttribute(fieldResultEClass, FIELD_RESULT__COLUMN);

		xmlGeneratedValueEClass = createEClass(XML_GENERATED_VALUE);
		createEAttribute(xmlGeneratedValueEClass, XML_GENERATED_VALUE__GENERATOR);
		createEAttribute(xmlGeneratedValueEClass, XML_GENERATED_VALUE__STRATEGY);

		xmlIdClassEClass = createEClass(XML_ID_CLASS);
		createEAttribute(xmlIdClassEClass, XML_ID_CLASS__CLASS_NAME);

		inheritanceEClass = createEClass(INHERITANCE);
		createEAttribute(inheritanceEClass, INHERITANCE__STRATEGY);

		xmlJoinColumnEClass = createEClass(XML_JOIN_COLUMN);
		createEAttribute(xmlJoinColumnEClass, XML_JOIN_COLUMN__REFERENCED_COLUMN_NAME);

		xmlJoinTableEClass = createEClass(XML_JOIN_TABLE);
		createEReference(xmlJoinTableEClass, XML_JOIN_TABLE__JOIN_COLUMNS);
		createEReference(xmlJoinTableEClass, XML_JOIN_TABLE__INVERSE_JOIN_COLUMNS);

		lobEClass = createEClass(LOB);

		mapKeyEClass = createEClass(MAP_KEY);
		createEAttribute(mapKeyEClass, MAP_KEY__NAME);

		xmlQueryEClass = createEClass(XML_QUERY);
		createEAttribute(xmlQueryEClass, XML_QUERY__NAME);
		createEAttribute(xmlQueryEClass, XML_QUERY__QUERY);
		createEReference(xmlQueryEClass, XML_QUERY__HINTS);

		xmlNamedNativeQueryEClass = createEClass(XML_NAMED_NATIVE_QUERY);
		createEAttribute(xmlNamedNativeQueryEClass, XML_NAMED_NATIVE_QUERY__RESULT_CLASS);
		createEAttribute(xmlNamedNativeQueryEClass, XML_NAMED_NATIVE_QUERY__RESULT_SET_MAPPING);

		xmlNamedQueryEClass = createEClass(XML_NAMED_QUERY);

		postLoadEClass = createEClass(POST_LOAD);

		postPersistEClass = createEClass(POST_PERSIST);

		postRemoveEClass = createEClass(POST_REMOVE);

		postUpdateEClass = createEClass(POST_UPDATE);

		prePersistEClass = createEClass(PRE_PERSIST);

		preRemoveEClass = createEClass(PRE_REMOVE);

		preUpdateEClass = createEClass(PRE_UPDATE);

		xmlPrimaryKeyJoinColumnEClass = createEClass(XML_PRIMARY_KEY_JOIN_COLUMN);
		createEAttribute(xmlPrimaryKeyJoinColumnEClass, XML_PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME);

		xmlQueryHintEClass = createEClass(XML_QUERY_HINT);
		createEAttribute(xmlQueryHintEClass, XML_QUERY_HINT__NAME);
		createEAttribute(xmlQueryHintEClass, XML_QUERY_HINT__VALUE);

		xmlBaseTableEClass = createEClass(XML_BASE_TABLE);
		createEAttribute(xmlBaseTableEClass, XML_BASE_TABLE__NAME);
		createEAttribute(xmlBaseTableEClass, XML_BASE_TABLE__CATALOG);
		createEAttribute(xmlBaseTableEClass, XML_BASE_TABLE__SCHEMA);
		createEReference(xmlBaseTableEClass, XML_BASE_TABLE__UNIQUE_CONSTRAINTS);

		xmlTableEClass = createEClass(XML_TABLE);

		xmlSecondaryTableEClass = createEClass(XML_SECONDARY_TABLE);
		createEReference(xmlSecondaryTableEClass, XML_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS);

		xmlGeneratorEClass = createEClass(XML_GENERATOR);
		createEAttribute(xmlGeneratorEClass, XML_GENERATOR__NAME);
		createEAttribute(xmlGeneratorEClass, XML_GENERATOR__INITIAL_VALUE);
		createEAttribute(xmlGeneratorEClass, XML_GENERATOR__ALLOCATION_SIZE);

		xmlSequenceGeneratorEClass = createEClass(XML_SEQUENCE_GENERATOR);
		createEAttribute(xmlSequenceGeneratorEClass, XML_SEQUENCE_GENERATOR__SEQUENCE_NAME);

		sqlResultSetMappingEClass = createEClass(SQL_RESULT_SET_MAPPING);
		createEAttribute(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__NAME);
		createEReference(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__ENTITY_RESULTS);
		createEReference(sqlResultSetMappingEClass, SQL_RESULT_SET_MAPPING__COLUMN_RESULTS);

		xmlTableGeneratorEClass = createEClass(XML_TABLE_GENERATOR);
		createEAttribute(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__TABLE);
		createEAttribute(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__CATALOG);
		createEAttribute(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__SCHEMA);
		createEAttribute(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__PK_COLUMN_NAME);
		createEAttribute(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__VALUE_COLUMN_NAME);
		createEAttribute(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__PK_COLUMN_VALUE);
		createEReference(xmlTableGeneratorEClass, XML_TABLE_GENERATOR__UNIQUE_CONSTRAINTS);

		xmlUniqueConstraintEClass = createEClass(XML_UNIQUE_CONSTRAINT);
		createEAttribute(xmlUniqueConstraintEClass, XML_UNIQUE_CONSTRAINT__COLUMN_NAMES);

		// Create enums
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		discriminatorTypeEEnum = createEEnum(DISCRIMINATOR_TYPE);
		enumTypeEEnum = createEEnum(ENUM_TYPE);
		fetchTypeEEnum = createEEnum(FETCH_TYPE);
		generationTypeEEnum = createEEnum(GENERATION_TYPE);
		inheritanceTypeEEnum = createEEnum(INHERITANCE_TYPE);
		temporalTypeEEnum = createEEnum(TEMPORAL_TYPE);

		// Create data types
		discriminatorValueEDataType = createEDataType(DISCRIMINATOR_VALUE);
		enumeratedEDataType = createEDataType(ENUMERATED);
		orderByEDataType = createEDataType(ORDER_BY);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlEntityMappingsEClass.getESuperTypes().add(this.getXmlQueryContainer());
		abstractXmlTypeMappingEClass.getESuperTypes().add(this.getXmlTypeMapping());
		xmlMappedSuperclassEClass.getESuperTypes().add(this.getAbstractXmlTypeMapping());
		xmlEntityEClass.getESuperTypes().add(this.getAbstractXmlTypeMapping());
		xmlEntityEClass.getESuperTypes().add(this.getXmlQueryContainer());
		xmlEntityEClass.getESuperTypes().add(this.getXmlGeneratorContainer());
		xmlEmbeddableEClass.getESuperTypes().add(this.getAbstractXmlTypeMapping());
		abstractXmlAttributeMappingEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlNullAttributeMappingEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlRelationshipMappingEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlMappedByMappingEClass.getESuperTypes().add(this.getXmlRelationshipMapping());
		xmlJoinColumnsMappingEClass.getESuperTypes().add(this.getXmlRelationshipMapping());
		xmlJoinTableMappingEClass.getESuperTypes().add(this.getXmlRelationshipMapping());
		xmlMultiRelationshipMappingEClass.getESuperTypes().add(this.getXmlMappedByMapping());
		xmlMultiRelationshipMappingEClass.getESuperTypes().add(this.getXmlJoinTableMapping());
		xmlSingleRelationshipMappingEClass.getESuperTypes().add(this.getXmlRelationshipMapping());
		xmlSingleRelationshipMappingEClass.getESuperTypes().add(this.getXmlJoinTableMapping());
		xmlSingleRelationshipMappingEClass.getESuperTypes().add(this.getXmlJoinColumnsMapping());
		xmlIdEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlIdEClass.getESuperTypes().add(this.getColumnMapping());
		xmlIdEClass.getESuperTypes().add(this.getXmlConvertibleMapping());
		xmlIdEClass.getESuperTypes().add(this.getXmlGeneratorContainer());
		xmlIdImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlIdImplEClass.getESuperTypes().add(this.getXmlId());
		baseXmlEmbeddedEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlEmbeddedIdEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlEmbeddedIdEClass.getESuperTypes().add(this.getBaseXmlEmbedded());
		xmlEmbeddedIdImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlEmbeddedIdImplEClass.getESuperTypes().add(this.getXmlEmbeddedId());
		xmlEmbeddedEClass.getESuperTypes().add(this.getBaseXmlEmbedded());
		xmlEmbeddedImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlEmbeddedImplEClass.getESuperTypes().add(this.getXmlEmbedded());
		xmlBasicEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlBasicEClass.getESuperTypes().add(this.getColumnMapping());
		xmlBasicEClass.getESuperTypes().add(this.getXmlConvertibleMapping());
		xmlBasicImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlBasicImplEClass.getESuperTypes().add(this.getXmlBasic());
		xmlVersionEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlVersionEClass.getESuperTypes().add(this.getColumnMapping());
		xmlVersionEClass.getESuperTypes().add(this.getXmlConvertibleMapping());
		xmlVersionImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlVersionImplEClass.getESuperTypes().add(this.getXmlVersion());
		xmlManyToOneEClass.getESuperTypes().add(this.getXmlSingleRelationshipMapping());
		xmlManyToOneImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlManyToOneImplEClass.getESuperTypes().add(this.getXmlManyToOne());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlMultiRelationshipMapping());
		xmlOneToManyEClass.getESuperTypes().add(this.getXmlJoinColumnsMapping());
		xmlOneToManyImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlOneToManyImplEClass.getESuperTypes().add(this.getXmlOneToMany());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlSingleRelationshipMapping());
		xmlOneToOneEClass.getESuperTypes().add(this.getXmlMappedByMapping());
		xmlOneToOneImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlOneToOneImplEClass.getESuperTypes().add(this.getXmlOneToOne());
		xmlManyToManyEClass.getESuperTypes().add(this.getXmlMultiRelationshipMapping());
		xmlManyToManyImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlManyToManyImplEClass.getESuperTypes().add(this.getXmlManyToMany());
		xmlTransientEClass.getESuperTypes().add(this.getXmlAttributeMapping());
		xmlTransientImplEClass.getESuperTypes().add(this.getAbstractXmlAttributeMapping());
		xmlTransientImplEClass.getESuperTypes().add(this.getXmlTransient());
		xmlAbstractColumnEClass.getESuperTypes().add(this.getXmlNamedColumn());
		xmlColumnEClass.getESuperTypes().add(this.getXmlAbstractColumn());
		xmlDiscriminatorColumnEClass.getESuperTypes().add(this.getXmlNamedColumn());
		xmlJoinColumnEClass.getESuperTypes().add(this.getXmlAbstractColumn());
		xmlJoinTableEClass.getESuperTypes().add(this.getXmlBaseTable());
		xmlNamedNativeQueryEClass.getESuperTypes().add(this.getXmlQuery());
		xmlNamedQueryEClass.getESuperTypes().add(this.getXmlQuery());
		postLoadEClass.getESuperTypes().add(this.getEventMethod());
		postPersistEClass.getESuperTypes().add(this.getEventMethod());
		postRemoveEClass.getESuperTypes().add(this.getEventMethod());
		postUpdateEClass.getESuperTypes().add(this.getEventMethod());
		prePersistEClass.getESuperTypes().add(this.getEventMethod());
		preRemoveEClass.getESuperTypes().add(this.getEventMethod());
		preUpdateEClass.getESuperTypes().add(this.getEventMethod());
		xmlPrimaryKeyJoinColumnEClass.getESuperTypes().add(this.getXmlNamedColumn());
		xmlTableEClass.getESuperTypes().add(this.getXmlBaseTable());
		xmlSecondaryTableEClass.getESuperTypes().add(this.getXmlBaseTable());
		xmlSequenceGeneratorEClass.getESuperTypes().add(this.getXmlGenerator());
		xmlTableGeneratorEClass.getESuperTypes().add(this.getXmlGenerator());

		// Initialize classes and features; add operations and parameters
		initEClass(xmlEntityMappingsEClass, XmlEntityMappings.class, "XmlEntityMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlEntityMappings_Version(), this.getVersionType(), "version", "1.0", 1, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntityMappings_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_PersistenceUnitMetadata(), this.getXmlPersistenceUnitMetadata(), null, "persistenceUnitMetadata", null, 0, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntityMappings_Package(), theXMLTypePackage.getString(), "package", null, 0, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntityMappings_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntityMappings_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntityMappings_Access(), this.getAccessType(), "access", "PROPERTY", 0, 1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_SequenceGenerators(), this.getXmlSequenceGenerator(), null, "sequenceGenerators", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_TableGenerators(), this.getXmlTableGenerator(), null, "tableGenerators", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_SqlResultSetMappings(), this.getSqlResultSetMapping(), null, "sqlResultSetMappings", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_MappedSuperclasses(), this.getXmlMappedSuperclass(), null, "mappedSuperclasses", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_Entities(), this.getXmlEntity(), null, "entities", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntityMappings_Embeddables(), this.getXmlEmbeddable(), null, "embeddables", null, 0, -1, XmlEntityMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlPersistenceUnitMetadataEClass, XmlPersistenceUnitMetadata.class, "XmlPersistenceUnitMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPersistenceUnitMetadata_XmlMappingMetadataComplete(), theXMLTypePackage.getBoolean(), "xmlMappingMetadataComplete", null, 0, 1, XmlPersistenceUnitMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPersistenceUnitMetadata_PersistenceUnitDefaults(), this.getXmlPersistenceUnitDefaults(), null, "persistenceUnitDefaults", null, 0, 1, XmlPersistenceUnitMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlPersistenceUnitDefaultsEClass, XmlPersistenceUnitDefaults.class, "XmlPersistenceUnitDefaults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPersistenceUnitDefaults_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, XmlPersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlPersistenceUnitDefaults_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, XmlPersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlPersistenceUnitDefaults_Access(), this.getAccessType(), "access", "PROPERTY", 0, 1, XmlPersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlPersistenceUnitDefaults_CascadePersist(), theXMLTypePackage.getBoolean(), "cascadePersist", null, 0, 1, XmlPersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPersistenceUnitDefaults_EntityListeners(), this.getEntityListeners(), null, "entityListeners", null, 0, 1, XmlPersistenceUnitDefaults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTypeMappingEClass, XmlTypeMapping.class, "XmlTypeMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlTypeMapping_ClassName(), theXMLTypePackage.getString(), "className", null, 1, 1, XmlTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTypeMapping_Access(), this.getAccessType(), "access", "PROPERTY", 0, 1, XmlTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTypeMapping_MetadataComplete(), theXMLTypePackage.getBooleanObject(), "metadataComplete", null, 0, 1, XmlTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTypeMapping_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, XmlTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlTypeMapping_Attributes(), this.getAttributes(), null, "attributes", null, 0, 1, XmlTypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractXmlTypeMappingEClass, AbstractXmlTypeMapping.class, "AbstractXmlTypeMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlMappedSuperclassEClass, XmlMappedSuperclass.class, "XmlMappedSuperclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlMappedSuperclass_IdClass(), this.getXmlIdClass(), null, "idClass", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlMappedSuperclass_ExcludeDefaultListeners(), theXMLTypePackage.getBoolean(), "excludeDefaultListeners", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlMappedSuperclass_ExcludeSuperclassListeners(), theXMLTypePackage.getBoolean(), "excludeSuperclassListeners", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_EntityListeners(), this.getEntityListeners(), null, "entityListeners", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PrePersist(), this.getPrePersist(), null, "prePersist", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PostPersist(), this.getPostPersist(), null, "postPersist", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PreRemove(), this.getPreRemove(), null, "preRemove", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PostRemove(), this.getPostRemove(), null, "postRemove", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PreUpdate(), this.getPreUpdate(), null, "preUpdate", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PostUpdate(), this.getPostUpdate(), null, "postUpdate", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMappedSuperclass_PostLoad(), this.getPostLoad(), null, "postLoad", null, 0, 1, XmlMappedSuperclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEntityEClass, XmlEntity.class, "XmlEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlEntity_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_Table(), this.getXmlTable(), null, "table", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_SecondaryTables(), this.getXmlSecondaryTable(), null, "secondaryTables", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PrimaryKeyJoinColumns(), this.getXmlPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumns", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_IdClass(), this.getXmlIdClass(), null, "idClass", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_Inheritance(), this.getInheritance(), null, "inheritance", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntity_DiscriminatorValue(), this.getDiscriminatorValue(), "discriminatorValue", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_DiscriminatorColumn(), this.getXmlDiscriminatorColumn(), null, "discriminatorColumn", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_SqlResultSetMappings(), this.getSqlResultSetMapping(), null, "sqlResultSetMappings", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntity_ExcludeDefaultListeners(), theXMLTypePackage.getBoolean(), "excludeDefaultListeners", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlEntity_ExcludeSuperclassListeners(), theXMLTypePackage.getBoolean(), "excludeSuperclassListeners", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_EntityListeners(), this.getEntityListeners(), null, "entityListeners", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PrePersist(), this.getPrePersist(), null, "prePersist", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PostPersist(), this.getPostPersist(), null, "postPersist", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PreRemove(), this.getPreRemove(), null, "preRemove", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PostRemove(), this.getPostRemove(), null, "postRemove", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PreUpdate(), this.getPreUpdate(), null, "preUpdate", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PostUpdate(), this.getPostUpdate(), null, "postUpdate", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_PostLoad(), this.getPostLoad(), null, "postLoad", null, 0, 1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_AttributeOverrides(), this.getXmlAttributeOverride(), null, "attributeOverrides", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlEntity_AssociationOverrides(), this.getXmlAssociationOverride(), null, "associationOverrides", null, 0, -1, XmlEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEmbeddableEClass, XmlEmbeddable.class, "XmlEmbeddable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlQueryContainerEClass, XmlQueryContainer.class, "XmlQueryContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlQueryContainer_NamedQueries(), this.getXmlNamedQuery(), null, "namedQueries", null, 0, -1, XmlQueryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlQueryContainer_NamedNativeQueries(), this.getXmlNamedNativeQuery(), null, "namedNativeQueries", null, 0, -1, XmlQueryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlGeneratorContainerEClass, XmlGeneratorContainer.class, "XmlGeneratorContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlGeneratorContainer_SequenceGenerator(), this.getXmlSequenceGenerator(), null, "sequenceGenerator", null, 0, 1, XmlGeneratorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlGeneratorContainer_TableGenerator(), this.getXmlTableGenerator(), null, "tableGenerator", null, 0, 1, XmlGeneratorContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributes_Ids(), this.getXmlId(), null, "ids", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_EmbeddedIds(), this.getXmlEmbeddedId(), null, "embeddedIds", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Basics(), this.getXmlBasic(), null, "basics", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Versions(), this.getXmlVersion(), null, "versions", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_ManyToOnes(), this.getXmlManyToOne(), null, "manyToOnes", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_OneToManys(), this.getXmlOneToMany(), null, "oneToManys", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_OneToOnes(), this.getXmlOneToOne(), null, "oneToOnes", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_ManyToManys(), this.getXmlManyToMany(), null, "manyToManys", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Embeddeds(), this.getXmlEmbedded(), null, "embeddeds", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributes_Transients(), this.getXmlTransient(), null, "transients", null, 0, -1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttributeMappingEClass, XmlAttributeMapping.class, "XmlAttributeMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlAttributeMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, XmlAttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractXmlAttributeMappingEClass, AbstractXmlAttributeMapping.class, "AbstractXmlAttributeMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlNullAttributeMappingEClass, XmlNullAttributeMapping.class, "XmlNullAttributeMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnMappingEClass, ColumnMapping.class, "ColumnMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnMapping_Column(), this.getXmlColumn(), null, "column", null, 0, 1, ColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlRelationshipMappingEClass, XmlRelationshipMapping.class, "XmlRelationshipMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlRelationshipMapping_TargetEntity(), theXMLTypePackage.getString(), "targetEntity", null, 0, 1, XmlRelationshipMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlRelationshipMapping_Fetch(), this.getFetchType(), "fetch", "LAZY", 0, 1, XmlRelationshipMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlRelationshipMapping_Cascade(), this.getCascadeType(), null, "cascade", null, 0, 1, XmlRelationshipMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlMappedByMappingEClass, XmlMappedByMapping.class, "XmlMappedByMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlMappedByMapping_MappedBy(), theXMLTypePackage.getString(), "mappedBy", null, 0, 1, XmlMappedByMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlJoinColumnsMappingEClass, XmlJoinColumnsMapping.class, "XmlJoinColumnsMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlJoinColumnsMapping_JoinColumns(), this.getXmlJoinColumn(), null, "joinColumns", null, 0, -1, XmlJoinColumnsMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlJoinTableMappingEClass, XmlJoinTableMapping.class, "XmlJoinTableMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlJoinTableMapping_JoinTable(), this.getXmlJoinTable(), null, "joinTable", null, 0, 1, XmlJoinTableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlMultiRelationshipMappingEClass, XmlMultiRelationshipMapping.class, "XmlMultiRelationshipMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlMultiRelationshipMapping_OrderBy(), this.getOrderBy(), "orderBy", null, 0, 1, XmlMultiRelationshipMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlMultiRelationshipMapping_MapKey(), this.getMapKey(), null, "mapKey", null, 0, 1, XmlMultiRelationshipMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlSingleRelationshipMappingEClass, XmlSingleRelationshipMapping.class, "XmlSingleRelationshipMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlSingleRelationshipMapping_Optional(), theXMLTypePackage.getBooleanObject(), "optional", null, 0, 1, XmlSingleRelationshipMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlIdEClass, XmlId.class, "XmlId", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlId_GeneratedValue(), this.getXmlGeneratedValue(), null, "generatedValue", null, 0, 1, XmlId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlIdImplEClass, XmlIdImpl.class, "XmlIdImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseXmlEmbeddedEClass, BaseXmlEmbedded.class, "BaseXmlEmbedded", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseXmlEmbedded_AttributeOverrides(), this.getXmlAttributeOverride(), null, "attributeOverrides", null, 0, -1, BaseXmlEmbedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEmbeddedIdEClass, XmlEmbeddedId.class, "XmlEmbeddedId", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEmbeddedIdImplEClass, XmlEmbeddedIdImpl.class, "XmlEmbeddedIdImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEmbeddedEClass, XmlEmbedded.class, "XmlEmbedded", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEmbeddedImplEClass, XmlEmbeddedImpl.class, "XmlEmbeddedImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlConvertibleMappingEClass, XmlConvertibleMapping.class, "XmlConvertibleMapping", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlConvertibleMapping_Lob(), theXMLTypePackage.getBoolean(), "lob", null, 0, 1, XmlConvertibleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlConvertibleMapping_Temporal(), this.getTemporalType(), "temporal", null, 0, 1, XmlConvertibleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlConvertibleMapping_Enumerated(), this.getEnumType(), "enumerated", null, 0, 1, XmlConvertibleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlBasicEClass, XmlBasic.class, "XmlBasic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlBasic_Fetch(), this.getFetchType(), "fetch", "LAZY", 0, 1, XmlBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlBasic_Optional(), theXMLTypePackage.getBooleanObject(), "optional", null, 0, 1, XmlBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlBasicImplEClass, XmlBasicImpl.class, "XmlBasicImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlVersionEClass, XmlVersion.class, "XmlVersion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlVersionImplEClass, XmlVersionImpl.class, "XmlVersionImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToOneEClass, XmlManyToOne.class, "XmlManyToOne", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToOneImplEClass, XmlManyToOneImpl.class, "XmlManyToOneImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlOneToManyEClass, XmlOneToMany.class, "XmlOneToMany", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlOneToManyImplEClass, XmlOneToManyImpl.class, "XmlOneToManyImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlOneToOneEClass, XmlOneToOne.class, "XmlOneToOne", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlOneToOne_PrimaryKeyJoinColumns(), this.getXmlPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumns", null, 0, -1, XmlOneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlOneToOneImplEClass, XmlOneToOneImpl.class, "XmlOneToOneImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToManyEClass, XmlManyToMany.class, "XmlManyToMany", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlManyToManyImplEClass, XmlManyToManyImpl.class, "XmlManyToManyImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlTransientEClass, XmlTransient.class, "XmlTransient", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlTransientImplEClass, XmlTransientImpl.class, "XmlTransientImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlAssociationOverrideEClass, XmlAssociationOverride.class, "XmlAssociationOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlAssociationOverride_JoinColumns(), this.getXmlJoinColumn(), null, "joinColumns", null, 1, -1, XmlAssociationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAssociationOverride_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, XmlAssociationOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttributeOverrideEClass, XmlAttributeOverride.class, "XmlAttributeOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlAttributeOverride_Column(), this.getXmlColumn(), null, "column", null, 1, 1, XmlAttributeOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAttributeOverride_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, XmlAttributeOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cascadeTypeEClass, CascadeType.class, "CascadeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCascadeType_CascadeAll(), theXMLTypePackage.getBoolean(), "cascadeAll", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeType_CascadePersist(), theXMLTypePackage.getBoolean(), "cascadePersist", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeType_CascadeMerge(), theXMLTypePackage.getBoolean(), "cascadeMerge", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeType_CascadeRemove(), theXMLTypePackage.getBoolean(), "cascadeRemove", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeType_CascadeRefresh(), theXMLTypePackage.getBoolean(), "cascadeRefresh", null, 0, 1, CascadeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlNamedColumnEClass, XmlNamedColumn.class, "XmlNamedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlNamedColumn_ColumnDefinition(), theXMLTypePackage.getString(), "columnDefinition", null, 0, 1, XmlNamedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNamedColumn_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, XmlNamedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAbstractColumnEClass, XmlAbstractColumn.class, "XmlAbstractColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlAbstractColumn_Insertable(), theXMLTypePackage.getBooleanObject(), "insertable", null, 0, 1, XmlAbstractColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAbstractColumn_Nullable(), theXMLTypePackage.getBooleanObject(), "nullable", null, 0, 1, XmlAbstractColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAbstractColumn_Table(), theXMLTypePackage.getString(), "table", null, 0, 1, XmlAbstractColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAbstractColumn_Unique(), theXMLTypePackage.getBooleanObject(), "unique", null, 0, 1, XmlAbstractColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAbstractColumn_Updatable(), theXMLTypePackage.getBooleanObject(), "updatable", null, 0, 1, XmlAbstractColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlColumnEClass, XmlColumn.class, "XmlColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlColumn_Length(), theXMLTypePackage.getIntObject(), "length", null, 0, 1, XmlColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlColumn_Precision(), theXMLTypePackage.getIntObject(), "precision", null, 0, 1, XmlColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlColumn_Scale(), theXMLTypePackage.getIntObject(), "scale", null, 0, 1, XmlColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnResultEClass, ColumnResult.class, "ColumnResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnResult_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ColumnResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlDiscriminatorColumnEClass, XmlDiscriminatorColumn.class, "XmlDiscriminatorColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlDiscriminatorColumn_DiscriminatorType(), this.getDiscriminatorType(), "discriminatorType", "STRING", 0, 1, XmlDiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDiscriminatorColumn_Length(), theXMLTypePackage.getIntObject(), "length", null, 0, 1, XmlDiscriminatorColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityListenersEClass, EntityListeners.class, "EntityListeners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityListeners_EntityListeners(), this.getEntityListener(), null, "entityListeners", null, 0, -1, EntityListeners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityListenerEClass, EntityListener.class, "EntityListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityListener_ClassName(), theXMLTypePackage.getString(), "className", null, 1, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PrePersist(), this.getPrePersist(), null, "prePersist", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostPersist(), this.getPostPersist(), null, "postPersist", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PreRemove(), this.getPreRemove(), null, "preRemove", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostRemove(), this.getPostRemove(), null, "postRemove", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PreUpdate(), this.getPreUpdate(), null, "preUpdate", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostUpdate(), this.getPostUpdate(), null, "postUpdate", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityListener_PostLoad(), this.getPostLoad(), null, "postLoad", null, 0, 1, EntityListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityResultEClass, EntityResult.class, "EntityResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityResult_DiscriminatorColumn(), theXMLTypePackage.getString(), "discriminatorColumn", null, 0, 1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityResult_EntityClass(), theXMLTypePackage.getString(), "entityClass", null, 1, 1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityResult_FieldResults(), this.getFieldResult(), null, "fieldResults", null, 0, -1, EntityResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventMethodEClass, EventMethod.class, "EventMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventMethod_MethodName(), theXMLTypePackage.getString(), "methodName", null, 1, 1, EventMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldResultEClass, FieldResult.class, "FieldResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldResult_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FieldResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldResult_Column(), theXMLTypePackage.getString(), "column", null, 1, 1, FieldResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlGeneratedValueEClass, XmlGeneratedValue.class, "XmlGeneratedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlGeneratedValue_Generator(), theXMLTypePackage.getString(), "generator", null, 0, 1, XmlGeneratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlGeneratedValue_Strategy(), this.getGenerationType(), "strategy", "TABLE", 0, 1, XmlGeneratedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlIdClassEClass, XmlIdClass.class, "XmlIdClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlIdClass_ClassName(), theXMLTypePackage.getString(), "className", null, 1, 1, XmlIdClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInheritance_Strategy(), this.getInheritanceType(), "strategy", "SINGLE_TABLE", 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlJoinColumnEClass, XmlJoinColumn.class, "XmlJoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlJoinColumn_ReferencedColumnName(), theXMLTypePackage.getString(), "referencedColumnName", null, 0, 1, XmlJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlJoinTableEClass, XmlJoinTable.class, "XmlJoinTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlJoinTable_JoinColumns(), this.getXmlJoinColumn(), null, "joinColumns", null, 0, -1, XmlJoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlJoinTable_InverseJoinColumns(), this.getXmlJoinColumn(), null, "inverseJoinColumns", null, 0, -1, XmlJoinTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lobEClass, Lob.class, "Lob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapKeyEClass, MapKey.class, "MapKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapKey_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MapKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlQueryEClass, XmlQuery.class, "XmlQuery", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlQuery_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, XmlQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlQuery_Query(), theXMLTypePackage.getString(), "query", null, 1, 1, XmlQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlQuery_Hints(), this.getXmlQueryHint(), null, "hints", null, 0, -1, XmlQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlNamedNativeQueryEClass, XmlNamedNativeQuery.class, "XmlNamedNativeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlNamedNativeQuery_ResultClass(), theXMLTypePackage.getString(), "resultClass", null, 0, 1, XmlNamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNamedNativeQuery_ResultSetMapping(), theXMLTypePackage.getString(), "resultSetMapping", null, 0, 1, XmlNamedNativeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlNamedQueryEClass, XmlNamedQuery.class, "XmlNamedQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postLoadEClass, PostLoad.class, "PostLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postPersistEClass, PostPersist.class, "PostPersist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postRemoveEClass, PostRemove.class, "PostRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postUpdateEClass, PostUpdate.class, "PostUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prePersistEClass, PrePersist.class, "PrePersist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preRemoveEClass, PreRemove.class, "PreRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preUpdateEClass, PreUpdate.class, "PreUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlPrimaryKeyJoinColumnEClass, XmlPrimaryKeyJoinColumn.class, "XmlPrimaryKeyJoinColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPrimaryKeyJoinColumn_ReferencedColumnName(), theXMLTypePackage.getString(), "referencedColumnName", null, 0, 1, XmlPrimaryKeyJoinColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlQueryHintEClass, XmlQueryHint.class, "XmlQueryHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlQueryHint_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, XmlQueryHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlQueryHint_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, XmlQueryHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlBaseTableEClass, XmlBaseTable.class, "XmlBaseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlBaseTable_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, XmlBaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlBaseTable_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, XmlBaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlBaseTable_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, XmlBaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlBaseTable_UniqueConstraints(), this.getXmlUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, XmlBaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTableEClass, XmlTable.class, "XmlTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlSecondaryTableEClass, XmlSecondaryTable.class, "XmlSecondaryTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlSecondaryTable_PrimaryKeyJoinColumns(), this.getXmlPrimaryKeyJoinColumn(), null, "primaryKeyJoinColumns", null, 0, -1, XmlSecondaryTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlGeneratorEClass, XmlGenerator.class, "XmlGenerator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlGenerator_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, XmlGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlGenerator_InitialValue(), theXMLTypePackage.getIntObject(), "initialValue", null, 0, 1, XmlGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlGenerator_AllocationSize(), theXMLTypePackage.getIntObject(), "allocationSize", null, 0, 1, XmlGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlSequenceGeneratorEClass, XmlSequenceGenerator.class, "XmlSequenceGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlSequenceGenerator_SequenceName(), theXMLTypePackage.getString(), "sequenceName", null, 0, 1, XmlSequenceGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlResultSetMappingEClass, SqlResultSetMapping.class, "SqlResultSetMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlResultSetMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlResultSetMapping_EntityResults(), this.getEntityResult(), null, "entityResults", null, 0, -1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlResultSetMapping_ColumnResults(), this.getColumnResult(), null, "columnResults", null, 0, -1, SqlResultSetMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTableGeneratorEClass, XmlTableGenerator.class, "XmlTableGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlTableGenerator_Table(), theXMLTypePackage.getString(), "table", null, 0, 1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTableGenerator_Catalog(), theXMLTypePackage.getString(), "catalog", null, 0, 1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTableGenerator_Schema(), theXMLTypePackage.getString(), "schema", null, 0, 1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTableGenerator_PkColumnName(), theXMLTypePackage.getString(), "pkColumnName", null, 0, 1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTableGenerator_ValueColumnName(), theXMLTypePackage.getString(), "valueColumnName", null, 0, 1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTableGenerator_PkColumnValue(), theXMLTypePackage.getString(), "pkColumnValue", null, 0, 1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlTableGenerator_UniqueConstraints(), this.getXmlUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, XmlTableGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlUniqueConstraintEClass, XmlUniqueConstraint.class, "XmlUniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlUniqueConstraint_ColumnNames(), theXMLTypePackage.getString(), "columnNames", null, 1, -1, XmlUniqueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.PROPERTY);
		addEEnumLiteral(accessTypeEEnum, AccessType.FIELD);

		initEEnum(discriminatorTypeEEnum, DiscriminatorType.class, "DiscriminatorType");
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.STRING);
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.CHAR);
		addEEnumLiteral(discriminatorTypeEEnum, DiscriminatorType.INTEGER);

		initEEnum(enumTypeEEnum, EnumType.class, "EnumType");
		addEEnumLiteral(enumTypeEEnum, EnumType.ORDINAL);
		addEEnumLiteral(enumTypeEEnum, EnumType.STRING);

		initEEnum(fetchTypeEEnum, FetchType.class, "FetchType");
		addEEnumLiteral(fetchTypeEEnum, FetchType.LAZY);
		addEEnumLiteral(fetchTypeEEnum, FetchType.EAGER);

		initEEnum(generationTypeEEnum, GenerationType.class, "GenerationType");
		addEEnumLiteral(generationTypeEEnum, GenerationType.TABLE);
		addEEnumLiteral(generationTypeEEnum, GenerationType.SEQUENCE);
		addEEnumLiteral(generationTypeEEnum, GenerationType.IDENTITY);
		addEEnumLiteral(generationTypeEEnum, GenerationType.AUTO);

		initEEnum(inheritanceTypeEEnum, InheritanceType.class, "InheritanceType");
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.SINGLE_TABLE);
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.JOINED);
		addEEnumLiteral(inheritanceTypeEEnum, InheritanceType.TABLE_PER_CLASS);

		initEEnum(temporalTypeEEnum, TemporalType.class, "TemporalType");
		addEEnumLiteral(temporalTypeEEnum, TemporalType.DATE);
		addEEnumLiteral(temporalTypeEEnum, TemporalType.TIME);
		addEEnumLiteral(temporalTypeEEnum, TemporalType.TIMESTAMP);

		// Initialize data types
		initEDataType(discriminatorValueEDataType, String.class, "DiscriminatorValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumeratedEDataType, Enumerator.class, "Enumerated", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderByEDataType, String.class, "OrderBy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEntityMappings <em>Xml Entity Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEntityMappings
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEntityMappings()
		 * @generated
		 */
		public static final EClass XML_ENTITY_MAPPINGS = eINSTANCE.getXmlEntityMappings();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY_MAPPINGS__VERSION = eINSTANCE.getXmlEntityMappings_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY_MAPPINGS__DESCRIPTION = eINSTANCE.getXmlEntityMappings_Description();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__PERSISTENCE_UNIT_METADATA = eINSTANCE.getXmlEntityMappings_PersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY_MAPPINGS__PACKAGE = eINSTANCE.getXmlEntityMappings_Package();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY_MAPPINGS__SCHEMA = eINSTANCE.getXmlEntityMappings_Schema();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY_MAPPINGS__CATALOG = eINSTANCE.getXmlEntityMappings_Catalog();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY_MAPPINGS__ACCESS = eINSTANCE.getXmlEntityMappings_Access();

		/**
		 * The meta object literal for the '<em><b>Sequence Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__SEQUENCE_GENERATORS = eINSTANCE.getXmlEntityMappings_SequenceGenerators();

		/**
		 * The meta object literal for the '<em><b>Table Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__TABLE_GENERATORS = eINSTANCE.getXmlEntityMappings_TableGenerators();

		/**
		 * The meta object literal for the '<em><b>Sql Result Set Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__SQL_RESULT_SET_MAPPINGS = eINSTANCE.getXmlEntityMappings_SqlResultSetMappings();

		/**
		 * The meta object literal for the '<em><b>Mapped Superclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__MAPPED_SUPERCLASSES = eINSTANCE.getXmlEntityMappings_MappedSuperclasses();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__ENTITIES = eINSTANCE.getXmlEntityMappings_Entities();

		/**
		 * The meta object literal for the '<em><b>Embeddables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY_MAPPINGS__EMBEDDABLES = eINSTANCE.getXmlEntityMappings_Embeddables();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata <em>Xml Persistence Unit Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitMetadata
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlPersistenceUnitMetadata()
		 * @generated
		 */
		public static final EClass XML_PERSISTENCE_UNIT_METADATA = eINSTANCE.getXmlPersistenceUnitMetadata();

		/**
		 * The meta object literal for the '<em><b>Xml Mapping Metadata Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = eINSTANCE.getXmlPersistenceUnitMetadata_XmlMappingMetadataComplete();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = eINSTANCE.getXmlPersistenceUnitMetadata_PersistenceUnitDefaults();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults <em>Xml Persistence Unit Defaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlPersistenceUnitDefaults
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlPersistenceUnitDefaults()
		 * @generated
		 */
		public static final EClass XML_PERSISTENCE_UNIT_DEFAULTS = eINSTANCE.getXmlPersistenceUnitDefaults();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PERSISTENCE_UNIT_DEFAULTS__SCHEMA = eINSTANCE.getXmlPersistenceUnitDefaults_Schema();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PERSISTENCE_UNIT_DEFAULTS__CATALOG = eINSTANCE.getXmlPersistenceUnitDefaults_Catalog();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PERSISTENCE_UNIT_DEFAULTS__ACCESS = eINSTANCE.getXmlPersistenceUnitDefaults_Access();

		/**
		 * The meta object literal for the '<em><b>Cascade Persist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = eINSTANCE.getXmlPersistenceUnitDefaults_CascadePersist();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = eINSTANCE.getXmlPersistenceUnitDefaults_EntityListeners();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlTypeMapping <em>Xml Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlTypeMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTypeMapping()
		 * @generated
		 */
		public static final EClass XML_TYPE_MAPPING = eINSTANCE.getXmlTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TYPE_MAPPING__CLASS_NAME = eINSTANCE.getXmlTypeMapping_ClassName();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TYPE_MAPPING__ACCESS = eINSTANCE.getXmlTypeMapping_Access();

		/**
		 * The meta object literal for the '<em><b>Metadata Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TYPE_MAPPING__METADATA_COMPLETE = eINSTANCE.getXmlTypeMapping_MetadataComplete();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TYPE_MAPPING__DESCRIPTION = eINSTANCE.getXmlTypeMapping_Description();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_TYPE_MAPPING__ATTRIBUTES = eINSTANCE.getXmlTypeMapping_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping <em>Abstract Xml Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.AbstractXmlTypeMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAbstractXmlTypeMapping()
		 * @generated
		 */
		public static final EClass ABSTRACT_XML_TYPE_MAPPING = eINSTANCE.getAbstractXmlTypeMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass <em>Xml Mapped Superclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlMappedSuperclass
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlMappedSuperclass()
		 * @generated
		 */
		public static final EClass XML_MAPPED_SUPERCLASS = eINSTANCE.getXmlMappedSuperclass();

		/**
		 * The meta object literal for the '<em><b>Id Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__ID_CLASS = eINSTANCE.getXmlMappedSuperclass_IdClass();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = eINSTANCE.getXmlMappedSuperclass_ExcludeDefaultListeners();

		/**
		 * The meta object literal for the '<em><b>Exclude Superclass Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = eINSTANCE.getXmlMappedSuperclass_ExcludeSuperclassListeners();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__ENTITY_LISTENERS = eINSTANCE.getXmlMappedSuperclass_EntityListeners();

		/**
		 * The meta object literal for the '<em><b>Pre Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__PRE_PERSIST = eINSTANCE.getXmlMappedSuperclass_PrePersist();

		/**
		 * The meta object literal for the '<em><b>Post Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__POST_PERSIST = eINSTANCE.getXmlMappedSuperclass_PostPersist();

		/**
		 * The meta object literal for the '<em><b>Pre Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__PRE_REMOVE = eINSTANCE.getXmlMappedSuperclass_PreRemove();

		/**
		 * The meta object literal for the '<em><b>Post Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__POST_REMOVE = eINSTANCE.getXmlMappedSuperclass_PostRemove();

		/**
		 * The meta object literal for the '<em><b>Pre Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__PRE_UPDATE = eINSTANCE.getXmlMappedSuperclass_PreUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__POST_UPDATE = eINSTANCE.getXmlMappedSuperclass_PostUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MAPPED_SUPERCLASS__POST_LOAD = eINSTANCE.getXmlMappedSuperclass_PostLoad();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEntity <em>Xml Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEntity
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEntity()
		 * @generated
		 */
		public static final EClass XML_ENTITY = eINSTANCE.getXmlEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY__NAME = eINSTANCE.getXmlEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__TABLE = eINSTANCE.getXmlEntity_Table();

		/**
		 * The meta object literal for the '<em><b>Secondary Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__SECONDARY_TABLES = eINSTANCE.getXmlEntity_SecondaryTables();

		/**
		 * The meta object literal for the '<em><b>Primary Key Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__PRIMARY_KEY_JOIN_COLUMNS = eINSTANCE.getXmlEntity_PrimaryKeyJoinColumns();

		/**
		 * The meta object literal for the '<em><b>Id Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__ID_CLASS = eINSTANCE.getXmlEntity_IdClass();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__INHERITANCE = eINSTANCE.getXmlEntity_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Discriminator Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY__DISCRIMINATOR_VALUE = eINSTANCE.getXmlEntity_DiscriminatorValue();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__DISCRIMINATOR_COLUMN = eINSTANCE.getXmlEntity_DiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Sql Result Set Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__SQL_RESULT_SET_MAPPINGS = eINSTANCE.getXmlEntity_SqlResultSetMappings();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY__EXCLUDE_DEFAULT_LISTENERS = eINSTANCE.getXmlEntity_ExcludeDefaultListeners();

		/**
		 * The meta object literal for the '<em><b>Exclude Superclass Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = eINSTANCE.getXmlEntity_ExcludeSuperclassListeners();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__ENTITY_LISTENERS = eINSTANCE.getXmlEntity_EntityListeners();

		/**
		 * The meta object literal for the '<em><b>Pre Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__PRE_PERSIST = eINSTANCE.getXmlEntity_PrePersist();

		/**
		 * The meta object literal for the '<em><b>Post Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__POST_PERSIST = eINSTANCE.getXmlEntity_PostPersist();

		/**
		 * The meta object literal for the '<em><b>Pre Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__PRE_REMOVE = eINSTANCE.getXmlEntity_PreRemove();

		/**
		 * The meta object literal for the '<em><b>Post Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__POST_REMOVE = eINSTANCE.getXmlEntity_PostRemove();

		/**
		 * The meta object literal for the '<em><b>Pre Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__PRE_UPDATE = eINSTANCE.getXmlEntity_PreUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__POST_UPDATE = eINSTANCE.getXmlEntity_PostUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__POST_LOAD = eINSTANCE.getXmlEntity_PostLoad();

		/**
		 * The meta object literal for the '<em><b>Attribute Overrides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__ATTRIBUTE_OVERRIDES = eINSTANCE.getXmlEntity_AttributeOverrides();

		/**
		 * The meta object literal for the '<em><b>Association Overrides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ENTITY__ASSOCIATION_OVERRIDES = eINSTANCE.getXmlEntity_AssociationOverrides();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddable <em>Xml Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddable
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddable()
		 * @generated
		 */
		public static final EClass XML_EMBEDDABLE = eINSTANCE.getXmlEmbeddable();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlQueryContainer <em>Xml Query Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlQueryContainer
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlQueryContainer()
		 * @generated
		 */
		public static final EClass XML_QUERY_CONTAINER = eINSTANCE.getXmlQueryContainer();

		/**
		 * The meta object literal for the '<em><b>Named Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_QUERY_CONTAINER__NAMED_QUERIES = eINSTANCE.getXmlQueryContainer_NamedQueries();

		/**
		 * The meta object literal for the '<em><b>Named Native Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_QUERY_CONTAINER__NAMED_NATIVE_QUERIES = eINSTANCE.getXmlQueryContainer_NamedNativeQueries();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer <em>Xml Generator Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratorContainer
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlGeneratorContainer()
		 * @generated
		 */
		public static final EClass XML_GENERATOR_CONTAINER = eINSTANCE.getXmlGeneratorContainer();

		/**
		 * The meta object literal for the '<em><b>Sequence Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_GENERATOR_CONTAINER__SEQUENCE_GENERATOR = eINSTANCE.getXmlGeneratorContainer_SequenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Table Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_GENERATOR_CONTAINER__TABLE_GENERATOR = eINSTANCE.getXmlGeneratorContainer_TableGenerator();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.Attributes <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.Attributes
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAttributes()
		 * @generated
		 */
		public static final EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__IDS = eINSTANCE.getAttributes_Ids();

		/**
		 * The meta object literal for the '<em><b>Embedded Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__EMBEDDED_IDS = eINSTANCE.getAttributes_EmbeddedIds();

		/**
		 * The meta object literal for the '<em><b>Basics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__BASICS = eINSTANCE.getAttributes_Basics();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__VERSIONS = eINSTANCE.getAttributes_Versions();

		/**
		 * The meta object literal for the '<em><b>Many To Ones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__MANY_TO_ONES = eINSTANCE.getAttributes_ManyToOnes();

		/**
		 * The meta object literal for the '<em><b>One To Manys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__ONE_TO_MANYS = eINSTANCE.getAttributes_OneToManys();

		/**
		 * The meta object literal for the '<em><b>One To Ones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__ONE_TO_ONES = eINSTANCE.getAttributes_OneToOnes();

		/**
		 * The meta object literal for the '<em><b>Many To Manys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__MANY_TO_MANYS = eINSTANCE.getAttributes_ManyToManys();

		/**
		 * The meta object literal for the '<em><b>Embeddeds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__EMBEDDEDS = eINSTANCE.getAttributes_Embeddeds();

		/**
		 * The meta object literal for the '<em><b>Transients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTES__TRANSIENTS = eINSTANCE.getAttributes_Transients();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeMapping <em>Xml Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAttributeMapping()
		 * @generated
		 */
		public static final EClass XML_ATTRIBUTE_MAPPING = eINSTANCE.getXmlAttributeMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ATTRIBUTE_MAPPING__NAME = eINSTANCE.getXmlAttributeMapping_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.AbstractXmlAttributeMapping <em>Abstract Xml Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.AbstractXmlAttributeMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAbstractXmlAttributeMapping()
		 * @generated
		 */
		public static final EClass ABSTRACT_XML_ATTRIBUTE_MAPPING = eINSTANCE.getAbstractXmlAttributeMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlNullAttributeMapping <em>Xml Null Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlNullAttributeMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNullAttributeMapping()
		 * @generated
		 */
		public static final EClass XML_NULL_ATTRIBUTE_MAPPING = eINSTANCE.getXmlNullAttributeMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.ColumnMapping <em>Column Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.ColumnMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getColumnMapping()
		 * @generated
		 */
		public static final EClass COLUMN_MAPPING = eINSTANCE.getColumnMapping();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COLUMN_MAPPING__COLUMN = eINSTANCE.getColumnMapping_Column();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping <em>Xml Relationship Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlRelationshipMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlRelationshipMapping()
		 * @generated
		 */
		public static final EClass XML_RELATIONSHIP_MAPPING = eINSTANCE.getXmlRelationshipMapping();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_RELATIONSHIP_MAPPING__TARGET_ENTITY = eINSTANCE.getXmlRelationshipMapping_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_RELATIONSHIP_MAPPING__FETCH = eINSTANCE.getXmlRelationshipMapping_Fetch();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_RELATIONSHIP_MAPPING__CASCADE = eINSTANCE.getXmlRelationshipMapping_Cascade();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlMappedByMapping <em>Xml Mapped By Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlMappedByMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlMappedByMapping()
		 * @generated
		 */
		public static final EClass XML_MAPPED_BY_MAPPING = eINSTANCE.getXmlMappedByMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_MAPPED_BY_MAPPING__MAPPED_BY = eINSTANCE.getXmlMappedByMapping_MappedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping <em>Xml Join Columns Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumnsMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinColumnsMapping()
		 * @generated
		 */
		public static final EClass XML_JOIN_COLUMNS_MAPPING = eINSTANCE.getXmlJoinColumnsMapping();

		/**
		 * The meta object literal for the '<em><b>Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_JOIN_COLUMNS_MAPPING__JOIN_COLUMNS = eINSTANCE.getXmlJoinColumnsMapping_JoinColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping <em>Xml Join Table Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTableMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinTableMapping()
		 * @generated
		 */
		public static final EClass XML_JOIN_TABLE_MAPPING = eINSTANCE.getXmlJoinTableMapping();

		/**
		 * The meta object literal for the '<em><b>Join Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_JOIN_TABLE_MAPPING__JOIN_TABLE = eINSTANCE.getXmlJoinTableMapping_JoinTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping <em>Xml Multi Relationship Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlMultiRelationshipMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlMultiRelationshipMapping()
		 * @generated
		 */
		public static final EClass XML_MULTI_RELATIONSHIP_MAPPING = eINSTANCE.getXmlMultiRelationshipMapping();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_MULTI_RELATIONSHIP_MAPPING__ORDER_BY = eINSTANCE.getXmlMultiRelationshipMapping_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_MULTI_RELATIONSHIP_MAPPING__MAP_KEY = eINSTANCE.getXmlMultiRelationshipMapping_MapKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping <em>Xml Single Relationship Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlSingleRelationshipMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlSingleRelationshipMapping()
		 * @generated
		 */
		public static final EClass XML_SINGLE_RELATIONSHIP_MAPPING = eINSTANCE.getXmlSingleRelationshipMapping();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_SINGLE_RELATIONSHIP_MAPPING__OPTIONAL = eINSTANCE.getXmlSingleRelationshipMapping_Optional();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlId <em>Xml Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlId
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlId()
		 * @generated
		 */
		public static final EClass XML_ID = eINSTANCE.getXmlId();

		/**
		 * The meta object literal for the '<em><b>Generated Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ID__GENERATED_VALUE = eINSTANCE.getXmlId_GeneratedValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlIdImpl <em>Xml Id Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlIdImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlIdImpl()
		 * @generated
		 */
		public static final EClass XML_ID_IMPL = eINSTANCE.getXmlIdImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded <em>Base Xml Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.BaseXmlEmbedded
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getBaseXmlEmbedded()
		 * @generated
		 */
		public static final EClass BASE_XML_EMBEDDED = eINSTANCE.getBaseXmlEmbedded();

		/**
		 * The meta object literal for the '<em><b>Attribute Overrides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BASE_XML_EMBEDDED__ATTRIBUTE_OVERRIDES = eINSTANCE.getBaseXmlEmbedded_AttributeOverrides();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedId <em>Xml Embedded Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedId
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddedId()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED_ID = eINSTANCE.getXmlEmbeddedId();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedIdImpl <em>Xml Embedded Id Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedIdImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddedIdImpl()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED_ID_IMPL = eINSTANCE.getXmlEmbeddedIdImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlBasic <em>Xml Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlBasic
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlBasic()
		 * @generated
		 */
		public static final EClass XML_BASIC = eINSTANCE.getXmlBasic();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_BASIC__FETCH = eINSTANCE.getXmlBasic_Fetch();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_BASIC__OPTIONAL = eINSTANCE.getXmlBasic_Optional();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlBasicImpl <em>Xml Basic Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlBasicImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlBasicImpl()
		 * @generated
		 */
		public static final EClass XML_BASIC_IMPL = eINSTANCE.getXmlBasicImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlVersion <em>Xml Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlVersion
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlVersion()
		 * @generated
		 */
		public static final EClass XML_VERSION = eINSTANCE.getXmlVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlVersionImpl <em>Xml Version Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlVersionImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlVersionImpl()
		 * @generated
		 */
		public static final EClass XML_VERSION_IMPL = eINSTANCE.getXmlVersionImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToOne <em>Xml Many To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlManyToOne
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToOne()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_ONE = eINSTANCE.getXmlManyToOne();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToOneImpl <em>Xml Many To One Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlManyToOneImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToOneImpl()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_ONE_IMPL = eINSTANCE.getXmlManyToOneImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToMany <em>Xml One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlOneToMany
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToMany()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_MANY = eINSTANCE.getXmlOneToMany();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToManyImpl <em>Xml One To Many Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlOneToManyImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToManyImpl()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_MANY_IMPL = eINSTANCE.getXmlOneToManyImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOne <em>Xml One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOne
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToOne()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_ONE = eINSTANCE.getXmlOneToOne();

		/**
		 * The meta object literal for the '<em><b>Primary Key Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMNS = eINSTANCE.getXmlOneToOne_PrimaryKeyJoinColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlOneToOneImpl <em>Xml One To One Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlOneToOneImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlOneToOneImpl()
		 * @generated
		 */
		public static final EClass XML_ONE_TO_ONE_IMPL = eINSTANCE.getXmlOneToOneImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToMany <em>Xml Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlManyToMany
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToMany()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_MANY = eINSTANCE.getXmlManyToMany();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlManyToManyImpl <em>Xml Many To Many Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlManyToManyImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlManyToManyImpl()
		 * @generated
		 */
		public static final EClass XML_MANY_TO_MANY_IMPL = eINSTANCE.getXmlManyToManyImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbedded <em>Xml Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEmbedded
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbedded()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED = eINSTANCE.getXmlEmbedded();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlEmbeddedImpl <em>Xml Embedded Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlEmbeddedImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlEmbeddedImpl()
		 * @generated
		 */
		public static final EClass XML_EMBEDDED_IMPL = eINSTANCE.getXmlEmbeddedImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping <em>Xml Convertible Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlConvertibleMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlConvertibleMapping()
		 * @generated
		 */
		public static final EClass XML_CONVERTIBLE_MAPPING = eINSTANCE.getXmlConvertibleMapping();

		/**
		 * The meta object literal for the '<em><b>Lob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERTIBLE_MAPPING__LOB = eINSTANCE.getXmlConvertibleMapping_Lob();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERTIBLE_MAPPING__TEMPORAL = eINSTANCE.getXmlConvertibleMapping_Temporal();

		/**
		 * The meta object literal for the '<em><b>Enumerated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_CONVERTIBLE_MAPPING__ENUMERATED = eINSTANCE.getXmlConvertibleMapping_Enumerated();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlTransient <em>Xml Transient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlTransient
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTransient()
		 * @generated
		 */
		public static final EClass XML_TRANSIENT = eINSTANCE.getXmlTransient();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlTransientImpl <em>Xml Transient Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlTransientImpl
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTransientImpl()
		 * @generated
		 */
		public static final EClass XML_TRANSIENT_IMPL = eINSTANCE.getXmlTransientImpl();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlAssociationOverride <em>Xml Association Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlAssociationOverride
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAssociationOverride()
		 * @generated
		 */
		public static final EClass XML_ASSOCIATION_OVERRIDE = eINSTANCE.getXmlAssociationOverride();

		/**
		 * The meta object literal for the '<em><b>Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ASSOCIATION_OVERRIDE__JOIN_COLUMNS = eINSTANCE.getXmlAssociationOverride_JoinColumns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ASSOCIATION_OVERRIDE__NAME = eINSTANCE.getXmlAssociationOverride_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlAttributeOverride <em>Xml Attribute Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlAttributeOverride
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAttributeOverride()
		 * @generated
		 */
		public static final EClass XML_ATTRIBUTE_OVERRIDE = eINSTANCE.getXmlAttributeOverride();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_ATTRIBUTE_OVERRIDE__COLUMN = eINSTANCE.getXmlAttributeOverride_Column();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ATTRIBUTE_OVERRIDE__NAME = eINSTANCE.getXmlAttributeOverride_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.CascadeType <em>Cascade Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.CascadeType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getCascadeType()
		 * @generated
		 */
		public static final EClass CASCADE_TYPE = eINSTANCE.getCascadeType();

		/**
		 * The meta object literal for the '<em><b>Cascade All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CASCADE_TYPE__CASCADE_ALL = eINSTANCE.getCascadeType_CascadeAll();

		/**
		 * The meta object literal for the '<em><b>Cascade Persist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CASCADE_TYPE__CASCADE_PERSIST = eINSTANCE.getCascadeType_CascadePersist();

		/**
		 * The meta object literal for the '<em><b>Cascade Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CASCADE_TYPE__CASCADE_MERGE = eINSTANCE.getCascadeType_CascadeMerge();

		/**
		 * The meta object literal for the '<em><b>Cascade Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CASCADE_TYPE__CASCADE_REMOVE = eINSTANCE.getCascadeType_CascadeRemove();

		/**
		 * The meta object literal for the '<em><b>Cascade Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CASCADE_TYPE__CASCADE_REFRESH = eINSTANCE.getCascadeType_CascadeRefresh();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlNamedColumn <em>Xml Named Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlNamedColumn
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNamedColumn()
		 * @generated
		 */
		public static final EClass XML_NAMED_COLUMN = eINSTANCE.getXmlNamedColumn();

		/**
		 * The meta object literal for the '<em><b>Column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_COLUMN__COLUMN_DEFINITION = eINSTANCE.getXmlNamedColumn_ColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_COLUMN__NAME = eINSTANCE.getXmlNamedColumn_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlAbstractColumn <em>Xml Abstract Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlAbstractColumn
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlAbstractColumn()
		 * @generated
		 */
		public static final EClass XML_ABSTRACT_COLUMN = eINSTANCE.getXmlAbstractColumn();

		/**
		 * The meta object literal for the '<em><b>Insertable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ABSTRACT_COLUMN__INSERTABLE = eINSTANCE.getXmlAbstractColumn_Insertable();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ABSTRACT_COLUMN__NULLABLE = eINSTANCE.getXmlAbstractColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ABSTRACT_COLUMN__TABLE = eINSTANCE.getXmlAbstractColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ABSTRACT_COLUMN__UNIQUE = eINSTANCE.getXmlAbstractColumn_Unique();

		/**
		 * The meta object literal for the '<em><b>Updatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ABSTRACT_COLUMN__UPDATABLE = eINSTANCE.getXmlAbstractColumn_Updatable();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlColumn <em>Xml Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlColumn
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlColumn()
		 * @generated
		 */
		public static final EClass XML_COLUMN = eINSTANCE.getXmlColumn();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_COLUMN__LENGTH = eINSTANCE.getXmlColumn_Length();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_COLUMN__PRECISION = eINSTANCE.getXmlColumn_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_COLUMN__SCALE = eINSTANCE.getXmlColumn_Scale();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.ColumnResult <em>Column Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.ColumnResult
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getColumnResult()
		 * @generated
		 */
		public static final EClass COLUMN_RESULT = eINSTANCE.getColumnResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COLUMN_RESULT__NAME = eINSTANCE.getColumnResult_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn <em>Xml Discriminator Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlDiscriminatorColumn
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlDiscriminatorColumn()
		 * @generated
		 */
		public static final EClass XML_DISCRIMINATOR_COLUMN = eINSTANCE.getXmlDiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = eINSTANCE.getXmlDiscriminatorColumn_DiscriminatorType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_DISCRIMINATOR_COLUMN__LENGTH = eINSTANCE.getXmlDiscriminatorColumn_Length();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.EntityListeners <em>Entity Listeners</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.EntityListeners
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEntityListeners()
		 * @generated
		 */
		public static final EClass ENTITY_LISTENERS = eINSTANCE.getEntityListeners();

		/**
		 * The meta object literal for the '<em><b>Entity Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENERS__ENTITY_LISTENERS = eINSTANCE.getEntityListeners_EntityListeners();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.EntityListener <em>Entity Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.EntityListener
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEntityListener()
		 * @generated
		 */
		public static final EClass ENTITY_LISTENER = eINSTANCE.getEntityListener();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENTITY_LISTENER__CLASS_NAME = eINSTANCE.getEntityListener_ClassName();

		/**
		 * The meta object literal for the '<em><b>Pre Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__PRE_PERSIST = eINSTANCE.getEntityListener_PrePersist();

		/**
		 * The meta object literal for the '<em><b>Post Persist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__POST_PERSIST = eINSTANCE.getEntityListener_PostPersist();

		/**
		 * The meta object literal for the '<em><b>Pre Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__PRE_REMOVE = eINSTANCE.getEntityListener_PreRemove();

		/**
		 * The meta object literal for the '<em><b>Post Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__POST_REMOVE = eINSTANCE.getEntityListener_PostRemove();

		/**
		 * The meta object literal for the '<em><b>Pre Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__PRE_UPDATE = eINSTANCE.getEntityListener_PreUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__POST_UPDATE = eINSTANCE.getEntityListener_PostUpdate();

		/**
		 * The meta object literal for the '<em><b>Post Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_LISTENER__POST_LOAD = eINSTANCE.getEntityListener_PostLoad();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.EntityResult <em>Entity Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.EntityResult
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEntityResult()
		 * @generated
		 */
		public static final EClass ENTITY_RESULT = eINSTANCE.getEntityResult();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENTITY_RESULT__DISCRIMINATOR_COLUMN = eINSTANCE.getEntityResult_DiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Entity Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENTITY_RESULT__ENTITY_CLASS = eINSTANCE.getEntityResult_EntityClass();

		/**
		 * The meta object literal for the '<em><b>Field Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENTITY_RESULT__FIELD_RESULTS = eINSTANCE.getEntityResult_FieldResults();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.FieldResult <em>Field Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.FieldResult
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getFieldResult()
		 * @generated
		 */
		public static final EClass FIELD_RESULT = eINSTANCE.getFieldResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD_RESULT__NAME = eINSTANCE.getFieldResult_Name();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD_RESULT__COLUMN = eINSTANCE.getFieldResult_Column();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlGeneratedValue <em>Xml Generated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlGeneratedValue
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlGeneratedValue()
		 * @generated
		 */
		public static final EClass XML_GENERATED_VALUE = eINSTANCE.getXmlGeneratedValue();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_GENERATED_VALUE__GENERATOR = eINSTANCE.getXmlGeneratedValue_Generator();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_GENERATED_VALUE__STRATEGY = eINSTANCE.getXmlGeneratedValue_Strategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlIdClass <em>Xml Id Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlIdClass
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlIdClass()
		 * @generated
		 */
		public static final EClass XML_ID_CLASS = eINSTANCE.getXmlIdClass();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_ID_CLASS__CLASS_NAME = eINSTANCE.getXmlIdClass_ClassName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.Inheritance <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.Inheritance
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getInheritance()
		 * @generated
		 */
		public static final EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INHERITANCE__STRATEGY = eINSTANCE.getInheritance_Strategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinColumn <em>Xml Join Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlJoinColumn
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinColumn()
		 * @generated
		 */
		public static final EClass XML_JOIN_COLUMN = eINSTANCE.getXmlJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Referenced Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_JOIN_COLUMN__REFERENCED_COLUMN_NAME = eINSTANCE.getXmlJoinColumn_ReferencedColumnName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlJoinTable <em>Xml Join Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlJoinTable
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlJoinTable()
		 * @generated
		 */
		public static final EClass XML_JOIN_TABLE = eINSTANCE.getXmlJoinTable();

		/**
		 * The meta object literal for the '<em><b>Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_JOIN_TABLE__JOIN_COLUMNS = eINSTANCE.getXmlJoinTable_JoinColumns();

		/**
		 * The meta object literal for the '<em><b>Inverse Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_JOIN_TABLE__INVERSE_JOIN_COLUMNS = eINSTANCE.getXmlJoinTable_InverseJoinColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.Lob <em>Lob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.Lob
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getLob()
		 * @generated
		 */
		public static final EClass LOB = eINSTANCE.getLob();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.MapKey <em>Map Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.MapKey
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getMapKey()
		 * @generated
		 */
		public static final EClass MAP_KEY = eINSTANCE.getMapKey();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAP_KEY__NAME = eINSTANCE.getMapKey_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlQuery <em>Xml Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlQuery
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlQuery()
		 * @generated
		 */
		public static final EClass XML_QUERY = eINSTANCE.getXmlQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_QUERY__NAME = eINSTANCE.getXmlQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_QUERY__QUERY = eINSTANCE.getXmlQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_QUERY__HINTS = eINSTANCE.getXmlQuery_Hints();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery <em>Xml Named Native Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlNamedNativeQuery
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNamedNativeQuery()
		 * @generated
		 */
		public static final EClass XML_NAMED_NATIVE_QUERY = eINSTANCE.getXmlNamedNativeQuery();

		/**
		 * The meta object literal for the '<em><b>Result Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_NATIVE_QUERY__RESULT_CLASS = eINSTANCE.getXmlNamedNativeQuery_ResultClass();

		/**
		 * The meta object literal for the '<em><b>Result Set Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = eINSTANCE.getXmlNamedNativeQuery_ResultSetMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlNamedQuery <em>Xml Named Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlNamedQuery
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlNamedQuery()
		 * @generated
		 */
		public static final EClass XML_NAMED_QUERY = eINSTANCE.getXmlNamedQuery();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.EventMethod <em>Event Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.EventMethod
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEventMethod()
		 * @generated
		 */
		public static final EClass EVENT_METHOD = eINSTANCE.getEventMethod();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EVENT_METHOD__METHOD_NAME = eINSTANCE.getEventMethod_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PostLoad <em>Post Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PostLoad
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostLoad()
		 * @generated
		 */
		public static final EClass POST_LOAD = eINSTANCE.getPostLoad();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PostPersist <em>Post Persist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PostPersist
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostPersist()
		 * @generated
		 */
		public static final EClass POST_PERSIST = eINSTANCE.getPostPersist();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PostRemove <em>Post Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PostRemove
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostRemove()
		 * @generated
		 */
		public static final EClass POST_REMOVE = eINSTANCE.getPostRemove();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PostUpdate <em>Post Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PostUpdate
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPostUpdate()
		 * @generated
		 */
		public static final EClass POST_UPDATE = eINSTANCE.getPostUpdate();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PrePersist <em>Pre Persist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PrePersist
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPrePersist()
		 * @generated
		 */
		public static final EClass PRE_PERSIST = eINSTANCE.getPrePersist();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PreRemove <em>Pre Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PreRemove
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPreRemove()
		 * @generated
		 */
		public static final EClass PRE_REMOVE = eINSTANCE.getPreRemove();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.PreUpdate <em>Pre Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.PreUpdate
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getPreUpdate()
		 * @generated
		 */
		public static final EClass PRE_UPDATE = eINSTANCE.getPreUpdate();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn <em>Xml Primary Key Join Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlPrimaryKeyJoinColumn
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlPrimaryKeyJoinColumn()
		 * @generated
		 */
		public static final EClass XML_PRIMARY_KEY_JOIN_COLUMN = eINSTANCE.getXmlPrimaryKeyJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Referenced Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = eINSTANCE.getXmlPrimaryKeyJoinColumn_ReferencedColumnName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlQueryHint <em>Xml Query Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlQueryHint
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlQueryHint()
		 * @generated
		 */
		public static final EClass XML_QUERY_HINT = eINSTANCE.getXmlQueryHint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_QUERY_HINT__NAME = eINSTANCE.getXmlQueryHint_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_QUERY_HINT__VALUE = eINSTANCE.getXmlQueryHint_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlBaseTable <em>Xml Base Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlBaseTable
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlBaseTable()
		 * @generated
		 */
		public static final EClass XML_BASE_TABLE = eINSTANCE.getXmlBaseTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_BASE_TABLE__NAME = eINSTANCE.getXmlBaseTable_Name();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_BASE_TABLE__CATALOG = eINSTANCE.getXmlBaseTable_Catalog();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_BASE_TABLE__SCHEMA = eINSTANCE.getXmlBaseTable_Schema();

		/**
		 * The meta object literal for the '<em><b>Unique Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_BASE_TABLE__UNIQUE_CONSTRAINTS = eINSTANCE.getXmlBaseTable_UniqueConstraints();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlTable <em>Xml Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlTable
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTable()
		 * @generated
		 */
		public static final EClass XML_TABLE = eINSTANCE.getXmlTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlSecondaryTable <em>Xml Secondary Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlSecondaryTable
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlSecondaryTable()
		 * @generated
		 */
		public static final EClass XML_SECONDARY_TABLE = eINSTANCE.getXmlSecondaryTable();

		/**
		 * The meta object literal for the '<em><b>Primary Key Join Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMNS = eINSTANCE.getXmlSecondaryTable_PrimaryKeyJoinColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlGenerator <em>Xml Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlGenerator
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlGenerator()
		 * @generated
		 */
		public static final EClass XML_GENERATOR = eINSTANCE.getXmlGenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_GENERATOR__NAME = eINSTANCE.getXmlGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_GENERATOR__INITIAL_VALUE = eINSTANCE.getXmlGenerator_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Allocation Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_GENERATOR__ALLOCATION_SIZE = eINSTANCE.getXmlGenerator_AllocationSize();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator <em>Xml Sequence Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlSequenceGenerator
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlSequenceGenerator()
		 * @generated
		 */
		public static final EClass XML_SEQUENCE_GENERATOR = eINSTANCE.getXmlSequenceGenerator();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_SEQUENCE_GENERATOR__SEQUENCE_NAME = eINSTANCE.getXmlSequenceGenerator_SequenceName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.SqlResultSetMapping <em>Sql Result Set Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.SqlResultSetMapping
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getSqlResultSetMapping()
		 * @generated
		 */
		public static final EClass SQL_RESULT_SET_MAPPING = eINSTANCE.getSqlResultSetMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SQL_RESULT_SET_MAPPING__NAME = eINSTANCE.getSqlResultSetMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Entity Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SQL_RESULT_SET_MAPPING__ENTITY_RESULTS = eINSTANCE.getSqlResultSetMapping_EntityResults();

		/**
		 * The meta object literal for the '<em><b>Column Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SQL_RESULT_SET_MAPPING__COLUMN_RESULTS = eINSTANCE.getSqlResultSetMapping_ColumnResults();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlTableGenerator <em>Xml Table Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlTableGenerator
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlTableGenerator()
		 * @generated
		 */
		public static final EClass XML_TABLE_GENERATOR = eINSTANCE.getXmlTableGenerator();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TABLE_GENERATOR__TABLE = eINSTANCE.getXmlTableGenerator_Table();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TABLE_GENERATOR__CATALOG = eINSTANCE.getXmlTableGenerator_Catalog();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TABLE_GENERATOR__SCHEMA = eINSTANCE.getXmlTableGenerator_Schema();

		/**
		 * The meta object literal for the '<em><b>Pk Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TABLE_GENERATOR__PK_COLUMN_NAME = eINSTANCE.getXmlTableGenerator_PkColumnName();

		/**
		 * The meta object literal for the '<em><b>Value Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TABLE_GENERATOR__VALUE_COLUMN_NAME = eINSTANCE.getXmlTableGenerator_ValueColumnName();

		/**
		 * The meta object literal for the '<em><b>Pk Column Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_TABLE_GENERATOR__PK_COLUMN_VALUE = eINSTANCE.getXmlTableGenerator_PkColumnValue();

		/**
		 * The meta object literal for the '<em><b>Unique Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference XML_TABLE_GENERATOR__UNIQUE_CONSTRAINTS = eINSTANCE.getXmlTableGenerator_UniqueConstraints();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint <em>Xml Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.XmlUniqueConstraint
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getXmlUniqueConstraint()
		 * @generated
		 */
		public static final EClass XML_UNIQUE_CONSTRAINT = eINSTANCE.getXmlUniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute XML_UNIQUE_CONSTRAINT__COLUMN_NAMES = eINSTANCE.getXmlUniqueConstraint_ColumnNames();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.AccessType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getAccessType()
		 * @generated
		 */
		public static final EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.DiscriminatorType <em>Discriminator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.DiscriminatorType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getDiscriminatorType()
		 * @generated
		 */
		public static final EEnum DISCRIMINATOR_TYPE = eINSTANCE.getDiscriminatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.EnumType <em>Enum Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.EnumType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEnumType()
		 * @generated
		 */
		public static final EEnum ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.FetchType <em>Fetch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.FetchType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getFetchType()
		 * @generated
		 */
		public static final EEnum FETCH_TYPE = eINSTANCE.getFetchType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.GenerationType <em>Generation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.GenerationType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getGenerationType()
		 * @generated
		 */
		public static final EEnum GENERATION_TYPE = eINSTANCE.getGenerationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.InheritanceType <em>Inheritance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.InheritanceType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getInheritanceType()
		 * @generated
		 */
		public static final EEnum INHERITANCE_TYPE = eINSTANCE.getInheritanceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jpt.core.resource.orm.TemporalType <em>Temporal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jpt.core.resource.orm.TemporalType
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getTemporalType()
		 * @generated
		 */
		public static final EEnum TEMPORAL_TYPE = eINSTANCE.getTemporalType();

		/**
		 * The meta object literal for the '<em>Discriminator Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getDiscriminatorValue()
		 * @generated
		 */
		public static final EDataType DISCRIMINATOR_VALUE = eINSTANCE.getDiscriminatorValue();

		/**
		 * The meta object literal for the '<em>Enumerated</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getEnumerated()
		 * @generated
		 */
		public static final EDataType ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em>Order By</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getOrderBy()
		 * @generated
		 */
		public static final EDataType ORDER_BY = eINSTANCE.getOrderBy();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jpt.core.resource.orm.OrmPackage#getVersionType()
		 * @generated
		 */
		public static final EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //OrmPackage
