package test01.inner.demo01;

/**
 * 成员内部类 - 直接访问内部类
 *
 * 注意：内部类的修饰符不能为私有的
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 方法一
        // 外部类 外部类对象 = new 外部类() ;
        OuterClass oc = new OuterClass() ;
        // 外部类名称.内部类名称 内部类对象 = 外部类对象.new 内部类名称() ;
        OuterClass.InnerClass ic1 = oc.new InnerClass() ;
        ic1.test();

        // 方法二
        OuterClass.InnerClass ic2 = new OuterClass().new InnerClass() ;
        ic2.test();

    }
}
