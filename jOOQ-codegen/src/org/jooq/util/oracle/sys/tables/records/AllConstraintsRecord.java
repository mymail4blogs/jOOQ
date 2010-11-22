/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.oracle.sys.tables.AllConstraints;


/**
 * This class is generated by jOOQ.
 *
 * Constraint definitions on accessible tables
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllConstraintsRecord extends TableRecordImpl<AllConstraintsRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * Owner of the table
	 */
	public void setOwner(String value) {
		setValue(AllConstraints.OWNER, value);
	}

	/**
	 * Owner of the table
	 */
	public String getOwner() {
		return getValue(AllConstraints.OWNER);
	}

	/**
	 * Name associated with constraint definition
	 */
	public void setConstraintName(String value) {
		setValue(AllConstraints.CONSTRAINT_NAME, value);
	}

	/**
	 * Name associated with constraint definition
	 */
	public String getConstraintName() {
		return getValue(AllConstraints.CONSTRAINT_NAME);
	}

	/**
	 * Type of constraint definition
	 */
	public void setConstraintType(String value) {
		setValue(AllConstraints.CONSTRAINT_TYPE, value);
	}

	/**
	 * Type of constraint definition
	 */
	public String getConstraintType() {
		return getValue(AllConstraints.CONSTRAINT_TYPE);
	}

	/**
	 * Name associated with table with constraint definition
	 */
	public void setTableName(String value) {
		setValue(AllConstraints.TABLE_NAME, value);
	}

	/**
	 * Name associated with table with constraint definition
	 */
	public String getTableName() {
		return getValue(AllConstraints.TABLE_NAME);
	}

	/**
	 * Text of search condition for table check
	 */
	public void setSearchCondition(String value) {
		setValue(AllConstraints.SEARCH_CONDITION, value);
	}

	/**
	 * Text of search condition for table check
	 */
	public String getSearchCondition() {
		return getValue(AllConstraints.SEARCH_CONDITION);
	}

	/**
	 * Owner of table used in referential constraint
	 */
	public void setROwner(String value) {
		setValue(AllConstraints.R_OWNER, value);
	}

	/**
	 * Owner of table used in referential constraint
	 */
	public String getROwner() {
		return getValue(AllConstraints.R_OWNER);
	}

	/**
	 * Name of unique constraint definition for referenced table
	 */
	public void setRConstraintName(String value) {
		setValue(AllConstraints.R_CONSTRAINT_NAME, value);
	}

	/**
	 * Name of unique constraint definition for referenced table
	 */
	public String getRConstraintName() {
		return getValue(AllConstraints.R_CONSTRAINT_NAME);
	}

	/**
	 * The delete rule for a referential constraint
	 */
	public void setDeleteRule(String value) {
		setValue(AllConstraints.DELETE_RULE, value);
	}

	/**
	 * The delete rule for a referential constraint
	 */
	public String getDeleteRule() {
		return getValue(AllConstraints.DELETE_RULE);
	}

	/**
	 * Enforcement status of constraint - ENABLED or DISABLED
	 */
	public void setStatus(String value) {
		setValue(AllConstraints.STATUS, value);
	}

	/**
	 * Enforcement status of constraint - ENABLED or DISABLED
	 */
	public String getStatus() {
		return getValue(AllConstraints.STATUS);
	}

	/**
	 * Is the constraint deferrable - DEFERRABLE or NOT DEFERRABLE
	 */
	public void setDeferrable(String value) {
		setValue(AllConstraints.DEFERRABLE, value);
	}

	/**
	 * Is the constraint deferrable - DEFERRABLE or NOT DEFERRABLE
	 */
	public String getDeferrable() {
		return getValue(AllConstraints.DEFERRABLE);
	}

	/**
	 * Is the constraint deferred by default -  DEFERRED or IMMEDIATE
	 */
	public void setDeferred(String value) {
		setValue(AllConstraints.DEFERRED, value);
	}

	/**
	 * Is the constraint deferred by default -  DEFERRED or IMMEDIATE
	 */
	public String getDeferred() {
		return getValue(AllConstraints.DEFERRED);
	}

	/**
	 * Was this constraint system validated? -  VALIDATED or NOT VALIDATED
	 */
	public void setValidated(String value) {
		setValue(AllConstraints.VALIDATED, value);
	}

	/**
	 * Was this constraint system validated? -  VALIDATED or NOT VALIDATED
	 */
	public String getValidated() {
		return getValue(AllConstraints.VALIDATED);
	}

	/**
	 * Was the constraint name system generated? -  GENERATED NAME or USER NAME
	 */
	public void setGenerated(String value) {
		setValue(AllConstraints.GENERATED, value);
	}

	/**
	 * Was the constraint name system generated? -  GENERATED NAME or USER NAME
	 */
	public String getGenerated() {
		return getValue(AllConstraints.GENERATED);
	}

	/**
	 * Creating this constraint should give ORA-02436.  Rewrite it before 2000 AD.
	 */
	public void setBad(String value) {
		setValue(AllConstraints.BAD, value);
	}

	/**
	 * Creating this constraint should give ORA-02436.  Rewrite it before 2000 AD.
	 */
	public String getBad() {
		return getValue(AllConstraints.BAD);
	}

	/**
	 * If set, this flag will be used in optimizer
	 */
	public void setRely(String value) {
		setValue(AllConstraints.RELY, value);
	}

	/**
	 * If set, this flag will be used in optimizer
	 */
	public String getRely() {
		return getValue(AllConstraints.RELY);
	}

	/**
	 * The date when this column was last enabled or disabled
	 */
	public void setLastChange(Date value) {
		setValue(AllConstraints.LAST_CHANGE, value);
	}

	/**
	 * The date when this column was last enabled or disabled
	 */
	public Date getLastChange() {
		return getValue(AllConstraints.LAST_CHANGE);
	}

	/**
	 * The owner of the index used by this constraint
	 */
	public void setIndexOwner(String value) {
		setValue(AllConstraints.INDEX_OWNER, value);
	}

	/**
	 * The owner of the index used by this constraint
	 */
	public String getIndexOwner() {
		return getValue(AllConstraints.INDEX_OWNER);
	}

	/**
	 * The index used by this constraint
	 */
	public void setIndexName(String value) {
		setValue(AllConstraints.INDEX_NAME, value);
	}

	/**
	 * The index used by this constraint
	 */
	public String getIndexName() {
		return getValue(AllConstraints.INDEX_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setInvalid(String value) {
		setValue(AllConstraints.INVALID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getInvalid() {
		return getValue(AllConstraints.INVALID);
	}

	/**
	 * An uncommented item
	 */
	public void setViewRelated(String value) {
		setValue(AllConstraints.VIEW_RELATED, value);
	}

	/**
	 * An uncommented item
	 */
	public String getViewRelated() {
		return getValue(AllConstraints.VIEW_RELATED);
	}

	public AllConstraintsRecord(Configuration configuration) {
		super(configuration, AllConstraints.ALL_CONSTRAINTS);
	}
}
