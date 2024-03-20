package com.jerrycodes.studentsystem.service;

import com.jerrycodes.studentsystem.model.Student;
import com.jerrycodes.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicelmpl implements StudentService{
    // 连接数据库
    @Autowired
    private StudentRepository studentRepository;

    // 保存，Alt + Insert - Override Methods... - SaveStudent(student:Student):Student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // 获取：Alt + Insert - Override Methods... - getALLStudents():List<Student>
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
