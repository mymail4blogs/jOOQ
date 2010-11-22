/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class ConstraintColumnUsageRecord extends TableRecordImpl<ConstraintColumnUsageRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(ConstraintColumnUsage.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(ConstraintColumnUsage.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(ConstraintColumnUsage.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(ConstraintColumnUsage.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(ConstraintColumnUsage.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(ConstraintColumnUsage.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnName(String value) {
		setValue(ConstraintColumnUsage.COLUMN_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getColumnName() {
		return getValue(ConstraintColumnUsage.COLUMN_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(String value) {
		setValue(ConstraintColumnUsage.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintCatalog() {
		return getValue(ConstraintColumnUsage.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(String value) {
		setValue(ConstraintColumnUsage.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintSchema() {
		return getValue(ConstraintColumnUsage.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(String value) {
		setValue(ConstraintColumnUsage.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConstraintName() {
		return getValue(ConstraintColumnUsage.CONSTRAINT_NAME);
	}

	public ConstraintColumnUsageRecord(Configuration configuration) {
		super(configuration, ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);
	}
}
