package com.korit.authstudy.dto;

import com.korit.authstudy.domain.entity.Member;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
public class MemberRegisterDto {

    private String membername;
    private String password;
    private String name;
    private String email;

    public Member toEntity(BCryptPasswordEncoder passwordEncoder) {
        return Member.builder()
                .membername(membername)
                .password(passwordEncoder.encode(password))
                .name(name)
                .email(email)
                .build();
    }
}
