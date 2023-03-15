package org.ch01.test05.tx.demo02;

/**
 * 线程通信相关的API方法
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class MainTest {


    public static void main(String[] args) throws InterruptedException {
        // 实例化线程并启动
        MyThread mt = new MyThread();
        mt.start();

        // 主线程睡眠三秒后，唤醒子线程
        Thread.sleep(3000);

        synchronized (MyThread.lock) {
            // 线程通知 - 唤醒 wait 的线程
            MyThread.lock.notify();
        }
        System.out.println("主线程结束");

    }
}
