package test00.demo03;

/**
 * 具体宠物 - 温顺
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Cat implements IWenShun{
    /**
     * 名称
     */
    private String name ;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 叫
     */
    public void call() {
        System.out.println("喵喵");
    }
}
