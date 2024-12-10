package com.xworkz.service;

import com.xworkz.dto.DeathCertificateDTO;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements  DeathCertificateService{
    @Override
    public boolean validAndSave(DeathCertificateDTO deathCertificateDTO) {
        return true;
    }
}
