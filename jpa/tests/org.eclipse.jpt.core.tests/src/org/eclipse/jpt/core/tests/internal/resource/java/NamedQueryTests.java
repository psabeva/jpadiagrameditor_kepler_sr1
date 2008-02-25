/*******************************************************************************
 * Copyright (c) 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.tests.internal.resource.java;

import java.util.Iterator;
import java.util.ListIterator;
import org.eclipse.jdt.core.IType;
import org.eclipse.jpt.core.internal.jdtutility.JDTTools;
import org.eclipse.jpt.core.resource.java.JPA;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.core.resource.java.NamedQueryAnnotation;
import org.eclipse.jpt.core.resource.java.QueryHintAnnotation;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

public class NamedQueryTests extends JavaResourceModelTestCase {

	private static final String QUERY_NAME = "myQuery";
	private static final String QUERY_QUERY = "SELECT name FROM Employee";
	
	public NamedQueryTests(String name) {
		super(name);
	}

	private void createNamedQueryAnnotation() throws Exception {
		createQueryHintAnnotation();
		this.createAnnotationAndMembers("NamedQuery", "String name(); " +
			"String query();" + 
			"QueryHint[] hints() default{};");
	}
	
	private void createQueryHintAnnotation() throws Exception {
		this.createAnnotationAndMembers("QueryHint", "String name(); " +
			"String value();");
	}
	
	private IType createTestNamedQuery() throws Exception {
		createNamedQueryAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.NAMED_QUERY);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@NamedQuery");
			}
		});
	}
	
	private IType createTestNamedQueryWithName() throws Exception {
		return createTestNamedQueryWithStringElement("name", QUERY_NAME);
	}
	
	private IType createTestNamedQueryWithQuery() throws Exception {
		return createTestNamedQueryWithStringElement("query", QUERY_QUERY);
	}
	
	private IType createTestNamedQueryWithStringElement(final String elementName, final String value) throws Exception {
		createNamedQueryAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.NAMED_QUERY);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@NamedQuery(" + elementName + "=\"" + value + "\")");
			}
		});
	}

	private IType createTestNamedQueryWithQueryHints() throws Exception {
		createNamedQueryAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.NAMED_QUERY, JPA.QUERY_HINT);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@NamedQuery(hints={@QueryHint(name=\"BAR\", value=\"FOO\"), @QueryHint})");
			}
		});
	}

	public void testNamedQuery() throws Exception {
		IType testType = this.createTestNamedQuery();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType);
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		assertNotNull(namedQuery);
	}

	public void testGetName() throws Exception {
		IType testType = this.createTestNamedQueryWithName();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		assertEquals(QUERY_NAME, namedQuery.getName());
	}

	public void testSetName() throws Exception {
		IType testType = this.createTestNamedQueryWithName();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		assertEquals(QUERY_NAME, namedQuery.getName());
		
		namedQuery.setName("foo");
		assertEquals("foo", namedQuery.getName());
		
		assertSourceContains("@NamedQuery(name=\"foo\")");
		
		namedQuery.setName(null);
		assertNull(namedQuery.getName());
		
		assertSourceDoesNotContain("@NamedQuery");
	}

	public void testGetQuery() throws Exception {
		IType testType = this.createTestNamedQueryWithQuery();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		assertEquals(QUERY_QUERY, namedQuery.getQuery());
	}

	public void testSetQuery() throws Exception {
		IType testType = this.createTestNamedQueryWithQuery();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		assertEquals(QUERY_QUERY, namedQuery.getQuery());
		
		namedQuery.setQuery("foo");
		assertEquals("foo", namedQuery.getQuery());
		
		assertSourceContains("@NamedQuery(query=\"foo\")");
		
		namedQuery.setQuery(null);
		assertNull(namedQuery.getQuery());
		
		assertSourceDoesNotContain("@NamedQuery");
	}
	
	public void testHints() throws Exception {
		IType testType = this.createTestNamedQuery();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		
		assertEquals(0, namedQuery.hintsSize());
	}
	
	public void testHints2() throws Exception {
		IType testType = this.createTestNamedQuery();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		
		namedQuery.addHint(0);
		namedQuery.addHint(1);
		namedQuery.updateFromJava(JDTTools.buildASTRoot(testType));
		
		assertEquals(2, namedQuery.hintsSize());
	}
	
	public void testHints3() throws Exception {
		IType testType = this.createTestNamedQueryWithQueryHints();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		
		assertEquals(2, namedQuery.hintsSize());
		
		ListIterator<QueryHintAnnotation> iterator = namedQuery.hints();
		assertEquals("BAR", iterator.next().getName());
		assertNull(iterator.next().getName());
	}
	
	public void testAddHint() throws Exception {
		IType testType = this.createTestNamedQuery();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		
		namedQuery.addHint(0).setName("FOO");
		namedQuery.addHint(1);
		QueryHintAnnotation queryHint = namedQuery.addHint(0);
		queryHint.setName("BAR");

		assertEquals("BAR", namedQuery.hintAt(0).getName());
		assertEquals("FOO", namedQuery.hintAt(1).getName());
		assertNull(namedQuery.hintAt(2).getName());
		assertSourceContains("@NamedQuery(hints={@QueryHint(name=\"BAR\"),@QueryHint(name=\"FOO\"), @QueryHint})");
	}
	
	public void testRemoveHint() throws Exception {
		IType testType = this.createTestNamedQueryWithQueryHints();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		namedQuery.addHint(0).setName("BAZ");
		
		assertEquals("BAZ", namedQuery.hintAt(0).getName());
		assertEquals("BAR", namedQuery.hintAt(1).getName());
		assertNull(namedQuery.hintAt(2).getName());
		assertEquals(3, namedQuery.hintsSize());
		
		namedQuery.removeHint(2);
		assertEquals("BAZ", namedQuery.hintAt(0).getName());
		assertEquals("BAR", namedQuery.hintAt(1).getName());
		assertEquals(2, namedQuery.hintsSize());
		assertSourceContains("@NamedQuery(hints={@QueryHint(name=\"BAZ\"), @QueryHint(name=\"BAR\", value=\"FOO\")})");
		
		namedQuery.removeHint(0);
		assertEquals("BAR", namedQuery.hintAt(0).getName());
		assertEquals(1, namedQuery.hintsSize());
		assertSourceContains("@NamedQuery(hints=@QueryHint(name=\"BAR\", value=\"FOO\"))");
		
		namedQuery.removeHint(0);
		assertEquals(0, namedQuery.hintsSize());
		assertSourceDoesNotContain("@NamedQuery");
	}
	
	public void testMoveHint() throws Exception {
		IType testType = this.createTestNamedQueryWithQueryHints();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		namedQuery.addHint(0).setName("BAZ");
		
		assertEquals("BAZ", namedQuery.hintAt(0).getName());
		assertEquals("BAR", namedQuery.hintAt(1).getName());
		assertNull(namedQuery.hintAt(2).getName());
		assertEquals(3, namedQuery.hintsSize());
	
		namedQuery.moveHint(2, 0);
		
		assertEquals("BAR", namedQuery.hintAt(0).getName());
		assertNull(namedQuery.hintAt(1).getName());
		assertEquals("BAZ", namedQuery.hintAt(2).getName());
		assertEquals(3, namedQuery.hintsSize());
		assertSourceContains("@NamedQuery(hints={@QueryHint(name=\"BAR\", value=\"FOO\"), @QueryHint, @QueryHint(name=\"BAZ\")})");
	}
	
	public void testMoveHint2() throws Exception {
		IType testType = this.createTestNamedQueryWithQueryHints();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		
		NamedQueryAnnotation namedQuery = (NamedQueryAnnotation) typeResource.annotation(JPA.NAMED_QUERY);
		namedQuery.addHint(0).setName("BAZ");
		
		assertEquals("BAZ", namedQuery.hintAt(0).getName());
		assertEquals("BAR", namedQuery.hintAt(1).getName());
		assertNull(namedQuery.hintAt(2).getName());
		assertEquals(3, namedQuery.hintsSize());
	
		namedQuery.moveHint(0, 2);
		
		assertNull(namedQuery.hintAt(0).getName());
		assertEquals("BAZ", namedQuery.hintAt(1).getName());
		assertEquals("BAR", namedQuery.hintAt(2).getName());
		assertEquals(3, namedQuery.hintsSize());
		assertSourceContains("@NamedQuery(hints={@QueryHint, @QueryHint(name=\"BAZ\"), @QueryHint(name=\"BAR\", value=\"FOO\")})");
	}
	
}
