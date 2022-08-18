package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AuthorizedDataList implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "AUTHORIZEDDATALIST_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "AUTHORIZEDDATALIST_ID_SEQ", name = "AUTHORIZEDDATALIST_ID_GENERATOR")
	private java.lang.Long id;

	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	private java.util.List<com.facebank.enterprises.AuthorizedData> authorizedData;

	public AuthorizedDataList() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.util.List<com.facebank.enterprises.AuthorizedData> getAuthorizedData() {
		return this.authorizedData;
	}

	public void setAuthorizedData(
			java.util.List<com.facebank.enterprises.AuthorizedData> authorizedData) {
		this.authorizedData = authorizedData;
	}

	public AuthorizedDataList(
			java.lang.Long id,
			java.util.List<com.facebank.enterprises.AuthorizedData> authorizedData) {
		this.id = id;
		this.authorizedData = authorizedData;
	}

}