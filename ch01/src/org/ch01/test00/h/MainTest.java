package org.ch01.test00.h;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {

        Account account = new Account(5000) ;

        BankThread laoGongThread =
                new BankThread(account,"老公",3000) ;

        BankThread laoPoThread =
                new BankThread(account,"老婆",4000) ;

        laoGongThread.start();
        laoPoThread.start();
    }
}

