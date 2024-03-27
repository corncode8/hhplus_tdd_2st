package hhplus.demo.reservation.fake;

import hhplus.demo.domain.Lecture;
import hhplus.demo.domain.Reservation;
import hhplus.demo.repository.lecture.LectureCoreRepository;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FakeLectureCoreRepository implements LectureCoreRepository {

    private final Map<Long, Lecture> lectures = new HashMap<>();

    public void addLecture(Lecture lecture) {
        lectures.put(lecture.getId(), lecture);
    }

    public void addReservation(Lecture lecture, Reservation reservation) {
        lecture.addReservation(reservation);
    }

    @Override
    public int reservationCnt(Long lectureId) {
        Lecture lecture = lectures.get(lectureId);

        return lecture.getReservationCnt();
    }

    @Override
    public Optional<Lecture> findLectureById(Long id) {
        return Optional.ofNullable(lectures.getOrDefault(id, new Lecture(id, "항해 플러스", LocalDateTime.now())));
    }

    @Override
    public Optional<Lecture> findLecture(Long id) {
        return Optional.ofNullable(lectures.get(id));
    }

}