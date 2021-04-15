package com.mkk.pattens.decorator;

public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public String notification(){
        return super.notification() + " by " + message();
    }

    @Override
    public String message() {
        return "SMS";
    }
}
