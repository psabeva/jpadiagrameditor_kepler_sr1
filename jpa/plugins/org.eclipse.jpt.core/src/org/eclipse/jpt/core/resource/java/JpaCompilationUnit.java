/*******************************************************************************
 * Copyright (c) 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.resource.java;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jpt.core.JpaAnnotationProvider;
import org.eclipse.jpt.core.utility.jdt.AnnotationEditFormatter;
import org.eclipse.jpt.utility.CommandExecutorProvider;

/**
 * 
 * 
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface JpaCompilationUnit extends JavaResourceNode {

	ICompilationUnit getCompilationUnit();

	JavaResourcePersistentType getPersistentType();
		String PERSISTENT_TYPE_PROPERTY = "persistentType";

	// TODO rename getJavaResourcePersistentType(String)
	JavaResourcePersistentType getJavaPersistentTypeResource(String typeName);

	JpaAnnotationProvider getAnnotationProvider();

	CommandExecutorProvider getModifySharedDocumentCommandExecutorProvider();
	
	AnnotationEditFormatter getAnnotationEditFormatter();

	void resourceChanged();
	
	/**
	 * Resolve type information that could be dependent on other files being added/removed
	 */
	void resolveTypes();

	void updateFromJava();

}
