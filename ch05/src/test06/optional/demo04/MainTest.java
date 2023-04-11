package test06.optional.demo04;

import java.util.Optional;

/**
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello");
        // Optional<String> optional = Optional.ofNullable(null);

        // 如果 optional 对象不存在值，则返回指定的默认值：defaultValue
        String result = optional.orElse("好好学习");

        // 输出：好好学习
        System.out.println(result);
    }
}
