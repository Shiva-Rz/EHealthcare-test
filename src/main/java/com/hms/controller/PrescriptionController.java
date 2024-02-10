package com.hms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Prescription;
import com.hms.service.PrescriptionService;

@RestController
@CrossOrigin("http://localhost:4200")
public class PrescriptionController {

	@Autowired
	PrescriptionService service;

	@PostMapping("AddPrescription")
	public String addPrescription(@RequestBody Prescription prescription) {
		service.generatePrescription(prescription);
		return "Prescription Added Successfully";
	}

	@GetMapping("ViewAllPrescription")
	public List<Prescription> viewAllPrescription() {
		Iterator<Prescription> presc = service.showAllPrescription().iterator();
		List<Prescription> prescList = new ArrayList<>();

		while (presc.hasNext()) {
			prescList.add(presc.next());
		}
		return prescList;
	}

}
