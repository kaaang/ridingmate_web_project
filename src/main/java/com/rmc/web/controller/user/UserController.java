package com.rmc.web.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rmc.web.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	// 로그인폼
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}

	// 회원가입폼
	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	// 회원가입폼
	@GetMapping("/passwordForm")
	public String passwordForm() {
		return "user/passwordForm";
	}
	
	// 회원가입폼
	@GetMapping("/detailForm")
	public String detailForm() {
		return "user/detailForm";
	}
	

	@GetMapping("/auth/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "exception", required = false) String exception, Model model) {
		model.addAttribute("error", error);
		model.addAttribute("exception", exception);
		return "user/loginForm";
	}

}
