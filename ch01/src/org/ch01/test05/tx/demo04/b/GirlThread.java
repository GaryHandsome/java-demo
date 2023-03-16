package org.ch01.test05.tx.demo04.b;

/**
 * 女孩子 - 消费者
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class GirlThread extends Thread {

    /**
     * 篮子
     */
    private Box box;

    /**
     * 姓名
     */
    private String name;

    public GirlThread() {

    }

    public GirlThread(Box box, String name) {
        super(name);
        this.box = box;
    }

    @Override
    public void run() {
        while(true) {
            box.take();
        }
    }
}
