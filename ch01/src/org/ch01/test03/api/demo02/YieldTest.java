package org.ch01.test03.api.demo02;

/**
 * yield() ： 线程让步 - 让出 CPU 的控制权
 *
 * 注意：当前线程让出CPU控制权，回到准备就绪状态，
 * 但有可能会抢到CPU控制权，继续执行
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class YieldTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread() ;
        MyThread mt2 = new MyThread() ;

        mt1.start();
        mt2.start();
    }
}
