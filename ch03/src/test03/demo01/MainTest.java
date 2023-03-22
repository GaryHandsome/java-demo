package test03.demo01;

/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第二：实例化泛型类对象，并指定具体泛型类型
        GenericTest<String> gt1 = new GenericTest<>();
        gt1.sayHello("张三");


        GenericTest<Integer> gt2 = new GenericTest<>();
        gt2.sayHello(250);
    }
}
