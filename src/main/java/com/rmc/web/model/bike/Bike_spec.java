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
public class Bike_spec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(nullable = true, length = 100)
    private String Year;
    @Column(nullable = true, length = 100)
    private String Category;
    @Column(nullable = true, length = 100)
    private String Power_HP;
    @Column(nullable = true, length = 100)
    private String Fuel_consumption_liters_100_km;
    @Column(nullable = true, length = 100)
    private String Bore_mm;
    @Column(nullable = true, length = 100)
    private String Stroke_mm;
    @Column(nullable = true, length = 100)
    private String Top_speed_km_h;
    @Column(nullable = true, length = 100
    )private String Torque_Nm;
    @Column(nullable = true, length = 100)
    private String Rating;
    @Column(nullable = true, length = 100)
    private String Engine_type;
    @Column(nullable = true, length = 100)
    private String Fuel_system;
    @Column(nullable = true, length = 100)
    private String Fuel_control;
    @Column(nullable = true, length = 100)
    private String Cooling_system;
    @Column(nullable = true, length = 100)
    private String Gearbox;
    @Column(nullable = true, length = 100)
    private String Transmission_type;
    @Column(nullable = true, length = 100)
    private String Frame_type;
    @Column(nullable = true, length = 100)
    private String Front_suspension;
    @Column(nullable = true, length = 100)
    private String Rear_suspension;
    @Column(nullable = true, length = 100)
    private String Rear_wheel_travel;
    @Column(nullable = true, length = 100)
    private String Front_tyre;
    @Column(nullable = true, length = 100)
    private String Rear_tyre;
    @Column(nullable = true, length = 100)
    private String Front_brakes;
    @Column(nullable = true, length = 100)
    private String Rear_brakes;
    @Column(nullable = true, length = 100)
    private String Color_options;
    @Column(nullable = true, length = 100)
    private String Starter;
    @Column(nullable = true, length = 100)
    private String Comments;
    @Column(nullable = true, length = 100)
    private String Engine_details;
    @Column(nullable = true, length = 100)
    private String Compression_Ratio;
    @Column(nullable = true, length = 100)
    private String Valves_per_cylinder;
    @Column(nullable = true, length = 100)
    private String Ignition;
    @Column(nullable = true, length = 100)
    private String Lubrication_system;
    @Column(nullable = true, length = 100)
    private String Clutch;
    @Column(nullable = true, length = 100)
    private String Driveline;
    @Column(nullable = true, length = 100)
    private String Greenhouse_gases;
    @Column(nullable = true, length = 100)
    private String Emission_details;
    @Column(nullable = true, length = 100)
    private String Exhaust_system;
    @Column(nullable = true, length = 100)
    private String Wheels;
    @Column(nullable = true, length = 100)
    private String Power_weight_ratio;
    @Column(nullable = true, length = 100)
    private String Factory_warranty;
    @Column(nullable = true, length = 100)
    private String Electrical;
    @Column(nullable = true, length = 100)
    private String Carrying_capacity;
    @Column(nullable = true, length = 100)
    private String Instruments;
    @Column(nullable = true, length = 100)
    private String Light;
    @Column(nullable = true, length = 100)
    private String Max_RPM;
    @Column(nullable = true, length = 100)
    private String Seat;
    @Column(nullable = true, length = 100)
    private String Modifications_compared_to_previous_model;
    @Column(nullable = true, length = 100)
    private String Front_percentage_of_weight;
    @Column(nullable = true, length = 100)
    private String Rear_percentage_of_weight;
    @Column(nullable = true, length = 100)
    private String Displacement_ccm;
    @Column(nullable = true, length = 100)
    private String Displacement_cubic_inches;
    @Column(nullable = true, length = 100)
    private String Trail_mm;
    @Column(nullable = true, length = 100)
    private String Trail_inches;
    @Column(nullable = true, length = 100)
    private String Diameter_mm;
    @Column(nullable = true, length = 100)
    private String Diameter_inches;
    @Column(nullable = true, length = 100)
    private String Ground_clearance_mm;
    @Column(nullable = true, length = 100)
    private String Ground_clearance_inches;
    @Column(nullable = true, length = 100)
    private String Wheelbase_mm;
    @Column(nullable = true, length = 100)
    private String Wheelbase_inches;
    @Column(nullable = true, length = 100)
    private String Fuel_capacity_liters;
    @Column(nullable = true, length = 100)
    private String Fuel_capacity_gallons;
    @Column(nullable = true, length = 100)
    private String Front_wheel_travel_mm;
    @Column(nullable = true, length = 100)
    private String Front_wheel_travel_inches;
    @Column(nullable = true, length = 100)
    private String Dry_weight_kg;
    @Column(nullable = true, length = 100)
    private String Dry_weight_pounds;
    @Column(nullable = true, length = 100)
    private String Overall_height_mm;
    @Column(nullable = true, length = 100)
    private String Overall_height_inches;
    @Column(nullable = true, length = 100)
    private String Overall_length_mm;
    @Column(nullable = true, length = 100)
    private String Overall_length_inches;
    @Column(nullable = true, length = 100)
    private String Overall_width_mm;
    @Column(nullable = true, length = 100)
    private String Overall_width_inches;
    @Column(nullable = true, length = 100)
    private String Reserve_fuel_capacity_liters;
    @Column(nullable = true, length = 100)
    private String Reserve_fuel_capacity_gallons;
    @Column(nullable = true, length = 100)
    private String Top_speed_mph;
    @Column(nullable = true, length = 100)
    private String Alternate_seat_height_mm;
    @Column(nullable = true, length = 100)
    private String Alternate_seat_height_inches;
    @Column(nullable = true, length = 100)
    private String Oil_capacity_liters;
    @Column(nullable = true, length = 100)
    private String Oil_capacity_quarts;
    @Column(nullable = true, length = 100)
    private String Seat_height_mm;
    @Column(nullable = true, length = 100)
    private String Seat_height_inches;
    @Column(nullable = true, length = 100)
    private String Compression_Enumerator;
    @Column(nullable = true, length = 100)
    private String Fuel_consumption_km_liter;
    @Column(nullable = true, length = 100)
    private String Fuel_consumption_miles_gallon;
    @Column(nullable = true, length = 100)
    private String Automatic_gearbox;
    @Column(nullable = true, length = 100)
    private String Torque_kgf_m;
    @Column(nullable = true, length = 100)
    private String Torque_ft_lbs;
    @Column(nullable = true, length = 100)
    private String Torque_Benchmark_RPM;
    @Column(nullable = true, length = 100)
    private String Bore_inches;
    @Column(nullable = true, length = 100)
    private String Stroke_inches;
    @Column(nullable = true, length = 100)
    private String Power_kW;
    @Column(nullable = true, length = 100)
    private String Power_Benchmark_RPM;
    @Column(nullable = true, length = 100)
    private String Price_as_new_USD;
    @Column(nullable = true, length = 100)
    private String Price_as_new_Euros;





    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bike_id")
    private Bike bike;




}
