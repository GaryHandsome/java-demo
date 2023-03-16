package org.ch01.test05.tx.demo04.a;

import java.util.Random;

/**
 * 水果 - 随机生成水果
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class Fruit {

    /**
     * 具体水果 - 随机生成
     */
    private String[] fruitList = {"苹果", "香蕉", "雪梨", "草莓", "榴莲", "葡萄"};

    /**
     * 数组随机下标
     */
    private int index;

    public Fruit() {
        this.index = new Random().nextInt(fruitList.length);
    }

    @Override
    public String toString() {
        return fruitList[index];
    }

    public static void main(String[] args) {
        System.out.println(new Fruit());
    }
}
