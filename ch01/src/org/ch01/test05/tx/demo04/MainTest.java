package org.ch01.test05.tx.demo04;

/**
 * @Date 2023-03-15
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化篮子
        Box box = new Box();

        BoyThread xb = new BoyThread(box, "小白");
        GirlThread xh = new GirlThread(box, "小花");

        xb.start();
        xh.start();
    }
}
