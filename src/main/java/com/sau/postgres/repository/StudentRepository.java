package com.sau.postgres.repository;

import com.sau.postgres.model.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {}
