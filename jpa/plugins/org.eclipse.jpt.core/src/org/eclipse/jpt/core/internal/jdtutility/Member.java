/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.jdtutility;

import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jpt.core.utility.TextRange;

public interface Member {

	IMember getJdtMember();

	boolean wraps(IMember member);

	Type topLevelDeclaringType();

	CompilationUnit astRoot();

	BodyDeclaration bodyDeclaration(CompilationUnit astRoot);

	IBinding binding(CompilationUnit astRoot);

	ModifiedDeclaration modifiedDeclaration();

	ModifiedDeclaration modifiedDeclaration(CompilationUnit astRoot);

	TextRange textRange(CompilationUnit astRoot);

	TextRange nameTextRange(CompilationUnit astRoot);

	TextRange annotationTextRange(DeclarationAnnotationAdapter adapter, CompilationUnit astRoot);

	TextRange annotationElementTextRange(DeclarationAnnotationElementAdapter<?> adapter, CompilationUnit astRoot);

	void newMarkerAnnotation(DeclarationAnnotationAdapter adapter);

	void edit(Editor editor);


	// ********** "editor" interface **********

	/**
	 * This interface defines a callback that is invoked when the member's
	 * compilation unit is in a state to be manipulated.
	 */
	public interface Editor {

		/**
		 * Edit the specified declaration.
		 */
		void edit(ModifiedDeclaration declaration);

	}

}
