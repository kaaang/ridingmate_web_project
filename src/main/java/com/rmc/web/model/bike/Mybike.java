package com.rmc.web.model.bike;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.rmc.web.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Mybike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = true, length = 100)
    private String nickname;

//    이미지 예정
//    @OneToMany(fetch = FetchType.LAZY)
//    @JsonBackReference
//    @JoinColumn(name = "mybike_id")
//    private List<MybikeImage> mybikeImage;

    @CreationTimestamp
    private Timestamp timestamp;

    @Column(nullable = true)
    private int mileage;

    @Column(nullable = true, length = 50)
    private String purchase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bike_id")
    private Bike bike;
}
