package com.rmc.web.repository;

import com.rmc.web.model.bike.Bike;
import com.rmc.web.model.bike.Mybike;
import com.rmc.web.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MybikeRepository extends JpaRepository<Mybike, Integer> {

    List<Mybike> findAllByUserId(int userId);

}
