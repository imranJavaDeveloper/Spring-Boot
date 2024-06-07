package com.example.springboot.service;

import com.example.springboot.entity.Student;
import com.example.springboot.repositroy.StudentRepositroy;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepositroy studentRepositroy;

    // give all Student list
       public List<Student> getAllUser(){
           return studentRepositroy.findAll();
       }
    // print Student detail based on id

       public Optional<Student> getUserId(Integer id){
           return studentRepositroy.findById(id);
       }

    // create  new student and save it detail
    public Student createStudent(Student student){
           return studentRepositroy.save(student);
    }

    // update user
     public Student UpdateStudent(Integer id,Student detail){
           Student student=studentRepositroy.findById(id).orElseThrow(()->new RuntimeException("student not found"));
            student.setName(detail.getName());
            student.setAddress(detail.getAddress());
            student.setPhone(detail.getPhone());
            return studentRepositroy.save(detail);
     }


    public void deleteUser(Integer id) {
        studentRepositroy.deleteById(id);
    }

}
