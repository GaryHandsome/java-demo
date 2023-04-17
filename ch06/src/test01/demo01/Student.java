package test01.demo01;

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
     * 等级：必须只能是 A B C D E 五种级别
     */
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    /**
     * 学生的等级必须取值：A、B、C、D、E - 通过正则表达式验证
     * @param grade
     */
    public void setGrade(String grade) {
        if (!grade.matches("[ABCDE]")) {
            throw new RuntimeException("等级只能是A B C D E");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + ",等级：" + this.grade;
    }
}
