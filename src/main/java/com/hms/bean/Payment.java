package com.hms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_payment")
public class Payment {

	@Id
	@Column(name = "payment_id", nullable = false)
	private long paymentId;

	@Column(name = "amount", nullable = false)
	private long amount;

	@Column(name = "status", nullable = false)
	private String status;

	@JoinColumn(name = "user_id", nullable = false)
	private long userId;

	@JoinColumn(name = "prescription_id", nullable = false)
	private long prescriptionId;

	public Payment() {
		super();

	}

	public Payment(long paymentId, long amount, String status, long userId, long prescriptionId) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.status = status;
		this.userId = userId;
		this.prescriptionId = prescriptionId;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", status=" + status + ", userId=" + userId
				+ ", prescriptionId=" + prescriptionId + "]";
	}

}
