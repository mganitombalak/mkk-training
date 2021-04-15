package com.mkk.pattens.bridge;

public class QuestionManager {

    protected IQuestion question;

    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public IQuestion getQuestion(){
        return question;
    }

    public void setQuestion(IQuestion question){
        this.question=question;
    }

    public void next(){
        question.nextQuestion();
    }

    public void previous(){
        question.previousQuestion();
    }

    public void newQ(String text){
        question.newQuestion(text);
    }
    public void delete(String text){
        question.deleteQuestion(text);
    }

    public void display(){
        question.displayQuestion();
    }
    public void displayAll(){
        question.displayAllQuestion();
    }
}
