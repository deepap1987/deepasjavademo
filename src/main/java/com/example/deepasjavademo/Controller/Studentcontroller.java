package com.example.deepasjavademo.Controller;

import com.example.deepasjavademo.Model.Student;
import com.example.deepasjavademo.Model.Subject;
import com.example.deepasjavademo.Service.Studentservice;
import com.example.deepasjavademo.Service.Subjectservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Student")
public class Studentcontroller {

    @Autowired
    Studentservice studentservice;

    @RequestMapping(method = RequestMethod.GET , value="/Getall")
    public List<Student> getallstudent(){
       return studentservice.getallstudent();
    }

    @RequestMapping(method=RequestMethod.POST , value="/Addstudent")
    public void addstudent(@RequestBody Student student){
        studentservice.addstudent(student);

    }
    @RequestMapping(method=RequestMethod.PUT , value="/Updatestudent/{id}")
    public void updatestudent(@PathVariable Integer id, @RequestBody Student student){
        studentservice.updatestudent(student);
    }
    @RequestMapping(method=RequestMethod.DELETE , value="/Deletstudent/{id}")
    public void deletstudent(@PathVariable  Integer id){
        studentservice.deletstudent(id);
    }
    @RequestMapping(method=RequestMethod.GET ,value = "/Getbyid/{id}")
    public Optional<Student> getstudentbyid(@PathVariable Integer id){
        return studentservice.getstudentbyid(id);
    }
}
