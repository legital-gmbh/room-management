package org.legital.roommanagement.repository;

import org.legital.roommanagement.domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
