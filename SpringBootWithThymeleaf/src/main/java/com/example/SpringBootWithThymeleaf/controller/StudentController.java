package com.example.SpringBootWithThymeleaf.controller;

import com.example.SpringBootWithThymeleaf.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    // get list of student from this method
    @GetMapping("/student")
    public String listStudent(Model model){
        List<Student> students= new ArrayList<>();
        students.add(new Student(101,"md imran alam","mdimranalam@gmai.com","854526642265"));
        students.add(new Student(102,"md furkan alam","mdfurkanalam@gmai.com","854526642265"));
        students.add(new Student(103,"md adil alam","mdadilalam@gmai.com","854526642265"));
        students.add(new Student(104,"md raja alam","mdrajaalam@gmai.com","854526642265"));
        students.add(new Student(105,"md shahid alam","mdshahidalam@gmai.com","854526642265"));
        model.addAttribute("student",students);
        return "student-list";

    }

}
