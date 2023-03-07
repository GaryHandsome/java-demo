package org.ch00.test03;

/**
 * 代码重构：把 Bird、Cat、Dog 公共代码进行提取，定义在父类 Animal 中
 * 各个子类不需要重复定义相关的代码，继承父类即可 - 代码重用、多态的实现
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃");
    }

    public void showInfo() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
    }
}
