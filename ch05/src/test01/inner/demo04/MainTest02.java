package test01.inner.demo04;

/**
 * 接口用法二：匿名内部类实现
 *
 * 特点：一般只用一次，用完就丢
 *
 * 接口 对象 = new 接口() {
 *      1.成员变量
 *
 *      2.成员方法
 *
 *      // 注意：匿名内部类不允许定义静态的成员，但是可以定义常量
 *
 *      3.接口抽象方法的实现 ;
 * } ;
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
            private String name ;
            public void test() {
                System.out.println("匿名内部类");
            }

            // private static double PI = 3.14 ;

            @Override
            public String sayHello(String name) {
                test() ;
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
