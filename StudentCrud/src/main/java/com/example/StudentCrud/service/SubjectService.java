package com.example.StudentCrud.service;

import com.example.StudentCrud.entity.Subject;
import com.example.StudentCrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepo;
    public List<Subject> getAllSubject(){
        List<Subject>subjects=new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;

    }

    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }


    public void deleteSubject(Long id) {
    }
}
