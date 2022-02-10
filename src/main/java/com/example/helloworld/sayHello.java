package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sayHello")
public class sayHello {
    @Value("${hello}")
    private String hello;

    public void sayHello(){
        System.out.println(hello);
    }
}
