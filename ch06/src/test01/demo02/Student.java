package test01.demo02;

/**
 * 学生
 *
 * @Date 2023-04-17
 * @Author zqx
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 等级对象 - 在等级对象内部中已经定义好五个等级，
     * 用户只能使用内部定义好的五个等级对象
     */
    private Grade grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + ",等级：" + this.grade;
    }
}
