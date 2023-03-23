package test00.demo04;

/**
 * 具体宠物 - 温顺
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Cat extends Animal implements IWenShun {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    /**
     * 叫
     */
    public void call() {
        System.out.println("喵喵");
    }
}
