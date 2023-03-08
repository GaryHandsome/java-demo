package org.ch00.test08;

/**
 * @Date 2023-03-08
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        XiaoTou zs = new XiaoTou();

        FangDaoMen fangDaoMen = new FangDaoMen();
        Car bmw = new Car();

        zs.tou1(fangDaoMen);
        zs.tou1(bmw);
    }
}
