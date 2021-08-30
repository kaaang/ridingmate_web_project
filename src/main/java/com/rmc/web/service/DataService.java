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
            return new BikeCompany();
        });
        bikeCompany.setCompany(bike_spec.getCompany());
        bikeCompanyRepository.save(bikeCompany);


        BikeModel bikeModel = bikeModelRepository.findByModel(bike_spec.getModel()).orElseGet(()->{
           return new BikeModel();
        });
        bikeModel.setModel(bike_spec.getModel());
        bikeModel.setBikeCompany(bikeCompany);
        bikeModelRepository.save(bikeModel);


        bike_spec.setBikeModel(bikeModel);
        bikeSpecRepository.save(bike_spec);





        return 1;
    }

}
