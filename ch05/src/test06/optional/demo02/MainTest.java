package test06.optional.demo02;

import java.util.Optional;

/**
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：实例化 Optional 对象，并指定具体的数据
        Optional<Object> optional = Optional.ofNullable(null);
        //Optional<Object> optional = Optional.ofNullable(100);

        // 第二：使用 Optional 对象提供的 API 方法，实现相关的操作
        // 错误，如果 Optional 对象的值为 null，调用 get 方法时抛出异常
        // System.out.println(optional.get());
        if(optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Optional 对象指定的数据为 null");
        }
    }
}
