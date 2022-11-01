package com.example.deepasjavademo.Service;

import com.example.deepasjavademo.Model.Subject;
import com.example.deepasjavademo.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@ComponentScan("Repository")
public class Subjectservice {

    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getallsubject(){
        List<Subject> subjects=new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addsubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updatesubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void deletsubject(int id){
        subjectRepository.deleteById(id);
    }

    public Optional<Subject> getReferenceById(int id) {
        return subjectRepository.findById(id);

    }
}
