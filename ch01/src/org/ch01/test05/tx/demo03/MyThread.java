package org.ch01.test05.tx.demo03;

/**
 * sleep VS wait
 *
 * 都可使当前线程进入阻塞状态；但sleep()不释放锁对象，而wait()会释放锁对象
 *
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class MyThread extends Thread {

    // 锁对象
    public static final String lock = "lock";

    @Override
    public void run() {
        System.out.println("你好");

        synchronized (lock) {
            try {
                // lock.wait(5000);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("子线程结束");
    }
}
