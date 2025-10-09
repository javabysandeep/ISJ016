package dao;

import model.Student;
import util.ConnectionUtil;

import java.sql.Connection;
import java.util.List;

public class StudentDao {
    public void createStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
    }

    public void updateStudent(Student student) {
    }

    public void deleteStudentById(int id) {
    }

    public Student getStudentById(int id) {
        return null;
    }

    public List<Student> getAllStudents() {
        return null;
    }

}
