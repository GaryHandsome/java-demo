package test02;

/**
 * @Date 2023-03-27
 * @Author zqx
 */
public class Dog extends Animal {
    /**
     * 方法的重写 - 覆盖
     */
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
