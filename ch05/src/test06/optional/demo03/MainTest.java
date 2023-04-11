package test06.optional.demo03;

import java.util.Optional;

/**
 * ifPresent():如果 Optional 实例中存在值，
 * 则执行指定的操作（使用该值调用指定的消费者），否则什么也不做。
 *
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：实例化 Optional 对象，并指定具体的数据 - Hello,World
        Optional<String> optional = Optional.ofNullable("Hello, world!");
        // Optional<String> optional = Optional.ofNullable(null);

        // 第二：使用 Optional 对象提供的 API 方法，实现相关的操作
        // Consumer<? super T> action - 函数式接口（消费型接口）
        // void accept(T t);
        // optional.ifPresent(实现类 ｜ 匿名内部类 ｜ Lambda表达式 | 方法引用);
        optional.ifPresent((t) -> {
            System.out.println(t.toUpperCase());
        });

        // 方法引用 - 如果存在一个与抽象方法匹配的方法，则可以使用方法引用
        optional.ifPresent(System.out::println);
    }
}
