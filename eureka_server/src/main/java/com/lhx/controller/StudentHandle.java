package com.lhx.controller;

import com.lhx.entity.Student;
import com.lhx.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandle {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return  studentRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id")long id){
        return  studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")long id){
        studentRepository.deleteById(id);
    }
}
