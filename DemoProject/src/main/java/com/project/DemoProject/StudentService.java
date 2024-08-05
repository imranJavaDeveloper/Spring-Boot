package com.project.DemoProject;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class StudentService {

    private static ArrayList<Student> list= new ArrayList<>();

    static {

        list.add(new Student(102,"md furkan alam",450));
        list.add(new Student(103,"md raja alam",480));
        list.add(new Student(104,"md imroz alam",433));
        list.add(new Student(105,"md shahid ali alam",338));
    }

    // get all student
     public List<Student> getAllStudent(){
        return list;
     }

     // get student by id
     public Student getStudentById(int id){
        Student s=null;
       s= list.stream().filter(e->e.getId()==id).findFirst().get();
       return s;
     }

     // add student
    public Student addStudent(Student student){
        list.add(student);

        return student;
    }

}
