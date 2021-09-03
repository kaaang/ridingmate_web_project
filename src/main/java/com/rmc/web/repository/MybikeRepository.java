package com.rmc.web.repository;

import com.rmc.web.model.bike.Bike;
import com.rmc.web.model.bike.Mybike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MybikeRepository extends JpaRepository<Mybike, Integer> {

}
