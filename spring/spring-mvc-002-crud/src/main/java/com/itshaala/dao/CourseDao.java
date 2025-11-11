package com.itshaala.dao;

import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CourseDao {
    private JdbcTemplate jdbcTemplate;

    public void createCourse(Course course) {
        String sql = "insert into course_tbl(id,name,duration,price) values(?,?,?,?)";
        jdbcTemplate.update(sql, course.getId(), course.getName(), course.getDuration(), course.getPrice());
    }

    public void updateCourse(Course course) {
        String sql = "update course_tbl set name=?,duration=?,price=? where id=?";
        jdbcTemplate.update(sql, course.getName(), course.getDuration(), course.getPrice(), course.getId());
    }

    public void deleteCourse(int id) {
        String sql = "delete from course_tbl where id=?";
        jdbcTemplate.update(sql, id);
    }

    public Course getCourse(int id) {
        String sql = "select * from course_tbl where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Course course = new Course();
            course.setId(rs.getInt("id"));
            course.setName(rs.getString("name"));
            course.setDuration(rs.getString("duration"));
            course.setPrice(rs.getInt("price"));
            return course;
        });
    }

    public List<Course> getAllCourses() {
        return null;
    }
}
