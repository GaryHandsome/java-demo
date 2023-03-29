package test00.demo04;

/**
 * 鸽子 - 是一个飞禽动物  - extend FeiQinAnimal
 *
 * 一般，子类继承父类，拥有父类的特性。同时，子类也应该拥有自己特有的特性
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class GeZi extends FeiQinAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃玉米...");
    }

    @Override
    @ShuiMianQingKuang("失眠")
    public void sleep() {
        super.sleep();
        System.out.println("树上睡...");
    }

    // ...
}
