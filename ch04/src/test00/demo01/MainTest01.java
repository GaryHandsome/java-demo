package test00.demo01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) throws Exception {
        // 第一：实例化学生对象
        Student stu = new Student("张三", 12);

        // 第二：解决源代码中的注解 - 反射
        // 1.获取要操作类的class对象
        Class<Student> clazz = Student.class;
        // MinData annotation1 = clazz.getAnnotation(MinData.class);

        // 2.调用相关的API方法，获取类的相关信息(Field、Method、Constructor、Annotation)，进而进行相关操作
        Field ageField = clazz.getDeclaredField("age");
        Method ageMethod = clazz.getDeclaredMethod("setAge", int.class);

        // 3.获取 age 字段上面的注解
        MinData fieldAnnotation = ageField.getAnnotation(MinData.class);
        MinData methodAnnotation = ageMethod.getAnnotation(MinData.class);


        // 4.获取注解的内容
        int fieldAge = fieldAnnotation.value();
        int methodAge = methodAnnotation.value();

        // 5.根据需求，进行相关的逻辑处理
        if (stu.getAge() < fieldAge || stu.getAge() < methodAge) {
            throw new RuntimeException("年龄不能低于：" + (fieldAge < methodAge ? fieldAge : methodAge));
        }

        // 第三：打印输出学生对象
        System.out.println(stu);
    }
}
