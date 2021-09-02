package com.rmc.web.model.bike;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Bike_spec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Transient
    private String company;

    @Transient
    private String model;

    @Column(nullable = true, length = 200)
    private String year;

    @Column(nullable = true, length = 200)
    private String category;

    @Column(nullable = true, length = 200)
    private String power_hp;

    @Column(nullable = true, length = 200)
    private String bore_mm;

    @Column(nullable = true, length = 200)
    private String stroke_mm;

    @Column(nullable = true, length = 200)
    private String torque_nm;

    @Column(nullable = true, length = 200)
    private String engine_type;

    @Lob
    private String fuel_system;

    @Column(nullable = true, length = 200)
    private String fuel_control;

    @Column(nullable = true, length = 200)
    private String cooling_system;

    @Column(nullable = true, length = 200)
    private String gearbox;

    @Column(nullable = true, length = 200)
    private String transmission_type;

    @Lob
    private String front_suspension;

    @Lob
    private String rear_suspension;

    @Column(nullable = true, length = 200)
    private String rear_wheel_travel;

    @Column(nullable = true, length = 200)
    private String front_tyre;

    @Column(nullable = true, length = 200)
    private String rear_tyre;

    @Lob
    private String front_brakes;

    @Column(nullable = true, length = 200)
    private String rear_brakes;

    @Column(nullable = true, length = 200)
    private String compression_ratio;

    @Lob
    private String wheels;

    @Column(nullable = true, length = 200)
    private String power_weight_ratio;

    @Lob
    private String factory_warranty;

    @Column(nullable = true, length = 200)
    private String electrical;

    @Column(nullable = true, length = 200)
    private String carrying_capacity;

    @Column(nullable = true, length = 200)
    private String instruments;

    @Column(nullable = true, length = 200)
    private String light;

    @Column(nullable = true, length = 200)
    private String max_rpm;

    @Column(nullable = true, length = 200)
    private String seat;

    @Column(nullable = true, length = 200)
    private String front_percentage_of_weight;

    @Column(nullable = true, length = 200)
    private String rear_percentage_of_weight;

    @Column(nullable = true, length = 200)
    private String displacement_ccm;

    @Column(nullable = true, length = 200)
    private String displacement_cubic_inches;

    @Column(nullable = true, length = 200)
    private String trail_mm;

    @Column(nullable = true, length = 200)
    private String trail_inches;

    @Lob
    private String diameter_mm;

    @Column(nullable = true, length = 200)
    private String diameter_inches;

    @Column(nullable = true, length = 200)
    private String ground_clearance_mm;

    @Column(nullable = true, length = 200)
    private String ground_clearance_inches;

    @Column(nullable = true, length = 200)
    private String wheelbase_mm;

    @Column(nullable = true, length = 200)
    private String wheelbase_inches;

    @Column(nullable = true, length = 200)
    private String fuel_capacity_liters;

    @Column(nullable = true, length = 200)
    private String front_wheel_travel_mm;

    @Column(nullable = true, length = 200)
    private String front_wheel_travel_inches;

    @Column(nullable = true, length = 200)
    private String dry_weight_kg;

    @Column(nullable = true, length = 200)
    private String overall_height_mm;

    @Column(nullable = true, length = 200)
    private String overall_height_inches;

    @Column(nullable = true, length = 200)
    private String overall_length_mm;

    @Column(nullable = true, length = 200)
    private String overall_length_inches;

    @Column(nullable = true, length = 200)
    private String overall_width_mm;

    @Column(nullable = true, length = 200)
    private String overall_width_inches;

    @Column(nullable = true, length = 200)
    private String reserve_fuel_capacity_liters;

    @Column(nullable = true, length = 200)
    private String top_speed_mph;

    @Column(nullable = true, length = 200)
    private String alternate_seat_height_mm;

    @Column(nullable = true, length = 200)
    private String alternate_seat_height_inches;

    @Column(nullable = true, length = 200)
    private String oil_capacity_liters;

    @Column(nullable = true, length = 200)
    private String oil_capacity_quarts;

    @Column(nullable = true, length = 200)
    private String seat_height_mm;

    @Column(nullable = true, length = 200)
    private String seat_height_inches;

    @Column(nullable = true, length = 200)
    private String compression_enumerator;

    @Column(nullable = true, length = 200)
    private String fuel_consumption_km_liter;

    @Column(nullable = true, length = 200)
    private String fuel_consumption_miles_gallon;

    @Column(nullable = true, length = 200)
    private String automatic_gearbox;

    @Column(nullable = true, length = 200)
    private String torque_kgf_m;

    @Column(nullable = true, length = 200)
    private String torque_ft_lbs;

    @Column(nullable = true, length = 200)
    private String torque_benchmark_rpm;

    @Column(nullable = true, length = 200)
    private String bore_inches;

    @Column(nullable = true, length = 200)
    private String stroke_inches;

    @Column(nullable = true, length = 200)
    private String power_kw;

    @Column(nullable = true, length = 200)
    private String power_benchmark_rpm;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bikemodel_id")
    private BikeModel bikeModel;
}