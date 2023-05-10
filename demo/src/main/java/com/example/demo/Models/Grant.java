package com.example.demo.Models;

import com.example.demo.Enums.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "grant")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Grant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;
    private int grantRupees;
}
