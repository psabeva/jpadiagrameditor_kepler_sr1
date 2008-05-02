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
import org.eclipse.jpt.core.resource.java.EmbeddedIdAnnotation;
import org.eclipse.jpt.core.resource.java.JPA;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentAttribute;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentType;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

public class EmbeddedIdTests extends JavaResourceModelTestCase {

	public EmbeddedIdTests(String name) {
		super(name);
	}

	private IType createTestEmbeddedId() throws Exception {
		this.createAnnotationAndMembers("EmbeddedId", "");
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.EMBEDDED_ID);
			}
			@Override
			public void appendIdFieldAnnotationTo(StringBuilder sb) {
				sb.append("@EmbeddedId");
			}
		});
	}
	
	public void testEmbeddedId() throws Exception {
		IType testType = this.createTestEmbeddedId();
		JavaResourcePersistentType typeResource = buildJavaTypeResource(testType); 
		JavaResourcePersistentAttribute attributeResource = typeResource.fields().next();
		
		JavaResourceNode mappingAnnotation = attributeResource.getMappingAnnotation();
		assertTrue(mappingAnnotation instanceof EmbeddedIdAnnotation);
	}

}
