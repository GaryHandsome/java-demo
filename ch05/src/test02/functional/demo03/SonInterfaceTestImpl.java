package test02.functional.demo03;

/**
 * 给子接口定义实现类 -
 * 1）必须要实现接口中的抽象方法
 * 2）默认方法不需要重写。当然，根据需求，可以重写
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class SonInterfaceTestImpl implements SonInterfaceTest {
    @Override
    public void abstractMethod() {
        System.out.println("重写父类的抽象方法");
    }
}
