package com.hms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Department;
import com.hms.service.DepartmentService;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin("http://localhost:4200")
public class DepartmentController {

	@Autowired
	DepartmentService service;

	@PostMapping("AddDepartment")
	public String addDepartment(@RequestBody Department department) {
		service.insertDepartment(department);
		return "Department Added Successfully";

	}

	@PutMapping("EditDepartment")
	public String editDepartment(@RequestBody Department department) {
		service.updateDepartment(department);
		return "Department Updated Successfully";

	}

	@DeleteMapping("DeleteDepartment")
	public String deleteDepartment(@PathParam("departmentNo") long departmentNo) {
		service.removeDepartment(departmentNo);
		return "Department Deleted Successfully";
	}

	@GetMapping("ViewDepartment/{departmentNo}")
	public Department viewDepartment(@PathVariable("departmentNo") long departmentNo) {
		return service.checkDepartment(departmentNo);
		
	}

	@GetMapping("ViewAllDepartments")
	public List<Department> viewAllDepartments() {
		Iterator<Department> department = service.checkAllDepartments().iterator();
		List<Department> departmentList = new ArrayList<>();

		while (department.hasNext()) {
			departmentList.add(department.next());
		}
		return departmentList;
	}
}
