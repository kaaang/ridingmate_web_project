package com.rmc.web.model.bike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bikecompany_id")
    private BikeCompany bikeCompany;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bikemodel_id")
    private BikeModel bikeModel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bike_spec_id")
    private Bike_spec bike_spec;
}
