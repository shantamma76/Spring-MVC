package com.xworkz.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeathCertificateDTO {
 private String deceasedName;
 private  String deceasedAge;
 private String address;
 private String dob;
 private String lastDay;
 private String cause;
}
