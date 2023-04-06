package test00.demo04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * 函数式接口作为方法参数的使用
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {

    /**
     * 函数式接口作为方法参数的使用
     * <p>
     * 说明：函数式接口用在方法参数的目的是为了做一些封装，实现一些逻辑处理
     *
     * @param supplier
     */
    private static void getMin(Supplier<Student> supplier) {
        // 1.获取 Supplier 接口生产的数据
        Student minStudent = supplier.get();

        // 2.对数据进行相关的逻辑处理...
        System.out.println("最年轻的学生为：");
        System.out.println(minStudent);
    }


    public static void main(String[] args) {

        Student[] arr = {
                new Student("张三",18) ,
                new Student("李四",48) ,
                new Student("王五",28) ,
                new Student("赵六",38) ,
        } ;

        // 1.匿名内部类实现
        getMin(new Supplier<Student>(){
            @Override
            public Student get() {
                // int compare(T o1, T o2);
                Arrays.sort(arr,(stu1, stu2)->stu1.getAge()-stu2.getAge());
                return arr[0];
            }
        }) ;

        // 2.Lambda表达式 - T get();
        getMin(()->{
            // Arrays.sort(arr,(stu1, stu2)->stu1.getAge()-stu2.getAge());
            Arrays.sort(arr, Comparator.comparingInt(Student::getAge));
            return arr[0];
        }) ;


    }
}
