package com.itshaala.springboot001jdbc.controller;

import com.itshaala.springboot001jdbc.model.Student;
import com.itshaala.springboot001jdbc.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }

    public Student getStudent(int id) {
        return studentService.getStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
