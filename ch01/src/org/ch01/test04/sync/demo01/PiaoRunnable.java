package org.ch01.test04.sync.demo01;

/**
 * 使用同步代码块解决线程安全问题
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class PiaoRunnable implements Runnable {

    private int count = 50;

    // 定义锁对象 - 必须唯一 - 静态常量、字符串常量、class对象
    // 方法一：private String lock = "lock";
    // 方法二：private final static Object lock = new Object();
    // 方法三：类名.class
    // 方法四：this - 小心，确保this唯一

    @Override
    public void run() {
        // 循环售票
        while (count > 0) {
            synchronized (this) {
                // 代码段（临界区） - 有可能发生线程安全的代码
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出了第" + count + "张电影票");
                    count--;
                }
            }
        }
    }
}
