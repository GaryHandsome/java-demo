package org.ch01.test03.api.demo02;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {

            // 如果i是10的倍数，则当前线程让出CPU的控制权
            if (i % 10 == 0) {
                Thread.yield();
            }

            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
