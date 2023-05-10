package com.example.demo.Repositorys;

import com.example.demo.Models.Grant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrantRepository extends JpaRepository<Grant,Integer> {
}
