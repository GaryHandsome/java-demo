package test00.demo02.t1;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("好好学习，天天向上");
        }
    }
}
