package com.xworkz.service;

import com.xworkz.dto.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Override
    public boolean saveAndValide(HospitalDTO hospitalDTO) {
        return true;
    }
}
