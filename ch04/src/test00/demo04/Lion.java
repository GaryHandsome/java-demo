package test00.demo04;

/**
 * 狮子 - 是一个哺乳动物  - extend BuRuAnimal
 *
 * 一般，子类继承父类，拥有父类的特性。同时，子类也应该拥有自己特有的特性
 *
 * @Date 2023-03-29
 * @Author zqx
 */
@JianKangQingKuang("差")
public class Lion extends BuRuAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("狮子只吃肉...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("侧着睡，警觉性非常高...");
    }

    // ...
}
