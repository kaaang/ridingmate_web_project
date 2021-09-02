package com.rmc.web.controller.bike;

import com.rmc.web.model.bike.BikeCompany;
import com.rmc.web.model.bike.BikeModel;
import com.rmc.web.model.bike.Bike_spec;
import com.rmc.web.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bikeApiController {

    @Autowired
    private DataService dataService;

    @GetMapping("/auth/searchcompany")
    public List<BikeCompany> searchCompany(){
        List<BikeCompany> result = dataService.search();
        return result;
    }

    @GetMapping("/auth/searchmodel")
    public List<BikeModel> searchModel(@RequestParam String companyName){
        List<BikeModel> result = dataService.search(companyName);
        return result;
    }

    @GetMapping("/auth/searchyear")
    public List<Bike_spec> searchModel(@RequestParam String companyName,@RequestParam String model){
        List<Bike_spec> result = dataService.search(companyName,model);
        return result;
    }




}
