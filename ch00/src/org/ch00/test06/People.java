package org.ch00.test06;

/**
 * 人类
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public class People extends Animal{

    private String sex;

    public void say() {

    }

    @Override
    public void eat() {
        System.out.println("杂食动物，没有不吃的...");
    }
}
