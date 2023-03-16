package org.ch01.test04.sync.demo04;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        OneThread t1 = new OneThread();
        TwoThread t2 = new TwoThread();

        t1.start();
        t2.start();
    }
}
