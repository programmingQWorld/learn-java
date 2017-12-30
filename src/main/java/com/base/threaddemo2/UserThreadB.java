package com.base.threaddemo2;

public class UserThreadB extends Thread {
    private HasSelfPrivateNum num;
    public UserThreadB (HasSelfPrivateNum num) {
        this.num = num;
    }
    public void run () {
        super.run();
        num.addI("b");
    }
}
