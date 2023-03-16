package org.ch01.test02.way.demo03;

import java.util.concurrent.Callable;

/**
 * 第一：定义一个类，实现 Callable 接口 - 指定泛型
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MyCallable implements Callable<Integer> {

    // 第二：重写 call()方法
    @Override
    public Integer call() throws Exception {
        System.out.println("你好");


        Thread.sleep(5000);

        // ......
        return 100;
    }
}
