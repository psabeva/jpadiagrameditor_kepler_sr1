/*******************************************************************************
 * Copyright (c) 2009, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.internal.resource.java.binary;

import org.eclipse.jpt.common.core.JptCommonCorePlugin;
import org.eclipse.jpt.common.core.JptResourceModelListener;
import org.eclipse.jpt.common.core.JptResourceType;
import org.eclipse.jpt.common.utility.internal.ListenerList;
import org.eclipse.jpt.jpa.core.JpaAnnotationProvider;
import org.eclipse.jpt.jpa.core.resource.java.JavaResourceNode;

/**
 * JAR and external types
 */
abstract class RootBinaryNode
	extends BinaryNode
	implements JavaResourceNode.Root
{
	/** pluggable annotation provider */
	private final JpaAnnotationProvider annotationProvider;

	/** listeners notified whenever the resource model changes */
	private final ListenerList<JptResourceModelListener> resourceModelListenerList = new ListenerList<JptResourceModelListener>(JptResourceModelListener.class);


	// ********** construction **********
	
	RootBinaryNode(JavaResourceNode parent, JpaAnnotationProvider annotationProvider) {
		super(parent);
		this.annotationProvider = annotationProvider;
	}


	// ********** overrides **********

	@Override
	protected boolean requiresParent() {
		return false;
	}

	@Override
	public Root getRoot() {
		return this;
	}

	@Override
	public JpaAnnotationProvider getAnnotationProvider() {
		return this.annotationProvider;
	}


	// ********** JavaResourceNode.Root implementation **********

	public void resourceModelChanged() {
		for (JptResourceModelListener listener : this.resourceModelListenerList.getListeners()) {
			listener.resourceModelChanged(this);
		}
	}


	// ********** JptResourceModel implementation **********
	
	public JptResourceType getResourceType() {
		return JptCommonCorePlugin.JAR_RESOURCE_TYPE;
	}

	public void addResourceModelListener(JptResourceModelListener listener) {
		this.resourceModelListenerList.add(listener);
	}

	public void removeResourceModelListener(JptResourceModelListener listener) {
		this.resourceModelListenerList.remove(listener);
	}

}