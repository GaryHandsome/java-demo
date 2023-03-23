package test00.demo02;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 第一：实例化类对象
        ObjectUtil02 objectUtil02 = new ObjectUtil02();

        // 相比泛型类的实现，泛型方法更简单
        Cat cat = objectUtil02.create(Cat.class);
        Dog dog = objectUtil02.create(Dog.class);


    }
}
