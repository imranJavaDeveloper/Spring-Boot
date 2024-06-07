package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllUsers() {
        return studentService.getAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getUserById(@PathVariable Integer id) {
        Optional<Student> user = studentService.getUserId(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Student createUser(@RequestBody Student user) {
        return studentService.createStudent(user);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Student> updateUser(@PathVariable Integer id, @RequestBody Student userDetails) {
        return ResponseEntity.ok(studentService.UpdateStudent(id, userDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        studentService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}