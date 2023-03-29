package test00.demo03;

import java.util.Arrays;

/**
 * 学生
 *
 * @Date 2023-03-29
 * @Author zqx
 */
@SetData(hobby = {"吃", "喝", "玩", "乐"}, sex = "男,女,male,female")
public class Student {
    private String name;
    private String sex;
    private String[] hobby;

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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "，性别：" + this.sex + "，爱好：" + Arrays.toString(this.hobby);
    }
}
