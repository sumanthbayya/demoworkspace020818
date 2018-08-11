package com.sumanthbayya.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sumanthbayya.entities.User_Profiles;

@Transactional
@Repository
public interface UserDAO extends CrudRepository<User_Profiles, Long>{
	
	
	

}
