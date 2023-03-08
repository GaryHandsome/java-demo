package org.ch00.test08;

import java.util.Random;

/**
 * @Date 2023-03-08
 * @Author zqx
 */
public class XiaoTou {

    /**
     * 小偷面向具有防盗功能的设备进行偷盗行为 - 接口实现多态
     */
    public void tou1(IFangDao iFangDao) {
        System.out.println("开始偷盗");

        int rand = new Random().nextInt(10);

        if (rand > 8) {
            System.out.println("偷盗成功");
        } else {
            iFangDao.baoJing();
            System.out.println("恭喜，你被抓了！");
        }
    }


    /**
     * 小偷面向门进行偷盗行为 - 父类实现多态
     *
     * @param men
     */
    public void tou2(Men men) {
        System.out.println("开始偷盗");

        int rand = new Random().nextInt(10);

        if(men instanceof FangDaoMen) {
            // 向下转型 - 把父类或接口 转化为 子类或实现类
            FangDaoMen fangDaoMen = (FangDaoMen)men ;
            if (rand > 5) {
                System.out.println("偷盗成功");
            } else {
                fangDaoMen.baoJing();
                System.out.println("恭喜，你被抓了！");
            }
        } else {
            System.out.println("偷盗成功");
        }

    }
}
