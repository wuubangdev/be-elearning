package com.elearning.user.service;

import com.elearning.user.dto.StudentDto;
import com.elearning.user.dto.StudentInfoDto;

public interface StudentService {
    public StudentInfoDto createStudent(StudentDto studentDto);
    public StudentInfoDto updateStudent(StudentDto studentDto);
}
