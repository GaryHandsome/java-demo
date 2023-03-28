package test00.demo01;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
public class Student {
    private String name;

    @MinData(value = 38)
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @MinData(value = 28)
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + ",年龄：" + this.age;
    }
}
