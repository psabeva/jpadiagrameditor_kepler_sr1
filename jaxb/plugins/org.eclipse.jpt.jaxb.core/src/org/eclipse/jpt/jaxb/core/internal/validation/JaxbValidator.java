/*******************************************************************************
 * Copyright (c) 2007, 2010 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jaxb.core.internal.validation;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jpt.core.IResourcePart;
import org.eclipse.jpt.jaxb.core.JaxbProject;
import org.eclipse.jpt.jaxb.core.JptJaxbCorePlugin;
import org.eclipse.jpt.utility.internal.iterables.SingleElementIterable;
import org.eclipse.wst.validation.AbstractValidator;
import org.eclipse.wst.validation.ValidationResult;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IProjectValidationContext;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;
import org.eclipse.wst.validation.internal.provisional.core.IValidationContext;
import org.eclipse.wst.validation.internal.provisional.core.IValidator;

/**
 * This class is referenced in the JAXB extension for the
 * WTP validator extension point.
 */
public class JaxbValidator
		extends AbstractValidator
		implements IValidator {
	
	public JaxbValidator() {
		super();
	}
	
	
	// ********** IValidator implementation **********
	
	public void validate(IValidationContext context, IReporter reporter) {
		validate(reporter, project(context));
	}
	
	public void cleanup(IReporter reporter) {
		// nothing to do
	}
	
	
	// **************** AbstractValidator impl *********************************
	
	@Override
	public ValidationResult validate(IResource resource, int kind, ValidationState state, IProgressMonitor monitor) {
		if (resource.getType() != IResource.FILE)
			return null;
		ValidationResult result = new ValidationResult();
		IReporter reporter = result.getReporter(monitor);
		IProject project = resource.getProject();
		this.clearMarkers(project);
		result.setSuspendValidation(project);
		this.validate(reporter, project);
		return result;
	}
	
	
	// **************** internal conv. *****************************************
	private void clearMarkers(IProject project) {
		try {
			clearMarkers_(project);
		}
		catch (CoreException ce) {
			JptJaxbCorePlugin.log(ce);
		}
	}

	private void clearMarkers_(IProject project) throws CoreException {
		IMarker[] markers = project.findMarkers(JptJaxbCorePlugin.VALIDATION_MARKER_ID, true, IResource.DEPTH_INFINITE);
		for (IMarker marker : markers) {
			marker.delete();
		}
	}
	
	private void validate(IReporter reporter, IProject project) {
		for (IMessage message : this.getValidationMessages(reporter, project)) {
			// check to see if the message should be ignored based on preferences
			// TODO JAXB validation preferences
//			if (!JpaValidationPreferences.isProblemIgnored(project, message.getId())){
				reporter.addMessage(this, adjustMessage(message));
//			}
			
		}
	}
	
	private IProject project(IValidationContext context) {
		return ((IProjectValidationContext) context).getProject();
	}
	
	private Iterable<IMessage> getValidationMessages(IReporter reporter, IProject project) {
		JaxbProject jaxbProject = JptJaxbCorePlugin.getJaxbProject(project);
		if (jaxbProject != null) {
			return jaxbProject.validationMessages(reporter);
		}
		return new SingleElementIterable<IMessage>(
				DefaultValidationMessages.buildMessage(
						IMessage.HIGH_SEVERITY,
						JaxbValidationMessages.NO_JAXB_PROJECT,
						project));
	}
	
	private IMessage adjustMessage(IMessage message) {
		IAdaptable targetObject = (IAdaptable) message.getTargetObject();
		IResource targetResource = ((IResourcePart) targetObject.getAdapter(IResourcePart.class)).getResource();
		message.setTargetObject(targetResource);
		if (message.getLineNumber() == IMessage.LINENO_UNSET) {
			message.setAttribute(IMarker.LOCATION, " ");
		}
		return message;
	}
}