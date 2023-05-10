package com.example.demo.Services;

import com.example.demo.Models.Grant;
import com.example.demo.Repositorys.GrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrantService {

    @Autowired
    GrantRepository grantRepository;

    public String addGrant(Grant grant){
        Grant grant1=new Grant();
        grant1.setBranchName(grant.getBranchName());
        grant1.setGrantRupees(grant.getGrantRupees());
        grantRepository.save(grant1);
        return "successfully add grant!";
    }
}
