package test05.method.demo06;

import java.util.function.BiPredicate;

/**
 * @Date 2023-04-07
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // boolean test(T t, U u);
        BiPredicate<String, String> bl1 = (t, u) -> t.equals(u);

        // 第一个参数x是成员方法equals的调用者
        // 第二个参数y是成员方法equals的参数
        BiPredicate<String, String> bl2 = String::equals;

        System.out.println(bl1.test("aa", "aa"));

        System.out.println(bl2.test("cc", "cc"));

    }
}
