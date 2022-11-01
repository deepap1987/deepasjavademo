package com.example.deepasjavademo.Repository;


import com.example.deepasjavademo.Model.Subject;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer>{
}
