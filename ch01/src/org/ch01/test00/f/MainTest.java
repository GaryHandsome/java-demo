package org.ch01.test00.f;

/**
 * 1-100
 * 101-900
 * 901-1000
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        SumThread st1 = new SumThread(1, 100);
        SumThread st2 = new SumThread(101, 900);
        SumThread st3 = new SumThread(901, 1000);

        // 启动线程
        st1.start();
        st2.start();
        st3.start();

        // 调用 json 方法，分别让以上三个线程等待死亡
        st1.join();
        st2.join();
        st3.join();


        int sum = st1.getSum() + st2.getSum() + st3.getSum();

        System.out.println("1-1000的和是：" +sum);
    }
}
