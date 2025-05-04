package com.example.attendance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class AttendanceConfig {

    //save attendance to the database
    @Bean
    CommandLineRunner commandLineRunner(AttendanceRepository repository) {
        return args -> {
            Attendance attendance1 = new Attendance(1L, 1L, "Absent");
            Attendance attendance2 = new Attendance(2L, 2L, "Present");

            repository.saveAll(List.of(attendance1, attendance2));
        };
    }
}
