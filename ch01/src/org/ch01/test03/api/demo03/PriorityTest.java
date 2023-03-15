package org.ch01.test03.api.demo03;

/**
 * setPriority(1-10)：线程优先级控制
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class PriorityTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        // 设置优先级
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);


        mt1.start();
        mt2.start();
    }
}
