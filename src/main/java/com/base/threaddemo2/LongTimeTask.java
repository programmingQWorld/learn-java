package com.base.threaddemo2;

public class LongTimeTask {
    private String data1;
    private String data2;

    public  void doLongTimeTask () {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String privateGetData1 = "长时间处理任务后从远程返回的值 1 threadName = " + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值 2 threadName = " + Thread.currentThread().getName();

            synchronized (this) {
                data1 = privateGetData1;
                data2 = privateGetData2;
            }

            System.out.println(data1);
            System.out.println(data2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
