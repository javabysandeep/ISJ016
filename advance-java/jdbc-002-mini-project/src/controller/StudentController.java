package controller;

import model.Student;
import service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void createStudent(Student student) {
        studentService.createStudent(student);
    }

    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudentById(int id) {
        studentService.deleteStudentById(id);
    }

    public Student getStudentById(int id) {
        return studentService.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
