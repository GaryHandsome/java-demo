package test00.demo04;

/**
 * 海洋动物 - 是一个动物（is-a） - extend 动物
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class HaiYangAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("海洋动物吃...");
    }

    @Override
    public void sleep() {
        System.out.println("海洋动物睡...");
    }
}
