package org.ch01.test05.tx.demo04.a;

/**
 * 男孩子 - 生产者
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class BoyThread extends Thread {

    /**
     * 篮子
     */
    private Box box;

    /**
     * 姓名
     */
    private String name;

    public BoyThread() {

    }

    public BoyThread(Box box, String name) {
        super(name);
        this.box = box;
    }

    @Override
    public void run() {
        while(true) {
            box.put(new Fruit());
        }
    }
}
