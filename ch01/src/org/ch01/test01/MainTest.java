package org.ch01.test01;

/**
 * 单线程程序
 *
 * 思考：在当前程序中，一共有几个线程? - 三个
 *
 *
 *
 * @Date 2023-03-13
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("main方法开始");
        method01();
        method02();
        method03();
        System.out.println("main方法结束");
    }

    private static void method01() {
        System.out.println("方法一");
    }

    private static void method02() {
        System.out.println("方法二");
    }

    private static void method03() {
        System.out.println("方法三");
    }


}
