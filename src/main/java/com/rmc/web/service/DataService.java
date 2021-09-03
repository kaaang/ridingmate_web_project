package com.rmc.web.service;


import com.rmc.web.model.bike.*;
import com.rmc.web.model.user.User;
import com.rmc.web.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private BikeCompanyRepository bikeCompanyRepository;

    @Autowired
    private BikeModelRepository bikeModelRepository;

    @Autowired
    private BikeSpecRepository bikeSpecRepository;

    @Autowired
    private BikeRepository bikeRepository;

    @Autowired
    private MybikeRepository mybikeRepository;

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
        Bike_spec spec = bikeSpecRepository.findByYearAndBikeModel(bike_spec.getYear(),bike_spec.getBikeModel()).orElseGet(()->{
            bikeSpecRepository.save(bike_spec);
            return bike_spec;
        });
        return 1;
    }

    @Transactional
    public List<BikeCompany> search(){
        return bikeCompanyRepository.findAll();
    }

    public List<BikeModel> search(String companyName){
        BikeCompany bikeCompany=bikeCompanyRepository.findByCompany(companyName).orElseGet(()->{
            return null;
        });
        List<BikeModel> models= bikeModelRepository.findAllByBikeCompany(bikeCompany);
        return models;
    }

    public List<Bike_spec> search(String companyName,String model){
        BikeCompany bikeCompany=bikeCompanyRepository.findByCompany(companyName).orElseGet(()->{
            return null;
        });

        BikeModel bikeModel = bikeModelRepository.findByBikeCompanyAndModel(bikeCompany,model).orElseGet(()->{
            return null;
        });

        List<Bike_spec> specs= bikeSpecRepository.findAllByBikeModel(bikeModel);
        return specs;
    }

    public int save(Mybike mybike, User user, String companyName, String model, String year){
        BikeCompany bikeCompany=bikeCompanyRepository.findByCompany(companyName).orElseGet(()->{
            return null;
        });

        BikeModel bikeModel = bikeModelRepository.findByBikeCompanyAndModel(bikeCompany,model).orElseGet(()->{
            return null;
        });

        Bike_spec spec = bikeSpecRepository.findByYearAndBikeModel(year,bikeModel).orElseGet(()->{
            return null;
        });

        if (bikeCompany==null||bikeModel==null||spec==null){
            return -1;
        }else{
            Bike bike=new Bike();
            bike.setBikeCompany(bikeCompany);
            bike.setBikeModel(bikeModel);
            bike.setBike_spec(spec);
            bikeRepository.save(bike);

            mybike.setBike(bike);
            mybike.setUser(user);
            mybikeRepository.save(mybike);

            return 1;
        }

    }

}
