package com.example.demo.entities.entitys;

import com.example.demo.entities.dato.Questions;
import com.example.demo.entities.dato.User;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "ResuladoPreguntas")
public class ResultQuestions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "usersid")
    private User usersid;
    @ManyToOne
    @JoinColumn(name = "questionsid")
    private Questions questionsid;
    @Column(name = "score")
    private int score;

    public ResultQuestions() {
    }

    public ResultQuestions(int id, User usersid, Questions questionsid,int score) {
        this.id = id;
        this.usersid = usersid;
        this.questionsid = questionsid;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsersid() {
        return usersid;
    }

    public void setUsersid(User usersid) {
        this.usersid = usersid;
    }

    public Questions getQuestionsid() {
        return questionsid;
    }

    public void setQuestionsid(Questions questionsid) {
        this.questionsid = questionsid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
