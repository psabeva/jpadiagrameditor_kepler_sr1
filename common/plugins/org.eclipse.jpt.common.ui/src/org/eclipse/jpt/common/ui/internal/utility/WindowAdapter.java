/*******************************************************************************
 * Copyright (c) 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.common.ui.internal.utility;

import org.eclipse.jpt.common.utility.internal.StringTools;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchWindow;

/**
 * Convenience implementation of {@link IWindowListener}.
 */
public class WindowAdapter
	implements IWindowListener
{
	public void windowOpened(IWorkbenchWindow window) {
		// do nothing
	}
	public void windowActivated(IWorkbenchWindow window) {
		// do nothing
	}
	public void windowDeactivated(IWorkbenchWindow window) {
		// do nothing
	}
	public void windowClosed(IWorkbenchWindow window) {
		// do nothing
	}
	@Override
	public String toString() {
		return StringTools.buildToStringFor(this);
	}
}
