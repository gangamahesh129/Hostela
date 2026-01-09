package com.example.hostela.jpamodel;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hostel_details")
public class HostelDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotelid")
    private Integer hostelId;

    @Column(name = "hostelname")
    private String hostelName;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private Integer pinCode;

    @Column(name = "userid")
    private Integer userid;


}
