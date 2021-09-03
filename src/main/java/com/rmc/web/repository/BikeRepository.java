package com.rmc.web.repository;

import com.rmc.web.model.bike.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
