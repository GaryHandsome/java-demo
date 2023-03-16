package org.ch01.test04.sync.demo04;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class TwoThread extends Thread{

    public static final Object twoLock = new Object();

    @Override
    public void run() {
        synchronized (twoLock) {
            System.out.println("TwoThread-获得了twoLock这把锁，做一些相关的处理...");

            synchronized (OneThread.oneLock) {
                System.out.println("TwoThread-获得了oneLock这把锁，做一些相关的处理...");
            }
        }
    }
}
