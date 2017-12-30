package com.base.threaddemo;

/**
 * 实现Runnable接口的类
 * @author lcq
 */
public class DoSomething implements Runnable {
    private String name;
    public DoSomething ( String name ) {
        this.name = name;
    }
    public void run() {
        for (int i=0; i<5; i++) {
            for (int k=0; k < 1000; k++) {
                System.out.println(name + ": " + i);
            }
        }
    }
}
