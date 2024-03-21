package com.jerrycodes.studentsystem.service;

import com.jerrycodes.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteStudent(int studentId);
    public void updateStudent(int studentId, String name, String address);
}
