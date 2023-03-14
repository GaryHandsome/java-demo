package org.ch01.test00.c;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第三：实例化 Runnable 对象
        RgbRunnable redRunnable = new RgbRunnable();
        RgbRunnable greenRunnable = new RgbRunnable();
        RgbRunnable blueRunnable = new RgbRunnable();

        // 第四：实例化线程对象 - 组装Runnable对象
        Thread redThread = new Thread(redRunnable,"红");
        Thread greenThread = new Thread(greenRunnable,"绿");
        Thread blueThread = new Thread(blueRunnable,"蓝");

        // 第五：启动线程
        redThread.start();
        greenThread.start();
        blueThread.start();
    }
}
