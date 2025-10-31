package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void createStudent(Student student) {
        studentService.createStudent(student);
    }

    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        studentService.deleteStudent(student);
    }

    public Student getStudentById(int id) {
        return studentService.getStudentById(id);
    }
}
