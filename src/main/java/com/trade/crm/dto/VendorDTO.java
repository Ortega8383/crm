package com.trade.crm.dto;

import com.trade.crm.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendorDTO {
    private int id;
    private String company;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private String email;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String city;
    private String zipCode;
    private String notes;
}
