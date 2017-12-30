package com.base.threaddemo;

import junit.framework.TestCase;

public class ExamplePriorityThreadTest extends TestCase {
    public void testRun() throws InterruptedException {
        ExamplePriorityThread threadA = new ExamplePriorityThread();
        threadA.setPriority(Thread.NORM_PRIORITY - 3);

        ExamplePriorityThread threadB = new ExamplePriorityThread();
        threadB.setPriority(Thread.NORM_PRIORITY + 3);

        threadA.start();
        threadB.start();

        Thread.sleep(5000);
    }
}
