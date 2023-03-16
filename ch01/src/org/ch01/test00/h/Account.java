package org.ch01.test00.h;

/**
 * 帐号
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class Account {
    /**
     * 余额
     */
    private double money;

    public Account() {
    }

    public Account(double money) {
        this.money = money;
    }

    /**
     * 取钱
     *
     * @param money
     */
    public synchronized void getMoney(double money) {
        System.out.print(Thread.currentThread().getName() + "取了" + money);

        // 余额充足
        if (this.money > money) {
            // 扣钱
            this.money = this.money - money;
            System.out.println("，余额为：" + this.money);
            return;
        }

        // 余额不充足
        System.out.println("，余额不足，余额为：" + this.money);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
