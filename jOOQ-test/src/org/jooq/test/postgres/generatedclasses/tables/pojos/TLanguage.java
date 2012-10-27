/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_language", schema = "public")
public class TLanguage implements java.io.Serializable {

	private static final long serialVersionUID = -1302543125;

	private final java.lang.String  cd;
	private final java.lang.String  description;
	private final java.lang.String  descriptionEnglish;
	private final java.lang.Integer id;

	public TLanguage(
		java.lang.String  cd,
		java.lang.String  description,
		java.lang.String  descriptionEnglish,
		java.lang.Integer id
	) {
		this.cd = cd;
		this.description = description;
		this.descriptionEnglish = descriptionEnglish;
		this.id = id;
	}

	@javax.persistence.Column(name = "cd", nullable = false, length = 2)
	public java.lang.String getCd() {
		return this.cd;
	}

	@javax.persistence.Column(name = "description", length = 50)
	public java.lang.String getDescription() {
		return this.description;
	}

	@javax.persistence.Column(name = "description_english", length = 50)
	public java.lang.String getDescriptionEnglish() {
		return this.descriptionEnglish;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}
}