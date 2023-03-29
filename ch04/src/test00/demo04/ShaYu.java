package test00.demo04;

/**
 * 鲨鱼 - 是一个海洋动物  - extend HaiYangAnimal
 *
 * 一般，子类继承父类，拥有父类的特性。同时，子类也应该拥有自己特有的特性
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class ShaYu extends HaiYangAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("大鱼吃小鱼...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("海里睡...");
    }

    // ...
}
