package com.springboot.annotation;

import org.springframework.stereotype.Component;

public class Student {
   String name;

   public Student(String name){
       this.name=name;
   }
    public void study(){
        System.out.println(" I am studying");
    }
}
