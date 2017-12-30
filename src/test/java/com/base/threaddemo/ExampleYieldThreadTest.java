package com.base.threaddemo;

import junit.framework.TestCase;

public class ExampleYieldThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleYieldThread thread = new ExampleYieldThread();
        thread.start();

        Thread.sleep(1000 * 5);
    }
}
