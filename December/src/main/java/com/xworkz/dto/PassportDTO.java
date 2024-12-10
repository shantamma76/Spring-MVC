package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassportDTO {

    private String givenName;
    private String surname;
    private String dob;
    private String emailId;
    private String loginID;
    private String password;
    private String confirmPassword;
    private String hintAnswer;

}
