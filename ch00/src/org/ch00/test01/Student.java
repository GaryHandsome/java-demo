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
