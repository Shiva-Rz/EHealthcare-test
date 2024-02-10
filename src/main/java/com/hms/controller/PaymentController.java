package com.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Payment;
import com.hms.service.PaymentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class PaymentController {

	@Autowired
	PaymentService service;

	@PostMapping("MakePayment")
	public String makePayment(@RequestBody Payment pay) {
		service.addPayment(pay);
		return "Payment Successful";
	}

	@GetMapping("CheckStatus/{paymentId}")
	public Payment checkStatus(@PathVariable("paymentId") long paymentId) {
		return service.viewPayment(paymentId);
		
	}
}
