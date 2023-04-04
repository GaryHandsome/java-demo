package test02.functional.demo03;

/**
 * 父接口
 *
 * @Date 2023-04-04
 * @Author zqx
 */
@FunctionalInterface
public interface FatherInterfaceTest {
    /**
     * 抽象方法
     */
    void abstractMethod();

    /**
     * 默认方法 - 子接口可以继承父接口中的默认方法
     * 默认方法是通过对象访问，如：对象.默认方法()
     */
    default void defaultMethod() {
        System.out.println("我是默认方法...");
    }

    /**
     * 静态方法 - 子接口不可以继承父接口中的静态方法
     * 静态方法是通过接口名称访问，如：接口名称.静态方法()
     */
    static void staticMethod() {
        System.out.println("我是静态方法...");
    }
}
