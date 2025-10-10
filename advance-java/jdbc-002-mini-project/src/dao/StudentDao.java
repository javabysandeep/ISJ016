package dao;

import lombok.SneakyThrows;
import model.Student;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public void createStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into student(name,email,phone) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("sql issue " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("issue while closing the connection");
            }
        }
        System.out.println("student record inserted successfully");
    }

    @SneakyThrows
    public void updateStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "update student set name=?, email=?, phone=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getEmail());
        preparedStatement.setString(3, student.getPhone());
        preparedStatement.setInt(4, student.getId());
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("student record updated.");
    }

    @SneakyThrows
    public void deleteStudentById(int id) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "delete from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("student record deleted.");
    }

    @SneakyThrows
    public Student getStudentById(int id) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Student student = new Student();
        while (resultSet.next()) {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
        }
        connection.close();
        return student;
    }

    @SneakyThrows
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        String query = "select * from student";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
            studentList.add(student);
        }
        connection.close();
        return studentList;
    }

}
