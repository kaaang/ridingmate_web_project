package com.rmc.web.model.market;

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
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob
    private String content;

    @Column(nullable = false)
    private int price;

    @CreationTimestamp
    private Timestamp timestamp;

    @Enumerated(EnumType.STRING)
    private BoardRoleType role;

    @Column(nullable = false)
    private String hit;




    @OneToMany(mappedBy = "board",fetch = FetchType.EAGER)
    private List<Reply> reply;

//    @OneToMany(mappedBy = "board",fetch = FetchType.EAGER)
//    private List<BoardImg> boardImg;




}
