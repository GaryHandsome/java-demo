package test00.demo04;

/**
 * 具体宠物
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Tiger extends Animal{


    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }


    /**
     * 吼
     */
    public void kong() {
        System.out.println("吼...");
    }
}
