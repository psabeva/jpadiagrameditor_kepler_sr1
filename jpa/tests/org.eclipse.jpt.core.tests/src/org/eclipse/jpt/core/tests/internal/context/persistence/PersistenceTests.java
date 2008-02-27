/*******************************************************************************
 *  Copyright (c) 2007 Oracle. 
 *  All rights reserved.  This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.tests.internal.context.persistence;

import org.eclipse.jpt.core.context.persistence.Persistence;
import org.eclipse.jpt.core.resource.persistence.PersistenceFactory;
import org.eclipse.jpt.core.resource.persistence.PersistenceResource;
import org.eclipse.jpt.core.resource.persistence.XmlPersistence;
import org.eclipse.jpt.core.resource.persistence.XmlPersistenceUnit;
import org.eclipse.jpt.core.tests.internal.context.ContextModelTestCase;

public class PersistenceTests extends ContextModelTestCase
{
	public PersistenceTests(String name) {
		super(name);
	}
	
	protected Persistence persistence() {
		return jpaContent().getPersistenceXml().getPersistence();
	}
	
	public void testUpdateAddPersistenceUnit() throws Exception {
		PersistenceResource prm = persistenceResource();
		XmlPersistence xmlPersistence = prm.getPersistence();
		Persistence persistence = jpaContent().getPersistenceXml().getPersistence();
		
		// clear xml persistence units, test that it's clear in context
		xmlPersistence.getPersistenceUnits().clear();
		
		assertEquals(0, persistence.persistenceUnitsSize());
		
		// add xml persistence unit, test that it's added to context
		XmlPersistenceUnit xmlPersistenceUnit = PersistenceFactory.eINSTANCE.createXmlPersistenceUnit();
		xmlPersistenceUnit.setName("test");
		xmlPersistence.getPersistenceUnits().add(xmlPersistenceUnit);
		
		assertEquals(1, persistence.persistenceUnitsSize());
		
		// add another, test that it *isn't* add to context
		xmlPersistenceUnit = PersistenceFactory.eINSTANCE.createXmlPersistenceUnit();
		xmlPersistenceUnit.setName("test2");
		xmlPersistence.getPersistenceUnits().add(xmlPersistenceUnit);
		
		assertEquals(1, persistence.persistenceUnitsSize());
	}
	
	public void testModifyAddPersistencUnit() {
		XmlPersistence xmlPersistence = xmlPersistence();
		Persistence persistence = persistence();
		
		// clear xml persistence units, test that it's clear in context
		xmlPersistence.getPersistenceUnits().clear();
		assertEquals(0, persistence.persistenceUnitsSize());
		
		// add persistence unit, test that it's added to resource
		persistence.addPersistenceUnit();
		
		assertEquals(1, persistence.persistenceUnitsSize());
		
		// add another, test that we get an exception
		boolean exception = false;
		try {
			persistence.addPersistenceUnit();
		}
		catch (IllegalStateException e) {
			exception = true;
		}
		
		assertTrue(exception);
	}
	
	public void testUpdateRemovePersistenceUnit() throws Exception {
		PersistenceResource prm = persistenceResource();
		XmlPersistence xmlPersistence = prm.getPersistence();
		Persistence persistence = jpaContent().getPersistenceXml().getPersistence();
		
		// add a persistence unit and test that there are two existing xml and 
		// one context persistence unit
		XmlPersistenceUnit xmlPersistenceUnit = PersistenceFactory.eINSTANCE.createXmlPersistenceUnit();
		xmlPersistenceUnit.setName("test");
		xmlPersistence.getPersistenceUnits().add(xmlPersistenceUnit);
		
		assertEquals(2, xmlPersistence.getPersistenceUnits().size());
		assertEquals(1, persistence.persistenceUnitsSize());
		
		// remove persistence unit from xml, test that context remains unchanged
		xmlPersistenceUnit = xmlPersistence.getPersistenceUnits().get(0);
		xmlPersistence.getPersistenceUnits().remove(xmlPersistenceUnit);
		
		assertEquals(1, xmlPersistence.getPersistenceUnits().size());
		assertEquals(1, persistence.persistenceUnitsSize());
		
		// remove another one from xml, text that it's now removed from context
		xmlPersistenceUnit = xmlPersistence.getPersistenceUnits().get(0);
		xmlPersistence.getPersistenceUnits().remove(xmlPersistenceUnit);
		
		assertEquals(0, xmlPersistence.getPersistenceUnits().size());
		assertEquals(0, persistence.persistenceUnitsSize());
	}
	
	public void testModifyRemovePersistenceUnit() {
		XmlPersistence xmlPersistence = xmlPersistence();
		Persistence persistence = persistence();
		
		// add a persistence unit and test that there are two existing xml and 
		// one context persistence unit
		XmlPersistenceUnit xmlPersistenceUnit = PersistenceFactory.eINSTANCE.createXmlPersistenceUnit();
		xmlPersistenceUnit.setName("test");
		xmlPersistence.getPersistenceUnits().add(xmlPersistenceUnit);
		
		assertEquals(2, xmlPersistence.getPersistenceUnits().size());
		assertEquals(1, persistence.persistenceUnitsSize());
		
		// remove persistence unit, test that it's removed from resource and that
		// a *new* persistence unit representing the previously unrepresented one
		// is present
		persistence.removePersistenceUnit(0);
		
		assertEquals(1, xmlPersistence.getPersistenceUnits().size());
		assertEquals(1, persistence.persistenceUnitsSize());
		
		// remove new persistence unit, test that it's removed from resource and 
		// context
		persistence.removePersistenceUnit(0);
		
		assertEquals(0, xmlPersistence.getPersistenceUnits().size());
		assertEquals(0, persistence.persistenceUnitsSize());
	}
}
