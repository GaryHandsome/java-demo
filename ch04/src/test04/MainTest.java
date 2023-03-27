package test04;

/**
 * 使用反射解析类中注解
 *
 * @Date 2023-03-27
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：获取类的Class对象
        Class<Student> clazz = Student.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.判断是否存在注解
        boolean isExist = clazz.isAnnotationPresent(Hello.class);

        if(isExist) {
            // 2.获取类定义的注解对象
            Hello annotation = clazz.getAnnotation(Hello.class);

            // 3.获取注解成员的数据 - 注解对象.成员名称() ;
            String msg = annotation.msg();
            System.out.println(msg);

            // 4.获取注解的信息，根据需求实现一些逻辑功能
            if("优秀".equals(msg)) {
                System.out.println("送你一个棒棒糖");
            } else {
                System.out.println("送你一巴掌");
            }
        } else {
            System.out.println("类中并没有使用@Hello这个注解");
        }


    }
}
