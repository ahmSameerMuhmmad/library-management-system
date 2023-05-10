package com.example.demo.Services;

import com.example.demo.Enums.BranchName;
import com.example.demo.Models.CollegeStudent;
import com.example.demo.Models.MarksBranch;
import com.example.demo.Repositorys.CollegeStudentRepository;
import com.example.demo.Repositorys.MarksBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarksBranchService {
    @Autowired
    MarksBranchRepository marksBranchRepository;

    @Autowired
    CollegeStudentRepository collegeStudentRepository;
    public String addMarksBranch(MarksBranch marksBranch){
        MarksBranch marksBranch1=new MarksBranch();
        marksBranch1.setBranchName(marksBranch.getBranchName());
        marksBranch1.setContactNo(marksBranch.getContactNo());
        marksBranch1.setHodName(marksBranch.getHodName());
        marksBranchRepository.save(marksBranch1);
        return "successfully added marksBranch";
    }
    public List<String> getContactNumberOfStudent(){
        List<String>numbers=new ArrayList<>();
        for(MarksBranch marksBranch: marksBranchRepository.findAll()){
            BranchName branchName=marksBranch.getBranchName();
            if(collegeStudentRepository.findById(marksBranch.getId()).isPresent() ){
                CollegeStudent collegeStudent=collegeStudentRepository.findById(marksBranch.getId()).get();
                if(collegeStudent.getMarks()>=35){
                    numbers.add(marksBranch.getContactNo());
                }

            }

        }
        return numbers;
    }
}
