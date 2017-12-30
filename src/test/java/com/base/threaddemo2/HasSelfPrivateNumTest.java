package com.base.threaddemo2;

import junit.framework.TestCase;

public class HasSelfPrivateNumTest extends TestCase {
    public void testAddI() throws Exception {
        HasSelfPrivateNum numA = new HasSelfPrivateNum();
        // HasSelfPrivateNum numB = new HasSelfPrivateNum();  // 每个线程处理各自的数据，互不干扰
        UserThreadA usera = new UserThreadA(numA);
        usera.start();

        UserThreadB userb = new UserThreadB(numA);
        userb.start();

        Thread.sleep(3000);  // 防止主线程结束之后，usera和userb线程都不在进行

    }
}
