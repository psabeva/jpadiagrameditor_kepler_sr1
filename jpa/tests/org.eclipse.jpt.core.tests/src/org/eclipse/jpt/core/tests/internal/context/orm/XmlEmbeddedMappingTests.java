/*******************************************************************************
 *  Copyright (c) 2007 Oracle. 
 *  All rights reserved.  This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: 
 *  	Oracle - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.core.tests.internal.context.orm;

import java.util.Iterator;
import java.util.ListIterator;
import org.eclipse.jdt.core.IType;
import org.eclipse.jpt.core.JptCorePlugin;
import org.eclipse.jpt.core.MappingKeys;
import org.eclipse.jpt.core.context.AttributeOverride;
import org.eclipse.jpt.core.context.BasicMapping;
import org.eclipse.jpt.core.context.EmbeddedIdMapping;
import org.eclipse.jpt.core.context.EmbeddedMapping;
import org.eclipse.jpt.core.context.IdMapping;
import org.eclipse.jpt.core.context.ManyToManyMapping;
import org.eclipse.jpt.core.context.ManyToOneMapping;
import org.eclipse.jpt.core.context.OneToManyMapping;
import org.eclipse.jpt.core.context.OneToOneMapping;
import org.eclipse.jpt.core.context.TransientMapping;
import org.eclipse.jpt.core.context.VersionMapping;
import org.eclipse.jpt.core.context.orm.OrmPersistentType;
import org.eclipse.jpt.core.internal.context.orm.GenericOrmAttributeOverride;
import org.eclipse.jpt.core.internal.context.orm.GenericOrmColumn;
import org.eclipse.jpt.core.internal.context.orm.GenericOrmEmbeddedMapping;
import org.eclipse.jpt.core.internal.context.orm.OrmPersistentAttribute;
import org.eclipse.jpt.core.resource.java.JPA;
import org.eclipse.jpt.core.resource.orm.XmlEmbedded;
import org.eclipse.jpt.core.resource.orm.OrmFactory;
import org.eclipse.jpt.core.resource.persistence.PersistenceFactory;
import org.eclipse.jpt.core.resource.persistence.XmlMappingFileRef;
import org.eclipse.jpt.core.tests.internal.context.ContextModelTestCase;
import org.eclipse.jpt.core.tests.internal.projects.TestJavaProject.SourceWriter;
import org.eclipse.jpt.utility.internal.iterators.ArrayIterator;

public class XmlEmbeddedMappingTests extends ContextModelTestCase
{
	private static final String ATTRIBUTE_OVERRIDE_NAME = "city";
	private static final String ATTRIBUTE_OVERRIDE_COLUMN_NAME = "E_CITY";

	public XmlEmbeddedMappingTests(String name) {
		super(name);
	}
		
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		XmlMappingFileRef mappingFileRef = PersistenceFactory.eINSTANCE.createXmlMappingFileRef();
		mappingFileRef.setFileName(JptCorePlugin.DEFAULT_ORM_XML_FILE_PATH);
		xmlPersistenceUnit().getMappingFiles().add(mappingFileRef);
		persistenceResource().save(null);
	}

	private void createEntityAnnotation() throws Exception {
		this.createAnnotationAndMembers("Entity", "String name() default \"\";");		
	}
	
	private void createEmbeddedAnnotation() throws Exception{
		this.createAnnotationAndMembers("Embedded", "");		
	}
	
	private void createColumnAnnotation() throws Exception {
		this.createAnnotationAndMembers("Column", 
			"String name() default \"\";" +
			"boolean unique() default false;" +
			"boolean nullable() default true;" +
			"boolean insertable() default true;" +
			"boolean updatable() default true;" +
			"String columnDefinition() default \"\";" +
			"String table() default \"\";" +
			"int length() default 255;" +
			"int precision() default 0;" +
			"int scale() default 0;");		
	}
	
	private void createAttributeOverrideAnnotation() throws Exception {
		createColumnAnnotation();
		this.createAnnotationAndMembers("AttributeOverride", 
			"String name();" +
			"Column column();");		
	}
	
	private IType createTestEntityEmbeddedMapping() throws Exception {
		createEntityAnnotation();
		createEmbeddedAnnotation();
		createAttributeOverrideAnnotation();
		return this.createTestType(new DefaultAnnotationWriter() {
			@Override
			public Iterator<String> imports() {
				return new ArrayIterator<String>(JPA.ENTITY, JPA.EMBEDDED, JPA.ATTRIBUTE_OVERRIDE, JPA.COLUMN);
			}
			@Override
			public void appendTypeAnnotationTo(StringBuilder sb) {
				sb.append("@Entity");
			}
			
			@Override
			public void appendIdFieldAnnotationTo(StringBuilder sb) {
				sb.append(CR);
				sb.append("    @Embedded");
				sb.append(CR);
				sb.append("    @AttributeOverride(name=\"" + ATTRIBUTE_OVERRIDE_NAME + "\", column=@Column(name=\"" + ATTRIBUTE_OVERRIDE_COLUMN_NAME + "\"))");
				sb.append(CR);
				sb.append("    private Address address;").append(CR);
				sb.append(CR);
				sb.append("    @Id");				
			}
		});
	}	
	
	private IType createTestEmbeddableAddress() throws Exception {
		SourceWriter sourceWriter = new SourceWriter() {
			public void appendSourceTo(StringBuilder sb) {
				sb.append(CR);
					sb.append("import ");
					sb.append(JPA.EMBEDDABLE);
					sb.append(";");
					sb.append(CR);
					sb.append("import ");
					sb.append(JPA.ID);
					sb.append(";");
					sb.append(CR);
					sb.append("import ");
					sb.append(JPA.COLUMN);
					sb.append(";");
					sb.append(CR);
				sb.append(CR);
				sb.append("@Embeddable");
				sb.append(CR);
				sb.append("public class ").append("Address").append(" ");
				sb.append("{").append(CR);
				sb.append(CR);
				sb.append("    @Id").append(CR);
				sb.append("    private int id;").append(CR);
				sb.append(CR);
				sb.append("    private String city;").append(CR);
				sb.append(CR);
				sb.append("    @Column(name=\"A_STATE\")").append(CR);
				sb.append("    private String state;").append(CR);
				sb.append(CR);
				sb.append("    private int zip;").append(CR);
				sb.append(CR);
				sb.append("}").append(CR);
		}
		};
		return this.javaProject.createType(PACKAGE_NAME, "Address.java", sourceWriter);
	}	

	public void testUpdateName() throws Exception {
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embeddedMapping");
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		XmlEmbedded embeddedResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getEmbeddeds().get(0);
		
		assertEquals("embeddedMapping", xmlEmbeddedMapping.getName());
		assertEquals("embeddedMapping", embeddedResource.getName());
				
		//set name in the resource model, verify context model updated
		embeddedResource.setName("newName");
		assertEquals("newName", xmlEmbeddedMapping.getName());
		assertEquals("newName", embeddedResource.getName());
	
		//set name to null in the resource model
		embeddedResource.setName(null);
		assertNull(xmlEmbeddedMapping.getName());
		assertNull(embeddedResource.getName());
	}
	
	public void testModifyName() throws Exception {
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embeddedMapping");
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		XmlEmbedded embeddedResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getEmbeddeds().get(0);
		
		assertEquals("embeddedMapping", xmlEmbeddedMapping.getName());
		assertEquals("embeddedMapping", embeddedResource.getName());
				
		//set name in the context model, verify resource model updated
		xmlEmbeddedMapping.setName("newName");
		assertEquals("newName", xmlEmbeddedMapping.getName());
		assertEquals("newName", embeddedResource.getName());
	
		//set name to null in the context model
		xmlEmbeddedMapping.setName(null);
		assertNull(xmlEmbeddedMapping.getName());
		assertNull(embeddedResource.getName());
	}
	
	public void testAddSpecifiedAttributeOverride() throws Exception {
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embeddedMapping");
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		XmlEmbedded embeddedResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getEmbeddeds().get(0);
		
		GenericOrmAttributeOverride attributeOverride = xmlEmbeddedMapping.addSpecifiedAttributeOverride(0);
		ormResource().save(null);
		attributeOverride.setName("FOO");
		ormResource().save(null);
				
		assertEquals("FOO", embeddedResource.getAttributeOverrides().get(0).getName());
		
		GenericOrmAttributeOverride attributeOverride2 = xmlEmbeddedMapping.addSpecifiedAttributeOverride(0);
		ormResource().save(null);
		attributeOverride2.setName("BAR");
		ormResource().save(null);
		
		assertEquals("BAR", embeddedResource.getAttributeOverrides().get(0).getName());
		assertEquals("FOO", embeddedResource.getAttributeOverrides().get(1).getName());
		
		GenericOrmAttributeOverride attributeOverride3 = xmlEmbeddedMapping.addSpecifiedAttributeOverride(1);
		ormResource().save(null);
		attributeOverride3.setName("BAZ");
		ormResource().save(null);
		
		assertEquals("BAR", embeddedResource.getAttributeOverrides().get(0).getName());
		assertEquals("BAZ", embeddedResource.getAttributeOverrides().get(1).getName());
		assertEquals("FOO", embeddedResource.getAttributeOverrides().get(2).getName());
		
		ListIterator<GenericOrmAttributeOverride> attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals(attributeOverride2, attributeOverrides.next());
		assertEquals(attributeOverride3, attributeOverrides.next());
		assertEquals(attributeOverride, attributeOverrides.next());
		
		attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAR", attributeOverrides.next().getName());
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertEquals("FOO", attributeOverrides.next().getName());
	}
	
	public void testRemoveSpecifiedAttributeOverride() throws Exception {
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embeddedMapping");
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		XmlEmbedded embeddedResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getEmbeddeds().get(0);

		xmlEmbeddedMapping.addSpecifiedAttributeOverride(0).setName("FOO");
		xmlEmbeddedMapping.addSpecifiedAttributeOverride(1).setName("BAR");
		xmlEmbeddedMapping.addSpecifiedAttributeOverride(2).setName("BAZ");
		
		assertEquals(3, embeddedResource.getAttributeOverrides().size());
		
		xmlEmbeddedMapping.removeSpecifiedAttributeOverride(0);
		assertEquals(2, embeddedResource.getAttributeOverrides().size());
		assertEquals("BAR", embeddedResource.getAttributeOverrides().get(0).getName());
		assertEquals("BAZ", embeddedResource.getAttributeOverrides().get(1).getName());

		xmlEmbeddedMapping.removeSpecifiedAttributeOverride(0);
		assertEquals(1, embeddedResource.getAttributeOverrides().size());
		assertEquals("BAZ", embeddedResource.getAttributeOverrides().get(0).getName());
		
		xmlEmbeddedMapping.removeSpecifiedAttributeOverride(0);
		assertEquals(0, embeddedResource.getAttributeOverrides().size());
	}
	
	public void testMoveSpecifiedAttributeOverride() throws Exception {
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embeddedMapping");
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		XmlEmbedded embeddedResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getEmbeddeds().get(0);

		xmlEmbeddedMapping.addSpecifiedAttributeOverride(0).setName("FOO");
		xmlEmbeddedMapping.addSpecifiedAttributeOverride(1).setName("BAR");
		xmlEmbeddedMapping.addSpecifiedAttributeOverride(2).setName("BAZ");
		
		assertEquals(3, embeddedResource.getAttributeOverrides().size());
		
		
		xmlEmbeddedMapping.moveSpecifiedAttributeOverride(2, 0);
		ListIterator<GenericOrmAttributeOverride> attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAR", attributeOverrides.next().getName());
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertEquals("FOO", attributeOverrides.next().getName());

		assertEquals("BAR", embeddedResource.getAttributeOverrides().get(0).getName());
		assertEquals("BAZ", embeddedResource.getAttributeOverrides().get(1).getName());
		assertEquals("FOO", embeddedResource.getAttributeOverrides().get(2).getName());


		xmlEmbeddedMapping.moveSpecifiedAttributeOverride(0, 1);
		attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertEquals("BAR", attributeOverrides.next().getName());
		assertEquals("FOO", attributeOverrides.next().getName());

		assertEquals("BAZ", embeddedResource.getAttributeOverrides().get(0).getName());
		assertEquals("BAR", embeddedResource.getAttributeOverrides().get(1).getName());
		assertEquals("FOO", embeddedResource.getAttributeOverrides().get(2).getName());
	}
	
	public void testUpdateAttributeOverrides() throws Exception {
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, "model.Foo");
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embeddedMapping");
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		XmlEmbedded embeddedResource = ormResource().getEntityMappings().getEntities().get(0).getAttributes().getEmbeddeds().get(0);
		
		embeddedResource.getAttributeOverrides().add(OrmFactory.eINSTANCE.createAttributeOverrideImpl());
		embeddedResource.getAttributeOverrides().add(OrmFactory.eINSTANCE.createAttributeOverrideImpl());
		embeddedResource.getAttributeOverrides().add(OrmFactory.eINSTANCE.createAttributeOverrideImpl());
		
		embeddedResource.getAttributeOverrides().get(0).setName("FOO");
		embeddedResource.getAttributeOverrides().get(1).setName("BAR");
		embeddedResource.getAttributeOverrides().get(2).setName("BAZ");

		ListIterator<GenericOrmAttributeOverride> attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("FOO", attributeOverrides.next().getName());
		assertEquals("BAR", attributeOverrides.next().getName());
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertFalse(attributeOverrides.hasNext());
		
		embeddedResource.getAttributeOverrides().move(2, 0);
		attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAR", attributeOverrides.next().getName());
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertEquals("FOO", attributeOverrides.next().getName());
		assertFalse(attributeOverrides.hasNext());

		embeddedResource.getAttributeOverrides().move(0, 1);
		attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertEquals("BAR", attributeOverrides.next().getName());
		assertEquals("FOO", attributeOverrides.next().getName());
		assertFalse(attributeOverrides.hasNext());

		embeddedResource.getAttributeOverrides().remove(1);
		attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertEquals("FOO", attributeOverrides.next().getName());
		assertFalse(attributeOverrides.hasNext());

		embeddedResource.getAttributeOverrides().remove(1);
		attributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
		assertEquals("BAZ", attributeOverrides.next().getName());
		assertFalse(attributeOverrides.hasNext());
		
		embeddedResource.getAttributeOverrides().remove(0);
		assertFalse(xmlEmbeddedMapping.specifiedAttributeOverrides().hasNext());
	}
	
	
	public void testEmbeddedMappingNoUnderylingJavaAttribute() throws Exception {
		createTestEntityEmbeddedMapping();
		createTestEmbeddableAddress();

		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		entityMappings().addOrmPersistentType(MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY, PACKAGE_NAME + ".Address");
		ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "foo");
		assertEquals(3, ormPersistentType.virtualAttributesSize());
		
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.specifiedAttributes().next();
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		
		assertEquals("foo", xmlEmbeddedMapping.getName());

		
		assertFalse(xmlEmbeddedMapping.specifiedAttributeOverrides().hasNext());
		assertFalse(xmlEmbeddedMapping.defaultAttributeOverrides().hasNext());
	}
	
	
	public void testVirtualMappingMetadataCompleteFalse() throws Exception {
		createTestEntityEmbeddedMapping();
		createTestEmbeddableAddress();

		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		entityMappings().addOrmPersistentType(MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY, PACKAGE_NAME + ".Address");
		assertEquals(3, ormPersistentType.virtualAttributesSize());		
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.virtualAttributes().next();
		
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();	
		assertEquals("address", xmlEmbeddedMapping.getName());

		assertEquals(4, xmlEmbeddedMapping.specifiedAttributeOverridesSize());
		assertEquals(0, xmlEmbeddedMapping.defaultAttributeOverridesSize());
		ListIterator<GenericOrmAttributeOverride> xmlAttributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();

		GenericOrmAttributeOverride xmlAttributeOverride = xmlAttributeOverrides.next();
		assertEquals(ATTRIBUTE_OVERRIDE_NAME, xmlAttributeOverride.getName());
		GenericOrmColumn xmlColumn = xmlAttributeOverride.getColumn();
		assertEquals(ATTRIBUTE_OVERRIDE_COLUMN_NAME, xmlColumn.getSpecifiedName());
//		assertEquals(Boolean.TRUE, xmlColumn.getSpecifiedUnique());
//		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedNullable());
//		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedInsertable());
//		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedUpdatable());
//		assertEquals("COLUMN_DEFINITION", xmlColumn.getColumnDefinition());
//		assertEquals("MY_TABLE", xmlColumn.getSpecifiedTable());
//		assertEquals(Integer.valueOf(5), xmlColumn.getSpecifiedLength());
//		assertEquals(Integer.valueOf(6), xmlColumn.getSpecifiedPrecision());
//		assertEquals(Integer.valueOf(7), xmlColumn.getSpecifiedScale());
		
		xmlAttributeOverride = xmlAttributeOverrides.next();
		assertEquals("id", xmlAttributeOverride.getName());
		xmlColumn = xmlAttributeOverride.getColumn();
		assertEquals("id", xmlColumn.getSpecifiedName());

		xmlAttributeOverride = xmlAttributeOverrides.next();
		assertEquals("state", xmlAttributeOverride.getName());
		xmlColumn = xmlAttributeOverride.getColumn();
		assertEquals("A_STATE", xmlColumn.getSpecifiedName());

		xmlAttributeOverride = xmlAttributeOverrides.next();
		assertEquals("zip", xmlAttributeOverride.getName());
		xmlColumn = xmlAttributeOverride.getColumn();
		assertEquals("zip", xmlColumn.getSpecifiedName());

	}
	
	public void testVirtualMappingMetadataCompleteTrue() throws Exception {
		createTestEntityEmbeddedMapping();
		createTestEmbeddableAddress();

		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		entityMappings().addOrmPersistentType(MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY, PACKAGE_NAME + ".Address");
		ormPersistentType.getMapping().setSpecifiedMetadataComplete(Boolean.TRUE);
		assertEquals(3, ormPersistentType.virtualAttributesSize());		
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.virtualAttributes().next();
		
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();	
		assertEquals("address", xmlEmbeddedMapping.getName());

		//TODO
//		assertEquals(4, xmlEmbeddedMapping.specifiedAttributeOverridesSize());
//		assertEquals(0, CollectionTools.size(xmlEmbeddedMapping.defaultAttributeOverrides()));
//		ListIterator<XmlAttributeOverride> xmlAttributeOverrides = xmlEmbeddedMapping.specifiedAttributeOverrides();
//
//		XmlAttributeOverride xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals(ATTRIBUTE_OVERRIDE_NAME, xmlAttributeOverride.getName());
//		XmlColumn xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("city", xmlColumn.getSpecifiedName());
////		assertEquals(Boolean.TRUE, xmlColumn.getSpecifiedUnique());
////		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedNullable());
////		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedInsertable());
////		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedUpdatable());
////		assertEquals("COLUMN_DEFINITION", xmlColumn.getColumnDefinition());
////		assertEquals("MY_TABLE", xmlColumn.getSpecifiedTable());
////		assertEquals(Integer.valueOf(5), xmlColumn.getSpecifiedLength());
////		assertEquals(Integer.valueOf(6), xmlColumn.getSpecifiedPrecision());
////		assertEquals(Integer.valueOf(7), xmlColumn.getSpecifiedScale());
//		
//		xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals("id", xmlAttributeOverride.getName());
//		xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("id", xmlColumn.getSpecifiedName());
//
//		xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals("state", xmlAttributeOverride.getName());
//		xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("state", xmlColumn.getSpecifiedName());
//
//		xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals("zip", xmlAttributeOverride.getName());
//		xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("zip", xmlColumn.getSpecifiedName());
	}
	
	public void testSpecifiedMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		createTestEmbeddableAddress();

		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		entityMappings().addOrmPersistentType(MappingKeys.EMBEDDABLE_TYPE_MAPPING_KEY, PACKAGE_NAME + ".Address");

		ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "address");
		assertEquals(2, ormPersistentType.virtualAttributesSize());
		
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.specifiedAttributes().next();
		GenericOrmEmbeddedMapping xmlEmbeddedMapping = (GenericOrmEmbeddedMapping) xmlPersistentAttribute.getMapping();
		
		assertEquals("address", xmlEmbeddedMapping.getName());

		assertEquals(0, xmlEmbeddedMapping.specifiedAttributeOverridesSize());
		//TODO
//		assertEquals(4, CollectionTools.size(xmlEmbeddedMapping.defaultAttributeOverrides()));
//		ListIterator<XmlAttributeOverride> xmlAttributeOverrides = xmlEmbeddedMapping.defaultAttributeOverrides();
//
//		XmlAttributeOverride xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals(ATTRIBUTE_OVERRIDE_NAME, xmlAttributeOverride.getName());
//		XmlColumn xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("city", xmlColumn.getDefaultName());
////		assertEquals(Boolean.TRUE, xmlColumn.getSpecifiedUnique());
////		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedNullable());
////		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedInsertable());
////		assertEquals(Boolean.FALSE, xmlColumn.getSpecifiedUpdatable());
////		assertEquals("COLUMN_DEFINITION", xmlColumn.getColumnDefinition());
////		assertEquals("MY_TABLE", xmlColumn.getSpecifiedTable());
////		assertEquals(Integer.valueOf(5), xmlColumn.getSpecifiedLength());
////		assertEquals(Integer.valueOf(6), xmlColumn.getSpecifiedPrecision());
////		assertEquals(Integer.valueOf(7), xmlColumn.getSpecifiedScale());
//		
//		xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals("id", xmlAttributeOverride.getName());
//		xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("id", xmlColumn.getDefaultName());
//
//		xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals("state", xmlAttributeOverride.getName());
//		xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("state", xmlColumn.getDefaultName());
//
//		xmlAttributeOverride = xmlAttributeOverrides.next();
//		assertEquals("zip", xmlAttributeOverride.getName());
//		xmlColumn = xmlAttributeOverride.getColumn();
//		assertEquals("zip", xmlColumn.getDefaultName());
	}
	
	
	public void testEmbeddedMorphToIdMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.ID_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof IdMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToVersionMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.VERSION_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof VersionMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToTransientMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.TRANSIENT_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof TransientMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToBasicMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.BASIC_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof BasicMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToEmbeddedIdMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.EMBEDDED_ID_ATTRIBUTE_MAPPING_KEY);
		assertTrue(xmlPersistentAttribute.getMapping() instanceof EmbeddedIdMapping);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
		attributeOverride = ((EmbeddedIdMapping) xmlPersistentAttribute.getMapping()).specifiedAttributeOverrides().next();
		assertEquals("override", attributeOverride.getName());
		assertEquals("OVERRIDE_COLUMN", attributeOverride.getColumn().getSpecifiedName());
	}
	
	public void testEmbeddedMorphToOneToOneMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.ONE_TO_ONE_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof OneToOneMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToOneToManyMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.ONE_TO_MANY_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof OneToManyMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToManyToOneMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.MANY_TO_ONE_ATTRIBUTE_MAPPING_KEY);
		assertEquals(1, ormPersistentType.specifiedAttributesSize());
		assertEquals(xmlPersistentAttribute, ormPersistentType.specifiedAttributes().next());
		assertTrue(xmlPersistentAttribute.getMapping() instanceof ManyToOneMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}
	
	public void testEmbeddedMorphToManyToManyMapping() throws Exception {
		createTestEntityEmbeddedMapping();
		OrmPersistentType ormPersistentType = entityMappings().addOrmPersistentType(MappingKeys.ENTITY_TYPE_MAPPING_KEY, FULLY_QUALIFIED_TYPE_NAME);
		OrmPersistentAttribute xmlPersistentAttribute = ormPersistentType.addSpecifiedPersistentAttribute(MappingKeys.EMBEDDED_ATTRIBUTE_MAPPING_KEY, "embedded");
		
		EmbeddedMapping embeddedMapping = (EmbeddedMapping) xmlPersistentAttribute.getMapping();
		assertFalse(embeddedMapping.isDefault());
		AttributeOverride attributeOverride = embeddedMapping.addSpecifiedAttributeOverride(0);
		attributeOverride.setName("override");
		attributeOverride.getColumn().setSpecifiedName("OVERRIDE_COLUMN");
		assertFalse(embeddedMapping.isDefault());
		
		xmlPersistentAttribute.setSpecifiedMappingKey(MappingKeys.MANY_TO_MANY_ATTRIBUTE_MAPPING_KEY);
		assertTrue(xmlPersistentAttribute.getMapping() instanceof ManyToManyMapping);
		assertEquals("embedded", xmlPersistentAttribute.getMapping().getName());
	}

}