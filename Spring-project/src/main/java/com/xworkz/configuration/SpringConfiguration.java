package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class SpringConfiguration {


    @Bean
    public String bescuitName(){
        System.out.println("Running bescuitName in SpringConfiguration");
        return "parle";
    }

    @Bean
public int cakeCost(){
        System.out.println("Running cakeCost SpringConfiguration");
        return 50;
}
    @Bean
   public double chipsCost(){
       System.out.println("Running chipsCost SpringConfiguration");
       return 20.00;
   }

    @Bean
   public String color(){
       System.out.println("Running color SpringConfiguration");
       return "Brown";
   }

   @Bean
   public String powerBrand(){
       System.out.println("Running powerBrand in SpringConfiguration");
       return "Yardley";
   }
    @Bean
   public String phoneBrand(){
       System.out.println("Running phoneBrand in SpringConfiguration");
       return "Techno Spark";
   }

    @Bean
   public String voltage(){
       System.out.println("Running voltage in SpringConfiguration");
       return "2.1V";
   }

    @Bean
   public String juiceName(){
       System.out.println("Running juiceName in SpringConfiguration");
       return "Mango";
   }

    @Bean
   public String icrcreamName(){
       System.out.println("Running icrcreamName in SpringConfiguration");
       return "Paluda";
   }

    @Bean
   public double cost(){
       System.out.println("Running cost in SpringConfiguration");
       return 55.00;
   }

}
