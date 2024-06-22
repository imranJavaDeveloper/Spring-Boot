package com.example.SpringBootWithThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    // create method for display the dynamic content
    @GetMapping("/hello")
    public String showHelloPage(Model model){
       model.addAttribute("message","hello : my first thymeleaf with Spring Boot project");
      // model.addAttribute("message","my thymeleaf project");
        return "hello";
    }
}
