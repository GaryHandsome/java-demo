package org.ch00.test06;

/**
 * 为什么要抽象出一个父类 - 动物呢？ -
 * 因为相关的类都有公共的属性和行为 - 代码重用
 * 另外，还要结合需求
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
         // Animal a = new Animal() ;
        Animal a = new People();
        Animal b = new Student() ;
        // Animal c = new Pig() ;

        // a.eat();
        // b.eat();

        ShiTang st = new ShiTang();
        st.fuWu(a);
        st.fuWu(b);

    }
}
