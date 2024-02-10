package com.hms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Address;
import com.hms.dao.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	AddressRepo repo;

	public String insertAddress(Address address) {
		repo.save(address);
		return "Address Added Successfully";
	}

	public String updateAddress(Address address) {
		repo.save(address);
		return "Address Updated Successfully";
	}

	public String removeAddress(long userDoorNo) {
		repo.deleteById(userDoorNo);
		return "User Address Deleted Successfully";
	}

	public Address showAddress(long userDoorNo) {
		return repo.findById(userDoorNo).get();
		
	}

	public List<Address> showAllAddress() {
		Iterator<Address> address = repo.findAll().iterator();
		List<Address> addressList = new ArrayList<>();

		while (address.hasNext()) {
			addressList.add(address.next());
		}
		return addressList;
	}
}
