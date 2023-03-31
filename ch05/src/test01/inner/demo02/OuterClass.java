package test01.inner.demo02;

/**
 * 静态成员 VS 非静态成员
 * <p>
 * 类名.静态成员 VS 对象.非静态成员
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class OuterClass {
    // 1.成员变量
    // 2.成员方法
    // 3.成员内部类

    // 4.静态变量
    public static double PI = 3.14;

    /**
     * 5.静态方法
     */
    public static void staticMethod() {
        System.out.println("PI=" + OuterClass.PI);

        // 类名 对象 = new 类名() ;
        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        ic.test();
    }

    // 6.静态内部类
    public static class InnerClass {
        // .....
        public void test() {
            System.out.println("静态内部类");
        }
    }
}
