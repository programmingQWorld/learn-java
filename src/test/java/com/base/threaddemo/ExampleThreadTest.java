package com.base.threaddemo;

import junit.framework.TestCase;

/**
 * created by lcq on 17/12/24
 * Mail to 2432156011@qq.com
 */
public class ExampleThreadTest extends TestCase {
    public void testRun() throws Exception {
        ExampleThread thread = new ExampleThread();
        ExampleThread thread1 = new ExampleThread();
        ExampleThread thread2 = new ExampleThread();
        ExampleThread thread3 = new ExampleThread();

        thread2.start();
        thread.start();
        thread1.start();
        thread3.start();

        // ---- 一下是与本主题无关的扩展测试
        // Thread.sleep(1000); // 程序在这里休眠，将决定这个线程的是否存活
        boolean isAlive = thread3.isAlive();
        System.out.println(isAlive);

        // 在线程死亡后，是否还可以获取线程的信息
        System.out.println( thread3.getName() + "\t"
                + thread3.getId()
                + "\t" + thread3.isAlive() );  // Thread-3	14	false
    }
}
