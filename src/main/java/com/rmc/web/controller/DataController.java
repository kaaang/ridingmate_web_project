package com.rmc.web.controller;

import com.rmc.web.dto.ResponseDto;
import com.rmc.web.model.bike.Bike_spec;
import com.rmc.web.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/auth/data")
    public ResponseDto<Integer> serch(@RequestBody Bike_spec bike_spec){
        int result = dataService.serch(bike_spec);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), result);
    }

}
