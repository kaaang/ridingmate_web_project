package com.rmc.web.repository;

import com.rmc.web.model.bike.BikeModel;
import com.rmc.web.model.bike.Bike_spec;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeSpecRepository extends JpaRepository<Bike_spec, Integer> {

    Optional<Bike_spec> findByYearAndBikeModel(String year, BikeModel bikeModel);

}
