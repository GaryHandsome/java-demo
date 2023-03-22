package test05;

/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化接口对象
        GenericTest<String> gt1 = new GenericTestImpl2();

        // 错误 - 接口泛型 与 实现类实现接口指定的泛型不一致
        // GenericTest<Integer> gt2 = new GenericTestImpl2();
    }
}
