package com.rmc.web.service;


import com.rmc.web.model.bike.BikeCompany;
import com.rmc.web.model.bike.BikeModel;
import com.rmc.web.model.bike.Bike_spec;
import com.rmc.web.repository.BikeCompanyRepository;
import com.rmc.web.repository.BikeModelRepository;
import com.rmc.web.repository.BikeSpecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DataService {

    @Autowired
    private BikeCompanyRepository bikeCompanyRepository;

    @Autowired
    private BikeModelRepository bikeModelRepository;

    @Autowired
    private BikeSpecRepository bikeSpecRepository;

    @Transactional
    public int serch(Bike_spec bike_spec){



        BikeCompany bikeCompany =bikeCompanyRepository.findByCompany(bike_spec.getCompany()).orElseGet(()->{
            BikeCompany company = BikeCompany.builder().company(bike_spec.getCompany()).build();
            bikeCompanyRepository.save(company);
            return company;
        });



        BikeModel bikeModel = bikeModelRepository.findByModel(bike_spec.getModel()).orElseGet(()->{
            BikeModel model = BikeModel.builder().model(bike_spec.getModel()).bikeCompany(bikeCompany).build();
            bikeModelRepository.save(model);
            return model;
        });


        bike_spec.setBikeModel(bikeModel);
        bikeSpecRepository.save(bike_spec);





        return 1;
    }

}
