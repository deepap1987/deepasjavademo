package com.example.deepasjavademo.Repository;

import com.example.deepasjavademo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer> {
}
