package test00.demo04;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Women ls = new Women();

        Animal xx = new Animal("未知道动物") ;
        Dog xb = new Dog("小白") ;
        Cat xl = new Cat("小蓝") ;
        Tiger xh = new Tiger("小黄") ;

        Tree t = new Tree();

        ls.sayHello(xb);
        ls.sayHello(xl);
        ls.sayHello(xh);
        ls.sayHello(xx);

        // 错误 - t 不是 Animal类型，也不是Animal类型的子类
        //ls.sayHello(t);

    }
}
