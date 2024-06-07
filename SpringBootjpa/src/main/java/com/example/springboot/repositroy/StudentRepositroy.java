package com.example.springboot.repositroy;

import com.example.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositroy extends JpaRepository<Student, Integer> {
}
