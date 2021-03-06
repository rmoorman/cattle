/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "credential", schema = "cattle")
public interface Credential extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.credential.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.credential.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.credential.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.credential.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.credential.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.credential.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.credential.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.credential.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.credential.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.credential.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.credential.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.credential.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.credential.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.credential.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.credential.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.credential.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.credential.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.credential.public_value</code>.
	 */
	public void setPublicValue(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.public_value</code>.
	 */
	@javax.persistence.Column(name = "public_value", length = 4096)
	public java.lang.String getPublicValue();

	/**
	 * Setter for <code>cattle.credential.secret_value</code>.
	 */
	public void setSecretValue(java.lang.String value);

	/**
	 * Getter for <code>cattle.credential.secret_value</code>.
	 */
	@javax.persistence.Column(name = "secret_value", length = 4096)
	public java.lang.String getSecretValue();

	/**
	 * Setter for <code>cattle.credential.registry_id</code>.
	 */
	public void setRegistryId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.credential.registry_id</code>.
	 */
	@javax.persistence.Column(name = "registry_id", precision = 19)
	public java.lang.Long getRegistryId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Credential
	 */
	public void from(io.cattle.platform.core.model.Credential from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Credential
	 */
	public <E extends io.cattle.platform.core.model.Credential> E into(E into);
}
