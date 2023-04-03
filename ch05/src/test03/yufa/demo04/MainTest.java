package test03.yufa.demo04;

/**
 * 测试 -
 *      1）如果函数体有多行代码，则需要使用大括号，return不能省略
 *      2）如果函数体只有一行代码，则大括号可以省略不写，如果有 return 语句，也可以省略不写
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // String test(String name);

        // 1）如果函数体有多行代码，则需要使用大括号，return不能省略
        InterfaceTest it1 = name -> {
            System.out.println("好好学习，天天向上");
            return "你好," + name;
        } ;
        String msg1 = it1.test("张三");
        System.out.println(msg1);


        // 2）如果函数体只有一行代码，则大括号可以省略不写，如果有 return 语句，也可以省略不写
        InterfaceTest it2 = name ->  "您好，" + name ;
        String msg2 = it2.test("李四");
        System.out.println(msg2);

    }
}
