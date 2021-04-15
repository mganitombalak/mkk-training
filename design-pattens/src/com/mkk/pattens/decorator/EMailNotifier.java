package com.mkk.pattens.decorator;

public class EMailNotifier extends NotifierDecorator{
    public EMailNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public String notification(){
        return super.notification() + " by " + message();
    }

    @Override
    public String message() {
        return "EMail";
    }
}
