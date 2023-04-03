package test03.yufa.demo01;

/**
 * 测试 - 无参：使用空括号 () 表示没有参数
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 参考：void test();
        InterfaceTest it = () -> {
            System.out.println("好好学习");
            System.out.println("天天向上");
        } ;

        it.test();
    }
}
