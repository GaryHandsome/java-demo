package org.ch01.test05.tx.demo01;

/**
 * 线程通信相关的API方法
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class MainTest01 {

    // 定义锁对象
    private static String lock = "lock";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("你好");

        // 等待 - 错误 - wait、notify、notifyAll只能使用在同步块或同步方法中
        lock.wait();
    }
}
