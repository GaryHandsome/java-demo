package test06.optional.demo06;

import java.util.Optional;

/**
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：实例化 Optional 对象，并指定具体的数据 - null
        // Optional<Object> optional = Optional.ofNullable(100);
        Optional<Object> optional = Optional.ofNullable(null);

        // 第二：使用 Optional 对象提供的 API 方法，实现相关的操作
        // Supplier - 函数式接口作为方法参数的使用
        // optional.orElseThrow(实现类 | 匿名内部类 | Lambda表达式 | 方法引用)
        // T get();
        // 注意：在实际开发中，一般抛出自己定义的业务异常
        optional.orElseThrow(() -> new RuntimeException("数据为空"));

    }
}
