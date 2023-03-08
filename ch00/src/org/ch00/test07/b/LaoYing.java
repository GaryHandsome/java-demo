package org.ch00.test07.b;

/**
 * @Date 2023-03-08
 * @Author zqx
 */
public class LaoYing extends Bird implements IFlyer{
    // 子类特有的属性和方法（略）
    @Override
    public void fly() {
        System.out.println("⽼鹰飞...");
    }

}
