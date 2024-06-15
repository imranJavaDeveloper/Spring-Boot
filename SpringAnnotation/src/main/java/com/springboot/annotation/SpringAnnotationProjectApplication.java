package com.springboot.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationProjectApplication {

	@Autowired
    @Qualifier("student2")
	public Student student;
	@Autowired
	@Qualifier("emp1")
	public Emp emp;

	public static void main(String[] args) {

		SpringApplication.run(SpringAnnotationProjectApplication.class, args);


	}

}
