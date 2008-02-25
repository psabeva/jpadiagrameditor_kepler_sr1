/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Oracle. - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.ui.internal.mappings.details;

import org.eclipse.jpt.core.context.PrimaryKeyJoinColumn;
import org.eclipse.jpt.core.context.SecondaryTable;
import org.eclipse.jpt.ui.internal.widgets.AbstractDialogPane;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * This dialog is used to either create or edit a joing column that is within
 * a secondary table.
 *
 * @see PrimaryKeyJoinColumn
 * @see SecondaryTable
 * @see PrimaryKeyJoinColumnInSecondaryTableStateObject
 * @see AbstractJoinColumnDialogPane
 *
 * @version 2.0
 * @since 2.0
 */
public class PrimaryKeyJoinColumnInSecondaryTableDialog extends AbstractJoinColumnDialog<PrimaryKeyJoinColumnInSecondaryTableStateObject> {

	/**
	 * Creates a new <code>PrimaryKeyJoinColumnDialog</code>.
	 *
	 * @param parent The parent shell
	 * @param secondaryTable The owner of the join column to create or where it
	 * is located
	 * @param joinColumn Either the join column to edit or <code>null</code> if
	 * this state object is used to create a new one
	 */
	public PrimaryKeyJoinColumnInSecondaryTableDialog(Shell parent,
	                                                  SecondaryTable secondaryTable,
	                                                  PrimaryKeyJoinColumn joinColumn) {

		super(parent, secondaryTable, joinColumn);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected AbstractDialogPane<PrimaryKeyJoinColumnInSecondaryTableStateObject> buildLayout(Composite container) {
		return new AbstractJoinColumnDialogPane<PrimaryKeyJoinColumnInSecondaryTableStateObject>(
			subjectHolder(),
			container
		);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected PrimaryKeyJoinColumnInSecondaryTableStateObject buildStateObject() {
		return new PrimaryKeyJoinColumnInSecondaryTableStateObject(
			getOwner(),
			getJoinColumn()
		);
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	public PrimaryKeyJoinColumn getJoinColumn() {
		return (PrimaryKeyJoinColumn) super.getJoinColumn();
	}

	/*
	 * (non-Javadoc)
	 */
	@Override
	protected SecondaryTable getOwner() {
		return (SecondaryTable) super.getOwner();
	}
}