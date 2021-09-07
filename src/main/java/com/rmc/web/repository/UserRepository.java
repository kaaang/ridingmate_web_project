package com.rmc.web.repository;

import com.rmc.web.model.user.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	/*
	 * int findByidCheck(String username);
	 * 
	 * int findByidCheck(Integer username);
	 */
	
    Optional<User> findByUsername(String username);	
    
    @Query("select u.password from User u where u.id = ?1")
    Optional<String> findPasswordById(int id);

   // int findByUsernameint(User username);	
}
