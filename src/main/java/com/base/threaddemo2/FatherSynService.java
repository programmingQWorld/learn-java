package com.base.threaddemo2;

public class FatherSynService extends Thread {
    public int i = 10;

    /**
     * i自减后，输出i值，休眠100毫秒
     */
    synchronized public void operateIMainMethod() {
        try {
            while ( i>0 ) {
                i--;
                System.out.println("father print i = " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
