package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AutomaticDocumentsData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private DocumentTypeData car;
	private DocumentTypeData kyc;

	private com.facebank.enterprises.DocumentTypeData affidavit;

	public AutomaticDocumentsData() {
	}

	public com.facebank.enterprises.DocumentTypeData getCar() {
		return this.car;
	}

	public void setCar(com.facebank.enterprises.DocumentTypeData car) {
		this.car = car;
	}

	public com.facebank.enterprises.DocumentTypeData getKyc() {
		return this.kyc;
	}

	public void setKyc(com.facebank.enterprises.DocumentTypeData kyc) {
		this.kyc = kyc;
	}

	public com.facebank.enterprises.DocumentTypeData getAffidavit() {
		return this.affidavit;
	}

	public void setAffidavit(com.facebank.enterprises.DocumentTypeData affidavit) {
		this.affidavit = affidavit;
	}

	public AutomaticDocumentsData(
			com.facebank.enterprises.DocumentTypeData car,
			com.facebank.enterprises.DocumentTypeData kyc,
			com.facebank.enterprises.DocumentTypeData affidavit) {
		this.car = car;
		this.kyc = kyc;
		this.affidavit = affidavit;
	}

}