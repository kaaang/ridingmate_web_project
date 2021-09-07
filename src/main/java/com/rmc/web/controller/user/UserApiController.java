package com.rmc.web.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rmc.web.dto.ResponseDto;
import com.rmc.web.model.user.User;
import com.rmc.web.service.UserService;

@RestController
public class UserApiController {

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody User user) {
		userService.join(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}

	

	@PutMapping("/user")
    public ResponseDto<Integer> update(@RequestBody User user){
    	userService.update(user);
    	
    	System.out.println("세션에 등록해야하는 아이디는"+user.getUsername());
    	System.out.println("세션에 등록해야하는 비밀번호는"+user.getPassword());
    	
    	if(user.getPassword().equals("")) {
    		
    	}else {
    		//세션 등록
    		Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
    		SecurityContextHolder.getContext().setAuthentication(authentication);
    		
    	}
    	
    	
    	return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
    
    @PostMapping("/passChk")
    public @ResponseBody int passChk(@RequestBody User user) {
    	int result=userService.passChk(user.getPassword(), user.getId());
    	return result;
    }
    


}

