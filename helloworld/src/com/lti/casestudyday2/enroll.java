package com.lti.casestudyday2;

import com.lti.casestudy.Course;
import com.lti.casestudy.Student;
import java.time.LocalDate;

public class Enroll {
    private Student student;
    private Course course;
    private LocalDate enrollmentDate;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
