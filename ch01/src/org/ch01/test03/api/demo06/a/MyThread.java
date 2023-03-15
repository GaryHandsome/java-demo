package org.ch01.test03.api.demo06.a;

/**
 * 案例一：interrupt中断正在睡眠（wait、join）的线程 - 中断状态为false - 程序结束
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("好好学习，天天向上");

        try {
            // 如果中断线程正在sleep，wait，join，很能中断状态清空（还原）
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            System.out.println("哪个混蛋，把我吵醒了!");
        }
    }
}
