package test06.optional.demo05;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * orElse Vs orElseGet
 *
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // Optional<String> optional = Optional.of("好好学习");
        Optional<String> optional = Optional.ofNullable(null);

        // Supplier<? extends T> supplier - 函数式接口作为方法参数的作用
        // T get();
        // optional.orElseGet(实现类 | 匿名内部类 | Lambda表达式 | 方法引用) ;

        String msg = optional.orElseGet(() -> "天天向上");

        System.out.println(msg);
    }
}
