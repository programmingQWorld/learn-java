package com.base.threaddemo;

public class ExampleYieldThread extends Thread {
    public void run() {
        super.run();
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i=0; i<500000; i++) {
            Thread.yield();
            count = count+(i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒");
    }
}
