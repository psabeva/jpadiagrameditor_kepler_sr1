/*******************************************************************************
 * Copyright (c) 2005, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.validation;

@SuppressWarnings("nls")
public interface JpaValidationMessages {

	public static final String BUNDLE_NAME = "jpa_validation";
	
	public static final String PROJECT_INVALID_LIBRARY_PROVIDER = "PROJECT_INVALID_LIBRARY_PROVIDER";
	public static final String PROJECT_NO_CONNECTION = "PROJECT_NO_CONNECTION";
	public static final String PROJECT_INVALID_CONNECTION = "PROJECT_INVALID_CONNECTION";
	public static final String PROJECT_INACTIVE_CONNECTION = "PROJECT_INACTIVE_CONNECTION";
	public static final String PROJECT_NO_PERSISTENCE_XML = "PROJECT_NO_PERSISTENCE_XML";
	public static final String PROJECT_MULTIPLE_PERSISTENCE_XML = "PROJECT_MULTIPLE_PERSISTENCE_XML";
	public static final String XML_VERSION_NOT_LATEST = "XML_VERSION_NOT_LATEST";
	public static final String PERSISTENCE_XML_INVALID_CONTENT = "PERSISTENCE_XML_INVALID_CONTENT";
	public static final String PERSISTENCE_XML_UNSUPPORTED_CONTENT = "PERSISTENCE_XML_UNSUPPORTED_CONTENT";
	public static final String PERSISTENCE_NO_PERSISTENCE_UNIT = "PERSISTENCE_NO_PERSISTENCE_UNIT";
	public static final String PERSISTENCE_MULTIPLE_PERSISTENCE_UNITS = "PERSISTENCE_MULTIPLE_PERSISTENCE_UNITS";
	public static final String PERSISTENCE_UNIT_ENTITY_NAME_ATTRIBUTE_MISSING = "PERSISTENCE_UNIT_ENTITY_NAME_ATTRIBUTE_MISSING";
	public static final String PERSISTENCE_UNIT_UNSPECIFIED_MAPPING_FILE = "PERSISTENCE_UNIT_UNSPECIFIED_MAPPING_FILE";
	public static final String PERSISTENCE_UNIT_UNSUPPORTED_MAPPING_FILE_CONTENT = "PERSISTENCE_UNIT_UNSUPPORTED_MAPPING_FILE_CONTENT";
	public static final String PERSISTENCE_UNIT_NONEXISTENT_MAPPING_FILE = "PERSISTENCE_UNIT_NONEXISTENT_MAPPING_FILE";
	public static final String PERSISTENCE_UNIT_INVALID_MAPPING_FILE = "PERSISTENCE_UNIT_INVALID_MAPPING_FILE";
	public static final String PERSISTENCE_UNIT_DUPLICATE_MAPPING_FILE = "PERSISTENCE_UNIT_DUPLICATE_MAPPING_FILE";
	public static final String PERSISTENCE_UNIT_UNSPECIFIED_CLASS = "PERSISTENCE_UNIT_UNSPECIFIED_CLASS";
	public static final String PERSISTENCE_UNIT_NONEXISTENT_CLASS = "PERSISTENCE_UNIT_NONEXISTENT_CLASS";
	public static final String PERSISTENCE_UNIT_INVALID_CLASS = "PERSISTENCE_UNIT_INVALID_CLASS";
	public static final String PERSISTENCE_UNIT_DUPLICATE_CLASS = "PERSISTENCE_UNIT_DUPLICATE_CLASS";
	public static final String PERSISTENCE_UNIT_REDUNDANT_CLASS = "PERSISTENCE_UNIT_REDUNDANT_CLASS";
	public static final String PERSISTENCE_UNIT_DUPLICATE_JAR_FILE = "PERSISTENCE_UNIT_DUPLICATE_JAR_FILE";
	public static final String PERSISTENCE_UNIT_UNSPECIFIED_JAR_FILE = "PERSISTENCE_UNIT_UNSPECIFIED_JAR_FILE";
	public static final String PERSISTENCE_UNIT_JAR_FILE_DEPLOYMENT_PATH_WARNING = "PERSISTENCE_UNIT_JAR_FILE_DEPLOYMENT_PATH_WARNING";
	public static final String PERSISTENCE_UNIT_NONEXISTENT_JAR_FILE = "PERSISTENCE_UNIT_NONEXISTENT_JAR_FILE";
	public static final String GENERATOR_DUPLICATE_NAME = "GENERATOR_DUPLICATE_NAME";
	public static final String GENERATOR_NAME_UNDEFINED = "GENERATOR_NAME_UNDEFINED";
	public static final String QUERY_DUPLICATE_NAME = "QUERY_DUPLICATE_NAME";
	public static final String QUERY_NAME_UNDEFINED = "QUERY_NAME_UNDEFINED";
	public static final String QUERY_STATEMENT_UNDEFINED = "QUERY_STATEMENT_UNDEFINED";
	public static final String MAPPING_FILE_EXTRANEOUS_PERSISTENCE_UNIT_METADATA = "MAPPING_FILE_EXTRANEOUS_PERSISTENCE_UNIT_METADATA";
	public static final String PERSISTENT_TYPE_MAPPED_BUT_NOT_INCLUDED_IN_PERSISTENCE_UNIT = "PERSISTENT_TYPE_MAPPED_BUT_NOT_INCLUDED_IN_PERSISTENCE_UNIT";
	public static final String PERSISTENT_TYPE_ANNOTATED_BUT_NOT_INCLUDED_IN_PERSISTENCE_UNIT = "PERSISTENT_TYPE_ANNOTATED_BUT_NOT_INCLUDED_IN_PERSISTENCE_UNIT";
	public static final String PERSISTENT_TYPE_UNSPECIFIED_CLASS = "PERSISTENT_TYPE_UNSPECIFIED_CLASS";
	public static final String PERSISTENT_TYPE_UNRESOLVED_CLASS = "PERSISTENT_TYPE_UNRESOLVED_CLASS";
	public static final String TYPE_MAPPING_PK_REDEFINED_ID_CLASS = "TYPE_MAPPING_PK_REDEFINED_ID_CLASS";
	public static final String TYPE_MAPPING_PK_REDEFINED_ID_ATTRIBUTE = "TYPE_MAPPING_PK_REDEFINED_ID_ATTRIBUTE";
	public static final String TYPE_MAPPING_ID_CLASS_REDEFINED = "TYPE_MAPPING_ID_CLASS_REDEFINED";
	public static final String TYPE_MAPPING_ID_CLASS_REQUIRED = "TYPE_MAPPING_ID_CLASS_REQUIRED";
	public static final String TYPE_MAPPING_ID_CLASS_AND_EMBEDDED_ID_BOTH_USED = "TYPE_MAPPING_ID_CLASS_AND_EMBEDDED_ID_BOTH_USED";
	public static final String TYPE_MAPPING_MULTIPLE_EMBEDDED_ID = "TYPE_MAPPING_MULTIPLE_EMBEDDED_ID";
	public static final String TYPE_MAPPING_ID_CLASS_WITH_MAPS_ID = "TYPE_MAPPING_ID_CLASS_WITH_MAPS_ID";
	public static final String TYPE_MAPPING_MAPS_ID_ATTRIBUTE_TYPE_DOES_NOT_AGREE = "TYPE_MAPPING_MAPS_ID_ATTRIBUTE_TYPE_DOES_NOT_AGREE";
	public static final String TYPE_MAPPING_ID_CLASS_ATTRIBUTE_NO_MATCH = "TYPE_MAPPING_ID_CLASS_ATTRIBUTE_NO_MATCH";
	public static final String TYPE_MAPPING_ID_CLASS_ATTRIBUTE_MAPPING_NO_MATCH = "TYPE_MAPPING_ID_CLASS_ATTRIBUTE_MAPPING_NO_MATCH";
	public static final String TYPE_MAPPING_ID_CLASS_ATTRIBUTE_MAPPING_DUPLICATE_MATCH = "TYPE_MAPPING_ID_CLASS_ATTRIBUTE_MAPPING_DUPLICATE_MATCH";
	public static final String TYPE_MAPPING_ID_CLASS_ATTRIBUTE_NOT_PRIMARY_KEY = "TYPE_MAPPING_ID_CLASS_ATTRIBUTE_NOT_PRIMARY_KEY";
	public static final String TYPE_MAPPING_ID_CLASS_ATTRIBUTE_TYPE_DOES_NOT_AGREE = "TYPE_MAPPING_ID_CLASS_ATTRIBUTE_TYPE_DOES_NOT_AGREE";
	public static final String ENTITY_NON_ROOT_ID_CLASS_SPECIFIED = "ENTITY_NON_ROOT_ID_CLASS_SPECIFIED";
	public static final String ENTITY_NON_ROOT_ID_ATTRIBUTE_SPECIFIED = "ENTITY_NON_ROOT_ID_ATTRIBUTE_SPECIFIED";
	public static final String ENTITY_NO_PK = "ENTITY_NO_PK";
	public static final String TYPE_MAPPING_FINAL_CLASS = "TYPE_MAPPING_FINAL_CLASS";
	public static final String TYPE_MAPPING_MEMBER_CLASS = "TYPE_MAPPING_MEMBER_CLASS";
	public static final String TYPE_MAPPING_CLASS_MISSING_NO_ARG_CONSTRUCTOR = "TYPE_MAPPING_CLASS_MISSING_NO_ARG_CONSTRUCTOR";
	public static final String TYPE_MAPPING_CLASS_PRIVATE_NO_ARG_CONSTRUCTOR = "TYPE_MAPPING_CLASS_PRIVATE_NO_ARG_CONSTRUCTOR";
	public static final String ENTITY_SINGLE_TABLE_DESCENDANT_DEFINES_TABLE = "ENTITY_SINGLE_TABLE_DESCENDANT_DEFINES_TABLE";
	public static final String ENTITY_ABSTRACT_TABLE_PER_CLASS_DEFINES_TABLE = "ENTITY_ABSTRACT_TABLE_PER_CLASS_DEFINES_TABLE";
	public static final String ENTITY_ABSTRACT_DISCRIMINATOR_VALUE_DEFINED = "ENTITY_ABSTRACT_DISCRIMINATOR_VALUE_DEFINED";
	public static final String ENTITY_TABLE_PER_CLASS_DISCRIMINATOR_VALUE_DEFINED = "ENTITY_TABLE_PER_CLASS_DISCRIMINATOR_VALUE_DEFINED";
	public static final String ENTITY_NAME_MISSING = "ENTITY_NAME_MISSING";
	public static final String ENTITY_NON_ROOT_DISCRIMINATOR_COLUMN_DEFINED = "ENTITY_NON_ROOT_DISCRIMINATOR_COLUMN_DEFINED";
	public static final String ENTITY_TABLE_PER_CLASS_DISCRIMINATOR_COLUMN_DEFINED = "ENTITY_TABLE_PER_CLASS_DISCRIMINATOR_COLUMN_DEFINED";
	public static final String PERSISTENT_ATTRIBUTE_UNSPECIFIED_NAME = "PERSISTENT_ATTRIBUTE_UNSPECIFIED_NAME";
	public static final String PERSISTENT_ATTRIBUTE_UNRESOLVED_NAME = "PERSISTENT_ATTRIBUTE_UNRESOLVED_NAME";
	public static final String PERSISTENT_ATTRIBUTE_INHERITED_ATTRIBUTES_NOT_SUPPORTED = "PERSISTENT_ATTRIBUTE_INHERITED_ATTRIBUTES_NOT_SUPPORTED";
	public static final String PERSISTENT_ATTRIBUTE_FINAL_FIELD = "PERSISTENT_ATTRIBUTE_FINAL_FIELD";
	public static final String PERSISTENT_ATTRIBUTE_FINAL_GETTER = "PERSISTENT_ATTRIBUTE_FINAL_GETTER";
	public static final String PERSISTENT_ATTRIBUTE_PUBLIC_FIELD = "PERSISTENT_ATTRIBUTE_PUBLIC_FIELD";
	public static final String PERSISTENT_ATTRIBUTE_INVALID_MAPPING = "PERSISTENT_ATTRIBUTE_INVALID_MAPPING";
	public static final String MAPPING_UNRESOLVED_MAPPED_BY = "MAPPING_UNRESOLVED_MAPPED_BY";
	public static final String MAPPING_INVALID_MAPPED_BY = "MAPPING_INVALID_MAPPED_BY";
	public static final String MAPPING_MAPPED_BY_ON_BOTH_SIDES = "MAPPING_MAPPED_BY_ON_BOTH_SIDES";
	public static final String ID_MAPPING_UNRESOLVED_GENERATOR_NAME = "ID_MAPPING_UNRESOLVED_GENERATOR_NAME";
	public static final String ID_MAPPING_MAPPED_BY_RELATIONSHIP_AND_COLUMN_SPECIFIED = "ID_MAPPING_MAPPED_BY_RELATIONSHIP_AND_COLUMN_SPECIFIED";
	public static final String EMBEDDED_ID_MAPPING_MAPPED_BY_RELATIONSHIP_AND_ATTRIBUTE_OVERRIDES_SPECIFIED = "EMBEDDED_ID_MAPPING_MAPPED_BY_RELATIONSHIP_AND_ATTRIBUTE_OVERRIDES_SPECIFIED";
	public static final String ATTRIBUTE_OVERRIDE_MAPPED_BY_RELATIONSHIP_AND_SPECIFIED = "ATTRIBUTE_OVERRIDE_MAPPED_BY_RELATIONSHIP_AND_SPECIFIED";
	public static final String ATTRIBUTE_OVERRIDE_INVALID_NAME = "ATTRIBUTE_OVERRIDE_INVALID_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ATTRIBUTE_OVERRIDE_INVALID_NAME = "VIRTUAL_ATTRIBUTE_ATTRIBUTE_OVERRIDE_INVALID_NAME";
	public static final String ASSOCIATION_OVERRIDE_INVALID_NAME = "ASSOCIATION_OVERRIDE_INVALID_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVALID_NAME = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVALID_NAME";
	public static final String VIRTUAL_ATTRIBUTE_OVERRIDE_INVALID_NAME = "VIRTUAL_ATTRIBUTE_OVERRIDE_INVALID_NAME";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_INVALID_NAME = "VIRTUAL_ASSOCIATION_OVERRIDE_INVALID_NAME";
	public static final String VIRTUAL_MAP_KEY_ATTRIBUTE_OVERRIDE_INVALID_NAME = "VIRTUAL_MAP_KEY_ATTRIBUTE_OVERRIDE_INVALID_NAME";
	public static final String VIRTUAL_ATTRIBUTE_MAP_KEY_ATTRIBUTE_OVERRIDE_INVALID_NAME = "VIRTUAL_ATTRIBUTE_MAP_KEY_ATTRIBUTE_OVERRIDE_INVALID_NAME";
	public static final String TABLE_UNRESOLVED_CATALOG = "TABLE_UNRESOLVED_CATALOG";
	public static final String TABLE_UNRESOLVED_SCHEMA = "TABLE_UNRESOLVED_SCHEMA";
	public static final String TABLE_UNRESOLVED_NAME = "TABLE_UNRESOLVED_NAME";
	public static final String SECONDARY_TABLE_UNRESOLVED_CATALOG = "SECONDARY_TABLE_UNRESOLVED_CATALOG";
	public static final String SECONDARY_TABLE_UNRESOLVED_SCHEMA = "SECONDARY_TABLE_UNRESOLVED_SCHEMA";
	public static final String SECONDARY_TABLE_UNRESOLVED_NAME = "SECONDARY_TABLE_UNRESOLVED_NAME";
	public static final String JOIN_TABLE_UNRESOLVED_CATALOG = "JOIN_TABLE_UNRESOLVED_CATALOG";
	public static final String JOIN_TABLE_UNRESOLVED_SCHEMA = "JOIN_TABLE_UNRESOLVED_SCHEMA";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_CATALOG = "VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_CATALOG";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_SCHEMA = "VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_SCHEMA";
	public static final String JOIN_TABLE_UNRESOLVED_NAME = "JOIN_TABLE_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_JOIN_TABLE_UNRESOLVED_NAME";
	public static final String COLUMN_UNRESOLVED_TABLE = "COLUMN_UNRESOLVED_TABLE";
	public static final String COLUMN_UNRESOLVED_NAME = "COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME = "VIRTUAL_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_COLUMN_UNRESOLVED_TABLE = "VIRTUAL_ATTRIBUTE_JOIN_COLUMN_UNRESOLVED_TABLE";
	public static final String JOIN_COLUMN_UNRESOLVED_NAME = "JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String INVERSE_JOIN_COLUMN_UNRESOLVED_NAME = "INVERSE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_ATTRIBUTE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_REFERENCED_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_REFERENCED_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS = "VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS = "VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_INVERSE_JOIN_COLUMNS";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_TABLE_UNRESOLVED_NAME = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_TABLE_UNRESOLVED_NAME";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_TABLE_UNRESOLVED_CATALOG = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_TABLE_UNRESOLVED_CATALOG";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_TABLE_UNRESOLVED_SCHEMA = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_TABLE_UNRESOLVED_SCHEMA";
	
	public static final String GENERATED_VALUE_UNRESOLVED_GENERATOR = "GENERATED_VALUE_UNRESOLVED_GENERATOR";
	public static final String PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME = "PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_ATTRIBUTE_PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME = "VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME = "VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_UNRESOLVED_REFERENCED_COLUMN_NAME";
	public static final String VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	public static final String VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS = "VIRTUAL_SECONDARY_TABLE_PRIMARY_KEY_JOIN_COLUMN_REFERENCED_COLUMN_NAME_MUST_BE_SPECIFIED_MULTIPLE_JOIN_COLUMNS";
	
	public static final String NO_JPA_PROJECT = "NO_JPA_PROJECT";
	public static final String TARGET_ENTITY_NOT_DEFINED = "TARGET_ENTITY_NOT_DEFINED";
	public static final String VIRTUAL_ATTRIBUTE_TARGET_ENTITY_NOT_DEFINED = "VIRTUAL_ATTRIBUTE_TARGET_ENTITY_NOT_DEFINED";
	public static final String TARGET_ENTITY_IS_NOT_AN_ENTITY = "TARGET_ENTITY_IS_NOT_AN_ENTITY";
	public static final String VIRTUAL_ATTRIBUTE_TARGET_ENTITY_IS_NOT_AN_ENTITY = "VIRTUAL_ATTRIBUTE_TARGET_ENTITY_IS_NOT_AN_ENTITY";
	public static final String DISCRIMINATOR_COLUMN_UNRESOLVED_NAME = "DISCRIMINATOR_COLUMN_UNRESOLVED_NAME";
	public static final String ENTITY_TABLE_PER_CLASS_NOT_SUPPORTED_ON_PLATFORM = "ENTITY_TABLE_PER_CLASS_NOT_SUPPORTED_ON_PLATFORM";
	public static final String ENTITY_TABLE_PER_CLASS_NOT_PORTABLE_ON_PLATFORM = "ENTITY_TABLE_PER_CLASS_NOT_PORTABLE_ON_PLATFORM";
	public static final String TARGET_NOT_AN_EMBEDDABLE = "TARGET_NOT_AN_EMBEDDABLE";
	
	public static final String COLUMN_TABLE_NOT_VALID="COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_COLUMN_TABLE_NOT_VALID="VIRTUAL_ATTRIBUTE_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID="VIRTUAL_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID="VIRTUAL_ATTRIBUTE_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID";
	public static final String JOIN_COLUMN_TABLE_NOT_VALID = "JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_JOIN_COLUMN_TABLE_NOT_VALID = "VIRTUAL_ATTRIBUTE_JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String INVERSE_JOIN_COLUMN_TABLE_NOT_VALID = "INVERSE_JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID = "VIRTUAL_ATTRIBUTE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_TABLE_NOT_VALID = "VIRTUAL_ASSOCIATION_OVERRIDE_JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_TABLE_NOT_VALID = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID = "VIRTUAL_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID = "VIRTUAL_ATTRIBUTE_ASSOCIATION_OVERRIDE_INVERSE_JOIN_COLUMN_TABLE_NOT_VALID";

	//JPA 2.0 validation messages
	public static final String MAPS_ID_VALUE_NOT_SPECIFIED = "MAPS_ID_VALUE_NOT_SPECIFIED";
	public static final String MAPS_ID_VALUE_NOT_RESOLVED = "MAPS_ID_VALUE_NOT_RESOLVED";
	public static final String MAPS_ID_VALUE_INVALID = "MAPS_ID_VALUE_INVALID";
	public static final String ORDER_COLUMN_AND_ORDER_BY_BOTH_SPECIFIED = "ORDER_COLUMN_AND_ORDER_BY_BOTH_SPECIFIED";
	public static final String ELEMENT_COLLECTION_TARGET_CLASS_NOT_DEFINED = "ELEMENT_COLLECTION_TARGET_CLASS_NOT_DEFINED";
	public static final String VIRTUAL_ATTRIBUTE_ELEMENT_COLLECTION_TARGET_CLASS_NOT_DEFINED = "VIRTUAL_ATTRIBUTE_ELEMENT_COLLECTION_TARGET_CLASS_NOT_DEFINED";
	public static final String ELEMENT_COLLECTION_MAP_KEY_CLASS_NOT_DEFINED = "ELEMENT_COLLECTION_MAP_KEY_CLASS_NOT_DEFINED";
	public static final String VIRTUAL_ATTRIBUTE_ELEMENT_COLLECTION_MAP_KEY_CLASS_NOT_DEFINED = "VIRTUAL_ATTRIBUTE_ELEMENT_COLLECTION_MAP_KEY_CLASS_NOT_DEFINED";
	public static final String ELEMENT_COLLECTION_TARGET_CLASS_MUST_BE_EMBEDDABLE_OR_BASIC_TYPE = "ELEMENT_COLLECTION_TARGET_CLASS_MUST_BE_EMBEDDABLE_OR_BASIC_TYPE";
	public static final String VIRTUAL_ATTRIBUTE_ELEMENT_COLLECTION_TARGET_CLASS_MUST_BE_EMBEDDABLE_OR_BASIC_TYPE = "VIRTUAL_ATTRIBUTE_ELEMENT_COLLECTION_TARGET_CLASS_MUST_BE_EMBEDDABLE_OR_BASIC_TYPE";
	public static final String MAP_KEY_COLUMN_UNRESOLVED_NAME="MAP_KEY_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_MAP_KEY_COLUMN_UNRESOLVED_NAME="VIRTUAL_ATTRIBUTE_MAP_KEY_COLUMN_UNRESOLVED_NAME";
	public static final String COLLECTION_TABLE_UNRESOLVED_CATALOG = "COLLECTION_TABLE_UNRESOLVED_CATALOG";
	public static final String COLLECTION_TABLE_UNRESOLVED_SCHEMA = "COLLECTION_TABLE_UNRESOLVED_SCHEMA";
	public static final String VIRTUAL_ATTRIBUTE_COLLECTION_TABLE_UNRESOLVED_CATALOG = "VIRTUAL_ATTRIBUTE_COLLECTION_TABLE_UNRESOLVED_CATALOG";
	public static final String VIRTUAL_ATTRIBUTE_COLLECTION_TABLE_UNRESOLVED_SCHEMA = "VIRTUAL_ATTRIBUTE_COLLECTION_TABLE_UNRESOLVED_SCHEMA";
	public static final String COLLECTION_TABLE_UNRESOLVED_NAME = "COLLECTION_TABLE_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_COLLECTION_TABLE_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_COLLECTION_TABLE_UNRESOLVED_NAME";
	public static final String ORDER_COLUMN_UNRESOLVED_NAME = "ORDER_COLUMN_UNRESOLVED_NAME";
	public static final String VIRTUAL_ATTRIBUTE_ORDER_COLUMN_UNRESOLVED_NAME = "VIRTUAL_ATTRIBUTE_ORDER_COLUMN_UNRESOLVED_NAME";

	public static final String VIRTUAL_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID="VIRTUAL_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID="VIRTUAL_ATTRIBUTE_MAP_KEY_ATTRIBUTE_OVERRIDE_COLUMN_TABLE_NOT_VALID";
	public static final String MAP_KEY_COLUMN_TABLE_NOT_VALID="MAP_KEY_COLUMN_TABLE_NOT_VALID";
	public static final String VIRTUAL_ATTRIBUTE_MAP_KEY_COLUMN_TABLE_NOT_VALID="VIRTUAL_ATTRIBUTE_MAP_KEY_COLUMN_TABLE_NOT_VALID";

}