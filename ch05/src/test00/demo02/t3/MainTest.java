package test00.demo02.t3;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 方式三：Lambda表达式 - public abstract void run();
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("好好学习，天天向上");
            }
        };

        // 通过Runnable接口实例化Thread对象
        Thread thread = new Thread(runnable);

        // 启动线程
        thread.start();
    }
}
