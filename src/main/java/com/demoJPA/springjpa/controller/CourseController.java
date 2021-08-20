package com.demoJPA.springjpa.controller;

import com.demoJPA.springjpa.entity.Course;
import com.demoJPA.springjpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourse(){
        List<Course> courses = courseService.getAllCourse();
        return courses;
    }
}
