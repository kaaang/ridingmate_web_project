package com.rmc.web.controller.bike;

import com.rmc.web.dto.ResponseDto;
import com.rmc.web.model.bike.BikeCompany;
import com.rmc.web.model.bike.Bike_spec;
import com.rmc.web.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bikeApiController {

    @Autowired
    private DataService dataService;

    @GetMapping("/auth/searchspec")
    public List<BikeCompany> search(){
        List<BikeCompany> result = dataService.search();
        return result;
    }



}
