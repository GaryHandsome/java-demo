package org.ch01.test05.tx.demo04;

import java.util.LinkedList;

/**
 * 篮子 - 最多只能放5个水果
 * <p>
 * 男孩子与女孩子公共操作了篮子 - 有可能发生线程安全问题
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class Box {
    /**
     * 定义一个集合容器 - 用于存储水果
     */
    private LinkedList<Fruit> boxList = new LinkedList<>();


    /**
     * 女孩子吃水果
     *
     * @return
     */
    public synchronized Fruit take() {
        // 如果篮子为空，通知男孩子摘水果，女孩子等等男孩子通知
        if (boxList.size() == 0) {
            this.notify();
            try {
                // 注意：wait()方法下面的代码不会被执行
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 吃水果
        Fruit fruit = boxList.removeLast();

        // 输出结果
        System.out.println("女孩子[" + Thread.currentThread().getName() + "]吃水果[" + fruit + "]，篮子容量：" + boxList.size());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return fruit;
    }

    /**
     * 男孩子摘水果
     *
     * @param fruit
     */
    public synchronized void put(Fruit fruit) {
        // 如果篮子已满，通知女孩子吃水果，男孩子等等女孩子通知
        if (boxList.size() == 5) {
            this.notify();
            try {
                // 注意：wait()方法下面的代码不会被执行
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 摘水果
        boxList.add(fruit);

        // 输出结果
        System.out.println("男孩子[" + Thread.currentThread().getName() + "]摘水果[" + fruit + "]，篮子容量：" + boxList.size());


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
