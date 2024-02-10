package com.hms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_department")
public class Department {

	@Id
	@Column(name = "department_no", nullable = false)
	private long departmentNo;

	@Column(name = "department_name", nullable = false)
	private String departmentName;

	@JoinColumn(name = "user_id", nullable = false)
	private long userId;

	public Department() {
		super();

	}

	public Department(long departmentNo, String departmentName, long userId) {
		super();
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.userId = userId;
	}

	public long getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(long departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Department [departmentNo=" + departmentNo + ", departmentName=" + departmentName + ", userId=" + userId
				+ "]";
	}

}
