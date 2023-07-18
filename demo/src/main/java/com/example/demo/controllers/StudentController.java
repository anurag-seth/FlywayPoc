package com.example.demo.controllers;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
        return studentService.findAll();
    }

    @PostMapping("/save")
    public Student saveStudent(Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/delete")
    public void deleteStudent(int id){
        studentService.deleteById(id);
    }
}
