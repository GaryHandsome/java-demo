package test02.functional.demo04;

/**
 * 父接口一
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public interface FatherInterfaceTest01 {
    /**
     * 默认方法
     */
    default void defaultMethod() {
        System.out.println("父接口一的默认方法");
    }

    /**
     * 默认方法
     */
    static void staticMethod() {
        System.out.println("父接口一默认方法");
    }

}
