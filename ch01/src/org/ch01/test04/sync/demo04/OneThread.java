package org.ch01.test04.sync.demo04;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class OneThread extends Thread{

    public static final Object oneLock = new Object();

    @Override
    public void run() {
        synchronized (oneLock) {
            System.out.println("OneThread-获得了oneLock这把锁，做一些相关的处理...");

            synchronized (TwoThread.twoLock) {
                System.out.println("OneThread-获得了twoLock这把锁，做一些相关的处理...");
            }
        }
    }
}
