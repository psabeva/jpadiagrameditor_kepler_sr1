/*******************************************************************************
 * Copyright (c) 2007, 2009 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.resource.java.source;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.core.internal.utility.jdt.MemberAnnotationAdapter;
import org.eclipse.jpt.core.internal.utility.jdt.MemberIndexedAnnotationAdapter;
import org.eclipse.jpt.core.resource.java.BaseJoinColumnAnnotation;
import org.eclipse.jpt.core.resource.java.JavaResourceNode;
import org.eclipse.jpt.core.resource.java.NestableAnnotation;
import org.eclipse.jpt.core.utility.TextRange;
import org.eclipse.jpt.core.utility.jdt.AnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.AnnotationElementAdapter;
import org.eclipse.jpt.core.utility.jdt.DeclarationAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.DeclarationAnnotationElementAdapter;
import org.eclipse.jpt.core.utility.jdt.IndexedAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.IndexedDeclarationAnnotationAdapter;
import org.eclipse.jpt.core.utility.jdt.Member;

/**
 * javax.persistence.JoinColumn
 * javax.persistence.MapKeyJoinColumn
 */
public abstract class SourceBaseJoinColumnAnnotation
	extends SourceBaseColumnAnnotation
	implements BaseJoinColumnAnnotation
{
	private final DeclarationAnnotationElementAdapter<String> referencedColumnNameDeclarationAdapter;
	private final AnnotationElementAdapter<String> referencedColumnNameAdapter;
	private String referencedColumnName;


	protected SourceBaseJoinColumnAnnotation(JavaResourceNode parent, Member member, DeclarationAnnotationAdapter daa, AnnotationAdapter annotationAdapter) {
		super(parent, member, daa, annotationAdapter);
		this.referencedColumnNameDeclarationAdapter = this.buildStringElementAdapter(this.getReferencedColumnNameElementName());
		this.referencedColumnNameAdapter = this.buildShortCircuitElementAdapter(this.referencedColumnNameDeclarationAdapter);
	}

	protected SourceBaseJoinColumnAnnotation(JavaResourceNode parent, Member member, DeclarationAnnotationAdapter daa) {
		this(parent, member, daa, new MemberAnnotationAdapter(member, daa));
	}

	protected SourceBaseJoinColumnAnnotation(JavaResourceNode parent, Member member, IndexedDeclarationAnnotationAdapter idaa) {
		this(parent, member, idaa, new MemberIndexedAnnotationAdapter(member, idaa));
	}

	@Override
	public void initialize(CompilationUnit astRoot) {
		super.initialize(astRoot);
		this.referencedColumnName = this.buildReferencedColumnName(astRoot);
	}

	@Override
	public void update(CompilationUnit astRoot) {
		super.update(astRoot);
		this.setReferencedColumnName(this.buildReferencedColumnName(astRoot));
	}

	protected abstract String getReferencedColumnNameElementName();


	//************ BaseJoinColumnAnnotation implementation ***************

	// referenced column name
	public String getReferencedColumnName() {
		return this.referencedColumnName;
	}

	public void setReferencedColumnName(String referencedColumnName) {
		if (this.attributeValueHasNotChanged(this.referencedColumnName, referencedColumnName)) {
			return;
		}
		String old = this.referencedColumnName;
		this.referencedColumnName = referencedColumnName;
		this.referencedColumnNameAdapter.setValue(referencedColumnName);
		this.firePropertyChanged(REFERENCED_COLUMN_NAME_PROPERTY, old, referencedColumnName);
	}

	private String buildReferencedColumnName(CompilationUnit astRoot) {
		return this.referencedColumnNameAdapter.getValue(astRoot);
	}

	public TextRange getReferencedColumnNameTextRange(CompilationUnit astRoot) {
		return this.getElementTextRange(this.referencedColumnNameDeclarationAdapter, astRoot);
	}

	public boolean referencedColumnNameTouches(int pos, CompilationUnit astRoot) {
		return this.elementTouches(this.referencedColumnNameDeclarationAdapter, pos, astRoot);
	}


	 // ********** NestableAnnotation implementation **********

	@Override
	public void initializeFrom(NestableAnnotation oldAnnotation) {
		super.initializeFrom(oldAnnotation);
		BaseJoinColumnAnnotation oldJoinColumn = (BaseJoinColumnAnnotation) oldAnnotation;
		this.setReferencedColumnName(oldJoinColumn.getReferencedColumnName());
	}

	public void moveAnnotation(int newIndex) {
		this.getIndexedAnnotationAdapter().moveAnnotation(newIndex);
	}

	protected IndexedAnnotationAdapter getIndexedAnnotationAdapter() {
		return (IndexedAnnotationAdapter) this.annotationAdapter;
	}
}