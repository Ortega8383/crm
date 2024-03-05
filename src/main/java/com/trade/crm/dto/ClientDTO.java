package com.trade.crm.dto;

import com.trade.crm.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private int id;
    @NotBlank
    @Size(max = 50, min = 2)
    private String company;
    @NotBlank
    @Size(max = 20, min = 2)
    private String firstName;
    @NotBlank
    @Size(max = 20, min = 2)
    private String lastName;
    @NotNull
    private Gender gender;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @NotBlank
    @Email
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    private String email;
    @NotBlank
    @Pattern(regexp = "^\\+?\\d{1,2}\\s?\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}$")
    private String phone;
    @NotBlank
    @Size(max = 20, min = 2)
    private String addressLine1;
    @NotBlank
    @Size(max = 20, min = 2)
    private String addressLine2;
    @NotBlank
    @Size(max = 20, min = 2)
    private String town;
    @NotBlank
    @Size(max = 20, min = 2)
    private String city;
    @NotBlank
    @Size(max = 7, min = 2)
    private String zipCode;
    private String notes;
}
