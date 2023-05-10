package com.example.demo.Controllers;

import com.example.demo.Models.MarksBranch;
import com.example.demo.Services.MarksBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marksBranch")
public class MarksBranchController {
    @Autowired
    MarksBranchService marksBranchService;

  @PostMapping("/add-marksBranch")
    public ResponseEntity<String> addMarksBranch(@RequestBody MarksBranch marksBranch){
      String response=marksBranchService.addMarksBranch(marksBranch);
      return new ResponseEntity<>(response, HttpStatus.CREATED);
  }
  @GetMapping("/getContactNumberOfStudent")
    public ResponseEntity<List<String>> getContactNumberOfStudent(){
      List<String> list=marksBranchService.getContactNumberOfStudent();
      return new ResponseEntity<>(list, HttpStatus.FOUND);
  }

}
