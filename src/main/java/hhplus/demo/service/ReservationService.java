package hhplus.demo.service;

import hhplus.demo.domain.Lecture;
import hhplus.demo.domain.Reservation;
import hhplus.demo.domain.Student;
import hhplus.demo.dto.ReservationReq;



public interface ReservationService {

    // 특강 수강 신청
    // ReservationReq(studentId, lectureId)
    Reservation regist(ReservationReq reservationReq);

    // findStudent
    Student findStudent(Long studentId);

    // findLecture
    Lecture findLecture(Long lectureId);

}
