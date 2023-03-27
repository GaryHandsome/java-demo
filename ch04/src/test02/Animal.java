package test02;

/**
 * @Date 2023-03-27
 * @Author zqx
 */
public class Animal {
    public void eat() {
        System.out.println("吃");
    }

    @Deprecated
    public static void test01() {
        System.out.println("此方法标记为过时，不建议使用");
    }
}
