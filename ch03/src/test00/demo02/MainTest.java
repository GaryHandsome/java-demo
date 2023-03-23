package test00.demo02;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：实例化泛型类对象 - 指定具体的数据类型
        ObjectUtil<Cat> objectUtil1 = new ObjectUtil<>();
        // 第二：实例化指定的对象
        Cat cat = objectUtil1.create(Cat.class);
        cat.eat();

        // 泛型类实现的缺点：每构造一个类的对象时，
        // 都必须实例化一个泛型类对象（ObjectUtil）
        // 如何解决？ - 泛型方法
        ObjectUtil<Dog> objectUtil2 = new ObjectUtil<>();
        Dog dog = objectUtil2.create(Dog.class);
        dog.sleep();
    }
}
