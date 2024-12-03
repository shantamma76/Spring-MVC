package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz")
public class StudentConfiguration {

    StudentConfiguration() {
            System.out.println("Created Student Configuration const");
        }
    }







