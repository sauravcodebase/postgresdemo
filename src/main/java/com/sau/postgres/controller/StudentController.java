package com.sau.postgres.controller;

import com.sau.postgres.model.Student;
import com.sau.postgres.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = StudentController.ROOT)
public class StudentController {
    public static final String ROOT = "/api/v1/sau";
    @Autowired
    StudentService studentService;
    @PostMapping(value = "/create" ,consumes = "application/json")
    public ResponseEntity<Object> create(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getName());
        studentService.createStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}
