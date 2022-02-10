package com.example.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");

        sayHello hello = cont.getBean("sayHello", sayHello.class);
        hello.sayHello();
    }

}
