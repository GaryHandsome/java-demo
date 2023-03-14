package org.ch01.test03.api.demo01;

import java.util.concurrent.TimeUnit;

/**
 * sleep(N) ：当前线程休眠 N 毫秒（阻塞），让出CPU时间片给其它线程
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class SleepTest02 {
    public static void main(String[] args)  {
        System.out.println("main方法开始");

        // 静态方法、可抛出异常的方法
        try {
            //Thread.sleep(5);
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main方法结束");
    }
}
