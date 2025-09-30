package com.elearning.user.mapper;

import com.elearning.user.dto.StudentDto;
import com.elearning.user.dto.StudentInfoDto;
import com.elearning.user.entity.Student;

public class StudentMapper {

    public static Student toStudent(StudentDto studentDto) {
        Student student = new Student(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getEmail(),
                studentDto.getPassword(),
                studentDto.getPhone()
        );
        return student;
    }

    public static StudentInfoDto toStudentInfoDto(Student student) {
        StudentInfoDto studentInfoDto = new StudentInfoDto(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getPhone()
        );
        return studentInfoDto;
    }
}
