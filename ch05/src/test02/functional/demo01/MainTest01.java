package test02.functional.demo01;

/**
 * 函数式接口的使用场景有以下三个情况
 *
 * 1）直接使用（常用）
 * 2）作为方法参数使用（常用）
 * 3）作为方法返回值使用
 *
 * 另外，函数式接口的使用方式一般有以下几种
 * 1）传统用法 - 定义相关的实现类
 * 2）匿名内部类
 * 3）Lambda表达式
 * 4）方法引用
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 1.直接使用（常用） + 传统用法 - 定义相关的实现类
        InterfaceTest it1 = new InterfaceTestImpl();
        it1.sayHello("张三");

        // 2.直接使用（常用） + 匿名内部类
        InterfaceTest it2 = new InterfaceTest(){
            @Override
            public void sayHello(String name) {
                System.out.println("你好呀，" + name);
            }
        } ;
        it2.sayHello("李四");

        // 3.直接使用（常用） + Lambda表达式 - 函数式接口中抽象方法的实现
        // void sayHello(String name) ;
        InterfaceTest it3 = (String name) -> {
            System.out.println("您好，" + name);
        } ;
        it3.sayHello("王五");
    }
}
