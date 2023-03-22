package test05;

/**
 * 泛型接口的实现
 * <p>
 * 注意：实现泛型接口时，一般要指定具体的数据类型，否则默认为Object
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class GenericTestImpl2 implements GenericTest<String> {

    @Override
    public String sayHello(String msg) {
        System.out.println("你好，" + msg);
        return "好好学习";
    }
}
