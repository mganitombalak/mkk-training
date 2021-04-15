package com.mkk.pattens.bridge;

public interface IQuestion {

    void nextQuestion();
    void previousQuestion();
    void newQuestion(String questionText);
    void deleteQuestion(String questionText);
    void displayQuestion();
    void displayAllQuestion();
}
