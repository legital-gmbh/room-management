package org.legital.roommanagement.service;

import org.legital.roommanagement.domain.Course;
import org.legital.roommanagement.repository.CourseRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course saveCourse() {
        Course course = new Course();
        course.setFieldOfStudy("I");
        course.setNumber(10);
        course.setLecturer("Lennart Gamradt");
        course.setTitle("Spring Kurs");

        return courseRepository.save(course);
    }
}
