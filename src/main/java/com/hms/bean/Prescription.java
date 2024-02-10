package com.hms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_prescription")
public class Prescription {

	@Id
	@Column(name = "prescription_id", nullable = false)
	private long prescriptionId;

	@Column(name = "prescription_date", nullable = false)
	private String prescriptionDate;

	@Column(name = "prescription_tablets", nullable = false)
	private String prescriptionTablets;

	@JoinColumn(name = "user_id", nullable = false)
	private long userId;

	@JoinColumn(name = "user_type", nullable = false)
	private String userType;

	public Prescription() {
		super();

	}

	public Prescription(long prescriptionId, String prescriptionDate, String prescriptionTablets, long userId,
			String userType) {
		super();
		this.prescriptionId = prescriptionId;
		this.prescriptionDate = prescriptionDate;
		this.prescriptionTablets = prescriptionTablets;
		this.userId = userId;
		this.userType = userType;
	}

	public long getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getPrescriptionDate() {
		return prescriptionDate;
	}

	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}

	public String getPrescriptionTablets() {
		return prescriptionTablets;
	}

	public void setPrescriptionTablets(String prescriptionTablets) {
		this.prescriptionTablets = prescriptionTablets;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", prescriptionDate=" + prescriptionDate
				+ ", prescriptionTablets=" + prescriptionTablets + ", userId=" + userId + ", userType=" + userType
				+ "]";
	}

}
