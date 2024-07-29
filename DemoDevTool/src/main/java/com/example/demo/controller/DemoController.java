package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/test")
	
	public String demo() {
		return"this is web page";
	}
	
	@GetMapping("/add")
	public String add() {
		
		int a=45;
		int b=98;
		return" sum of two number"+(a+b);
	}
	
	@GetMapping("/sub")
	
	public String sub() {
		
	   int fristNumber=45;
	   int secondNumber=78;
	   
		
		return"the subtract od two number"+(fristNumber-secondNumber);
	}

}
