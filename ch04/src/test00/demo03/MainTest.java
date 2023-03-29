package test00.demo03;

/**
 * 对注解进行解析 - 反射
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：实例化学生对象
        Student stu = new Student();
        stu.setName("张三");
        stu.setSex("male");


        // 第二：解析注解
        // 1.获取要操作类的 Class 对象
        Class<Student> clazz = Student.class;

        // 2.调用Class对象的API方法，获取类的相关信息，进而做相关的操作
        // 2.1）判断类上是否存在 SetData 注解
        boolean isExist = clazz.isAnnotationPresent(SetData.class);
        if (isExist) {
            // 2.2）获取类上面定义的 SetData 注解
            SetData setDataAnnotation = clazz.getAnnotation(SetData.class);

            // 2.3）获取 SetData 注解中的内容
            String checkSex = setDataAnnotation.sex();
            String[] hobby = setDataAnnotation.hobby();
            stu.setHobby(hobby);

            // 2.4）加工处理 - 实现一些逻辑操作
            String[] arr = checkSex.split(",");

            // 约定性别默认是非法的
            boolean flag = false;

            for (String s : arr) {
                if (s.equals(stu.getSex())) {
                    // 用户设置的性别是包含在约定的性别中 - true - 合法
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                // 在实际开发中，程序员需要在这里自定义异常，表示业务相关的错误
                throw new RuntimeException("性别不在约定的范围内[" + checkSex + "]，当前的性别值为：" + stu.getSex());
            }
        }

        // 第三：打印输出学生对象
        System.out.println(stu);
    }
}
