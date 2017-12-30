package com.base.threaddemo;

/**
 * Created by lcq on 2017/12/24
 * Main 2432156011@qq.com
 */
public class ExamplePriorityThread extends Thread {
    private int count = 0;
    public void run() {
        super.run();
        while (count < 500) {
            count++;
            System.out.println(count++);
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
