package com.xworkz.controller;

import com.xworkz.dto.HospitalDTO;
import com.xworkz.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {

    @Autowired
    private HospitalService service;

    HospitalController(){
        System.out.println("Running HospitalController");
    }

    @RequestMapping("/hospital")
    public String onPress(HospitalDTO dto) {
        System.out.println(dto);
        if(this.service.saveAndValide(dto)){
            System.out.println("valid");
        } else{
            System.out.println("not valid");
        }
        return "hospital.jsp";

    }

}
