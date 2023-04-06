package test04.api.demo04;

import java.util.function.Predicate;

/**
 * Predicate：断定型接口 - 对某个数据进行验证、判断、断定 - true / false
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest01 {

    /**
     * 通过 Predicate 接口，对性别进行合法性验证
     *
     * @param sex
     * @param predicate
     * @return
     */
    public static boolean check(String sex, Predicate<String> predicate) {
        return predicate.test(sex);
    }

    public static void main(String[] args) {
        String sex = "男" ;

        // boolean test(T t);
        boolean bl = check(sex,(xb)->{
            if("男".equals(xb) || "女".equals(xb)) {
                return true ;
            }
            return false;
        }) ;

        if(bl) {
            System.out.println("合法");
        } else {
            System.out.println("非法");
        }

    }
}
