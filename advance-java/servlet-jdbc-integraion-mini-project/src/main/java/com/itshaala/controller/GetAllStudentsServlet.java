package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/student")
public class GetAllStudentsServlet extends HttpServlet {
    private StudentService studentService = new StudentService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setPhone(phone);
        studentService.createStudent(student);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentService.getAllStudents();
        PrintWriter writer = resp.getWriter();
        writer.println("List of all students");
        studentList.forEach(writer::println);
    }
}
