package com.xworkz.service;

import com.xworkz.dto.OrganDonationDTO;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements OrganDonationService{
    @Override
    public boolean validOrgan(OrganDonationDTO organDonationDTO) {
        return true;
    }
}
