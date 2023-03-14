package org.ch01.test00.e;

/**
 * 需求：三个窗口共同销售50张票
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class PiaoRunnable implements Runnable{

    private int count = 50 ;

    @Override
    public void run() {
        // 循环售票
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + "售出了第" + count + "张电影票");
            count--;
        }
    }
}
