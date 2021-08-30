package com.rmc.web.repository;

import com.rmc.web.model.bike.Bike_spec;
import com.rmc.web.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeSpecRepository extends JpaRepository<Bike_spec, Integer> {


}
