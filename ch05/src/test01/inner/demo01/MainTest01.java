package test01.inner.demo01;

/**
 * 成员内部类使用方式一：通过内部方法使用
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 实例化对象 ： 类名 对象名  = new 类名() ;
        OuterClass oc = new OuterClass();

        oc.sayHello("张三");
    }
}
