package test00.demo04;

/**
 * 哺乳动物 - 是一个动物 - extend 动物
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class BuRuAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("哺乳动物吃...");
    }

    @Override
    public void sleep() {
        System.out.println("哺乳动物睡...");
    }
}
