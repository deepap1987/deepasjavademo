package com.example.deepasjavademo.Controller;


import com.example.deepasjavademo.Model.Subject;
import com.example.deepasjavademo.Service.Subjectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Subject")
public class SubjectController {

    @Autowired
    Subjectservice subjectservice;

    @RequestMapping(value="/GetAll", method= RequestMethod.GET)
    public List<Subject> getallsubject(){

        return subjectservice.getallsubject();
    }

    @RequestMapping(method = RequestMethod.POST, value="/AddSubject")
    public void addsubject(@RequestBody Subject subject){
        subjectservice.addsubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/updateSubject/{id}")
    public void updatesubject(@PathVariable Integer id, @RequestBody Subject subject){
        subjectservice.updatesubject(subject);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/deletSubject/{id}")
    public void deletsubject(@PathVariable Integer id)
    {
        subjectservice.deletsubject(id);
    }

    @RequestMapping(value="/GetbyId/{id}",method= RequestMethod.GET)
    public Optional<Subject> findbyid(@PathVariable Integer id){
        Optional<Subject> subject=subjectservice.getReferenceById(id);
        return subject;
    }
}
