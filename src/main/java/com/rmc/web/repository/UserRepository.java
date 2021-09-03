package com.rmc.web.repository;

import com.rmc.web.model.user.User;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	/*
	 * int findByidCheck(String username);
	 * 
	 * int findByidCheck(Integer username);
	 */
	
    Optional<User> findByUsername(String username);	

   // int findByUsernameint(User username);	
}
