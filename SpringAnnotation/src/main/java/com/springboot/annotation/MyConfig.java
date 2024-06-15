package com.springboot.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class MyConfig {

    @Bean("student1")
    Student getStudent(){
        System.out.println("get student method called");
        System.out.println(" first student  object called");
        return new Student("Student1");
    }
@Bean("student2")
    Student createStudent(){
        System.out.println("create student method called");
        System.out.println("second object called");
        return new Student("Student2");
    }
    @Bean("emp1")
    Emp getEmp(){
        System.out.println("first Emp object called");
        System.out.println("thank you");
        return new Emp(" Emp1");
    }

    @Bean("emp2")
    Emp createEmp(){
        System.out.println("second  Emp object called");
        System.out.println("thank you");
        return new Emp("Emp2");
    }
}
