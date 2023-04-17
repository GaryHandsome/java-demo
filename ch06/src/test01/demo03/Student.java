package test01.demo03;

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
     * 等级枚举
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
