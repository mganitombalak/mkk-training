package com.mkk.pattens.bridge;

public class BridgeApplication {

    public static void main(String[] args) {
        Questioneer questioneer = new Questioneer("Java Exam");
        questioneer.setQuestion(new JavaQuestions());
        questioneer.display();
        questioneer.next();
        questioneer.display();
    }
}
