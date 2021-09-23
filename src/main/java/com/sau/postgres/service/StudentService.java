package com.sau.postgres.service;

import com.sau.postgres.model.Student;
import com.sau.postgres.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;
    public void createStudent(Student student){
        studentRepository.save(student);

    }
}
