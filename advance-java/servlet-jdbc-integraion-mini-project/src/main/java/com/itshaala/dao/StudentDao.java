package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public void createStudent(Student student) {
        String query = "insert into student(name, email, phone) values(?,?,?)";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.executeUpdate();

        } catch (Exception e) {
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("issue while closing the connection");
            }
        }
    }

    public void updateStudent(Student student) {
        String query = "update student set name=?, email=?,phone=? where id=?";
        Connection connection = ConnectionUtil.getConnection();
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.setInt(4, student.getId());
            ps.executeUpdate();
        } catch (Exception e) {

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void deleteStudent(int id) {
        String query = "delete from student where id=?";
        Connection connection = ConnectionUtil.getConnection();
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        } finally {
            try {
                connection.close();
            } catch (Exception e) {

            }
        }
    }

    public Student getStudentById(int id) {
        String query = "select * from student where id=?";
        Student student = null;
        Connection connection = ConnectionUtil.getConnection();
        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            student = new Student();
            while (resultSet.next()) {
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setPhone(resultSet.getString("phone"));
            }
        } catch (Exception e) {

        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
            }
        }
        return student;
    }

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        String query = "select * from student";
        Connection connection = ConnectionUtil.getConnection();
        try {

            Statement ps = connection.createStatement();
            ResultSet resultSet = ps.executeQuery(query);

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setPhone(resultSet.getString("phone"));
                studentList.add(student);
            }
        } catch (Exception e) {
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
            }
        }
        return studentList;
    }
}
