package test01.inner.demo03;


/**
 * 局部内部类 - 只能在当前方法使用
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.sayHello("张三");
    }
}
