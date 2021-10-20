package org.legital.roommanagement.repository;

import org.legital.roommanagement.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
