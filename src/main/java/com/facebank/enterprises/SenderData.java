package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SenderData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String nameSender;

	private java.lang.String relationshipSender;

	private java.lang.String id;

	private java.lang.String number;

	private java.lang.Boolean flagCorrection;

	private java.lang.Boolean flagAlertCorrection;

	private java.lang.Boolean flagDisableDelete;

	private java.lang.Boolean flagDisableEdit;

	public SenderData() {
	}

	public java.lang.String getNameSender() {
		return this.nameSender;
	}

	public void setNameSender(java.lang.String nameSender) {
		this.nameSender = nameSender;
	}

	public java.lang.String getRelationshipSender() {
		return this.relationshipSender;
	}

	public void setRelationshipSender(java.lang.String relationshipSender) {
		this.relationshipSender = relationshipSender;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getNumber() {
		return this.number;
	}

	public void setNumber(java.lang.String number) {
		this.number = number;
	}

	public java.lang.Boolean getFlagCorrection() {
		return this.flagCorrection;
	}

	public void setFlagCorrection(java.lang.Boolean flagCorrection) {
		this.flagCorrection = flagCorrection;
	}

	public java.lang.Boolean getFlagAlertCorrection() {
		return this.flagAlertCorrection;
	}

	public void setFlagAlertCorrection(java.lang.Boolean flagAlertCorrection) {
		this.flagAlertCorrection = flagAlertCorrection;
	}

	public java.lang.Boolean getFlagDisableDelete() {
		return this.flagDisableDelete;
	}

	public void setFlagDisableDelete(java.lang.Boolean flagDisableDelete) {
		this.flagDisableDelete = flagDisableDelete;
	}

	public java.lang.Boolean getFlagDisableEdit() {
		return this.flagDisableEdit;
	}

	public void setFlagDisableEdit(java.lang.Boolean flagDisableEdit) {
		this.flagDisableEdit = flagDisableEdit;
	}

	public SenderData(java.lang.String nameSender,
			java.lang.String relationshipSender, java.lang.String id,
			java.lang.String number, java.lang.Boolean flagCorrection,
			java.lang.Boolean flagAlertCorrection,
			java.lang.Boolean flagDisableDelete,
			java.lang.Boolean flagDisableEdit) {
		this.nameSender = nameSender;
		this.relationshipSender = relationshipSender;
		this.id = id;
		this.number = number;
		this.flagCorrection = flagCorrection;
		this.flagAlertCorrection = flagAlertCorrection;
		this.flagDisableDelete = flagDisableDelete;
		this.flagDisableEdit = flagDisableEdit;
	}

}