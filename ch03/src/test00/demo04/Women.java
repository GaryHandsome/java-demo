package test00.demo04;

/**
 * 女主人 - 通过类边界，实现了女主人可以和各种动物问好
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class Women {
    public <T extends Animal> void sayHello(T animal) {
        System.out.println("你好，" + animal.getName());
    }
}
