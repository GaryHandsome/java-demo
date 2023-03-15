package org.ch01.test03.api.demo06.d;

/**
 * 案例四：interrupt中断的线程中存在sleep方法 - 中断状态为true - 程序能正常退出
 *
 * 两阶段中断线程模式
 *
 * @Date 2023-03-14
 * @Author zqx
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // 获取当前线程的中断状态
            boolean status = Thread.currentThread().isInterrupted();

            if (status) {
                // 注意：在结束线程之前，做一些后续处理...
                break;
            }

            System.out.println("好好学习，天天向上");

            // 睡眠5秒
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // 再次调用interrupt方法，把中断状态设置为true
                Thread.currentThread().interrupt();
            }
        }
    }
}
