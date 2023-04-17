package test01.demo02;

/**
 * @Date 2023-04-17
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Student s = new Student();

        // 错误，Grade不能在类外实例化对象
        // Grade f = new Grade("F") ;

        s.setName("张三");
        s.setGrade(Grade.A);

        System.out.println(s);
    }
}
