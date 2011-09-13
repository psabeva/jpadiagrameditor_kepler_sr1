/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jaxb.core.internal.context.java;

import java.util.List;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jpt.common.core.resource.java.JavaResourceAnnotatedElement;
import org.eclipse.jpt.common.core.utility.TextRange;
import org.eclipse.jpt.common.utility.Filter;
import org.eclipse.jpt.common.utility.internal.CollectionTools;
import org.eclipse.jpt.common.utility.internal.iterables.EmptyIterable;
import org.eclipse.jpt.common.utility.internal.iterables.EmptyListIterable;
import org.eclipse.jpt.common.utility.internal.iterables.ListIterable;
import org.eclipse.jpt.common.utility.internal.iterables.SingleElementListIterable;
import org.eclipse.jpt.jaxb.core.MappingKeys;
import org.eclipse.jpt.jaxb.core.context.JaxbAttributeMapping;
import org.eclipse.jpt.jaxb.core.context.JaxbPersistentAttribute;
import org.eclipse.jpt.jaxb.core.context.XmlAdaptable;
import org.eclipse.jpt.jaxb.core.context.XmlAnyElementMapping;
import org.eclipse.jpt.jaxb.core.context.XmlElementRef;
import org.eclipse.jpt.jaxb.core.context.XmlElementRefs;
import org.eclipse.jpt.jaxb.core.context.XmlElementWrapper;
import org.eclipse.jpt.jaxb.core.context.XmlJavaTypeAdapter;
import org.eclipse.jpt.jaxb.core.context.XmlMixed;
import org.eclipse.jpt.jaxb.core.context.java.JavaContextNode;
import org.eclipse.jpt.jaxb.core.internal.validation.DefaultValidationMessages;
import org.eclipse.jpt.jaxb.core.internal.validation.JaxbValidationMessages;
import org.eclipse.jpt.jaxb.core.resource.java.JAXB;
import org.eclipse.jpt.jaxb.core.resource.java.XmlAnyElementAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlElementRefAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlElementRefsAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlElementWrapperAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlJavaTypeAdapterAnnotation;
import org.eclipse.jpt.jaxb.core.resource.java.XmlMixedAnnotation;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;

public class GenericJavaXmlAnyElementMapping
		extends AbstractJavaAttributeMapping<XmlAnyElementAnnotation>
		implements XmlAnyElementMapping {
	
	protected Boolean specifiedLax;
	
	protected String specifiedValue;
	
	protected final XmlAdaptable xmlAdaptable;
	
	protected final XmlElementRefs xmlElementRefs;
	
	protected XmlElementWrapper xmlElementWrapper;
	
	protected XmlMixed xmlMixed;
	
	
	public GenericJavaXmlAnyElementMapping(JaxbPersistentAttribute parent) {
		super(parent);
		this.specifiedLax = buildSpecifiedLax();
		this.specifiedValue = getResourceValueString();
		this.xmlAdaptable = buildXmlAdaptable();
		this.xmlElementRefs = buildXmlElementRefs();
		initializeXmlElementWrapper();
		this.initializeXmlMixed();			
	}
	
	
	public String getKey() {
		return MappingKeys.XML_ANY_ELEMENT_ATTRIBUTE_MAPPING_KEY;
	}

	@Override
	protected String getAnnotationName() {
		return JAXB.XML_ANY_ELEMENT;
	}
	
	
	// ***** sync/update *****
	
	@Override
	public void synchronizeWithResourceModel() {
		super.synchronizeWithResourceModel();
		setSpecifiedLax_(buildSpecifiedLax());
		setSpecifiedValue_(getResourceValueString());
		this.xmlAdaptable.synchronizeWithResourceModel();
		this.xmlElementRefs.synchronizeWithResourceModel();
		syncXmlElementWrapper();
		syncXmlMixed();
	}
	
	@Override
	public void update() {
		super.update();
		this.xmlAdaptable.update();
		this.xmlElementRefs.update();
		updateXmlElementWrapper();
		updateXmlMixed();
	}
	
	
	// ***** lax *****
	
	public boolean isLax() {
		return (getSpecifiedLax() == null) ? isDefaultLax() : getSpecifiedLax().booleanValue();
	}
	
	public Boolean getSpecifiedLax() {
		return this.specifiedLax;
	}
	
	public void setSpecifiedLax(Boolean newSpecifiedLax) {
		getOrCreateAnnotation().setLax(newSpecifiedLax);
		setSpecifiedLax_(newSpecifiedLax);
	}
	
	protected void setSpecifiedLax_(Boolean newSpecifiedLax) {
		Boolean oldLax = this.specifiedLax;
		this.specifiedLax = newSpecifiedLax;
		firePropertyChanged(SPECIFIED_LAX_PROPERTY, oldLax, newSpecifiedLax);
	}
	
	protected Boolean buildSpecifiedLax() {
		return getAnnotation().getLax();
	}
	
	public boolean isDefaultLax() {
		return DEFAULT_LAX;
	}
	
	
	// ***** value *****
	
	public String getValue() {
		return getSpecifiedValue() == null ? getDefaultValue() : getSpecifiedValue();
	}
	
	public String getSpecifiedValue() {
		return this.specifiedValue;
	}
	
	public void setSpecifiedValue(String location) {
		getOrCreateAnnotation().setValue(location);
		setSpecifiedValue_(location);	
	}
	
	protected void setSpecifiedValue_(String type) {
		String old = this.specifiedValue;
		this.specifiedValue = type;
		this.firePropertyChanged(SPECIFIED_VALUE_PROPERTY, old, type);
	}
	
	protected String getResourceValueString() {
		return getAnnotation().getValue();
	}
	
	public String getDefaultValue() {
		return DEFAULT_VALUE;
	}
	
	
	// ***** XmlJavaTypeAdapter *****
	
	public XmlJavaTypeAdapter getXmlJavaTypeAdapter() {
		return this.xmlAdaptable.getXmlJavaTypeAdapter();
	}
	
	public XmlJavaTypeAdapter addXmlJavaTypeAdapter() {
		return this.xmlAdaptable.addXmlJavaTypeAdapter();
	}
	
	public void removeXmlJavaTypeAdapter() {
		this.xmlAdaptable.removeXmlJavaTypeAdapter();
	}
	
	protected XmlJavaTypeAdapter buildXmlJavaTypeAdapter(XmlJavaTypeAdapterAnnotation xmlJavaTypeAdapterAnnotation) {
		return new GenericJavaAttributeXmlJavaTypeAdapter(this, xmlJavaTypeAdapterAnnotation);
	}
	
	public XmlAdaptable buildXmlAdaptable() {
		return new GenericJavaXmlAdaptable(this, new XmlAdaptable.Owner() {
			
			public JavaResourceAnnotatedElement getResource() {
				return getJavaResourceAttribute();
			}
			
			public XmlJavaTypeAdapter buildXmlJavaTypeAdapter(XmlJavaTypeAdapterAnnotation adapterAnnotation) {
				return GenericJavaXmlAnyElementMapping.this.buildXmlJavaTypeAdapter(adapterAnnotation);
			}
			
			public void fireXmlAdapterChanged(XmlJavaTypeAdapter oldAdapter, XmlJavaTypeAdapter newAdapter) {
				GenericJavaXmlAnyElementMapping.this.firePropertyChanged(XML_JAVA_TYPE_ADAPTER_PROPERTY, oldAdapter, newAdapter);
			}
		});
	}
	
	
	// ***** XmlElementRefs *****
	
	public XmlElementRefs getXmlElementRefs() {
		return this.xmlElementRefs;
	}
	
	protected XmlElementRefs buildXmlElementRefs() {
		return new GenericJavaXmlElementRefs(this, new XmlElementRefsContext());
	}
	
	
	// ***** XmlElementWrapper *****
	
	public XmlElementWrapper getXmlElementWrapper() {
		return this.xmlElementWrapper;
	}
	
	protected void setXmlElementWrapper_(XmlElementWrapper xmlElementWrapper) {
		XmlElementWrapper oldXmlElementWrapper = this.xmlElementWrapper;
		this.xmlElementWrapper = xmlElementWrapper;
		firePropertyChanged(XML_ELEMENT_WRAPPER_PROPERTY, oldXmlElementWrapper, xmlElementWrapper);
	}
	
	public XmlElementWrapper addXmlElementWrapper() {
		if (this.xmlElementWrapper != null) {
			throw new IllegalStateException();
		}
		XmlElementWrapperAnnotation annotation = 
				(XmlElementWrapperAnnotation) this.getJavaResourceAttribute().addAnnotation(JAXB.XML_ELEMENT_WRAPPER);
		XmlElementWrapper xmlElementWrapper = this.buildXmlElementWrapper(annotation);
		this.setXmlElementWrapper_(xmlElementWrapper);
		return xmlElementWrapper;
	}
	
	public void removeXmlElementWrapper() {
		if (this.xmlElementWrapper == null) {
			throw new IllegalStateException();
		}
		this.getJavaResourceAttribute().removeAnnotation(JAXB.XML_ELEMENT_WRAPPER);
		this.setXmlElementWrapper_(null);
	}
	
	protected XmlElementWrapperAnnotation getXmlElementWrapperAnnotation() {
		return (XmlElementWrapperAnnotation) this.getJavaResourceAttribute().getAnnotation(JAXB.XML_ELEMENT_WRAPPER);
	}
	
	protected XmlElementWrapper buildXmlElementWrapper(XmlElementWrapperAnnotation xmlElementWrapperAnnotation) {
		return new GenericJavaXmlElementWrapper(this, xmlElementWrapperAnnotation);
	}
	
	protected void initializeXmlElementWrapper() {
		XmlElementWrapperAnnotation annotation = this.getXmlElementWrapperAnnotation();
		if (annotation != null) {
			this.xmlElementWrapper = this.buildXmlElementWrapper(annotation);
		}
	}
	
	protected void syncXmlElementWrapper() {
		XmlElementWrapperAnnotation annotation = this.getXmlElementWrapperAnnotation();
		if (annotation != null) {
			if (this.getXmlElementWrapper() != null) {
				this.getXmlElementWrapper().synchronizeWithResourceModel();
			}
			else {
				this.setXmlElementWrapper_(this.buildXmlElementWrapper(annotation));
			}
		}
		else {
			this.setXmlElementWrapper_(null);
		}
	}
	
	protected void updateXmlElementWrapper() {
		if (this.getXmlElementWrapper() != null) {
			this.getXmlElementWrapper().update();
		}
	}
	
	
	// ***** XmlMixed *****
	
	public XmlMixed getXmlMixed() {
		return this.xmlMixed;
	}
	
	protected void setXmlMixed_(XmlMixed xmlMixed) {
		XmlMixed oldXmlMixed = this.xmlMixed;
		this.xmlMixed = xmlMixed;
		firePropertyChanged(XML_MIXED_PROPERTY, oldXmlMixed, xmlMixed);
	}
	
	public XmlMixed addXmlMixed() {
		if (this.xmlMixed != null) {
			throw new IllegalStateException();
		}
		XmlMixedAnnotation annotation = (XmlMixedAnnotation) getJavaResourceAttribute().addAnnotation(JAXB.XML_MIXED);
		
		XmlMixed xmlMixed = buildXmlMixed(annotation);
		setXmlMixed_(xmlMixed);
		return xmlMixed;
	}
	
	public void removeXmlMixed() {
		if (this.xmlMixed == null) {
			throw new IllegalStateException();
		}
		getJavaResourceAttribute().removeAnnotation(JAXB.XML_MIXED);
		setXmlMixed_(null);
	}
	
	protected XmlMixedAnnotation getXmlMixedAnnotation() {
		return (XmlMixedAnnotation) getJavaResourceAttribute().getAnnotation(JAXB.XML_MIXED);
	}
	
	protected XmlMixed buildXmlMixed(XmlMixedAnnotation xmlMixedAnnotation) {
		return new GenericJavaXmlMixed(this, xmlMixedAnnotation);
	}
	
	protected void initializeXmlMixed() {
		XmlMixedAnnotation annotation = getXmlMixedAnnotation();
		if (annotation != null) {
			this.xmlMixed = buildXmlMixed(annotation);
		}
	}
	
	protected void syncXmlMixed() {
		XmlMixedAnnotation annotation = getXmlMixedAnnotation();
		if (annotation != null) {
			if (this.xmlMixed != null) {
				this.xmlMixed.synchronizeWithResourceModel();
			}
			else {
				setXmlMixed_(buildXmlMixed(annotation));
			}
		}
		else {
			setXmlMixed_(null);
		}
	}
	
	protected void updateXmlMixed() {
		if (this.xmlMixed != null) {
			this.xmlMixed.update();
		}
	}
	
	
	// ***** misc *****
	
	@Override
	public Iterable<String> getDirectlyReferencedTypeNames() {
		return this.xmlElementRefs.getDirectlyReferencedTypeNames();
	}
	
	
	// ***** content assist *****
	
	@Override
	public Iterable<String> getJavaCompletionProposals(int pos, Filter<String> filter, CompilationUnit astRoot) {
		Iterable<String> result = super.getJavaCompletionProposals(pos, filter, astRoot);
		if (! CollectionTools.isEmpty(result)) {
			return result;
		}
		
		result = this.xmlElementRefs.getJavaCompletionProposals(pos, filter, astRoot);
		if (! CollectionTools.isEmpty(result)) {
			return result;
		}
		
		if (this.xmlElementWrapper != null) {
			result = this.xmlElementWrapper.getJavaCompletionProposals(pos, filter, astRoot);
			if (! CollectionTools.isEmpty(result)) {
				return result;
			}
		}
		
		return EmptyIterable.instance();
	}
	
	
	// ***** validation *****
	
	@Override
	public void validate(List<IMessage> messages, IReporter reporter, CompilationUnit astRoot) {
		super.validate(messages, reporter, astRoot);
		
		this.xmlElementRefs.validate(messages, reporter, astRoot);
		
		if (getJavaResourceAttribute().getAnnotation(JAXB.XML_ELEMENT_REFS) != null) {
			XmlElementRefAnnotation xmlElementRefAnnotation = 
					(XmlElementRefAnnotation) getJavaResourceAttribute().getAnnotation(JAXB.XML_ELEMENT_REF);
			if (xmlElementRefAnnotation != null) {
				messages.add(
						DefaultValidationMessages.buildMessage(
								IMessage.HIGH_SEVERITY,
								JaxbValidationMessages.ATTRIBUTE_MAPPING__UNSUPPORTED_ANNOTATION,
								new String[] { JAXB.XML_ELEMENT_REF, JAXB.XML_ELEMENT_REFS },
								getPersistentAttribute(),
								xmlElementRefAnnotation.getTextRange(astRoot)));
			}
		}
		
		this.xmlAdaptable.validate(messages, reporter, astRoot);
		
		if (this.xmlElementWrapper != null) {
			this.xmlElementWrapper.validate(messages, reporter, astRoot);
		}
		
		if (this.xmlMixed != null) {
			this.xmlMixed.validate(messages, reporter, astRoot);
		}
	}
	
	public class XmlElementRefsContext
			implements GenericJavaXmlElementRefs.Context {
		
		protected XmlElementRefsAnnotation getXmlElementRefsAnnotation() {
			return (XmlElementRefsAnnotation) GenericJavaXmlAnyElementMapping.this.getJavaResourceAttribute().getAnnotation(JAXB.XML_ELEMENT_REFS);
		}
		
		protected XmlElementRefsAnnotation addXmlElementRefsAnnotation() {
			return (XmlElementRefsAnnotation) GenericJavaXmlAnyElementMapping.this.getJavaResourceAttribute().addAnnotation(JAXB.XML_ELEMENT_REFS);
		}
		
		protected void removeXmlElementRefsAnnotation() {
			GenericJavaXmlAnyElementMapping.this.getJavaResourceAttribute().removeAnnotation(JAXB.XML_ELEMENT_REFS);
		}
		
		protected XmlElementRefAnnotation getXmlElementRefAnnotation() {
			return (XmlElementRefAnnotation) GenericJavaXmlAnyElementMapping.this.getJavaResourceAttribute().getAnnotation(JAXB.XML_ELEMENT_REF);
		}
		
		protected XmlElementRefAnnotation addXmlElementRefAnnotation() {
			return (XmlElementRefAnnotation) GenericJavaXmlAnyElementMapping.this.getJavaResourceAttribute().addAnnotation(JAXB.XML_ELEMENT_REF);
		}
		
		protected void removeXmlElementRefAnnotation() {
			GenericJavaXmlAnyElementMapping.this.getJavaResourceAttribute().removeAnnotation(JAXB.XML_ELEMENT_REF);
		}
		
		public ListIterable<XmlElementRefAnnotation> getXmlElementRefAnnotations() {
			XmlElementRefsAnnotation xmlElementRefsAnnotation = getXmlElementRefsAnnotation();
			if (xmlElementRefsAnnotation != null) {
				return xmlElementRefsAnnotation.getXmlElementRefs();
			}
			
			XmlElementRefAnnotation xmlElementRefAnnotation = getXmlElementRefAnnotation();
			if (xmlElementRefAnnotation != null) {
				return new SingleElementListIterable(xmlElementRefAnnotation);
			}
			
			return EmptyListIterable.instance();
		}
		
		public XmlElementRefAnnotation addXmlElementRefAnnotation(int index) {
			XmlElementRefsAnnotation xmlElementRefsAnnotation = getXmlElementRefsAnnotation();
			if (xmlElementRefsAnnotation != null) {
				return xmlElementRefsAnnotation.addXmlElementRef(index);
			}
			
			XmlElementRefAnnotation xmlElementRefAnnotation = getXmlElementRefAnnotation();
			if (xmlElementRefAnnotation != null) {
				if (index > 1) {
					throw new IllegalArgumentException(String.valueOf(index));
				}
				xmlElementRefsAnnotation = addXmlElementRefsAnnotation();
				XmlElementRefAnnotation xmlElementRefAnnotationCopy = xmlElementRefsAnnotation.addXmlElementRef(0);
				xmlElementRefAnnotationCopy.setName(xmlElementRefAnnotation.getName());
				xmlElementRefAnnotationCopy.setNamespace(xmlElementRefAnnotation.getNamespace());
				xmlElementRefAnnotationCopy.setRequired(xmlElementRefAnnotation.getRequired());
				xmlElementRefAnnotationCopy.setType(xmlElementRefAnnotation.getType());
				
				removeXmlElementRefAnnotation();
				
				return xmlElementRefsAnnotation.addXmlElementRef(index);
			}
			
			if (index > 0) {
				throw new IllegalArgumentException(String.valueOf(index));
			}
			return addXmlElementRefAnnotation();
		}
		
		public void removeXmlElementRefAnnotation(int index) {
			XmlElementRefsAnnotation xmlElementRefsAnnotation = getXmlElementRefsAnnotation();
			if (xmlElementRefsAnnotation != null) {
				xmlElementRefsAnnotation.removeXmlElementRef(index);
				if (xmlElementRefsAnnotation.getXmlElementRefsSize() == 0) {
					removeXmlElementRefsAnnotation();
				}
				else if (xmlElementRefsAnnotation.getXmlElementRefsSize() == 1) {
					XmlElementRefAnnotation xmlElementRefAnnotation = CollectionTools.get(xmlElementRefsAnnotation.getXmlElementRefs(), 0);
					XmlElementRefAnnotation xmlElementRefAnnotationCopy = addXmlElementRefAnnotation();
					xmlElementRefAnnotationCopy.setName(xmlElementRefAnnotation.getName());
					xmlElementRefAnnotationCopy.setNamespace(xmlElementRefAnnotation.getNamespace());
					xmlElementRefAnnotationCopy.setRequired(xmlElementRefAnnotation.getRequired());
					xmlElementRefAnnotationCopy.setType(xmlElementRefAnnotation.getType());
					removeXmlElementRefsAnnotation();
				}
				return;
			}
			
			XmlElementRefAnnotation xmlElementRefAnnotation = getXmlElementRefAnnotation();
			if (xmlElementRefAnnotation != null) {
				if (index != 0) {
					throw new IllegalArgumentException(String.valueOf(index));
				}
				removeXmlElementRefAnnotation();
				return;
			}
			
			throw new IllegalArgumentException(String.valueOf(index));
		}
		
		public void moveXmlElementRefAnnotation(int targetIndex, int sourceIndex) {
			if (targetIndex == sourceIndex) {
				return;
			}
			
			XmlElementRefsAnnotation xmlElementRefsAnnotation = getXmlElementRefsAnnotation();
			if (xmlElementRefsAnnotation == null) {
				throw new IllegalArgumentException(String.valueOf(targetIndex) + ", " + String.valueOf(sourceIndex));
			}
			xmlElementRefsAnnotation.moveXmlElementRef(targetIndex, sourceIndex);
		}
		
		public XmlElementRef buildXmlElementRef(JavaContextNode parent, XmlElementRefAnnotation annotation) {
			return new GenericJavaXmlElementRef(parent, new XmlElementRefContext(annotation));
		}
		
		public TextRange getValidationTextRange(CompilationUnit astRoot) {
			XmlElementRefsAnnotation xmlElementRefsAnnotation = getXmlElementRefsAnnotation();
			if (xmlElementRefsAnnotation != null) {
				return xmlElementRefsAnnotation.getTextRange(astRoot);
			}
			
			XmlElementRefAnnotation xmlElementRefAnnotation = getXmlElementRefAnnotation();
			if (xmlElementRefAnnotation != null) {
				return xmlElementRefAnnotation.getTextRange(astRoot);
			}
			
			return GenericJavaXmlAnyElementMapping.this.getValidationTextRange(astRoot);
		}
	}
	
	
	public class XmlElementRefContext
			implements GenericJavaXmlElementRef.Context {
		
		protected XmlElementRefAnnotation annotation;
		
		protected XmlElementRefContext(XmlElementRefAnnotation annotation) {
			this.annotation = annotation;
		}
		
		public XmlElementRefAnnotation getAnnotation() {
			return this.annotation;
		}
		
		public JaxbAttributeMapping getAttributeMapping() {
			return GenericJavaXmlAnyElementMapping.this;
		}
		
		public String getDefaultType() {
			return null;
		}
		
		public XmlElementWrapper getElementWrapper() {
			return GenericJavaXmlAnyElementMapping.this.getXmlElementWrapper();
		}
	}
}
