package test06;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第二：使用泛型方法
        // 语法一：根据具体的数据进行类型推导 - 建议
        GenericTest.sayHello(100);

        // 语法二：指定具体的数据类型
        GenericTest.<String>sayHello("好好学习") ;
        GenericTest.<Double>sayHello(3.14) ;

        System.out.println("-----------------------------");

        GenericTest gt = new GenericTest();
        gt.sayGoodBye("你好",3.14,true);
    }
}
