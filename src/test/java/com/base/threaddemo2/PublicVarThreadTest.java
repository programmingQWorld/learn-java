package com.base.threaddemo2;

import junit.framework.TestCase;

public class PublicVarThreadTest extends TestCase {
    public void testRun() throws InterruptedException {
        PublicVar publicVarRef = new PublicVar();  // 模拟一个公共对象
        PublicVarThreadA threadA = new PublicVarThreadA(publicVarRef);
        threadA.start();
        Thread.sleep(40);
        publicVarRef.getValue();
        Thread.sleep(1000*5);
        publicVarRef.getValue();
    }
}
