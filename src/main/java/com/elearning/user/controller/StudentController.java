package com.elearning.user.controller;

import com.elearning.user.dto.StudentDto;
import com.elearning.user.dto.StudentInfoDto;
import com.elearning.user.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentInfoDto> createStudent(@RequestBody StudentDto studentDto) {
        StudentInfoDto studentInfoDto = studentService.createStudent(studentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentInfoDto);
    }
}
