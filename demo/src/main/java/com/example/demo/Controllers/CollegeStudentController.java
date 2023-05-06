package com.example.demo.Controllers;

import com.example.demo.Enums.BranchName;
import com.example.demo.Models.CollegeStudent;
import com.example.demo.Services.CollegeStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collegeStudent")
public class CollegeStudentController {
    @Autowired
    CollegeStudentService collegeStudentService;

    @PostMapping("/addStudent")
    public ResponseEntity<String>addStudent(@RequestParam("name") String name,
                                            @RequestParam("rollNo") int rollNo,
                                            @RequestParam("branchName") BranchName branchName,
                                            @RequestParam("marks") int marks){
        String response=collegeStudentService.addStudent(name,rollNo,branchName,marks);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/getStudent")
    public ResponseEntity<List<CollegeStudent>>getStudent(){
        return new ResponseEntity<>(collegeStudentService.getStudent(),HttpStatus.FOUND);
    }


}
