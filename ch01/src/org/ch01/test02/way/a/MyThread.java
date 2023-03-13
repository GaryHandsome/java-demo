package org.ch01.test02.way.a;

/**
 * @Date 2023-03-13
 * @Author zqx
 */
// 第一：定义一个类，继承Thread
public class MyThread extends Thread {
    // 第二：重写 run 方法 - 线程体 - 实现该线程具体的功能
    @Override
    public void run() {
        System.out.println("好好学习");
    }
}
