package br.com.schedule.modelo;

import javax.security.auth.Subject;
import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Subject subject;
    private ClassRoom classRoom;
    private Teacher teacher;
    private StudentGroup studentGroup;

    public Schedule(LocalDate date, LocalTime startTime,
                    LocalTime endTime, Subject subject, ClassRoom classRoom,
                    Teacher teacher, StudentGroup studentGroup) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.subject = subject;
        this.classRoom = classRoom;
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    //Métodos

    public void conflictsWith(){

    }
}
