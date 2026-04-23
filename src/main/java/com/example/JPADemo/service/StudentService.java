package com.example.JPADemo.service;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentrepo;

    public List<Student> getStudentDetails() {
        return studentrepo.findAll();
    }

    public void addDetails(Student student) {
        studentrepo.save(student);
    }

    public Student getStudentById(int rno) {
        return studentrepo.getReferenceById(rno);
    }

    public void updateStudent(Student student) {
        Student s = studentrepo.findById(student.getRno()).orElse(null);

        if (s != null) {
            s.setName(student.getName());
            s.setGender(student.getGender());
            s.setTechnology(student.getTechnology());

            studentrepo.save(s);
        }
    }

    public void deleteStudent(int rno) {
        studentrepo.deleteById(rno);
        // delete by ID
    }

    public List<Student> getStudentByTechnology(String technology) {
        return studentrepo.findByTechnology(technology);
    }
}

