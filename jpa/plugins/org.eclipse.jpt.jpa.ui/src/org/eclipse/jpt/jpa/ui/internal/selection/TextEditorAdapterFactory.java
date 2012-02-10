/*******************************************************************************
 * Copyright (c) 2006, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.ui.internal.selection;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jpt.jpa.ui.selection.JpaEditorManager;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Factory to build JPA selection adapters for a {@link ITextEditor}:<ul>
 * <li>{@link org.eclipse.jpt.jpa.ui.selection.JpaEditorManager}
 * </ul>
 * See <code>org.eclipse.jpt.jpa.ui/plugin.xml</code>.
 */
public class TextEditorAdapterFactory
	implements IAdapterFactory
{
	private static final Class<?>[] ADAPTER_LIST = new Class[] { JpaEditorManager.class };

	public Class<?>[] getAdapterList() {
		return ADAPTER_LIST;
	}

	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
		if (adaptableObject instanceof ITextEditor) {
			return this.getAdapter((ITextEditor) adaptableObject, adapterType);
		}
		return null;
	}

	private Object getAdapter(ITextEditor editor, Class<?> adapterType) {
		if (adapterType == JpaEditorManager.class) {
			return this.buildJpaTextEditorManager(editor);
		}
		return null;
	}

	private JpaEditorManager buildJpaTextEditorManager(ITextEditor editor) {
		return new JpaTextEditorManager(editor);
	}
}
