/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;
import org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PgEnum extends TableImpl<PgEnumRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of pg_enum
	 */
	public static final PgEnum PG_ENUM = new PgEnum();

	/**
	 * The class holding records for this type
	 */
	private static final Class<PgEnumRecord> __RECORD_TYPE = PgEnumRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PgEnumRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item could not be mapped. Deserialising this field might not work!
	 */
	public static final TableField<PgEnumRecord, Object> ENUMTYPID = new TableFieldImpl<PgEnumRecord, Object>(SQLDialect.POSTGRES, "enumtypid", Object.class, PG_ENUM);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item could not be mapped. Deserialising this field might not work!
	 */
	public static final TableField<PgEnumRecord, Object> ENUMLABEL = new TableFieldImpl<PgEnumRecord, Object>(SQLDialect.POSTGRES, "enumlabel", Object.class, PG_ENUM);

	/**
	 * No further instances allowed
	 */
	private PgEnum() {
		super(SQLDialect.POSTGRES, "pg_enum", PgCatalog.PG_CATALOG);
	}

}
