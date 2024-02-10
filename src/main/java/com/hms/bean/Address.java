package com.hms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_address")
public class Address {

	@Id
	@Column(name = "user_doorno", nullable = false)
	private String userDoorNo;

	@Column(name = "user_street", nullable = false)
	private String userStreet;

	@Column(name = "user_city", nullable = false)
	private String userCity;

	@Column(name = "user_district", nullable = false)
	private String userDistrict;

	@Column(name = "user_pincode", nullable = false)
	private String userPincode;

	@JoinColumn(name = "user_id", nullable = false)
	private long userId;

	public Address() {
		super();

	}

	public Address(String userDoorNo, String userStreet, String userCity, String userDistrict, String userPincode,
			long userId) {
		super();
		this.userDoorNo = userDoorNo;
		this.userStreet = userStreet;
		this.userCity = userCity;
		this.userDistrict = userDistrict;
		this.userPincode = userPincode;
		this.userId = userId;
	}

	public String getUserDoorNo() {
		return userDoorNo;
	}

	public void setUserDoorNo(String userDoorNo) {
		this.userDoorNo = userDoorNo;
	}

	public String getUserStreet() {
		return userStreet;
	}

	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserDistrict() {
		return userDistrict;
	}

	public void setUserDistrict(String userDistrict) {
		this.userDistrict = userDistrict;
	}

	public String getUserPincode() {
		return userPincode;
	}

	public void setUserPincode(String userPincode) {
		this.userPincode = userPincode;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Address [userDoorNo=" + userDoorNo + ", userStreet=" + userStreet + ", userCity=" + userCity
				+ ", userDistrict=" + userDistrict + ", userPincode=" + userPincode + ", userId=" + userId + "]";
	}

}
