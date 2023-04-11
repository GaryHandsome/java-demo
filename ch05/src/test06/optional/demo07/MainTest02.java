package test06.optional.demo07;

import java.util.Optional;

/**
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 第一：实例化 Optional 对象，并指定具体的数据 - Hello
        Optional<String> optional1 = Optional.ofNullable("Hello");

        // 第二：使用 Optional 对象提供的 API 方法，实现相关的操作
        // <U> Optional<U> map(Function<? super T, ? extends U> mapper) - T 类型转换为 U 类型，返回的结果为：Optional<U>
        // R apply(T t);

        // 把 Optional对象表示的字符串 映射（转换）为 大写字母 - 链式操作
        String msg = optional1.map((t) -> t.toUpperCase()).get();

        System.out.println(msg);

    }
}
