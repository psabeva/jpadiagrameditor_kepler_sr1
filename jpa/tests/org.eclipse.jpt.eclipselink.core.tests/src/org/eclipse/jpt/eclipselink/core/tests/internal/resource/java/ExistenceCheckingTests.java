/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.eclipselink.core.tests.internal.resource.java;

import java.util.Iterator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.eclipselink.core.resource.java.EclipseLinkJPA;
import org.eclipse.jpt.eclipselink.core.resource.java.ExistenceCheckingAnnotation;
import org.eclipse.jpt.eclipselink.core.resource.java.ExistenceType;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

@SuppressWarnings("nls")
public class ExistenceCheckingTests extends EclipseLinkJavaResourceModelTestCase {

	public ExistenceCheckingTests(String name) {
		super(name);
	}

	private void createExistenceTypeEnum() throws Exception {
		this.createEnumAndMembers("ExistenceType", "CHECK_CACHE, CHECK_DATABASE, ASSUME_EXISTENCE, ASSUME_NON_EXISTENCE;");	
	}
	
	private void createExistenceCheckingAnnotation() throws Exception {
		this.createAnnotationAndMembers("ExistenceChecking", "ExistenceType value() default CHECK_CACHE;");
		createExistenceTypeEnum();
	}
	
	private ICompilationUnit createTestExistenceChecking() throws Exception {
		createExistenceCheckingAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(EclipseLinkJPA.EXISTENCE_CHECKING, EclipseLinkJPA.EXISTENCE_TYPE);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@ExistenceChecking");
			}
		});
	}
	
	private ICompilationUnit createTestExistenceCheckingWithValue() throws Exception {
		createExistenceCheckingAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(EclipseLinkJPA.EXISTENCE_CHECKING, EclipseLinkJPA.EXISTENCE_TYPE);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@ExistenceChecking(ExistenceType.ASSUME_EXISTENCE)");
			}
		});
	}

	public void testExistenceChecking() throws Exception {
		ICompilationUnit cu = this.createTestExistenceChecking();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(cu); 
		
		ExistenceCheckingAnnotation existenceChecking = (ExistenceCheckingAnnotation) typeResource.getSupportingAnnotation(EclipseLinkJPA.EXISTENCE_CHECKING);
		assertNotNull(existenceChecking);
	}

	public void testGetValue() throws Exception {
		ICompilationUnit cu = this.createTestExistenceCheckingWithValue();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(cu);
		
		ExistenceCheckingAnnotation existenceChecking = (ExistenceCheckingAnnotation) typeResource.getSupportingAnnotation(EclipseLinkJPA.EXISTENCE_CHECKING);
		assertEquals(ExistenceType.ASSUME_EXISTENCE, existenceChecking.getValue());
	}

	public void testSetValue() throws Exception {
		ICompilationUnit cu = this.createTestExistenceCheckingWithValue();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(cu);
		
		ExistenceCheckingAnnotation existenceChecking = (ExistenceCheckingAnnotation) typeResource.getSupportingAnnotation(EclipseLinkJPA.EXISTENCE_CHECKING);
		assertEquals(ExistenceType.ASSUME_EXISTENCE, existenceChecking.getValue());
		
		existenceChecking.setValue(ExistenceType.ASSUME_NON_EXISTENCE);
		assertEquals(ExistenceType.ASSUME_NON_EXISTENCE, existenceChecking.getValue());
		
		assertSourceContains("@ExistenceChecking(ASSUME_NON_EXISTENCE)", cu);
		
		existenceChecking.setValue(null);
		assertNull(existenceChecking.getValue());
		
		assertSourceDoesNotContain("(ASSUME_NON_EXISTENCE)", cu);
		assertSourceContains("@ExistenceChecking", cu);
		assertSourceDoesNotContain("@ExistenceChecking(", cu);
	}
}
