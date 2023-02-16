package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DocumentsData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.facebank.enterprises.EnterpriseDocumentsData companyDocuments;

	private StockholderDocumentsDataList stockholdersDocuments;

	private com.facebank.enterprises.DocumentFoldersData questysFoldersIds;

	private com.facebank.enterprises.AutomaticDocumentsData automaticDocuments;

	private java.lang.Boolean finalizeFlag = true;

	public DocumentsData() {
	}

	public com.facebank.enterprises.EnterpriseDocumentsData getCompanyDocuments() {
		return this.companyDocuments;
	}

	public void setCompanyDocuments(
			com.facebank.enterprises.EnterpriseDocumentsData companyDocuments) {
		this.companyDocuments = companyDocuments;
	}

	public com.facebank.enterprises.StockholderDocumentsDataList getStockholdersDocuments() {
		return this.stockholdersDocuments;
	}

	public void setStockholdersDocuments(
			com.facebank.enterprises.StockholderDocumentsDataList stockholdersDocuments) {
		this.stockholdersDocuments = stockholdersDocuments;
	}

	public com.facebank.enterprises.DocumentFoldersData getQuestysFoldersIds() {
		return this.questysFoldersIds;
	}

	public void setQuestysFoldersIds(
			com.facebank.enterprises.DocumentFoldersData questysFoldersIds) {
		this.questysFoldersIds = questysFoldersIds;
	}

	public com.facebank.enterprises.AutomaticDocumentsData getAutomaticDocuments() {
		return this.automaticDocuments;
	}

	public void setAutomaticDocuments(
			com.facebank.enterprises.AutomaticDocumentsData automaticDocuments) {
		this.automaticDocuments = automaticDocuments;
	}

	public java.lang.Boolean getFinalizeFlag() {
		return this.finalizeFlag;
	}

	public void setFinalizeFlag(java.lang.Boolean finalizeFlag) {
		this.finalizeFlag = finalizeFlag;
	}

	public DocumentsData(
			com.facebank.enterprises.EnterpriseDocumentsData companyDocuments,
			com.facebank.enterprises.StockholderDocumentsDataList stockholdersDocuments,
			com.facebank.enterprises.DocumentFoldersData questysFoldersIds,
			com.facebank.enterprises.AutomaticDocumentsData automaticDocuments,
			java.lang.Boolean finalizeFlag) {
		this.companyDocuments = companyDocuments;
		this.stockholdersDocuments = stockholdersDocuments;
		this.questysFoldersIds = questysFoldersIds;
		this.automaticDocuments = automaticDocuments;
		this.finalizeFlag = finalizeFlag;
	}

}