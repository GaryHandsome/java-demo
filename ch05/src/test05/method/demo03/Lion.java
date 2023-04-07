package test05.method.demo03;

/**
 * 子类
 *
 * @Date 2023-04-07
 * @Author zqx
 */
public class Lion extends Animal {
    /**
     * 函数式接口作为方法参数的使用 - 移动行为
     *
     * @param im
     */
    public void move(IMove im) {
        im.move();
    }

    /**
     * 吃
     */
    public void eat() {
        System.out.println("吃");
    }

    /**
     * 捕食 - 动起来 - 调用 move 方法
     * 1）匿名内部类实现
     */
    public void buShi1() {
        move(new IMove(){
            @Override
            public void move() {
                Lion.super.run();
            }
        });
    }

    /**
     * 捕食 - 动起来 - 调用 move 方法
     * 2）Lambda表达式实现 - void move();
     */
    public void buShi2() {
        move(()->{
            super.run();
        }) ;
    }

    /**
     * 捕食 - 动起来 - 调用 move 方法
     * 3）方法引用 - void move();
     */
    public void buShi3() {
        // 引用父类的方法 - super::方法名称
        move(super::run) ;
    }

    /**
     * 捕食 - 动起来 - 调用 move 方法
     * 3）方法引用 - void move();
     */
    public void buShi4() {
        // 引用本类的方法 - this::方法名称
        move(this::eat) ;
    }
}
