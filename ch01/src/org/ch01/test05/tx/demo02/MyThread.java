package org.ch01.test05.tx.demo02;

/**
 * 线程通信相关的API方法
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class MyThread extends Thread {

    // 锁对象
    public static final String lock = "lock";

    @Override
    public void run() {
        System.out.println("你好");

        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("子线程结束");
    }
}
