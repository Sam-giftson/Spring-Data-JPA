package com.example.JPADemo.controller;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentservice;

    @GetMapping("/student")
    public List<Student> getStudentDetails(){
        return studentservice.getStudentDetails();
    }

    @GetMapping("/student/{rno}")
    public Student getStudentById(@PathVariable int rno){
        return studentservice.getStudentById(rno);

    }

    @PostMapping("/student")
    public String addDetails(@RequestBody Student student){
        studentservice.addDetails(student);
        return "added";
    }

    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student){
        studentservice.updateStudent(student);
        return "update done";
    }

    @DeleteMapping("/student/{rno}")
    public String deleteStudent(@PathVariable int rno){
        studentservice.deleteStudent(rno);
        return "delete done";
    }

//    creating own method
        @GetMapping("/student/technology/{tech}")
        public List<Student> getStudentByTechnology(@PathVariable("tech") String technology){
            return studentservice.getStudentByTechnology(technology);
    }
}


