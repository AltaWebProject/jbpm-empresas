package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class CompanyData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ENTERPRISEDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ENTERPRISEDATA_ID_SEQ", name = "ENTERPRISEDATA_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.Integer businessType;

	private java.lang.Integer enterpriseType;

	@org.kie.api.definition.type.Description("Siglas")
	private java.lang.String acronym;

	private String startDate;

	private java.lang.Integer accountMotive;

	private java.lang.Integer sourceOfFunds;

	private java.lang.Integer nationality;

	private java.lang.String patrimonialOrigin;

	private java.lang.String legalResponsible;

	private java.lang.String nameCompany;

	@org.kie.api.definition.type.Description(value = "J - Persona Jurídica\nF - Persona Física")
	private java.lang.String typeId;

	private java.lang.String numberId;

	private java.lang.String emailCompany;

	public CompanyData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Integer getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(java.lang.Integer businessType) {
		this.businessType = businessType;
	}

	public java.lang.Integer getEnterpriseType() {
		return this.enterpriseType;
	}

	public void setEnterpriseType(java.lang.Integer enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public java.lang.String getAcronym() {
		return this.acronym;
	}

	public void setAcronym(java.lang.String acronym) {
		this.acronym = acronym;
	}

	public java.lang.Integer getAccountMotive() {
		return this.accountMotive;
	}

	public void setAccountMotive(java.lang.Integer accountMotive) {
		this.accountMotive = accountMotive;
	}

	public java.lang.Integer getSourceOfFunds() {
		return this.sourceOfFunds;
	}

	public void setSourceOfFunds(java.lang.Integer sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}

	public java.lang.Integer getNationality() {
		return this.nationality;
	}

	public void setNationality(java.lang.Integer nationality) {
		this.nationality = nationality;
	}

	public java.lang.String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.lang.String startDate) {
		this.startDate = startDate;
	}

	public java.lang.String getPatrimonialOrigin() {
		return this.patrimonialOrigin;
	}

	public void setPatrimonialOrigin(java.lang.String patrimonialOrigin) {
		this.patrimonialOrigin = patrimonialOrigin;
	}

	public java.lang.String getLegalResponsible() {
		return this.legalResponsible;
	}

	public void setLegalResponsible(java.lang.String legalResponsible) {
		this.legalResponsible = legalResponsible;
	}

	public java.lang.String getNameCompany() {
		return this.nameCompany;
	}

	public void setNameCompany(java.lang.String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public java.lang.String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(java.lang.String typeId) {
		this.typeId = typeId;
	}

	public java.lang.String getNumberId() {
		return this.numberId;
	}

	public void setNumberId(java.lang.String numberId) {
		this.numberId = numberId;
	}

	public java.lang.String getEmailCompany() {
		return this.emailCompany;
	}

	public void setEmailCompany(java.lang.String emailCompany) {
		this.emailCompany = emailCompany;
	}

	public CompanyData(java.lang.Long id, java.lang.Integer businessType,
			java.lang.Integer enterpriseType, java.lang.String acronym,
			java.lang.String startDate, java.lang.Integer accountMotive,
			java.lang.Integer sourceOfFunds, java.lang.Integer nationality,
			java.lang.String patrimonialOrigin,
			java.lang.String legalResponsible, java.lang.String nameCompany,
			java.lang.String typeId, java.lang.String numberId,
			java.lang.String emailCompany) {
		this.id = id;
		this.businessType = businessType;
		this.enterpriseType = enterpriseType;
		this.acronym = acronym;
		this.startDate = startDate;
		this.accountMotive = accountMotive;
		this.sourceOfFunds = sourceOfFunds;
		this.nationality = nationality;
		this.patrimonialOrigin = patrimonialOrigin;
		this.legalResponsible = legalResponsible;
		this.nameCompany = nameCompany;
		this.typeId = typeId;
		this.numberId = numberId;
		this.emailCompany = emailCompany;
	}

}