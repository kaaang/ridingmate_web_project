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
    	
    	System.out.println("현재의 비밀번호"+persistance.getPassword());
    	
    	String pass=null;
    	if(user.getPassword().equals("")) {
    		pass=persistance.getPassword();
    		System.out.println("적용될 비밀번호1"+pass);
    	}else {
    		String rawPassword = user.getPassword();
    		pass = encoder.encode(rawPassword);
    		System.out.println("적용될 비밀번호2"+pass);
    		persistance.setPassword(pass);
    	}
    	//user.setPassword(pass);
    	
        persistance.setUserstring(user.getUserstring());
        persistance.setNickname(user.getNickname());
        persistance.setPhone(user.getPhone());
        persistance.setEmail(user.getEmail());
        
        
    }
    
    @Transactional
    public int passChk(String rawpass, int id) {
    	String encpass=userRepository.findPasswordById(id).orElseThrow(()->{
    		return new IllegalArgumentException("비밀번호 찾기 실패");
    	});
    	
    	if(encoder.matches(rawpass, encpass)){
    		return 1; //비밀번호 일치
    	}else{
    		return 0; //비밀번호 불일치
    	}

    	
    }

}
