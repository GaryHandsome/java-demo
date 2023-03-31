package test01.inner.demo03;

/**
 * @Date 2023-03-31
 * @Author zqx
 */
public class OuterClass {
    // ....

    public void sayHello(String msg) {
        int age = 20;
        System.out.println("你好，" + msg);

        // 局部内部类 - 与局部变量一样，只作用于当前方法
        class InnerClass {
            public int sum(int a, int b) {
                return a + b;
            }
        }

        // 在方法中，实例化局部内部类对象
        // 注意：与成员内部类、静态内部类不一样，局部内部类只能在当前类中当前的方法使用
        InnerClass ic = new InnerClass();
        int sum = ic.sum(1, 1);
        System.out.println("和为：" + sum);

    }

    public void test() {
        // System.out.println(age);
    }
}
