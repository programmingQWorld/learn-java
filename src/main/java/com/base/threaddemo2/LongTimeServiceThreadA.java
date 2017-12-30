package com.base.threaddemo2;

public class LongTimeServiceThreadA extends Thread {
    private LongTimeTask task;

    public LongTimeServiceThreadA(LongTimeTask task) {
        super();
        this.task = task;
    }

    @Override
    public void run () {
        super.run();

    }
}
