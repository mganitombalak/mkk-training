package com.mkk.pattens.decorator;

public abstract class NotifierDecorator implements INotifier {
    private INotifier notifier;

    public NotifierDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String notification() {
        return notifier.notification();
    }

    @Override
    public String message() {
        return notifier.message();
    }
}
