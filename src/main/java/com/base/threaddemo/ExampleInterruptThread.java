package com.base.threaddemo;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ExampleInterruptThread extends Thread {
    public void run () {
        try {
            for (int i=0; i<5000000; i++){
                if (interrupted()) {
                    System.out.println("已经是停止状态，我要退出了");
                    throw new InterruptedException("停止……");
                }
            }
        } catch (InterruptedException ie) {
            System.out.println("顺利停止");
        }
    }
}
