package com.base.threaddemo;

public class ExampleThread extends Thread {
    public void run() {
        super.run();
        System.out.println("这是一个继承自Thread的ExampleThread。" + Thread.currentThread().getName());
    }
}
