package com.inqoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripDTO {
    private Integer id;
    private LocalDate start;
    private LocalDate end;
    private String destination;
    private double priceEur;
    private Integer customerID;
}
