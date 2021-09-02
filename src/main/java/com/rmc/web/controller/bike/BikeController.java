package com.rmc.web.controller.bike;

import com.rmc.web.controller.DataController;
import com.rmc.web.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BikeController {

    @Autowired
    private DataService dataService;
    @GetMapping("/auth/bikeenroll")
    public String insert(Model model){
        model.addAllAttributes(dataService.search());
        return "bike/enroll";
    }
}
