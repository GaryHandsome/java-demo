package org.ch01.test02.way.demo01.b;

/**
 * @Date 2023-03-13
 * @Author zqx
 */
// 第一：定义一个类，继承Thread
public class MyThread extends Thread {
    // 第二：重写 run 方法 - 线程体 - 实现该线程具体的功能
    @Override
    public void run() {
        // 获取当前线程
        Thread currentThread = Thread.currentThread();

        // 获取线程的名称
        String name = currentThread.getName();

        System.out.println(name + ":好好学习");
    }
}
