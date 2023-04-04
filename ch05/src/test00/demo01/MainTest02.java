package test00.demo01;

/**
 * 函数式接口的使用方式二：匿名内部类
 * 接口 对象 = new 接口(){
 *      接口抽象方法的实现
 * } ;
 * <p>
 * 提高程序的扩展性 - 加一个实现类
 * 提高程序的维护性 - 找到对应的实现类及相关的方法进行维护
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 通过匿名内部类实现接口 - 只使用一次
        InterfaceTest it1 = new InterfaceTest() {
            @Override
            public int jiSuan(int a, int b) {
                return a * b;
            }
        };

        System.out.println(it1.jiSuan(2, 3));


        InterfaceTest it2 = new InterfaceTest() {
            @Override
            public int jiSuan(int a, int b) {
                return (int)Math.pow(a,b);
            }
        };

        System.out.println(it2.jiSuan(2, 3));

    }
}
