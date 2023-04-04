package test00.demo01;

/**
 * 函数式接口的使用方式一：传统的用法
 *      接口 对象 = new 实现类() ;
 *
 * 提高程序的扩展性 - 加一个实现类
 * 提高程序的维护性 - 找到对应的实现类及相关的方法进行维护
 *
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 使用相同的接口对象，通过切换不同的实现类，可以实现不同的功能
        InterfaceTest it = new InterfaceTestJiaImpl() ;
        int r = it.jiSuan(10, 2);
        System.out.println(r);
    }
}
