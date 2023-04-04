package test00.demo01;

/**
 * 函数式接口的使用方式三：Lambda表达式 - 函数式接口中抽象方法的实现
 * 第一：把函数式接口中抽象方法拷贝出来做为参考
 * <p>
 * 第二：编写 Lambda 表达式
 * (参数列表) -> {方法体}
 * <p>
 * 第三：简化
 *
 *
 *
 *
 * <p>
 * 提高程序的扩展性 - 加一个实现类
 * 提高程序的维护性 - 找到对应的实现类及相关的方法进行维护
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        // 第一：把函数式接口中抽象方法拷贝出来做为参考
        // int jiSuan(int a, int b);

        // 第二：编写 Lambda 表达式：(参数列表) -> {方法体}
        InterfaceTest it1 = (a, b) -> a + b;
        System.out.println(it1.jiSuan(1, 1));

        InterfaceTest it2 = (a, b) -> {
            if (b == 0) {
                throw new RuntimeException("除数不能为0");
            }
            return a / b;
        };
        System.out.println(it2.jiSuan(6, 2));

    }
}
