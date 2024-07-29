package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@RequestMapping("/demo")
    public static String myMethod(){
        return "furkan alam";
    }
}
