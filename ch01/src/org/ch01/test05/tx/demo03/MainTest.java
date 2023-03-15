package org.ch01.test05.tx.demo03;

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
        Thread.sleep(1000);


        synchronized (MyThread.lock) {
            System.out.println("主线程结束");
        }

    }
}
