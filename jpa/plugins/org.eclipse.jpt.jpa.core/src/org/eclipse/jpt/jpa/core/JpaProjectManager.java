/*******************************************************************************
 * Copyright (c) 2006, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core;

import org.eclipse.jpt.common.utility.BooleanReference;
import org.eclipse.jpt.common.utility.command.Command;
import org.eclipse.jpt.common.utility.command.ExtendedCommandExecutor;
import org.eclipse.jpt.common.utility.model.Model;

/**
 * The JPA project manager holds all the JPA projects in the Eclipse workspace
 * and provides support for executing long-running commands that modify the
 * context model.
 * <p>
 * To retrieve the JPA project manager corresponding to an Eclipse workspace:
 * <pre>
 * IWorkspace workspace = ResourcesPlugin.getWorkspace();
 * JpaProjectManager jpaProjectManager = (JpaProjectManager) workspace.getAdapter(JpaProjectManager.class);
 * </pre>
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 * 
 * @version 2.3
 * @since 2.3
 */
public interface JpaProjectManager
	extends Model
{
	// ********** JPA projects **********

	/**
	 * Return the JPA project manager's JPA projects. This is a potentially
	 * long-running query (note the {@link InterruptedException}) as it will
	 * wait for any unbuilt JPA projects to be built or re-built.
	 * @see #getJpaProjects()
	 */
	Iterable<JpaProject> waitToGetJpaProjects() throws InterruptedException;

	/**
	 * Return the JPA project manager's JPA projects. The returned collection
	 * will not include any unbuilt or currently re-building JPA projects;
	 * but the client can listen for the appropriate events to be notified as
	 * JPA projects are added and/or removed from the collection.
	 * @see #addCollectionChangeListener(String, org.eclipse.jpt.common.utility.model.listener.CollectionChangeListener)
	 * @see #JPA_PROJECTS_COLLECTION
	 * @see #waitToGetJpaProjects()
	 */
	Iterable<JpaProject> getJpaProjects();
		public static final String JPA_PROJECTS_COLLECTION = "jpaProjects"; //$NON-NLS-1$

	/**
	 * The size returned here corresponds to the collection returned by
	 * {@link #getJpaProjects()}.
	 */
	int getJpaProjectsSize();


	// ********** batch commands **********

	/**
	 * Suspend the current thread until the specified command is
	 * executed, configuring the JPA
	 * project manager appropriately so all events, JPA project updates, etc.
	 * are handled synchronously. The assumption is this method will be called
	 * when either the workspace is "headless" (non-UI) or none of the change
	 * events are fired from anywhere but the UI thread (e.g. Java Reconciler
	 * fires change events in a background thread).
	 * @see #execute(Command, ExtendedCommandExecutor)
	 */
	void execute(Command batchCommand) throws InterruptedException;

	/**
	 * Suspend the current thread until the specified command is
	 * executed, configuring the JPA
	 * project manager appropriately so all events, JPA project updates, etc.
	 * are handled synchronously. The assumption is this method will be called
	 * from within a job that may execute on a non-UI thread, necessitating a
	 * command executor that will modify on the UI thread any documents that are
	 * currently open in the UI.
	 */
	void execute(Command command, ExtendedCommandExecutor threadLocalModifySharedDocumentCommandExecutor) throws InterruptedException;


	// ********** async event listener flags **********

	/**
	 * Add a flag that will be used to determine whether the manager's
	 * asynchronous event listeners are active:<ul>
	 * <li>If all the flags are <code>true</code>, the listeners
	 *     are active.
	 * <li>If <em>any</em> flag is <code>false</code>, the listeners
	 *     are <em><b>in</b></em>active
	 * </ul>
	 * This flag provides a way for clients to modify the context model directly
	 * without worrying about collisions caused by asynchronous events.
	 * @see #execute(Command, ExtendedCommandExecutor)
	 */
	void addAsyncEventListenerFlag(BooleanReference flag);

	/**
	 * Remove the specified flag.
	 * @see #addAsyncEventListenerFlag(BooleanReference)
	 */
	void removeAsyncEventListenerFlag(BooleanReference flag);
}
