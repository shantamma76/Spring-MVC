package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pizza {

    @Autowired
    private double cost;
}
