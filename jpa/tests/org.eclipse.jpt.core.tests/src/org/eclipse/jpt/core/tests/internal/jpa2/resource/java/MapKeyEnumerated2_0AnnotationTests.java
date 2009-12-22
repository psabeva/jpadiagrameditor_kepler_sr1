/*******************************************************************************
 * Copyright (c) 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.tests.internal.jpa2.resource.java;

import java.util.Iterator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jpt.core.jpa2.resource.java.JPA2_0;
import org.eclipse.jpt.core.jpa2.resource.java.MapKeyEnumerated2_0Annotation;
import org.eclipse.jpt.core.resource.java.EnumType;
import org.eclipse.jpt.core.resource.java.JPA;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentAttribute;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

@SuppressWarnings("nls")
public class MapKeyEnumerated2_0AnnotationTests extends JavaResourceModel2_0TestCase {

	public MapKeyEnumerated2_0AnnotationTests(String name) {
		super(name);
	}

	private ICompilationUnit createTestMapKeyEnumerated() throws Exception {
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA2_0.MAP_KEY_ENUMERATED);
			}
			@Override
			public void appendIdFieldAnnotationTo(StringBuilder sb) {
				sb.append("@MapKeyEnumerated");
			}
		});
	}
	
	private ICompilationUnit createTestMapKeyEnumeratedWithValue() throws Exception {
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA2_0.MAP_KEY_ENUMERATED, JPA.ENUM_TYPE);
			}
			@Override
			public void appendIdFieldAnnotationTo(StringBuilder sb) {
				sb.append("@MapKeyEnumerated(EnumType.ORDINAL)");
			}
		});
	}

	public void testMapKeyEnumerated() throws Exception {
		ICompilationUnit cu = this.createTestMapKeyEnumerated();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(cu); 
		JavaResourcePersistentAttribute attributeResource = typeResource.fields().next();
		
		MapKeyEnumerated2_0Annotation enumerated = (MapKeyEnumerated2_0Annotation) attributeResource.getAnnotation(JPA2_0.MAP_KEY_ENUMERATED);
		assertNotNull(enumerated);
	}
	
	public void testGetValue() throws Exception {
		ICompilationUnit cu = this.createTestMapKeyEnumeratedWithValue();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(cu); 
		JavaResourcePersistentAttribute attributeResource = typeResource.fields().next();
		
		MapKeyEnumerated2_0Annotation enumerated = (MapKeyEnumerated2_0Annotation) attributeResource.getAnnotation(JPA2_0.MAP_KEY_ENUMERATED);
		assertEquals(EnumType.ORDINAL, enumerated.getValue());
	}
	
	public void testSetValue() throws Exception {
		ICompilationUnit cu = this.createTestMapKeyEnumerated();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(cu); 
		JavaResourcePersistentAttribute attributeResource = typeResource.fields().next();

		MapKeyEnumerated2_0Annotation enumerated = (MapKeyEnumerated2_0Annotation) attributeResource.getAnnotation(JPA2_0.MAP_KEY_ENUMERATED);

		enumerated.setValue(EnumType.STRING);
		
		assertSourceContains("@MapKeyEnumerated(STRING)", cu);
		
		enumerated.setValue(null);
		
		assertSourceDoesNotContain("@MapKeyEnumerated(", cu);
		assertSourceContains("@MapKeyEnumerated", cu);
	}

}