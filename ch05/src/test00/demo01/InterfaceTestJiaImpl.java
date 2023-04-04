package test00.demo01;

/**
 * 实现两数相加的功能
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class InterfaceTestJiaImpl implements InterfaceTest {
    /**
     * 实现两数之和
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int jiSuan(int a, int b) {
        return a + b;
    }
}
