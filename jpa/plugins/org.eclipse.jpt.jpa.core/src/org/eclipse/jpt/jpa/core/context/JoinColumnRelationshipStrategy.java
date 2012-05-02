/*******************************************************************************
 * Copyright (c) 2009, 2012 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.context;

import org.eclipse.jpt.common.utility.internal.iterables.ListIterable;

/**
 * Join column relationship strategy.
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 *
 * @see RelationshipMapping
 * @see AssociationOverride
 * @see JoinColumnRelationship
 *
 * @version 3.2
 * @since 2.2
 */
public interface JoinColumnRelationshipStrategy
	extends ReadOnlyJoinColumnRelationshipStrategy, RelationshipStrategy
{
	void initializeFrom(ReadOnlyJoinColumnRelationshipStrategy oldStrategy);

	void initializeFromVirtual(ReadOnlyJoinColumnRelationshipStrategy oldStrategy);


	// ********** join columns **********

	ListIterable<? extends JoinColumn> getJoinColumns();


	// ********** specified join columns **********

	ListIterable<? extends JoinColumn> getSpecifiedJoinColumns();
	JoinColumn getSpecifiedJoinColumn(int index);

	/**
	 * Add a specified join column to the relationship.
	 */
	JoinColumn addSpecifiedJoinColumn();

	/**
	 * Add a specified join column to the relationship.
	 */
	JoinColumn addSpecifiedJoinColumn(int index);

	/**
	 * Remove the specified join column.
	 */
	void removeSpecifiedJoinColumn(int index);

	/**
	 * Remove the specified join column.
	 */
	void removeSpecifiedJoinColumn(JoinColumn joinColumn);

	/**
	 * Move the specified join column from the source index to the target index.
	 */
	void moveSpecifiedJoinColumn(int targetIndex, int sourceIndex);


	// ********** default join column **********

	JoinColumn getDefaultJoinColumn();


	/**
	 * Add specified join columns for each default join column
	 * with the same name and referenced column name. As a side-effect in the
	 * update, the default join columns will be recalculated
	 */
	void convertDefaultJoinColumnsToSpecified();

	/**
	 * Remove all the specified join columns. As a side-effect in the
	 * update, the default join columns will be recalculated
	 */
	void clearSpecifiedJoinColumns();

}
