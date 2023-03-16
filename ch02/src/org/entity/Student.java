package org.entity;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class Student {
    private String name;
    private int age;

    private Double weight ;

    public Student() {}

    public Student(String name,int age) {
        this.name = name ;
        this.age = age ;
    }

    public Student(String name,int age,Double weight) {
        this.name = name ;
        this.age = age ;
        this.weight = weight ;
    }

    public void sayHello() {
        System.out.println("你好");
    }

    private void eat() {
        System.out.println("吃");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public void show() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("体重：" + this.weight);
    }
}
