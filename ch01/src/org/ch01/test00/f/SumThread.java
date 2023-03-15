package org.ch01.test00.f;

/**
 * 定义线程类，实现计算从m到n的和
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class SumThread extends Thread {
    private int m;
    private int n;

    private int s;

    public SumThread() {
    }

    public SumThread(int m, int n) {
        this.m = m;
        this.n = n;
    }

    /**
     * 获取 m-n 的和
     *
     * @return
     */
    public int getSum() {
        return this.s;
    }

    /**
     * 线程体 - 实现的具体功能
     */
    @Override
    public void run() {
        for (int i = m; i <= n; i++) {
            s = s + i;
        }
    }
}
