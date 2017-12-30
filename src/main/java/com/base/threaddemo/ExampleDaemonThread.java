package com.base.threaddemo;

/**
 * Created by lcq on 2017/12/24
 */
public class ExampleDaemonThread extends Thread {
    private int i = 0;
    public void run(){
        super.run();
        try {
            while(true){
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
