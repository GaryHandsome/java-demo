package test05;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        Class<Student> clazz = Student.class;

        Hello annotation = clazz.getAnnotation(Hello.class);

        System.out.println(annotation.msg());
        System.out.println(annotation.maxData());
    }
}
