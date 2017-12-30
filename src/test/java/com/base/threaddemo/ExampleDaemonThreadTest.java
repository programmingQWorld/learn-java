package com.base.threaddemo;

import junit.framework.TestCase;

public class ExampleDaemonThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleDaemonThread thread = new ExampleDaemonThread();
        thread.setDaemon(true);
        thread.start();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("我离开了thread对象也不再打印");
    }

}
