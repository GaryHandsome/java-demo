package org.ch01.test02.way.demo02;

/**
 * @Date 2023-03-13
 * @Author zqx
 */
//第一：定义一个类，实现Runnable接口
public class MyRunnable implements Runnable {
    // 第二：重写Runnable接口中的run方法
    @Override
    public void run() {
        System.out.println("好好学习");
    }
}
