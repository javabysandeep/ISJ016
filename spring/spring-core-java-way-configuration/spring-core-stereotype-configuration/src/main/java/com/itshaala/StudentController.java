package com.itshaala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    void addStudent() {
        studentService.addStudent();
    }
}
