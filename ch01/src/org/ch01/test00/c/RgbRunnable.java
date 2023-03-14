package org.ch01.test00.c;

import java.util.Random;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
// 第一：定义一个类，实现Runnable接口 - 地位等同于 Thread 类
// Thread类：提供线程相关操作的API方法
public class RgbRunnable implements Runnable{
    // 第二：重写 run 方法 - 线程实现的具体功能 - 不同于 Thread 类，专注线程的功能
    @Override
    public void run() {
        Random rand = new Random();
        int colorValue = rand.nextInt(256);
        String colorName = Thread.currentThread().getName();
        System.out.println(colorName + ":" + colorValue);
    }
}
