/*******************************************************************************
 *  Copyright (c) 2006, 2007  Oracle. 
 *  All rights reserved.  This program and the accompanying materials are 
 *  made available under the terms of the Eclipse Public License v1.0 which 
 *  accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.internal.resource.persistence.translators;

import org.eclipse.jpt.core.resource.persistence.PersistencePackage;

public interface PersistenceXmlMapper
{
	PersistencePackage PERSISTENCE_PKG = PersistencePackage.eINSTANCE;
	
	String XML_NS = "xmlns";  //$NON-NLS-1$
	String XML_NS_XSI = "xmlns:xsi";  //$NON-NLS-1$
	String XSI_SCHEMA_LOCATION = "xsi:schemaLocation";  //$NON-NLS-1$
	String XSI_NS_URL = "http://www.w3.org/2001/XMLSchema-instance";  //$NON-NLS-1$
	String PERSISTENCE_NS_URL = "http://java.sun.com/xml/ns/persistence";  //$NON-NLS-1$
	String PERSISTENCE_SCHEMA_LOC_1_0 = "http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd";  //$NON-NLS-1$
	
	
	String CLASS = "class";  //$NON-NLS-1$
	String DESCRIPTION = "description";  //$NON-NLS-1$
	String EXCLUDE_UNLISTED_CLASSES = "exclude-unlisted-classes";  //$NON-NLS-1$
	String JAR_FILE = "jar-file";  //$NON-NLS-1$
	String JTA_DATA_SOURCE = "jta-data-source";  //$NON-NLS-1$
	String MAPPING_FILE = "mapping-file";  //$NON-NLS-1$
	String NAME = "name";  //$NON-NLS-1$
	String NON_JTA_DATA_SOURCE = "non-jta-data-source";  //$NON-NLS-1$
	String PERSISTENCE = "persistence";  //$NON-NLS-1$
	String PERSISTENCE_UNIT = "persistence-unit";  //$NON-NLS-1$
	String PROPERTIES = "properties";  //$NON-NLS-1$
	String PROPERTY = "property";  //$NON-NLS-1$
	String PROVIDER = "provider";  //$NON-NLS-1$
	String TRANSACTION_TYPE = "transaction-type";  //$NON-NLS-1$
	String VALUE = "value";  //$NON-NLS-1$
	String VERSION = "version";  //$NON-NLS-1$
}
