/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthorSynonymRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VAuthorSynonymRecord> implements org.jooq.Record0<>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVAuthorSynonym {

	private static final long serialVersionUID = 778400045;

	// -------------------------------------------------------------------------
	// Record0 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row0<> fieldsRow() {
		return (org.jooq.Row0) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row0<> valuesRow() {
		return (org.jooq.Row0) super.valuesRow();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVAuthorSynonym from) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVAuthorSynonym> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VAuthorSynonymRecord
	 */
	public VAuthorSynonymRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.VAuthorSynonym.V_AUTHOR_SYNONYM);
	}
}