package com.example.attendance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

// our model to set the data in the database
@Entity
@Table
public class Attendance {
    @Id
    @SequenceGenerator(name = "attendance_sequence", sequenceName = "attendance_sequence", allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "attendance_sequence")
    private Long id;
    private Long studentId;
    private Long classId;
    private String status;

    public Attendance() {

    }

    public Attendance(Long id, 
                      Long studentId,  
                      Long classId, 
                      String status) 
    {
        this.id = id;
        this.studentId = studentId;
        this.classId = classId;
        this.status = status;
    }

    public Attendance(Long studentId, 
                      Long classId, 
                      String status) 
    {
        this.studentId = studentId;
        this.classId = classId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;    
    }

    public Long getStudentId() {        
        return studentId;
    }

    public void setStudentId(Long studentId) {        
        this.studentId = studentId;
    }

    public Long getClassId() {        
        return classId;
    }

    public void setClassId(Long classId) {        
        this.classId = classId;
    }

    public String getStatus() {        
        return status;
    }

    public void setStatus(String status) {        
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendance [" + "id=" + id + ", studentId=" + studentId + ", classId=" + classId + ", status=" + status + "]";
    }
}
