package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class DecConfiguration {

    public DecConfiguration(){
        System.out.println("N-arg constructor in DecConfiguration");
    }
}
