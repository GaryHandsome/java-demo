package test00.demo01;

/**
 * 函数式接口
 *
 * @Date 2023-04-04
 * @Author zqx
 */
@FunctionalInterface
public interface InterfaceTest {
    /**
     * 抽象方法：实现参数 a 与 参数 b之间的运算
     *
     * @param a
     * @param b
     * @return
     */
    int jiSuan(int a, int b);
}
