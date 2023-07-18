package com.example.demo.services;


import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAll();

    Student save(Student student);

    void deleteById(int id);
}
