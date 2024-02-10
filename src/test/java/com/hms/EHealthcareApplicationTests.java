package com.hms;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hms.bean.Login;
import com.hms.bean.Prescription;
import com.hms.bean.User;
import com.hms.service.LoginService;
import com.hms.service.PrescriptionService;
import com.hms.service.UserService;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class EHealthcareApplicationTests {

	@Autowired
	LoginService loginserv;

	@Autowired
	UserService userserv;

	@Autowired
	PrescriptionService prescriptionserv;

	boolean val;
	boolean val1;
	List<User> list = new ArrayList<>();
	List<User> list1 = new ArrayList<>();
	List<User> list2 = new ArrayList<>();
	List<User> list3 = new ArrayList<>();
	List<User> list4 = new ArrayList<>();
	List<User> list5 = new ArrayList<>();
	List<User> list6 = new ArrayList<>();
	
	List<Prescription> presc = new ArrayList<>();
	List<Prescription> presc1 = new ArrayList<>();

	User adm = new User(100, "Admin", "dd@gmail.com", "9876", "DomnicDev", "9988776655");
	User doc = new User(111, "Doctor", "aarav@gmail.com", "0001", "Aravindh", "9911887733");
	User pat = new User(555, "Patient", "mahe@gmail.com", "mahe123", "mahesh", "9822567890");
	User def = new User(112, "Doctor", "shaji@gmail.com", "shaji", "shaji", "9876567880");

	Prescription bill = new Prescription(100, "09.02.2024", "citrizen - 10", 200, "Patient");

	Login person1 = new Login("Admin Success");
	Login person2 = new Login("Doctor Success");
	Login person3 = new Login("Patient Success");
	Login person4 = new Login("Login Fail");

	@Test
	@Order(1)
	void performAdminLogin() {
		Login no1 = loginserv.login(adm);
		person1.equals(no1);
	}

	@Test
	@Order(2)
	void performDoctorLogin() {
		Login no2 = loginserv.login(doc);
		doc.equals(no2);
	}

	@Test
	@Order(3)
	void performPatientLogin() {
		Login no3 = loginserv.login(pat);
		doc.equals(no3);
	}

	@Test
	@Order(4)
	void performLoginFail() {
		Login no4 = loginserv.login(def);
		def.equals(no4);
	}

	@Test
	@Order(5)
	void performDoctorInsert() {
		val1 = true;
		val = userserv.insertUser(doc);
		assertEquals(val1, val);
	}

	@Test
	@Order(6)
	void performDoctorUpdate() {
		val1 = true;
		val = userserv.updateUser(doc);
		assertEquals(val1, val);
	}

	@Test
	@Order(7)
	void performDoctorDelete() {
		val1 = true;
		val = userserv.deleteUser(111);
		assertEquals(val1, val);
	}

	@Test
	@Order(8)
	void performPatientInsert() {
		val1 = true;
		val = userserv.insertUser(pat);
		assertEquals(val1, val);
	}

	@Test
	@Order(9)
	void performPatientUpdate() {
		val1 = true;
		val = userserv.updateUser(pat);
		assertEquals(val1, val);
	}

	@Test
	@Order(10)
	void performPatientDelete() {
		val1 = true;
		val = userserv.deleteUser(555);
		assertEquals(val1, val);
	}

	@Test
	@Order(11)
	void performPrescInsert() {
		val1 = true;
		val = prescriptionserv.generatePrescription(bill);
		assertEquals(val1, val);
	}

	@Test
	@Order(12)
	void performPrescViewAll() {
		presc1 = prescriptionserv.showAllPrescription();
		presc.add(bill);
		presc.equals(presc1);
	}

	@Test
	@Order(13)
	void performViewAllDoctors() {
		list1 = userserv.showAllDoctors();
		list.add(doc);
		list.equals(list1);
	}
	
	@Test
	@Order(14)
	void performViewAllpatients() {
		list4 = userserv.showAllPatients();
		list3.add(pat);
		list3.equals(list4);
	}
	
	@Test
	@Order(15)
	void performViewAllusers() {
		list6 = userserv.showAllUsers();
		list5.add(adm);
		list5.equals(list6);
	}
	
}
