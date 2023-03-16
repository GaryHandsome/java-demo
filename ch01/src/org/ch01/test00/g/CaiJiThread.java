package org.ch01.test00.g;

/**
 * 采集数据线程 - 两阶段中断线程模式
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class CaiJiThread extends Thread {


    @Override
    public void run() {
        while (true) {

            // 获取当前线程中断状态
            boolean flag = Thread.currentThread().isInterrupted();

            if (flag) {
                System.out.println("中断退出之前，做一些后续处理...");
                break;
            }

            System.out.println("数据采集中....");

            // 每隔两秒停一下 - 防止 CPU 占用100%
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // System.out.println("睡眠中断，做一些后续处理...");
                // 如果进程进入睡眠状态，则需要再一次中断
                Thread.currentThread().interrupt();
            }


        }
    }
}
