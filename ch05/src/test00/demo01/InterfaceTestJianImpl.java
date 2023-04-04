package test00.demo01;

/**
 * 实现两数相减的功能
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class InterfaceTestJianImpl implements InterfaceTest {
    /**
     * 实现两数之差
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int jiSuan(int a, int b) {
        return a - b;
    }
}
