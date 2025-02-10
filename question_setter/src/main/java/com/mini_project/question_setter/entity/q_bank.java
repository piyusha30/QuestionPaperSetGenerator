package com.mini_project.question_setter.entity;

import javax.persistence.*;

@Entity

@Table(name = "q_bank")

public class q_bank {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int q_id;

    private String Subject;

    private int level;

    private int marks;



    @Column(name = "question")
    private String question;

    public q_bank() {
    }

    public q_bank(String subject, int level, int marks, String question) {
        Subject = subject;
        this.level = level;
        this.marks = marks;
        this.question = question;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}