package test02.functional.demo04;

/**
 * 父接口二
 * <p>
 * 注意：目前，两个父接口具有相同名称的默认方法
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public interface FatherInterfaceTest02 {
    /**
     * 默认方法
     */
    default void defaultMethod() {
        System.out.println("父接口二的默认方法");
    }

    /**
     * 默认方法
     */
    static void staticMethod() {
        System.out.println("父接口二默认方法");
    }
}
