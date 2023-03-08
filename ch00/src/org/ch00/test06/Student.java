package org.ch00.test06;

/**
 * 学生
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public class Student extends Animal{

    private double score;

    public void study() {

    }

    @Override
    public void eat() {
        System.out.println("吃营养食物...");
    }
}
