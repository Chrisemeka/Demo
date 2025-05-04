package com.example.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//service layer
@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    @Autowired
    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    // get request
    public List<Attendance> getAttendances() {
        return attendanceRepository.findAll();
    }

    // post request
    public Attendance registerAttendance(Attendance attendance) {
        System.out.println(attendance);
        return attendanceRepository.save(attendance);
    }

    // delete request
    public void deleteAttendance(Long id) {
        boolean exists = attendanceRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("attendance with id " + id + " does not exist");
        }
        attendanceRepository.deleteById(id);
    }
}
