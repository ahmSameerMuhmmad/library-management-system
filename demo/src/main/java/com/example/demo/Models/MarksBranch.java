package com.example.demo.Models;

import com.example.demo.Enums.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "marksBranch")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarksBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String hodName;
    private String contactNo;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;
}
