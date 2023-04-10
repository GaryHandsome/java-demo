package test00.demo06.t3;

import java.util.function.Predicate;

/**
 * 通过两个 Predicate 接口进行判断，对两个 Predicate 进行逻辑与的运算
 *
 * @Date 2023-04-10
 * @Author zqx
 */
public class MainTest02 {

    /**
     * 验证邮箱是否合法
     *
     * @param email
     * @param predicate1 验证帐号是否至少5个字符组成
     * @param predicate2 验证是否存在@符号
     * @return
     */
    private static String checkEmail(String email, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.and(predicate2).test(email) ? "合法" : "非法";
    }


    public static void main(String[] args) {

        String email = "zhq@qq.com.cn";

        // 函数式接口作为方法参数的使用 - boolean test(T t);
        String jg = checkEmail(email, (yx) -> {
            String[] arr = yx.split("@");
            if (arr.length > 0 && arr[0].length() >= 5) {
                return true;
            }
            return false;
        }, (yx) -> yx.matches("\\w{5,20}@\\w{2,10}(\\.\\w{2,5}){1,2}"));

        System.out.println(jg);
    }
}
