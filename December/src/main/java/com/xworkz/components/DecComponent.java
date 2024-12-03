package com.xworkz.components;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DecComponent {

    public DecComponent(){
        System.out.println("No-arg constructor in DecComponent");
    }

    @RequestMapping("/press")
    public String onPress(){
        System.out.println("running onPress in DecComponent");
        return "index.jsp";
    }
}
