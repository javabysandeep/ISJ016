package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;

public class CourseService {
    private CourseDao courseDao = new CourseDao();

    public void addCourse(Course course) {
        courseDao.addCourse(course);
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
}
