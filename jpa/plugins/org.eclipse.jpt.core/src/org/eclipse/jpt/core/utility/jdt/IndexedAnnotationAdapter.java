/*******************************************************************************
 * Copyright (c) 2006, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.utility.jdt;


/**
 * Adapt an indexed Java annotation with a simple-to-use interface.
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * This interface is not intended to be implemented by clients.
 */
public interface IndexedAnnotationAdapter extends AnnotationAdapter {

	/**
	 * Return the the index at which the annotation is situated.
	 */
	int getIndex();

	/**
	 * Move the annotation to the specified index, leaving its original
	 * position cleared out.
	 */
	void moveAnnotation(int newIndex);

}
