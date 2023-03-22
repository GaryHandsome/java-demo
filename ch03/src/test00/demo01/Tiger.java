package test00.demo01;

/**
 * 具体宠物
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Tiger {
    /**
     * 名称
     */
    private String name ;

    public Tiger() {
    }

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 吼
     */
    public void kong() {
        System.out.println("吼...");
    }
}
