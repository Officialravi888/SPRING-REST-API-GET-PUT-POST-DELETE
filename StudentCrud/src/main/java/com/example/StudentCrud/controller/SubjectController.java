package com.example.StudentCrud.controller;

import com.example.StudentCrud.entity.Subject;
import com.example.StudentCrud.repository.SubjectRepository;
import com.example.StudentCrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private SubjectRepository subjectRepository;

    @RequestMapping("/sub")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }
    @RequestMapping(method=RequestMethod.POST, value = "/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/subjects/{id}")
    public void updateSubject(@PathVariable Long id, @RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

  public void DeleteSubject(@PathVariable Long id){
        subjectService.deleteSubject(id);
  }
  public void deleteSubject(Long id){
        subjectService.deleteSubject(id);
  }

}
