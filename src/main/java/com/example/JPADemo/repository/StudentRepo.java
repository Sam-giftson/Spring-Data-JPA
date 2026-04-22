package com.example.JPADemo.repository;

import com.example.JPADemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import com.example.JPADemo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
