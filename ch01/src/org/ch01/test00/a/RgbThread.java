package org.ch01.test00.a;

import java.util.Random;

/**
 * 在RGB三原色中，使用多线程实现，
 * 分别随机打印输出红、绿、蓝三个随机值。（取值范围：0-255）
 *
 * @Date 2023-03-14
 * @Author zqx
 */
// 第一：定义一个类，继承Thread - 线程类 - 分别随机生产红、绿、蓝颜色值
public class RgbThread extends Thread{
    // 第二：重写run方法 - 线程体 - 实现线程具体功能
    @Override
    public void run() {
        Random rand = new Random();
        int colorValue = rand.nextInt(256);
        String colorName = Thread.currentThread().getName();
        System.out.println(colorName + "：" + colorValue);
    }
}
