package com.itshaala.springboot001jdbc.service;

import com.itshaala.springboot001jdbc.dao.StudentDao;
import com.itshaala.springboot001jdbc.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    private StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
