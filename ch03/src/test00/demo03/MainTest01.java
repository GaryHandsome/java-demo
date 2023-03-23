package test00.demo03;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 实例化泛型类对象 - Dog
        People<Dog> zs = new People<>();

        Dog xb = new Dog("小白") ;

        zs.setPet(xb);
        zs.shopping();

    }
}
