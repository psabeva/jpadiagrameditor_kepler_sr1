/*******************************************************************************
 * Copyright (c) 2010, 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Oracle - initial API and implementation
 ******************************************************************************/
package org.eclipse.jpt.jpa.core.context.orm;

import org.eclipse.jpt.jpa.core.context.Converter;
import org.eclipse.jpt.jpa.core.context.LobConverter;
import org.eclipse.jpt.jpa.core.internal.context.JptValidator;
import org.eclipse.jpt.jpa.core.internal.jpa1.context.ConverterTextRangeResolver;
import org.eclipse.jpt.jpa.core.resource.orm.XmlAttributeMapping;
import org.eclipse.jpt.jpa.core.resource.orm.XmlConvertibleMapping;

/**
 * <code>orm.xml</code> LOB converter
 * <p>
 * Provisional API: This interface is part of an interim API that is still
 * under development and expected to change significantly before reaching
 * stability. It is available at this early stage to solicit feedback from
 * pioneering adopters on the understanding that any code that uses this API
 * will almost certainly be broken (repeatedly) as the API evolves.
 */
public interface OrmLobConverter
	extends LobConverter, OrmConverter
{
	// ********** adapter **********

	public static class Adapter
		implements OrmConverter.Adapter, OrmConverter.Owner
	{
		private static final Adapter INSTANCE = new Adapter();
		public static Adapter instance() {
			return INSTANCE;
		}

		private Adapter() {
			super();
		}

		public Class<? extends Converter> getConverterType() {
			return LobConverter.class;
		}

		public OrmConverter buildConverter(OrmAttributeMapping parent, OrmXmlContextNodeFactory factory) {
			XmlConvertibleMapping xmlMapping = (XmlConvertibleMapping) parent.getXmlAttributeMapping();
			return xmlMapping.isLob() ? factory.buildOrmLobConverter(parent, this) : null;
		}

		public boolean isActive(XmlAttributeMapping xmlMapping) {
			return ((XmlConvertibleMapping) xmlMapping).isLob();
		}

		public OrmConverter buildNewConverter(OrmAttributeMapping parent, OrmXmlContextNodeFactory factory) {
			return factory.buildOrmLobConverter(parent, this);
		}

		public void clearXmlValue(XmlAttributeMapping xmlMapping) {
			((XmlConvertibleMapping) xmlMapping).setLob(false);
		}

		public JptValidator buildValidator(Converter converter, ConverterTextRangeResolver textRangeResolver) {
			return JptValidator.Null.instance();
		}
	}
}
