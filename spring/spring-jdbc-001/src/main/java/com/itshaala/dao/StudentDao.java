package com.itshaala.dao;

import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@AllArgsConstructor
@Repository
public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String query = "insert into student_tbl(id,name,email,phone) values(?,?,?,?)";
        jdbcTemplate.update(query, student.getId(), student.getName(), student.getEmail(), student.getPhone());
        System.out.println("Student added");
    }

    public void updateStudent(Student student) {
        String query = "update student_tbl set name=?,email=?,phone=? where id=?";
        jdbcTemplate.update(query, student.getName(), student.getEmail(), student.getPhone(), student.getId());
        System.out.println("Student updated");
    }

    public void deleteStudent(int id) {
        String query = "delete from student_tbl where id=?";
        jdbcTemplate.update(query, id);
        System.out.println("Student deleted");
    }

    public Student getStudent(int id) {
        String query = "select id,name,email,phone from student_tbl where id=?";
        RowMapper<Student> studentRowMapper = (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            student.setPhone(rs.getString("phone"));
            return student;
        };
        return jdbcTemplate.queryForObject(query, new Object[]{id}, studentRowMapper);
    }

    public List<Student> getAllStudents() {
        return null;
    }
}
