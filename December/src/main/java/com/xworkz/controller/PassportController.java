package com.xworkz.controller;

import com.xworkz.dto.OrganDonationDTO;
import com.xworkz.dto.PassportDTO;
import com.xworkz.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    private PassportService service;

    PassportController(){
        System.out.println("Running PassportController");
    }

    @RequestMapping("/pass")
    public String onPress(PassportDTO passportDTO){
        System.out.println(passportDTO);
        if(this.service.validPassport(passportDTO)){
            System.out.println("this is valid");
        }else{
            System.out.println("this is not valid");
        }
        return "passport.jsp";
    }
}

