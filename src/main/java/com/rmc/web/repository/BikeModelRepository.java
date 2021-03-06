package com.rmc.web.repository;

import com.rmc.web.model.bike.BikeCompany;
import com.rmc.web.model.bike.BikeModel;
import com.rmc.web.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BikeModelRepository extends JpaRepository<BikeModel, Integer> {

    Optional<BikeModel> findByModel(String model);
    List<BikeModel> findAllByBikeCompany(BikeCompany bikeCompany);
    Optional<BikeModel> findByBikeCompanyAndModel(BikeCompany bikeCompany,String model);


}
