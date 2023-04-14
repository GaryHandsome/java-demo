package test07.stream.test10;

/**
 * 学生
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private String sex ;

    public Student() {
    }

    public Student(String name, int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex ;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.age + "-" + this.sex;
    }
}
