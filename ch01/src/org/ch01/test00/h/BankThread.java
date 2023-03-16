package org.ch01.test00.h;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class BankThread extends Thread {
    /**
     * 帐号
     */
    private Account account;
    private double money ;
    private String name ;

    public BankThread() {
    }

    public BankThread(Account account,String name,double money) {
        super(name);
        this.money = money ;
        this.account = account;
    }

    @Override
    public void run() {
        account.getMoney(money);
    }
}
