package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class StockholderCompanyGeneralDocumentsData
		implements
			java.io.Serializable {

	static final long serialVersionUID = 1L;

	private DocumentTypeDataList evidence;
	private DocumentTypeDataList w8;
	private DocumentTypeDataList w9;
	private DocumentTypeDataList identifications;

	public StockholderCompanyGeneralDocumentsData() {
	}

	public com.facebank.enterprises.DocumentTypeDataList getEvidence() {
		return this.evidence;
	}

	public void setEvidence(
			com.facebank.enterprises.DocumentTypeDataList evidence) {
		this.evidence = evidence;
	}

	public com.facebank.enterprises.DocumentTypeDataList getW8() {
		return this.w8;
	}

	public void setW8(com.facebank.enterprises.DocumentTypeDataList w8) {
		this.w8 = w8;
	}

	public com.facebank.enterprises.DocumentTypeDataList getW9() {
		return this.w9;
	}

	public void setW9(com.facebank.enterprises.DocumentTypeDataList w9) {
		this.w9 = w9;
	}

	public com.facebank.enterprises.DocumentTypeDataList getIdentifications() {
		return this.identifications;
	}

	public void setIdentifications(
			com.facebank.enterprises.DocumentTypeDataList identifications) {
		this.identifications = identifications;
	}

	public StockholderCompanyGeneralDocumentsData(
			com.facebank.enterprises.DocumentTypeDataList evidence,
			com.facebank.enterprises.DocumentTypeDataList w8,
			com.facebank.enterprises.DocumentTypeDataList w9,
			com.facebank.enterprises.DocumentTypeDataList identifications) {
		this.evidence = evidence;
		this.w8 = w8;
		this.w9 = w9;
		this.identifications = identifications;
	}

}