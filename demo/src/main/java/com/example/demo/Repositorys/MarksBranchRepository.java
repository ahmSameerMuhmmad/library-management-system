package com.example.demo.Repositorys;

import com.example.demo.Models.MarksBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksBranchRepository extends JpaRepository<MarksBranch,Integer> {
}
