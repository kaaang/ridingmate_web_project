package com.rmc.web.controller.user;

import com.rmc.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //로그인폼
    @GetMapping("/auth/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    //회원가입폼
    @GetMapping("/auth/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
}
