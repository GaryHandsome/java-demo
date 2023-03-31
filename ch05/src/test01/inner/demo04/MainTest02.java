package test01.inner.demo04;

/**
 * 匿名内部类实现使用方式一：赋值给接口对象
 * 匿名内部类实现使用方式二：接口参数
 * 匿名内部类实现使用方式三：返回值
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        /**
         * 中文实现 - 在实例化接口对象时，通过匿名内部类实现接口
         */
        IJieKou jk1 = new IJieKou() {
            @Override
            public String sayHello(String name) {
                return "你好，" + name;
            }
        };


        /**
         * 英文实现 - 在实例化接口对象时，通过匿名内部类实现接口
         */
        IJieKou jk2 = new IJieKou() {
            @Override
            public String sayHello(String name) {
                return "Hello," + name;
            }
        };

        System.out.println(jk1.sayHello("张三"));
        System.out.println(jk2.sayHello("张三"));
    }
}
