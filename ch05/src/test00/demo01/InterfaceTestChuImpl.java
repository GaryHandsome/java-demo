package test00.demo01;

/**
 * 实现两数相除的功能
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class InterfaceTestChuImpl implements InterfaceTest {
    /**
     * 实现两数之商
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int jiSuan(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("除数不能为0！");
        }
        return a / b;
    }
}
