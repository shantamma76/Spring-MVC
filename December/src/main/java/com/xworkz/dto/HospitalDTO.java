package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@NoArgsConstructor
public class HospitalDTO {
    //5
    private String hospitalName;
    private String location;
    private String patientName;
    private int patientAge;
    private String disease;

}
