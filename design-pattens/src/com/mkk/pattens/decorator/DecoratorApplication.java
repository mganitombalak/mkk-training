package com.mkk.pattens.decorator;

import java.util.Arrays;

public class DecoratorApplication {

    public static void main(String[] args) {
        Notifier notifier =new Notifier();
        System.out.println(notifier.notification());
        System.out.println("===========================");

        SMSNotifier smsNotifier = new SMSNotifier(notifier);
        System.out.println(smsNotifier.notification());
        System.out.println("===========================");

        EMailNotifier eMailNotifier = new EMailNotifier(notifier);
        System.out.println(eMailNotifier.notification());
        System.out.println("===========================");
    }
}
