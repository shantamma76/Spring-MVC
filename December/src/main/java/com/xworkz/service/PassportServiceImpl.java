package com.xworkz.service;

import com.xworkz.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{
    @Override
    public boolean validPassport(PassportDTO passportDTO) {
        return true;
    }
}
