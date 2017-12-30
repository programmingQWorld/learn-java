package com.base.threaddemo;

import org.junit.Test;

public class TestDoSomething {
    @Test
    public void TestDoSomething() throws InterruptedException {
        DoSomething ds1 = new DoSomething("张三");
        DoSomething ds2 = new DoSomething("李四");

        Thread t1 = new Thread(ds1);
        Thread t2 = new Thread(ds2);

        t1.start();
        t2.start();

        Thread.sleep(5000);
    }
}
