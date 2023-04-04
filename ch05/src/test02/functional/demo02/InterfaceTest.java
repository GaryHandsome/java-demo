package test02.functional.demo02;

/**
 * 父接口
 *
 * @Date 2023-04-04
 * @Author zqx
 */
@FunctionalInterface
public interface InterfaceTest {
    // 1.常量
    public static final double PI = 3.14;

    // 2.抽象方法
    void method01();

    /**
     * 3.默认方法
     */
    default void method02() {
        System.out.println("默认方法 - 具体功能的实现（略）");
    }

    /**
     * 4.静态方法
     */
    static void method03() {
        System.out.println("静态方法 - 具体功能的实现（略）");
    }

    /**
     * 重写了超类Object类中任意一个public方法的方法并不算接口中的抽象方法。
     * 只是根据需求，对重写的方法进行重新注释。
     * <p>
     * 根据学生的成绩进行比较
     *
     * @param obj
     * @return
     */
    public boolean equals(Object obj);
}
