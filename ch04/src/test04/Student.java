package test04;

/**
 * @Date 2023-03-27
 * @Author zqx
 */
public class Student {

    @Hello(msg="天天向上")
    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
