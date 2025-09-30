package com.elearning.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StudentDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
}
