package org.ch01.test00.d;

/**
 * 需求：三个窗口各自销售50张票
 * <p>
 * 售票窗口 - 每个窗口有50张票
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class WindowThread extends Thread {

    // 每个 MyThread 对象就是一个售票窗口，每个售票窗口各自拥有50张票
    private int count = 50;

    public WindowThread() {

    }
    public WindowThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 循环售票
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + "售出了第" + count + "张电影票");
            count--;
        }
    }
}
