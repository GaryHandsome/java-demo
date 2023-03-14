package org.ch01.test00.d;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化线程对象 - 创建了三个售票窗口
        WindowThread w1 = new WindowThread("窗口一");
        WindowThread w2 = new WindowThread("窗口二");
        WindowThread w3 = new WindowThread("窗口三");

        // 启动线程
        w1.start();
        w2.start();
        w3.start();
    }
}
