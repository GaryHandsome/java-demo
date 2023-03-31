package test01.inner.demo02;


/**
 * 静态内部类使用方式二：外部使用
 * <p>
 * 注意：内部类的访问修饰符必须为非私有
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 外部类.内部类 内部类对象 = new 外部类.内部类() ;
        OuterClass.InnerClass ic = new OuterClass.InnerClass();

        ic.test();

    }
}
