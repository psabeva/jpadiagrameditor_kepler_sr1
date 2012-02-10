/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.common.utility.model.listener;

import org.eclipse.jpt.common.utility.internal.StringTools;
import org.eclipse.jpt.common.utility.model.event.CollectionAddEvent;
import org.eclipse.jpt.common.utility.model.event.CollectionChangeEvent;
import org.eclipse.jpt.common.utility.model.event.CollectionClearEvent;
import org.eclipse.jpt.common.utility.model.event.CollectionRemoveEvent;
import org.eclipse.jpt.common.utility.model.event.ListAddEvent;
import org.eclipse.jpt.common.utility.model.event.ListChangeEvent;
import org.eclipse.jpt.common.utility.model.event.ListClearEvent;
import org.eclipse.jpt.common.utility.model.event.ListMoveEvent;
import org.eclipse.jpt.common.utility.model.event.ListRemoveEvent;
import org.eclipse.jpt.common.utility.model.event.ListReplaceEvent;
import org.eclipse.jpt.common.utility.model.event.PropertyChangeEvent;
import org.eclipse.jpt.common.utility.model.event.StateChangeEvent;
import org.eclipse.jpt.common.utility.model.event.TreeAddEvent;
import org.eclipse.jpt.common.utility.model.event.TreeChangeEvent;
import org.eclipse.jpt.common.utility.model.event.TreeClearEvent;
import org.eclipse.jpt.common.utility.model.event.TreeRemoveEvent;

/**
 * Convenience implementation of {@link ChangeListener}.
 * <p>
 * Provisional API: This class is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public class ChangeAdapter
	implements ChangeListener
{
	public ChangeAdapter() {
		super();
	}

	// ***** state
	public void stateChanged(StateChangeEvent event) {
		// do nothing
	}

	// ***** property
	public void propertyChanged(PropertyChangeEvent event) {
		// do nothing
	}

	// ***** collection
	public void itemsAdded(CollectionAddEvent event) {
		// do nothing
	}

	public void itemsRemoved(CollectionRemoveEvent event) {
		// do nothing
	}

	public void collectionCleared(CollectionClearEvent event) {
		// do nothing
	}

	public void collectionChanged(CollectionChangeEvent event) {
		// do nothing
	}

	// ***** list
	public void itemsAdded(ListAddEvent event) {
		// do nothing
	}

	public void itemsRemoved(ListRemoveEvent event) {
		// do nothing
	}

	public void itemsReplaced(ListReplaceEvent event) {
		// do nothing
	}

	public void itemsMoved(ListMoveEvent event) {
		// do nothing
	}

	public void listCleared(ListClearEvent event) {
		// do nothing
	}

	public void listChanged(ListChangeEvent event) {
		// do nothing
	}

	// ***** tree
	public void nodeAdded(TreeAddEvent event) {
		// do nothing
	}

	public void nodeRemoved(TreeRemoveEvent event) {
		// do nothing
	}

	public void treeCleared(TreeClearEvent event) {
		// do nothing
	}

	public void treeChanged(TreeChangeEvent event) {
		// do nothing
	}

	@Override
	public String toString() {
		return StringTools.buildToStringFor(this);
	}
}
