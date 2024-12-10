package com.xworkz.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccountDto {

    private String bankName;
    private String holderName;
    private long accountNo;

}
