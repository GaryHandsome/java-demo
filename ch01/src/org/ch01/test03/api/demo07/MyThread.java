package org.ch01.test03.api.demo07;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("好好学习，天天向上");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            System.out.println("哪个混蛋，把我吵醒了!");
        }
    }
}
