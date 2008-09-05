/*******************************************************************************
 * Copyright (c) 2007, 2008 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.core.internal.context.java;

import org.eclipse.jpt.core.context.SequenceGenerator;
import org.eclipse.jpt.core.context.java.JavaJpaContextNode;
import org.eclipse.jpt.core.context.java.JavaSequenceGenerator;
import org.eclipse.jpt.core.resource.java.SequenceGeneratorAnnotation;


public class GenericJavaSequenceGenerator extends AbstractJavaGenerator
	implements JavaSequenceGenerator
{
	protected String specifiedSequenceName;

	public GenericJavaSequenceGenerator(JavaJpaContextNode parent) {
		super(parent);
	}

	@Override
	protected SequenceGeneratorAnnotation getResourceGenerator() {
		return (SequenceGeneratorAnnotation) super.getResourceGenerator();
	}

	public void initialize(SequenceGeneratorAnnotation resourceSequenceGenerator) {
		super.initialize(resourceSequenceGenerator);
		this.specifiedSequenceName = this.specifiedSequenceName(resourceSequenceGenerator);
	}
	
	public Integer getDefaultInitialValue() {
		return SequenceGenerator.DEFAULT_INITIAL_VALUE;
	}
	
	public String getSequenceName() {
		return (this.getSpecifiedSequenceName() == null) ? getDefaultSequenceName() : this.getSpecifiedSequenceName();
	}

	public String getSpecifiedSequenceName() {
		return this.specifiedSequenceName;
	}

	public void setSpecifiedSequenceName(String newSpecifiedSequenceName) {
		String oldSpecifiedSequenceName = this.specifiedSequenceName;
		this.specifiedSequenceName = newSpecifiedSequenceName;
		getResourceGenerator().setSequenceName(newSpecifiedSequenceName);
		firePropertyChanged(SPECIFIED_SEQUENCE_NAME_PROPERTY, oldSpecifiedSequenceName, newSpecifiedSequenceName);
	}

	protected void setSpecifiedSequenceName_(String newSpecifiedSequenceName) {
		String oldSpecifiedSequenceName = this.specifiedSequenceName;
		this.specifiedSequenceName = newSpecifiedSequenceName;
		firePropertyChanged(SPECIFIED_SEQUENCE_NAME_PROPERTY, oldSpecifiedSequenceName, newSpecifiedSequenceName);
	}

	public String getDefaultSequenceName() {
		return null;
	}

	public void update(SequenceGeneratorAnnotation resourceSequenceGenerator) {
		super.update(resourceSequenceGenerator);
		this.setSpecifiedSequenceName_(this.specifiedSequenceName(resourceSequenceGenerator)); 
	}
	
	protected String specifiedSequenceName(SequenceGeneratorAnnotation resourceSequenceGenerator) {
		return resourceSequenceGenerator.getSequenceName();
	}

}
