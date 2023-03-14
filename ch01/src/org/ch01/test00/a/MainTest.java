package org.ch01.test00.a;

/**
 * 注意：每次输出的顺序可能不一样
 *
 * 各个线程并发执行的，谁先拿到CPU的时间片，谁先执行（CPU调试器）
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第三：创建线程对象
        RgbThread redThread = new RgbThread();
        RgbThread greenThread = new RgbThread();
        RgbThread blueThread = new RgbThread();

        // 设置线程的名称
        redThread.setName("红");
        greenThread.setName("绿");
        blueThread.setName("蓝");

        // 第四：启动线程 - run
        redThread.start();
        greenThread.start();
        blueThread.start();
    }
}
