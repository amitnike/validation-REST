package com.amit.springboot.validationREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amit.springboot.validationREST.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
