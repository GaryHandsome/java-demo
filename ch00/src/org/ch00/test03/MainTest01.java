package org.ch00.test03;

/**
 * @Date 2023-03-07
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 实例化对象 - 类名 对象名 = new 类名() ;

        Bird xh = new Bird() ;

        // 注意：子类只能访问父类非私有的成员
        // xh.name = "小花" ;
        // xh.age = 20 ;
        xh.setName("小花");
        xh.setAge(20);

        xh.showInfo();

        xh.eat();
    }
}
