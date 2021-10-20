package org.legital.roommanagement.service;

import org.legital.roommanagement.repository.LectureRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.google.gson.Gson;
import org.legital.roommanagement.domain.Course;
import org.legital.roommanagement.domain.Lecture;
import org.legital.roommanagement.domain.Room;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
public class LectureService {

    private final Logger log = LoggerFactory.getLogger(LectureService.class);

    private final LectureRepository lectureRepository;

    @Value("Hallo Welt")
    private String contactEmailAddress;

    public LectureService(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }

    public void saveLectures(Room room, Course course) {
        Lecture lectureToday = new Lecture();
        lectureToday.setRoom(room);
        lectureToday.setCourse(course);
        lectureToday.setBegin(LocalDateTime.now().withHour(9).withMinute(30).withSecond(0));
        lectureToday.setEnd(LocalDateTime.now().withHour(11).withMinute(30).withSecond(0));

        Lecture lectureNextWeek = new Lecture();
        lectureNextWeek.setRoom(room);
        lectureNextWeek.setCourse(course);
        lectureNextWeek.setBegin(LocalDateTime.now().plusDays(7).withHour(9).withMinute(30).withSecond(0));
        lectureNextWeek.setEnd(LocalDateTime.now().plusDays(7).withHour(11).withMinute(30).withSecond(0));

        lectureRepository.save(lectureToday);
        lectureRepository.save(lectureNextWeek);

        Gson gson = new Gson();
        log.info("LECTURE TODAY ---------------------");
        log.info(gson.toJson(lectureToday));

        log.info("LECTURE NEXT WEEK ---------------------");
        log.info(gson.toJson(lectureNextWeek));
    }

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public void setContactEmailAddress(String contactEmailAddress) {
        this.contactEmailAddress = contactEmailAddress;
    }

}
