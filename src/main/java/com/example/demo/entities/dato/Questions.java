package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "question",nullable = false,length = 200)
    private String question;
    @Column(name = "alternative1",nullable = false,length = 30)
    private String alternative1;
    @Column(name = "alternative2",nullable = false,length = 30)
    private String alternative2;
    @Column(name = "alternative3",nullable = false,length = 30)
    private String alternative3;

    public Questions() {
    }

    public Questions(int id, String question, String alternative1, String alternative2, String alternative3) {
        this.id = id;
        this.question = question;
        this.alternative1 = alternative1;
        this.alternative2 = alternative2;
        this.alternative3 = alternative3;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAlternative1() {
        return alternative1;
    }

    public void setAlternative1(String alternative1) {
        this.alternative1 = alternative1;
    }

    public String getAlternative2() {
        return alternative2;
    }

    public void setAlternative2(String alternative2) {
        this.alternative2 = alternative2;
    }

    public String getAlternative3() {
        return alternative3;
    }

    public void setAlternative3(String alternative3) {
        this.alternative3 = alternative3;
    }


}
