package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        Course course = new Course();
        course.setName("Full Stack Python with React");
        course.setDuration("6 months");
        course.setPrice(100);
        course.setModules(List.of("Core Python", "Advance Python", "ORM", "DJango", "Frontend"));

        courseController.addCourse(course);
        // System.out.println(courseController.getCourse(2));
    }
}
