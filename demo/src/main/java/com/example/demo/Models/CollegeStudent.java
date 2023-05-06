package com.example.demo.Models;

import com.example.demo.Enums.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "collegeStudent")
@NoArgsConstructor
@AllArgsConstructor

public class CollegeStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int rollNo;
    private String name;
    private int marks;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;
}
