package com.mkk.pattens.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements IQuestion{

    private List<String> questions;
    private int index=0;

    public JavaQuestions() {
        questions = new ArrayList<>();
        questions.add("What is class?");
        questions.add("What is inheritance?");
        questions.add("How many types of inheritance are there?");
        questions.add("What are differences between class and interface?");
    }

    @Override
    public void nextQuestion() {
        if(index<=questions.size()-1){
            index++;
        }
    }

    @Override
    public void previousQuestion() {
        if(index>0){
            index--;
        }
    }

    @Override
    public void newQuestion(String questionText) {
        questions.add(questionText);
    }

    @Override
    public void deleteQuestion(String questionText) {
        questions.remove(questionText);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(index));
    }

    @Override
    public void displayAllQuestion() {
        questions.forEach(System.out::println);
    }
}
