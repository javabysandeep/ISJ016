package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;

    @GetMapping("/courses/{id}")
    public ModelAndView getCourseById(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("getCourseById");
        modelAndView.addObject("course", courseService.getCourse(id));
        return modelAndView;
    }
/*
    @PostMapping("/courses")
    public ModelAndView createCourse(
            @RequestParam("id") int id,
            @RequestParam(value = "name", defaultValue = "dummy course") String name,
            @RequestParam(value = "duration", defaultValue = "dummy duration") String duration,
            @RequestParam(value = "price", defaultValue = "99") int price) {
        Course course = new Course(id, name, duration, price);
        courseService.createCourse(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course-create-success");
        return modelAndView;
    }*/



    @PostMapping("/courses")
    public ModelAndView createCourse(@ModelAttribute Course course) {
        courseService.createCourse(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course-create-success");
        return modelAndView;
    }



    @GetMapping("/courses/create-course-form")
    public ModelAndView createCourseForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course-create-form");
        return modelAndView;
    }

}
