package test01.inner.demo04;

/**
 * 传统的用法
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 接口 对象 = new 实现类() ; - 多态
        IJieKou jk = new IJieKouImpl();

        String str = jk.sayHello("张三");
        System.out.println(str);
    }
}
