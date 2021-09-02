package com.rmc.web.model.bike;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BikeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(nullable = false, length = 100)
    private String model;

    @OneToMany(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "bikemodel_id")
    private List<Bike_spec> bike_specs;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bikecompany_id")
    private BikeCompany bikeCompany;


}
