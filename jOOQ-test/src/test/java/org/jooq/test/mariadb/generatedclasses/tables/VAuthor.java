/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mariadb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -163614697;

	/**
	 * The singleton instance of <code>test.v_author</code>
	 */
	public static final org.jooq.test.mariadb.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.mariadb.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>test.v_author.ID</code>. The author ID
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), V_AUTHOR, "The author ID");

	/**
	 * The column <code>test.v_author.FIRST_NAME</code>. The author's first name
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), V_AUTHOR, "The author's first name");

	/**
	 * The column <code>test.v_author.LAST_NAME</code>. The author's last name
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), V_AUTHOR, "The author's last name");

	/**
	 * The column <code>test.v_author.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, V_AUTHOR, "The author's date of birth");

	/**
	 * The column <code>test.v_author.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR, "The author's year of birth");

	/**
	 * The column <code>test.v_author.ADDRESS</code>. The author's address
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(200), V_AUTHOR, "The author's address");

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		this("v_author", null);
	}

	private VAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord> aliased) {
		this(alias, aliased, null);
	}

	private VAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.mariadb.generatedclasses.tables.records.VAuthorRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mariadb.generatedclasses.Test.TEST, aliased, parameters, "VIEW");
	}
}
