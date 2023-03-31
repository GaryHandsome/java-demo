package test01.inner.demo01;

/**
 * @Date 2023-03-31
 * @Author zqx
 */
public class OuterClass {
    // 1.成员变量
    private String name;

    /**
     * 2.成员方法 - 在成员方法中可以像调用其它成员一样，使用成员内部类
     *
     * @param msg
     */
    public void sayHello(String msg) {
        System.out.println("你好，" + msg);

        // 类名 对象名 = new 类名() ;
        InnerClass ic = new InnerClass();
        // 对象.属性
        // 对象.方法名称
        ic.test();
    }

    // 3.成员内部类
    class InnerClass {
        // 1.成员变量
        // 2.成员方法
        public void test() {
            System.out.println("成员内部类");
        }
    }

}
