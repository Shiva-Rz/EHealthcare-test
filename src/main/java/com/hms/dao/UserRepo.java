package com.hms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hms.bean.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	@Query(value="select * from tbl_users where user_type='Patient'",nativeQuery=true)
	List<User>viewAllPatients();
	
	@Query(value="select * from tbl_users where user_type='Doctor'",nativeQuery=true)
	List<User>viewAllDoctors();
	
	public User findByUserEmail(String userEmail);

	public User findByUserPassword(String userPassword);
}
