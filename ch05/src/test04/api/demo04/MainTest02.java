package test04.api.demo04;

import java.util.function.Predicate;

/**
 * Predicate：断定型接口 - 对某个数据进行验证、判断、断定 - true / false
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest02 {


    /**
     * 通过两个 Predicate 接口，对性别进行合法性验证
     * @param sex
     * @param predicate1 性别必须是男
     * @param predicate2 性别必须是女
     * @return
     */
    public static boolean check(String sex,
                                Predicate<String> predicate1,
                                Predicate<String> predicate2) {
        return predicate1.or(predicate2).test(sex) ;
    }

    public static void main(String[] args) {
        String sex = "仙" ;

        // boolean test(T t);
        System.out.println(check(sex, (t) -> "男".equals(t), (t) -> "女".equals(t)));
    }
}
