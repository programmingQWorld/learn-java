package com.base.threaddemo2;

public class SynchronizedMethodThread extends Thread {
    private MyObject object;
    public SynchronizedMethodThread(MyObject object) {
        this.object = object;
    }

    @Override
    public  void  run() {
        super.run();
        if (Thread.currentThread().getName().equals("A")) {
            object.methodA();
        } else {
            object.methodB();
        }
    }
}
