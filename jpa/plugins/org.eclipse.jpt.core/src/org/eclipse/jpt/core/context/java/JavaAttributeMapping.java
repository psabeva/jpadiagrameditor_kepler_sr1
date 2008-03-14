/*******************************************************************************
 * Copyright (c) 2006, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.context.java;

import java.util.Iterator;
import org.eclipse.jpt.core.context.AttributeMapping;
import org.eclipse.jpt.core.resource.java.JavaResourcePersistentAttribute;

/**
 * 
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface JavaAttributeMapping extends AttributeMapping, JavaJpaContextNode
{
	JavaPersistentAttribute persistentAttribute();
	
	void initializeFromResource(JavaResourcePersistentAttribute resourcePersistentAttribute);

	void update(JavaResourcePersistentAttribute resourcePersistentAttribute);
	
	String annotationName();
	
	/**
	 * Return all fully qualfied annotation names that are supported with this mapping type.
	 * This includes all possible annotations, not just the ones that currently exist on the attribute.
	 */
	Iterator<String> correspondingAnnotationNames();

}
