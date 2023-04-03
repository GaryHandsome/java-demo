package test02.functional.demo01;

/**
 * 接口的实现类
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class InterfaceTestImpl implements InterfaceTest {
    @Override
    public void sayHello(String name) {
        System.out.println("你好，" + name);
    }
}
