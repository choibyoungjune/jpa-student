package com.june.app.domain;


import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
        //여기서 course를 입력해준다
        student.getCourse().add(this);
    }

    public Student getStudent() {
        return student;
    }
}
