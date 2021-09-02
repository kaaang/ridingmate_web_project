package com.rmc.web.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rmc.web.dto.ResponseDto;
import com.rmc.web.model.user.User;
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
	
	// 회원 정보
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
	
	/*
	 * @GetMapping(value = "/idCheck")
	 * 
	 * @ResponseBody public String idCheck(User user, RedirectAttributes re) throws
	 * Exception { System.out.println("registerPOST");
	 * 
	 * Boolean result = userService.idCheck(user);
	 * 
	 * System.out.println("중복은 1 아니면 0 = " + result); if (!result) {
	 * re.addFlashAttribute("result", "registerFalse"); return "/auth/joinForm"; }
	 * else if (result) { userService.join(user); re.addFlashAttribute("result",
	 * "registerOK"); }
	 * 
	 * return "redirect:/"; }
	 */
	
//	@RequestMapping(value = "/auth/join/idCheck", method = RequestMethod.POST)
//	public @ResponseBody String AjaxView(  
//		        @RequestParam("username") User username){
//		String str = "";
//		int idcheck = userService.idCheck(username);
//		if(idcheck==1){ //이미 존재하는 계정
//			str = "NO";	
//		}else{	//사용 가능한 계정
//			str = "YES";	
//		}
//		return str;
//	}
	
	@PostMapping("/auth/join/idCheck")
	public @ResponseBody int idcheck(@RequestBody User user){
		System.out.println("test"+user);
		System.out.println("test22222"+user.getUsername());
		int result = userService.idCheck(user);
		System.out.println("result"+result);
		return result;
	}

	
}
