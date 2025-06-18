package com.korit.authstudy.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "members_tb")
public class Member {

    @Id // Primary Key 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Incremental 설정
    @Column(name = "member_id")
    private Integer id;
    private String memberName;
    private String password;
    private String name;
    private String email;

}
