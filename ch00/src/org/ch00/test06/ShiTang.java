package org.ch00.test06;

/**
 * 食堂
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public class ShiTang {
    /**
     * 服务
     */
    public void fuWu(Animal a) {
        System.out.println("您好，欢迎光临...");
        a.eat();
        System.out.println("再见,走好！");
    }

}
