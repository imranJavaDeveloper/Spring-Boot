package com.project.DemoProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    // get all student
    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return this.studentService.getAllStudent();
    }

    // get student by id

    @GetMapping("/{id}")
    public Student getById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }

    @PostMapping("/add")
     public Student addStudent(@RequestBody Student student){

       Student s= this.studentService.addStudent(student);

       return s;

     }

}
