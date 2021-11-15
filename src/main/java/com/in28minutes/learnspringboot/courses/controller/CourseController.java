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
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1L, "Learn Microservices", "Radwan Romy"),
                new Course(2L, "FCB", "Leonal Messi"),
                new Course(3L, "La Masia", "Ansu Fati"),
                        new Course(4L, "Physics", "Newton"),
                        new Course(5L, "D.L", "Math"),
                        new Course(6L, "SpaceX", "Elon Mask"),
                                new Course(7L, "Apple", "Steven jobs"),
                                new Course(8L, "Microsoft", "Bill gates"),
                                new Course(9L, "Mobile", "Alegendar"));
    }
}
