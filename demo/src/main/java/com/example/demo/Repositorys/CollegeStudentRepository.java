package com.example.demo.Repositorys;

import com.example.demo.Models.CollegeStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeStudentRepository extends JpaRepository<CollegeStudent,Integer> {
}
