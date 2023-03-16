package test01;

/**
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 类实例对象时，都会使用类背后的Class对象来实例化具体对象
        Student zs = new Student();
        Student ls = new Student();

        Class clazz1 = zs.getClass();
        Class clazz2 = ls.getClass();


        // System.out.println(zs == ls);
        System.out.println(clazz1==clazz2);

    }
}
