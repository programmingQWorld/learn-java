package com.base.threaddemo2;

import junit.framework.TestCase;

public class SynchronizedMethodThreadTest extends TestCase {
    public void testRun() throws InterruptedException {
        MyObject object = new MyObject();
        SynchronizedMethodThread a = new SynchronizedMethodThread(object);

        a.setName("A");
        SynchronizedMethodThread b = new SynchronizedMethodThread(object);
        b.setName("B");

        a.start();
        b.start();

        Thread.sleep(1000 * 15);
    }

}
