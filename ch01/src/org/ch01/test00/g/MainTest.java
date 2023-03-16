package org.ch01.test00.g;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        CaiJiThread caiJiThread = new CaiJiThread();
        CaiJiUtil caiJiUtil = new CaiJiUtil(caiJiThread);
        caiJiUtil.start();

        // 主线程，模拟10秒后停止采集线程
        Thread.sleep(10000);
        caiJiUtil.stop();
    }
}
