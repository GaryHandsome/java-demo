package org.ch01.test04.sync.demo01;

/**
 * 需求：三个窗口共同销售50张票
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class PiaoRunnable implements Runnable {

    private int count = 500;

    // 定义锁对象 - 必须唯一 - 静态常量、字符串常量、class对象
    private String lock = "lock";

    @Override
    public void run() {
        // 循环售票
        while (count > 0) {
            synchronized (lock) {
                if(count>0) {
                    // 代码段（临界区） ;
                    System.out.println(Thread.currentThread().getName() + "售出了第" + count + "张电影票");
                    count--;
                }
            }

        }
    }
}
