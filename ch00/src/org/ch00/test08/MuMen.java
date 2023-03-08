package org.ch00.test08;

/**
 * 木门
 * 是一道门，继承门，则木门就拥有门的特性（属性和行为）
 *
 * @Date 2023-03-08
 * @Author zqx
 */
public class MuMen extends Men{
    @Override
    public void open() {
        System.out.println("木门开");
    }

    @Override
    public void close() {
        System.out.println("木门关");
    }
}
