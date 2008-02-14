/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.jpt.core.internal.context.base.IAssociationOverride;
import org.eclipse.jpt.core.internal.context.base.IJoinColumn;
import org.eclipse.swt.widgets.Shell;

/**
 * TODO
 *
 * @see JoinColumnInAssociationOverrideStateObject
 * @see JoinColumnDialogPane
 *
 * @version 2.0
 * @since 2.0
 */
public class JoinColumnInAssociationOverrideDialog extends JoinColumnDialog<JoinColumnInAssociationOverrideStateObject> {

	private IAssociationOverride associationOverride;

	/**
	 * Creates a new <code>JoinColumnInAssociationOverrideDialog</code>.
	 *
	 * @param parent The parent shell
	 * @param associationOverride
	 */
	public JoinColumnInAssociationOverrideDialog(Shell parent,
	                                             IAssociationOverride associationOverride) {

		this(parent, associationOverride, null);
		this.associationOverride = associationOverride;
	}

	/**
	 * Creates a new <code>JoinColumnInAssociationOverrideDialog</code>.
	 *
	 * @param parent The parent shell
	 * @param joinColumn Either the join column to edit or <code>null</code> if
	 * this state object is used to create a new one
	 */
	public JoinColumnInAssociationOverrideDialog(Shell parent,
												IAssociationOverride associationOverride,
	                                            IJoinColumn joinColumn) {

		super(parent, joinColumn);
		this.associationOverride = associationOverride;
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected JoinColumnInAssociationOverrideStateObject buildStateObject() {
		return new JoinColumnInAssociationOverrideStateObject(this.associationOverride, getJoinColumn());
	}
}