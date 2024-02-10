package com.hms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Department;
import com.hms.dao.DepartmentRepo;


@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo repo;

	public String insertDepartment(Department department) {
		repo.save(department);
		return "Department Added Successfully";

	}

	public String updateDepartment(Department department) {
		repo.save(department);
		return "Department Updated Successfully";

	}

	public String removeDepartment(long departmentNo) {
		repo.deleteById(departmentNo);
		return "Department Deleted Successfully";
	}

	public Department checkDepartment(long departmentNo) {
		return repo.findById(departmentNo).get();
		
	}

	public List<Department> checkAllDepartments() {
		Iterator<Department> department = repo.findAll().iterator();
		List<Department> departmentList = new ArrayList<>();

		while (department.hasNext()) {
			departmentList.add(department.next());
		}
		return departmentList;
	}
}
