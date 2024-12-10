package com.xworkz.service;


import com.xworkz.dto.BankAccountDto;

public interface BankAccountService {

    boolean validAndSave(BankAccountDto bankAccountDto);

}
