package com.example.demo.Services;

import com.example.demo.Enums.BranchName;
import com.example.demo.Models.CollegeStudent;
import com.example.demo.Repositorys.CollegeStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CollegeStudentService {
    @Autowired
    CollegeStudentRepository collegeStudentRepository;

    public String addStudent(String name, int rollNo, BranchName branchName, int marks){
        CollegeStudent collegeStudent=new CollegeStudent();
        collegeStudent.setName(name);
        collegeStudent.setBranchName(branchName);
        collegeStudent.setRollNo(rollNo);
        collegeStudent.setMarks(marks);
        collegeStudentRepository.save(collegeStudent);
        return "successfully added student";
    }

    public List<CollegeStudent> getStudent(){
        List<CollegeStudent>list=new ArrayList<>();
        for(CollegeStudent collegeStudent:collegeStudentRepository.findAll()){
            list.add(collegeStudent);
        }
        return list;
    }
}
