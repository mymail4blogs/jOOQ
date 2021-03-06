/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1407093112;

	/**
	 * The singleton instance of <code>public</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.postgres.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.postgres.generatedclasses.tables.T_2781.T_2781,
			org.jooq.test.postgres.generatedclasses.tables.T_3111.T_3111,
			org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.postgres.generatedclasses.tables.T_785.T_785,
			org.jooq.test.postgres.generatedclasses.tables.T_959.T_959,
			org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1,
			org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2,
			org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.postgres.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.postgres.generatedclasses.tables.TInheritance_1.T_INHERITANCE_1,
			org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1.T_INHERITANCE_1_1,
			org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2.T_INHERITANCE_1_2,
			org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1,
			org.jooq.test.postgres.generatedclasses.tables.TInheritanceAll.T_INHERITANCE_ALL,
			org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS,
			org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.postgres.generatedclasses.tables.TUnsigned.T_UNSIGNED,
			org.jooq.test.postgres.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.postgres.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED);
	}

	@Override
	public final java.util.List<org.jooq.UDT<?>> getUDTs() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getUDTs0());
		return result;
	}

	private final java.util.List<org.jooq.UDT<?>> getUDTs0() {
		return java.util.Arrays.<org.jooq.UDT<?>>asList(
			org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE,
			org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE,
			org.jooq.test.postgres.generatedclasses.udt.UUuids.U_UUIDS);
	}
}
