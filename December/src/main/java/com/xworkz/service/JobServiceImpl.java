package com.xworkz.service;

import com.xworkz.dto.JobDTO;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{
    @Override
    public boolean validJob(JobDTO jobDTO) {
        return true;
    }
}
