package com.mkk.pattens.decorator;

public class Notifier implements INotifier{
    @Override
    public String notification() {
        return message();
    }

    @Override
    public String message() {
        return "Your message sent ";
    }
}
