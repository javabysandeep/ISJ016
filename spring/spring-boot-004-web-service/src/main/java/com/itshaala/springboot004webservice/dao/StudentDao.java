package com.itshaala.springboot004webservice.dao;

import com.itshaala.springboot004webservice.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void create(Student student) {
        String sql = "insert into student_tbl(name,email,phone) values(?,?,?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getPhone());
    }

    public void update(Student student) {
        String sql = "update student_tbl set name=?,email=?,phone=? where id=?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getPhone(), student.getId());
    }

    public void delete(int id) {
        String sql = "delete from student_tbl where id=?";
        jdbcTemplate.update(sql, id);
    }

    public Student findById(int id) {
        String sql = "select * from student_tbl where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), id);
    }

    public List<Student> findAll() {
        String sql = "select * from student_tbl";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }

}
