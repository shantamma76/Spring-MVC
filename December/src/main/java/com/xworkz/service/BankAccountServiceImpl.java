package com.xworkz.service;

import com.xworkz.dto.BankAccountDto;
import com.xworkz.dto.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements  BankAccountService{

    @Override
    public boolean validAndSave(BankAccountDto bankAccountDto) {
        return true;
    }
}
