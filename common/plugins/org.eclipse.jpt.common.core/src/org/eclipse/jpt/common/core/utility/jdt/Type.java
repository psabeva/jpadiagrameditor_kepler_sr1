/*******************************************************************************
 * Copyright (c) 2008, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.common.core.utility.jdt;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * Type: nestedTypes, nestedEnums, fields, and methods.
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * This interface is not intended to be implemented by clients.
 */
public interface Type extends AbstractType {

	/**
	 * Covariant override.
	 */
	TypeDeclaration getBodyDeclaration(CompilationUnit astRoot);

	/**
	 * Return the type's nested types (does not include annotations or enums).
	 */
	//TODO remove this, implementation now just calls typeDeclaration.getTypes()
	TypeDeclaration[] getTypes(TypeDeclaration typeDeclaration);

	/**
	 * Return the type's nested enums.
	 */
	//TODO remove this
	EnumDeclaration[] getEnums(TypeDeclaration typeDeclaration);

	/**
	 * Return the type's fields.
	 */
	//TODO remove this
	FieldDeclaration[] getFields(TypeDeclaration typeDeclaration);

	/**
	 * Return the type's methods.
	 */
	//TODO remove this
	MethodDeclaration[] getMethods(TypeDeclaration typeDeclaration);

}
