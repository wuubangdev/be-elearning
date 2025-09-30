package com.elearning.user.service.impl;

import com.elearning.user.dto.StudentDto;
import com.elearning.user.dto.StudentInfoDto;
import com.elearning.user.entity.Student;
import com.elearning.user.mapper.StudentMapper;
import com.elearning.user.repository.StudentRepository;
import com.elearning.user.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentInfoDto createStudent(StudentDto studentDto) {
        Student student = studentRepository.save(StudentMapper.toStudent(studentDto));
        return StudentMapper.toStudentInfoDto(student);
    }
}
