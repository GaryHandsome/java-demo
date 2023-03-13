package org.ch01.test02.way.demo01.a;

/**
 * @Date 2023-03-13
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {

        // 第三：实例化线程对象 - 子线程
        MyThread mt = new MyThread() ;

        // 第四：启动线程 - 本质上调用了线程的run方法
        mt.start();

        System.out.println("天天向上");
    }
}
