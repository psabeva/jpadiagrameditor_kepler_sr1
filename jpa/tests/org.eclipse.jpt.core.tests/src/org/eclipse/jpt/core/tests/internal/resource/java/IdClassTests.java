/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.tests.internal.resource.java;

import java.util.Iterator;
import org.eclipse.jdt.core.IType;
import org.eclipse.jpt.core.resource.java.IdClassAnnotation;
import org.eclipse.jpt.core.resource.java.JPA;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

public class IdClassTests extends JavaResourceModelTestCase {

	private static final String ID_CLASS_VALUE = "MyClass";
	
	public IdClassTests(String name) {
		super(name);
	}

	private void createIdClassAnnotation() throws Exception {
		this.createAnnotationAndMembers("IdClass", "Class value();");
	}
	
	private IType createTestIdClass() throws Exception {
		createIdClassAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.ID_CLASS);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@IdClass");
			}
		});
	}
	
	private IType createTestIdClassWithValue() throws Exception {
		createIdClassAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.ID_CLASS);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@IdClass(" + ID_CLASS_VALUE + ".class)");
			}
		});
	}

	public void testIdClass() throws Exception {
		IType testType = this.createTestIdClass();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		IdClassAnnotation idClass = (IdClassAnnotation) typeResource.getAnnotation(JPA.ID_CLASS);
		assertNotNull(idClass);
		assertNull(idClass.getValue());
	}

	public void testGetValue() throws Exception {
		IType testType = this.createTestIdClassWithValue();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType);
		
		IdClassAnnotation idClass = (IdClassAnnotation) typeResource.getAnnotation(JPA.ID_CLASS);
		assertEquals(ID_CLASS_VALUE, idClass.getValue());
	}

	public void testSetValue() throws Exception {
		IType testType = this.createTestIdClassWithValue();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType);
		
		IdClassAnnotation idClass = (IdClassAnnotation) typeResource.getAnnotation(JPA.ID_CLASS);
		assertEquals(ID_CLASS_VALUE, idClass.getValue());
		
		idClass.setValue("foo");
		assertEquals("foo", idClass.getValue());
		
		assertSourceContains("@IdClass(foo.class)");
		
		idClass.setValue(null);
		
		assertSourceDoesNotContain("@IdClass");
				
		idClass = (IdClassAnnotation) typeResource.getAnnotation(JPA.ID_CLASS);
		assertNull(idClass);
	}
	
	public void testGetFullyQualifiedClass() throws Exception {
		IType testType = this.createTestIdClassWithValue();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType);

		IdClassAnnotation idClass = (IdClassAnnotation) typeResource.getAnnotation(JPA.ID_CLASS);
		assertNotNull(idClass.getValue());
		assertEquals("MyClass", idClass.getFullyQualifiedClass()); //bug 196200 changed this


		idClass.setValue(TYPE_NAME);
				
		assertEquals(FULLY_QUALIFIED_TYPE_NAME, idClass.getFullyQualifiedClass());				
		assertSourceContains("@IdClass(" + TYPE_NAME + ".class)");
	}

}
