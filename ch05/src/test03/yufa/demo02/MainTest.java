package test03.yufa.demo02;

/**
 * 测试
 * 1）参数类型可以省略，参数类型可以由编译器根据上下文推断得出
 * 2）只有一个参数：可省略参数的括号（多个参数不能省略）
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // void test(String name);
        InterfaceTest it1 = (String name) -> {
            System.out.println("你好，" + name);
            System.out.println("好好学习，天天向上");
        };
        it1.test("张三");

        // 1）参数类型可以省略，参数类型可以由编译器根据上下文推断得出
        InterfaceTest it2 = (name) -> {
            System.out.println("你好，" + name);
            System.out.println("好好学习，天天向上");
        };
        it2.test("李四");

        // 2）只有一个参数：可省略参数的圆括号（多个参数不能省略）
        InterfaceTest it3 = name -> {
            System.out.println("你好，" + name);
            System.out.println("好好学习，天天向上");
        };
        it3.test("王五");
    }
}
