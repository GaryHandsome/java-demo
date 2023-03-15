package org.ch01.test04.sync.demo02;

/**
 *
 * 当多个线程访问（修改）共享资源时，很有可能发生线程安全问题 - 锁
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化 Runnable 对象 - 共享资源（公共）
        PiaoRunnable piao = new PiaoRunnable() ;

        // 实例化三个 Thread 对象 - 三个售票窗口
        Thread w1 = new Thread(piao,"一号窗口");
        Thread w2 = new Thread(piao,"二号窗口");
        Thread w3 = new Thread(piao,"三号窗口");

        // 启动线程，开始售票
        w1.start();
        w2.start();
        w3.start();
    }
}
