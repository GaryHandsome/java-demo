package test00.demo02.t1;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
