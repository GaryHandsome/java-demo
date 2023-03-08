package org.ch00.test08;

/**
 * @Date 2023-03-08
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        XiaoTou zs = new XiaoTou();

        FangDaoMen fangDaoMen = new FangDaoMen();
        MuMen muMen = new MuMen();
        Car bmw = new Car();

        // tou2这个方法，只能接收门对象，不能接收车对象
        zs.tou2(muMen);
        zs.tou2(fangDaoMen);
        //zs.tou2(bmw);
    }
}
