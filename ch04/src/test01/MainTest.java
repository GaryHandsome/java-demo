package test01;

/**
 * 注解生成文档
 *
 * @author zqx
 * @version 1.0
 */
public class MainTest {
    /**
     * 测试方法
     */
    public void test() {
        System.out.println("OK");
    }

    /**
     * 计算两数的和
     *
     * @param n1 第一个整数
     * @param n2 第二个整数
     * @return
     */
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
