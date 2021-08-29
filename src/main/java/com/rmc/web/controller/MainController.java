package com.rmc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"","/"})
    public String index(){
        return "index";
    }
    
    //내 바이크 리스트
    @GetMapping("/userbike")
    public String userBike() {
    	return "user_bike/user_bike_list";
    }
    @GetMapping("/userbike/fuelLog")
    public String fuelLog() {
    	return "user_bike/fuel/fuelLog";
    }
    @GetMapping("/userbike/maintenanceLog")
    public String maintenanceLog() {
    	return "user_bike/maintenance/maintenanceLog";
    }
    
    //중고마켓
    @GetMapping("/market")
    public String market() {
    	return "";
    }
    
    //고객센터
    @GetMapping("/cs")
    public String cs() {
    	return "cs/csForm";
    }
    

    

}
