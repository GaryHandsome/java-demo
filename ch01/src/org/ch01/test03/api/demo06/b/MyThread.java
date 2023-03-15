package org.ch01.test03.api.demo06.b;

/**
 * 案例二：interrupt中断正常线程 - 中断状态为true - 程序不能正常退出
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("好好学习，天天向上" + Thread.currentThread().isInterrupted());
        }
    }
}
