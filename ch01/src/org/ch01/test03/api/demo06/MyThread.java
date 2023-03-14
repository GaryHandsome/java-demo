package org.ch01.test03.api.demo06;

/**
 * @Date 2023-03-14
 * @Author zqx
 */
public class MyThread extends Thread {

    /**
     * 控制变量 - 控制线程是否结束
     */
    private boolean flag = true;

    /**
     * 停止线程
     */
    public void shutdown() {
        this.flag = false;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("你好");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
