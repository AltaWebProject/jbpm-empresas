package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DocumentsData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.facebank.enterprises.EnterpriseDocumentsData company;

	private com.facebank.enterprises.StockholderDocumentsData stockholders;

	public DocumentsData() {
	}

	public com.facebank.enterprises.EnterpriseDocumentsData getCompany() {
		return this.company;
	}

	public void setCompany(
			com.facebank.enterprises.EnterpriseDocumentsData company) {
		this.company = company;
	}

	public com.facebank.enterprises.StockholderDocumentsData getStockholders() {
		return this.stockholders;
	}

	public void setStockholders(
			com.facebank.enterprises.StockholderDocumentsData stockholders) {
		this.stockholders = stockholders;
	}

	public DocumentsData(
			com.facebank.enterprises.EnterpriseDocumentsData company,
			com.facebank.enterprises.StockholderDocumentsData stockholders) {
		this.company = company;
		this.stockholders = stockholders;
	}

}