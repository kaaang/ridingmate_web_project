package com.rmc.web.repository;

import com.rmc.web.model.bike.BikeCompany;
import com.rmc.web.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeCompanyRepository extends JpaRepository<BikeCompany, Integer> {

    Optional<BikeCompany> findByCompany(String company);

}
