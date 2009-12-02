/*******************************************************************************
* Copyright (c) 2009 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0, which accompanies this distribution
* and is available at http://www.eclipse.org/legal/epl-v10.html.
* 
* Contributors:
*     Oracle - initial API and implementation
*******************************************************************************/
package org.eclipse.jpt.core.jpa2.resource.java;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.resource.java.NamedQueryAnnotation;
import org.eclipse.jpt.core.utility.TextRange;

/**
 *  NamedQuery2_0Annotation
 */
public interface NamedQuery2_0Annotation
	extends NamedQueryAnnotation
{
	// ********** lockMode **********
	/**
	 * Corresponds to the 'lockMode' element of the NamedQuery annotation.
	 * Return null if the element does not exist in Java.
	 */
	LockModeType_2_0 getLockMode();
		String LOCK_MODE_PROPERTY = "lockMode"; //$NON-NLS-1$

	/**
	 * Corresponds to the 'lockMode' element of the NamedQuery annotation.
	 * Set to null to remove the element. If no other elements exist
	 * the NamedQuery annotation will be removed as well.
	 */
	void setLockMode(LockModeType_2_0 lockMode);

	/**
	 * Return the {@link TextRange} for the 'lockMode' element. If the element 
	 * does not exist return the {@link TextRange} for the NamedQuery annotation.
	 */
	TextRange getLockModeTextRange(CompilationUnit astRoot);

	/**
	 * Return whether the specified position touches the 'lockMode' element.
	 * Return false if the element does not exist.
	 */
	boolean lockModeTouches(int pos, CompilationUnit astRoot);

}