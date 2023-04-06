package test04.api.demo02.t4;

import java.util.function.Supplier;

/**
 * 函数式接口作为方法参数的使用
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {

    /**
     * 函数式接口作为方法参数的使用
     * <p>
     * 说明：函数式接口用在方法参数的目的是为了做一些封装，实现一些逻辑处理
     *
     * @param supplier
     */
    private static void print(Supplier<String> supplier) {
        // 1.获取 Supplier 接口生产的数据
        String msg = supplier.get();

        // 2.对数据进行相关的逻辑处理...
        System.out.println(msg);
    }


    public static void main(String[] args) {
        // 1.匿名内部类实现
        print(new Supplier<String>() {
            @Override
            public String get() {
                return "好好学习";
            }
        });

        // 2.Lambda表达式 - T get();
        print(() -> "好好学习");
    }
}
