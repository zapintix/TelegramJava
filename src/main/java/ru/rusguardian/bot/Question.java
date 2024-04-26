package ru.rusguardian.bot;

public class Question {
    String question;
    String[] answers;
    String rightAnswer;

    public Question(String question, String rightAnswer, String[] answers) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answers = answers;

    }


    public String getQuestion() {
        return question;
    }
}