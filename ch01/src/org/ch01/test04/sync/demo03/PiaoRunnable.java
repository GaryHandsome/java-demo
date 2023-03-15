package org.ch01.test04.sync.demo03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用JDK5.0新特性，同步锁由Lock对象充当。
 * ReentrantLock类实现Lock接口。
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class PiaoRunnable implements Runnable {

    private int count = 50;

    // 第一：实例化 ReentrantLock 对象
    ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        // 循环售票
        while (count > 0) {
            try {
                // 第二：加锁
                reentrantLock.lock();

                // 第三：需要同步的代码块 - 临界区代码 - 有可能发生线程安全的代码
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出了第" + count + "张电影票");
                    count--;
                }

            }finally {
                // 第四：释放锁
                reentrantLock.unlock();
            }
        }
    }
}
