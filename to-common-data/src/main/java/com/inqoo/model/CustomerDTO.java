package com.inqoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Integer id;

    private  String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private String phone;
    private String country;
    private String province;
    private String road;
    private String houseNumber;
    private String zipCode;
    List<TripDTO> tripDTOListt;



}
