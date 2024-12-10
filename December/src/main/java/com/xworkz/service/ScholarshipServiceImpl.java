package com.xworkz.service;

import com.xworkz.dto.ScholarshipDTO;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipServiceImpl implements ScholarshipService{
    @Override
    public boolean validScholarship(ScholarshipDTO scholarshipDTO) {
        return true;
    }
}




