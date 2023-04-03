package test03.yufa.demo03;

/**
 * 测试 - 如果有多个参数，圆括号不能省略
 *
 * @Date 2023-04-03
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // void test(String name,int age,String sex);
        InterfaceTest it = (name, age, sex) -> {
            System.out.println("姓名：" + name);
            System.out.println("年龄：" + age);
            System.out.println("性别：" + sex);
        };

        it.test("张三", 18, "男");
    }
}
