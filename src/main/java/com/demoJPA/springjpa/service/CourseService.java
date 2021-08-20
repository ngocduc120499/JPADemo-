package com.demoJPA.springjpa.service;

import com.demoJPA.springjpa.entity.Course;
import com.demoJPA.springjpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourse() {
        List<Course> courses = courseRepository.findAll();
        return  courses;
    }
}
