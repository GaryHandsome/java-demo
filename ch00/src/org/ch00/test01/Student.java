package org.ch00.test01;

/**
 * @Date 2023-03-07
 * @Author zqx
 * <p>
 * 第一：定义类
 */
public class Student {
    // 1.属性 - 描述对象的特征 - 成员变量 - 语法如下：
    private String name;
    private String sex;
    private int age;

    // alt + insert
    public Student(){}

    // 构造方法 - 方法名与类名相同，不能有返回值
    // 作用：在实例化对象的同时初始化对象
    // 注意：如果程序重载了构造方法，则建议把默认的构造方法显式的定义出来
    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 2.行为 - 描述对象的功能 - 成员方法 - 语法如下：
    public void study(String keMu, int hour) {
        // 方法体 - 此方法功能的具体实现
        System.out.println(this.name + "学习" + keMu + "，时长：" + hour);
    }

    public double getHe(double num1, double num2) {
        // 方法体 - 此方法功能的具体实现
        double he = num1 + num2;
        return he;
    }
}
