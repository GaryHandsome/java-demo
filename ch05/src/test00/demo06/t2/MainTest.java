package test00.demo06.t2;

import java.util.function.Predicate;

/**
 * @Date 2023-04-10
 * @Author zqx
 */
public class MainTest {


    /**
     * 判断分数是否合格 - 灵活
     *
     * @param score     分数
     * @param predicate 判断规则
     * @return
     */
    private static String isJiGe1(double score, Predicate<Double> predicate) {
        return predicate.test(score) ? "合格" : "不合格";
    }

    /**
     * 传统实现 - 写死
     *
     * @param score
     * @return
     */
    private static String isJiGe2(double score) {
        return score >= 60 ? "合格" : "不合格";
    }

    public static void main(String[] args) {
        double score = 59;


        //  boolean test(T t);
        String jg1 = isJiGe1(score, (cj) -> cj >= 60);
        System.out.println(jg1);


        String jg2 = isJiGe1(score, (cj) -> cj >= 45);
        System.out.println(jg2);
    }
}
