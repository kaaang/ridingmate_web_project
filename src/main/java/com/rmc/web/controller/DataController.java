package com.rmc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {


    @GetMapping("/auth/datainsert")
    public String insert(){
        return "hoho";
    }

}
