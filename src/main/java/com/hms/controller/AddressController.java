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

import com.hms.bean.Address;
import com.hms.service.AddressService;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin("http://localhost:4200")
public class AddressController {

	@Autowired
	AddressService service;

	@PostMapping("AddAddress")
	public String addAddress(@RequestBody Address address) {
		service.insertAddress(address);
		return "Address Added Successfully";

	}

	@PutMapping("EditAddress")
	public String editAddress(@RequestBody Address address) {
		service.updateAddress(address);
		return "Address Updated Successfully";

	}

	@DeleteMapping("DeleteAddress")
	public String deleteAddress(@PathParam("userDoorNo") long userDoorNo) {
		service.removeAddress(userDoorNo);
		return "User Address Deleted Successfully";
	}

	@GetMapping("ViewAddress/{userDoorNo}")
	public Address viewAddress(@PathVariable("userDoorNo") long userDoorNo) {
		return service.showAddress(userDoorNo);
		
	}

	@GetMapping("ViewAllAddress")
	public List<Address> viewAllAddress() {
		Iterator<Address> address = service.showAllAddress().iterator();
		List<Address> addressList = new ArrayList<>();

		while (address.hasNext()) {
			addressList.add(address.next());
		}
		return addressList;
	}

}
