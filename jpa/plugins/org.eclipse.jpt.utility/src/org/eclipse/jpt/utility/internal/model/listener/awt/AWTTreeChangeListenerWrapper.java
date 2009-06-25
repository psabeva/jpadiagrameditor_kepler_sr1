/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.utility.internal.model.listener.awt;

import java.awt.EventQueue;

import org.eclipse.jpt.utility.model.event.TreeChangeEvent;
import org.eclipse.jpt.utility.model.listener.TreeChangeListener;

/**
 * Wrap another tree change listener and forward events to it on the AWT
 * event queue.
 * Forward *every* event asynchronously via the UI thread so the listener
 * receives in the same order they were generated.
 */
public class AWTTreeChangeListenerWrapper
	implements TreeChangeListener
{
	private final TreeChangeListener listener;

	public AWTTreeChangeListenerWrapper(TreeChangeListener listener) {
		super();
		if (listener == null) {
			throw new NullPointerException();
		}
		this.listener = listener;
	}

	public void nodeAdded(TreeChangeEvent event) {
		this.executeOnEventQueue(this.buildNodeAddedRunnable(event));
	}

	public void nodeRemoved(TreeChangeEvent event) {
		this.executeOnEventQueue(this.buildNodeRemovedRunnable(event));
	}

	public void treeCleared(TreeChangeEvent event) {
		this.executeOnEventQueue(this.buildTreeClearedRunnable(event));
	}

	public void treeChanged(TreeChangeEvent event) {
		this.executeOnEventQueue(this.buildTreeChangedRunnable(event));
	}

	private Runnable buildNodeAddedRunnable(final TreeChangeEvent event) {
		return new Runnable() {
			public void run() {
				AWTTreeChangeListenerWrapper.this.nodeAdded_(event);
			}
			@Override
			public String toString() {
				return "node added"; //$NON-NLS-1$
			}
		};
	}

	private Runnable buildNodeRemovedRunnable(final TreeChangeEvent event) {
		return new Runnable() {
			public void run() {
				AWTTreeChangeListenerWrapper.this.nodeRemoved_(event);
			}
			@Override
			public String toString() {
				return "node removed"; //$NON-NLS-1$
			}
		};
	}

	private Runnable buildTreeClearedRunnable(final TreeChangeEvent event) {
		return new Runnable() {
			public void run() {
				AWTTreeChangeListenerWrapper.this.treeCleared_(event);
			}
			@Override
			public String toString() {
				return "tree cleared"; //$NON-NLS-1$
			}
		};
	}

	private Runnable buildTreeChangedRunnable(final TreeChangeEvent event) {
		return new Runnable() {
			public void run() {
				AWTTreeChangeListenerWrapper.this.treeChanged_(event);
			}
			@Override
			public String toString() {
				return "tree changed"; //$NON-NLS-1$
			}
		};
	}

	/**
	 * EventQueue#invokeLater(Runnable) seems to work OK;
	 * but using #invokeAndWait(Runnable) can sometimes make things
	 * more predictable when debugging, at the risk of deadlocks.
	 */
	private void executeOnEventQueue(Runnable r) {
		EventQueue.invokeLater(r);
//		try {
//			EventQueue.invokeAndWait(r);
//		} catch (InterruptedException ex) {
//			throw new RuntimeException(ex);
//		} catch (java.lang.reflect.InvocationTargetException ex) {
//			throw new RuntimeException(ex);
//		}
	}

	void nodeAdded_(TreeChangeEvent event) {
		this.listener.nodeAdded(event);
	}

	void nodeRemoved_(TreeChangeEvent event) {
		this.listener.nodeRemoved(event);
	}

	void treeCleared_(TreeChangeEvent event) {
		this.listener.treeCleared(event);
	}

	void treeChanged_(TreeChangeEvent event) {
		this.listener.treeChanged(event);
	}

	@Override
	public String toString() {
		return "AWT(" + this.listener.toString() + ')'; //$NON-NLS-1$
	}

}
