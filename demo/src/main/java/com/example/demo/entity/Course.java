package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_detail")
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="course_type", nullable = false)
    private String courseType;

    @Column(name="course_name")
    private String courseName;

    @Column(name="isActive", nullable = false)
    private boolean active;
}
