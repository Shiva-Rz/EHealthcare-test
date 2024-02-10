package com.hms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hms.bean.Address;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {

}
