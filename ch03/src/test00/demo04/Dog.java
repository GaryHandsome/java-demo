package test00.demo04;

/**
 * 具体宠物
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Dog extends Animal implements IWenShun {


    public Dog() {
    }

    public Dog(String name) {
       super(name);
    }



    /**
     * 叫
     */
    public void call() {
        System.out.println("汪汪");
    }
}
