package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class AuthorizedList implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "AUTHORIZEDLIST_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "AUTHORIZEDLIST_ID_SEQ", name = "AUTHORIZEDLIST_ID_GENERATOR")
	private java.lang.Long id;

	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	private java.util.List<com.facebank.enterprises.Authorized> authorizedDataList;

	public AuthorizedList() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.util.List<com.facebank.enterprises.Authorized> getAuthorizedDataList() {
		return this.authorizedDataList;
	}

	public void setAuthorizedDataList(
			java.util.List<com.facebank.enterprises.Authorized> authorizedDataList) {
		this.authorizedDataList = authorizedDataList;
	}

	public AuthorizedList(
			java.lang.Long id,
			java.util.List<com.facebank.enterprises.Authorized> authorizedDataList) {
		this.id = id;
		this.authorizedDataList = authorizedDataList;
	}

}