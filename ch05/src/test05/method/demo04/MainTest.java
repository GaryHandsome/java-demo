package test05.method.demo04;

/**
 * @Date 2023-04-07
 * @Author zqx
 */
public class MainTest {

    /**
     * 构造学生对象 - 函数式接口作为方法参数的使用
     *
     * @param name
     * @param age
     * @param sb
     * @return
     */
    private static Student build(String name,
                                 int age,
                                 StudentBuilder sb) {
        return sb.create(name, age);
    }

    public static void main(String[] args) {
        // 1.匿名内部类
        Student stu1 = build("张三", 18, new StudentBuilder() {
            @Override
            public Student create(String name, int age) {
                // 调用构造方法
                return new Student(name,age);
            }
        });
        System.out.println(stu1);

        // 2.Lambda表达式实现 - Student create(String name,int age) ;
        Student stu2 = build("李四",28,(name,age)->new Student(name,age)) ;
        System.out.println(stu2);

        // 3.构造方法的引用 - 类名::new
        Student stu3 = build("王五",38,Student::new) ;
        System.out.println(stu3);


    }
}
