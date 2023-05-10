package com.example.demo.Controllers;

import com.example.demo.Models.Grant;
import com.example.demo.Services.GrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grant")
public class GrantController {
    @Autowired
    GrantService grantService;

    @PostMapping("/addGrant")
    public ResponseEntity<String> addGrant(@RequestBody Grant grant){
        return new ResponseEntity<>(grantService.addGrant(grant), HttpStatus.CREATED);
    }
}
