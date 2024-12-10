package com.xworkz.controller;

import com.xworkz.dto.DeathCertificateDTO;
import com.xworkz.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathController {

    @Autowired
    private DeathCertificateService service;

    DeathController() {
        System.out.println("running DeathController");
    }

    @RequestMapping("/deceased")
    public String display(DeathCertificateDTO dto) {
        System.out.println("Running DeathController");
        System.out.println(dto);
        if (this.service.validAndSave(dto)) {
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
            }
            return "deathCertificate.jsp";
        }
    }







