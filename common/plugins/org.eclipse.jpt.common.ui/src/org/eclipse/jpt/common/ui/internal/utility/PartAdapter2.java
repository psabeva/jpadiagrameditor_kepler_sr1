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
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;

/**
 * Convenience implementation of {@link IPartListener2}.
 */
public class PartAdapter2
	implements IPartListener2
{
	public void partOpened(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partActivated(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partVisible(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partHidden(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// do nothing
	}
	public void partClosed(IWorkbenchPartReference partRef) {
		// do nothing
	}
	@Override
	public String toString() {
		return StringTools.buildToStringFor(this);
	}
}
