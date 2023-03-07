package org.ch00.test03;

/**
 * @Date 2023-03-07
 * @Author zqx
 */
public class Dog extends Animal{
    // 重写方法 - 发生继承父类或实现接口中
    // 重写方法要求：方法名 + 方法参数个数 + 方法参数的数据类型必须相同
    // 别外，返回值没有要求，但修饰符一般要大于或等于父类的修饰符
    // 在子类重写方法中，可以使用 super 关键字访问父类的非私有成员
    public void eat() {
        System.out.println("吃SHI - 子类的扩展");
        super.eat();
    }
}
