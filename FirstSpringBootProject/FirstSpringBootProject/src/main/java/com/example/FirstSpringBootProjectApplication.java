package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

    public static void main(String[] args) {
        System.out.println( Controller.myMethod());
        System.out.println("my first spring boot application");
        System.out.println("hi");

        System.out.println("welocme md imran alam");
        System.out.println("");
        SpringApplication.run(FirstSpringBootProjectApplication.class, args);
    }

}
