package test04.api.demo02.t3;

import java.util.function.Supplier;

/**
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // (参数列表) -> {} T get();
        Supplier<String> supplier = () -> "好好学习,天天向上，不要睡觉了！";

        String msg = supplier.get();
        System.out.println(msg);
    }
}
