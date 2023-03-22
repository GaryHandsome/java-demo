package test04;

/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Animal<Integer> cat = new Cat() ;
        Animal<String> dog = new Dog() ;

        // 错误 - 泛型类型必须保持一致
        // Animal<Integer> error = new Dog();
    }
}
