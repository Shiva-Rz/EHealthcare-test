package com.hms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_users")
public class User {

	@Id
	@Column(name = "user_id", nullable = false)
	private long userId;

	@Column(name = "user_type", nullable = false)
	private String userType;

	@Column(name = "user_email", nullable = false)
	private String userEmail;

	@Column(name = "user_password", nullable = false)
	private String userPassword;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "user_mobilenumber", nullable = false)
	private String userMobileNumber;

	public User() {
		super();

	}

	public User(long userId, String userType, String userEmail, String userPassword, String userName,
			String userMobileNumber) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userType=" + userType + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userName=" + userName + ", userMobileNumber=" + userMobileNumber + "]";
	}

}
