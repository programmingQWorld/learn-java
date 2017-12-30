package com.base.threaddemo;

import junit.framework.TestCase;

public class ComplexCurrentThreadTest extends TestCase {
    public void testRun() throws Exception {
        ComplexCurrentThread thread = new ComplexCurrentThread();
        thread.setName("lcq");
        thread.start();
        System.out.println( thread.isInterrupted() );
    }
}
