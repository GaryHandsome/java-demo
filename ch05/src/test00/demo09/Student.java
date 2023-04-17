package test00.demo09;

/**
 * @Date 2023-04-17
 * @Author zqx
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名:" + this.name;
    }
}
