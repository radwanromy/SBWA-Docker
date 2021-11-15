package com.in28minutes.learnspringboot.courses.controller;
import java.util.Arrays;
import java.util.List;

import com.in28minutes.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CourseController {
    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1L, "Learn Microservices","Radwan Romy") );
    }
}
