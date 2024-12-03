package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cake {

    @Autowired
    private int cakeCost;
}
