package com.base.threaddemo2;

import com.base.threaddemo.ExampleDaemonThread;
import junit.framework.TestCase;

public class SonSynThreadTest extends TestCase {
    public void testRun() throws Exception {
        SonSynService thread = new SonSynService();
        thread.start();

        SonSynService thread2 = new SonSynService();
        thread2.start();
        Thread.sleep(1000 * 10);
    }
}
