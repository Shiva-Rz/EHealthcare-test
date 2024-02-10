package com.hms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Prescription;
import com.hms.dao.PrescriptionRepo;

@Service
public class PrescriptionService {

	@Autowired
	PrescriptionRepo repo;

	public boolean generatePrescription(Prescription prescription) {
		repo.save(prescription);
		return true;
	}

	public List<Prescription> showAllPrescription() {
		Iterator<Prescription> presc = repo.findAll().iterator();
		List<Prescription> prescList = new ArrayList<>();

		while (presc.hasNext()) {
			prescList.add(presc.next());
		}
		return prescList;
	}
}
