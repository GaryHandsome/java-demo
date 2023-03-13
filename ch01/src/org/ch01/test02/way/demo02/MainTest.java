package org.ch01.test02.way.demo02;

import org.ch01.test02.way.demo01.a.MyThread;

/**
 * @Date 2023-03-13
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第三：实例化 Runnable 接口对象
        Runnable mr = new MyRunnable();

        // 第四：通过Runnable接口对象实例化Thread对象
        Thread t = new Thread(mr);

        // 第五：启动线程
        t.start();


        System.out.println("天天向上");
    }
}
