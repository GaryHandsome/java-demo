package test02.functional.demo01;

/**
 * 定义 函数式 接口
 *
 * @FunctionalInterface 与 @Override一样，起到编译检查的作用
 * 用于显式声明接口为 函数式接口
 *
 * @Date 2023-04-03
 * @Author zqx
 */
@FunctionalInterface
public interface InterfaceTest {
    void sayHello(String name) ;
}
