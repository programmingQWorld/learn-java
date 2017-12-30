package com.base.threaddemo2;

public class UserThreadA extends Thread {
    private HasSelfPrivateNum num;
    public UserThreadA (HasSelfPrivateNum num) {
        this.num = num;
    }
    public void run () {
        super.run();
        num.addI("a");
    }
}
