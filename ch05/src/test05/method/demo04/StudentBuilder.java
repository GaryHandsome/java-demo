package test05.method.demo04;

/**
 * 构造学生对象的工具类
 *
 * @Date 2023-04-07
 * @Author zqx
 */
@FunctionalInterface
public interface StudentBuilder {
    Student create(String name,int age) ;
}
