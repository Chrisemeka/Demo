package com.example.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/attendance")

public class AttendanceController {

    private final AttendanceService attendanceService;

    @Autowired
    public AttendanceController(AttendanceService attendanceService) {  
        this.attendanceService = attendanceService;      
    }

    @GetMapping
	public List <Attendance> getAttendances() {
        return attendanceService.getAttendances();
	}

    @PostMapping
    public void registerAttendance(@RequestBody Attendance attendance) {
        attendanceService.registerAttendance(attendance);
    }

    @DeleteMapping(path = "{id}")
    public void deleteAttendance(@PathVariable("id") Long id) {
        attendanceService.deleteAttendance(id);
    }
}
