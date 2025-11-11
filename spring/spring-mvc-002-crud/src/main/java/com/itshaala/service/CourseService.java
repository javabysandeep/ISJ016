package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    private CourseDao courseDao;

    public void createCourse(Course course) {
        courseDao.createCourse(course);
    }

    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    public void deleteCourse(int id) {
        courseDao.deleteCourse(id);
    }

    public Course getCourse(int id) {
        return courseDao.getCourse(id);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
