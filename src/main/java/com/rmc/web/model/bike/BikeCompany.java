package com.rmc.web.model.bike;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class BikeCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String company;



    @OneToMany(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "bikecompany_id")
    private List<BikeModel> bikeModels;



}
