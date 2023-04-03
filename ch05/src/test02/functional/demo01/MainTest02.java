package test02.functional.demo01;

/**
 * 函数式接口的使用场景有以下三个情况
 * <p>
 * 1）直接使用（常用）
 * 2）作为方法参数使用（常用）
 * 3）作为方法返回值使用
 * <p>
 * 另外，函数式接口的使用方式一般有以下几种
 * 1）传统用法 - 定义相关的实现类
 * 2）匿名内部类
 * 3）Lambda表达式
 * 4）方法引用
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class MainTest02 {

    /**
     * 问候 - InterfaceTest：具体问候的抽象
     * <p>
     * 函数式接口作为方法的参数使用
     *
     * @param it
     */
    public static void wenHou(InterfaceTest it, String name) {
        it.sayHello(name);
        System.out.println("鞠个躬");
    }


    public static void main(String[] args) {
        // 1.作为方法参数使用 + 传统用法 - 定义相关的实现类
        InterfaceTest it = new InterfaceTestImpl();
        MainTest02.wenHou(it,"张三") ;

        // 2.作为方法参数使用 + 匿名内部类
        MainTest02.wenHou(new InterfaceTest(){
            @Override
            public void sayHello(String name) {
                System.out.println("你好呀，" + name);
            }
        },"李四") ;

        // 3.作为方法参数使用 + Lambda表达式 - 函数式接口中抽象方法的实现
        // void sayHello(String name) ;
        MainTest02.wenHou((String name) -> {
            System.out.println("您好，" + name);
        },"王五");

        // 简化
        MainTest02.wenHou(name -> System.out.println("您好，" + name),"赵六");
    }
}
