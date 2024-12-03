package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class WinterConfiguration {

    @Bean
    public String teamName(){
        System.out.println("no-arg constructor in teamName");
        return "RCB";
    }

    @Bean
    public double budget(){
        System.out.println("No-arg constructor in budget");
        return 45000.00;
    }

    @Bean
    public String ownerName(){
        System.out.println("No-arg constructor in ownerName");
        return "United Spirits Limited";
    }

    @Bean
    public double batCost(){
        System.out.println("No-arg constructor in batCost");
        return 1000.00;
    }

    @Bean
    public double ballCost(){
        System.out.println("No-arg Constructor in ballCost");
        return 500.00;
    }

    @Bean
    public String stadium(){
        System.out.println("No-arg Constructor in ballCost");
        return "chinnaswami Stadium";

    }
}




