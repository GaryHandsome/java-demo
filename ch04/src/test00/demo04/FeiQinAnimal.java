package test00.demo04;

/**
 * 飞禽动物 - 是一个动物（is-a） - extend 动物
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class FeiQinAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("飞禽动物吃...");
    }

    @Override
    public void sleep() {
        System.out.println("飞禽动物睡...");
    }
}
