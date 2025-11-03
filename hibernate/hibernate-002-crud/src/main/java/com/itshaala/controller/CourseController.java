package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;

public class CourseController {
    private CourseService courseService = new CourseService();

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    public void deleteCourse(int id) {
        courseService.deleteCourse(id);
    }

    public Course getCourse(int id) {
        return courseService.getCourse(id);
    }
}
