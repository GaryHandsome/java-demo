package org.ch01.test03.api.demo04;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();

        // 等待当前线程运行结束
        // mt.join();
        mt.join(10);

        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
