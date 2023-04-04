package test02.functional.demo03;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        SonInterfaceTestImpl sit = new SonInterfaceTestImpl();

        sit.abstractMethod();

        sit.defaultMethod();

        // 错误，子接口中不存在静态方法的继承
        // sit.staticMethod() ;

        // 注意：接口中的静态方法必须通过所在的接口名称访问
        FatherInterfaceTest.staticMethod();
    }
}
