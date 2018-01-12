package com.company;

import javax.swing.*;
import java.io.Serializable;

public class QuizCard implements Serializable {
    private String question;
    private String answer;

    public QuizCard(String q, String a) {
        this.question  = q;
        this.answer = a;
    }

    public QuizCard () {}

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }
}
