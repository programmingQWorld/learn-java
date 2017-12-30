package com.base.threaddemo;

import junit.framework.TestCase;

public class ExampleCurrentThreadTest extends TestCase {
    public void testInit() throws Exception {
        ExampleCurrentThread thread = new ExampleCurrentThread();  // main
    }

    public void testRun() throws Exception {
        ExampleCurrentThread thread = new ExampleCurrentThread();
        thread.start();
        Thread.sleep(1000);

        /*构造方法的打印： main
        run方法的打印： Thread-0*/
    }
}
