package test01.inner.demo04;

/**
 * 接口用法三：接口作为方法参数的使用
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        TestClass tc = new TestClass();

        // 1.传统用法
        IJieKou ijk = new IJieKouImpl();
        tc.wenHou(ijk);

        // 2.匿名内部类的用法
        tc.wenHou(new IJieKou(){
            @Override
            public String sayHello(String name) {
                return "Hello," + name;
            }
        });


    }
}
