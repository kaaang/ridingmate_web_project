package com.rmc.web.service;

import com.rmc.web.model.user.RoleType;
import com.rmc.web.model.user.User;
import com.rmc.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;
    


    @Transactional
    public void join(User user){
        String rawPassword = user.getPassword();
        String encPassword = encoder.encode(rawPassword);
        user.setPassword(encPassword);
        user.setRole(RoleType.USER);
        userRepository.save(user);
    }
    
    @Transactional
    public void update(User user) {
    	User persistance=userRepository.findById(user.getId()).orElseThrow(()->{
    		return new IllegalArgumentException("회원찾기 실패");
    	});
    	
    	String rawPassword = user.getPassword();
        String encPassword = encoder.encode(rawPassword);
        
        persistance.setUserstring(user.getUserstring());
        persistance.setPassword(encPassword);
        persistance.setNickname(user.getNickname());
        persistance.setPhone(user.getPhone());
        persistance.setEmail(user.getEmail());
        
        
    }

}
