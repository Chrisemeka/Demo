package com.example.attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//data access layer
@Repository
public interface AttendanceRepository extends JpaRepository <Attendance, Long> {
    
}
