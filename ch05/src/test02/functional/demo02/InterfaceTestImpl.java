package test02.functional.demo02;


/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class InterfaceTestImpl implements InterfaceTest {
    /**
     * 实现类必须要重写接口中的抽象方法
     */
    @Override
    public void method01() {
        System.out.println("实现接口中的抽象方法");
    }
}
