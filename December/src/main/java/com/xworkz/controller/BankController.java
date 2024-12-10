package com.xworkz.controller;

import com.xworkz.dto.BankAccountDto;
import com.xworkz.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController {

        @Autowired
        private BankAccountService service;

        BankController(){
            System.out.println("running bankController");
        }

        @RequestMapping("/bank")
        public String onCreate(BankAccountDto dto){
            System.out.println("Executing a onCreate in BankAccountController");
            System.out.println(dto);
            if(this.service.validAndSave(dto)){
                System.out.println("Data is Saved");
            }else{
                System.out.println("Data is Not Saved");
            }
            return "bankAccount.jsp";
        }

}

