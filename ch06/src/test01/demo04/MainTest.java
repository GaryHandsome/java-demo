package test01.demo04;

/**
 * @Date 2023-04-17
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("张三");
        // 使用枚举常量 - 语法：枚举名称.枚举常量
        s.setGrade(Grade.A);

        System.out.println(s);

        // 调用成员方法
        s.getGrade().test01();

        // 调用成员方法
        Grade.test02();
    }
}
