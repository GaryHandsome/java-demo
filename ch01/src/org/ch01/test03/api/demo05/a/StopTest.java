package org.ch01.test03.api.demo05.a;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class StopTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();

        // 主线程睡眠1秒，让子线程能走一会
        Thread.sleep(1000);
        // 注意：不建议使用，有安全隐患
        mt.stop();
        System.out.println("程序结束");
    }
}
