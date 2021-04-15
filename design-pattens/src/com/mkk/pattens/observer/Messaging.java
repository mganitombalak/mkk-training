package com.mkk.pattens.observer;

public class Messaging {

    public static void main(String[] args) throws InterruptedException {
        MessageCenter mc = new MessageCenter();
        MessageClient mc1 = new MessageClient(1,mc);
        MessageClient mc2 = new MessageClient(2,mc);
        MessageClient mc3 = new MessageClient(3,mc);
        MessageClient mc4 = new MessageClient(4,mc);

        mc1.connect();
        Thread.sleep(1000);
        mc2.connect();
        Thread.sleep(1000);
        mc3.connect();
        Thread.sleep(1000);
        mc4.connect();
        Thread.sleep(1000);

        mc1.sendMessage("Hey folks!");
        Thread.sleep(100);
        mc2.sendMessage("Hey dude!");
        Thread.sleep(100);
        mc3.sendMessage("a/s/l");
        Thread.sleep(100);
        mc4.sendMessage("Hello");

        mc3.disConnect();

    }
}
