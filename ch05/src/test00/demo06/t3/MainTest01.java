package test00.demo06.t3;

import java.util.function.Predicate;

/**
 * 只通过一个 Predicate 进行判断
 *
 * @Date 2023-04-10
 * @Author zqx
 */
public class MainTest01 {


    public static void main(String[] args) {

        String email = "zhqianxin@qq.com.cn";

        // 函数式接口直接使用 - boolean test(T t);
        Predicate<String> predicate = (yx) -> {
            // 帐号必须至少由5个字符组成，而且有且只有一个@字符 - 正则表达式
            return yx.matches("\\w{5,20}@\\w{2,10}(\\.\\w{2,5}){1,2}");
        };

        boolean bl = predicate.test(email);
        System.out.println(bl);
    }
}
