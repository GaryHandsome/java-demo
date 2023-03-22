package test00.demo01;

/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 实例化泛型类对象，同时指定泛型的具体数据类型 - 宠物
        Dog dog = new Dog("旺财") ;

        People<Dog> zs = new People<>(dog) ;



        zs.shopping();



    }
}
