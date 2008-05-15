/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.utility.jdt;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * Type: just some covariant overrides.
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * This interface is not intended to be implemented by clients.
 */
public interface Type extends Member {

	/**
	 * Covariant override.
	 */
	ITypeBinding getBinding(CompilationUnit astRoot);

	/**
	 * Covariant override.
	 */
	TypeDeclaration getBodyDeclaration(CompilationUnit astRoot);

	/**
	 * Return the type's nested types (does not include annotations or enums).
	 */
	TypeDeclaration[] getTypes(CompilationUnit astRoot);

	/**
	 * Return the type's fields.
	 */
	FieldDeclaration[] getFields(CompilationUnit astRoot);

	/**
	 * Return the type's methods.
	 */
	MethodDeclaration[] getMethods(CompilationUnit astRoot);

}
