package com.base.threaddemo;

import junit.framework.TestCase;

public class ExampleInterruptThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleInterruptThread thread = new ExampleInterruptThread();
        thread.start();
        thread.interrupt();
        Thread.sleep(1000);
    }
}
