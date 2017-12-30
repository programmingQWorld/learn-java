package com.base.threaddemo;

public class ComplexCurrentThread extends Thread {
    public ComplexCurrentThread() {
        System.out.println("begin===");
        System.out.println("Thread.currentThread().getName" + Thread.currentThread().getName());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("end===========");
    }

    public void run () {
        super.run();
        System.out.println("run begin====");
        System.out.println("Thread.currentThread().getName" + Thread.currentThread().getName());

        System.out.println("this.getName() = " + this.getName());
        System.out.println("run end === ");
    }
}
