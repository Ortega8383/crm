package com.trade.crm.entity;

import com.trade.crm.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendors")
@Where(clause = "is_deleted = false")
public class Vendor extends BaseEntity {
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
