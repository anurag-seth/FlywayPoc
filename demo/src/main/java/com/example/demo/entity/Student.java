package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_detail")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="stud_id", unique=true, nullable = false, updatable = false)
    private int studId;

    @Column(name="first_name", nullable = false)
    @Pattern(regexp = "^[a-zA-Z]{3,10}$", message = "name must be of 3 to 10 length with no special characters")
    private String firstName;

    @Column(name="last_name")
    @Pattern(regexp = "^[a-zA-Z]{3,10}$", message = "name must be of 3 to 10 length with no special characters and numbers")
    private String lastName;

    @Column(name="email", unique=true, nullable = false, updatable = false)
    private String email;

    @Column(name="gender")
    private String gender;

    @Column(name="phn_num")
    private String number;
}
