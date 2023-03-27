package test03;

/**
 * @Date 2023-03-27
 * @Author zqx
 */
@HelloWorld
public class Student {

    @HelloWorld
    private String name ;
    private int sex ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @HelloWorld
    public void study(int hour) {
        System.out.println("学习");
    }


}
