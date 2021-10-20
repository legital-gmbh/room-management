package org.legital.roommanagement;

import org.legital.roommanagement.action.CreateLectureAction;
import org.legital.roommanagement.service.LectureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppApplicationRunner implements ApplicationRunner {

    private final Logger log = LoggerFactory.getLogger(AppApplicationRunner.class);

    private final LectureService lectureService;

    private final CreateLectureAction createLectureAction;

    public AppApplicationRunner(LectureService lectureService, CreateLectureAction createLectureAction) {
        this.lectureService = lectureService;
        this.createLectureAction = createLectureAction;
    }

    @Override
    public void run(ApplicationArguments args) {
        log.debug(lectureService.getContactEmailAddress());
        createLectureAction.execute();
    }

}
