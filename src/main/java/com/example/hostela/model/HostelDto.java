package com.example.hostela.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class HostelDto {
    private Integer hostelId;
    private String hostelName;
    private String street;
    private String city;
    private String state;
    private Integer pinCode;
    private Integer userid;
}
