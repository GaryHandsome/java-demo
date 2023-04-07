package test05.method.demo02;

/**
 * 方法引用有以下几个分类
 * 1、成员方法的引用
 * 2、静态方法的引用
 * 3、父类方法引用
 * 4、本类方法引用
 * 5、特定类型方法的引用
 * 6、构造方法的引用
 * 7、数组引用
 *
 *
 * @Date 2023-04-07
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        User user = new User() ;

        // 1.匿名内部类
        user.wenHao("张三",new IWenHou(){
            @Override
            public void sayHello(String name) {
                System.out.println("你好呀，" + name);
            }
        });

        // 2.Lambda表达式 - void sayHello(String name);
        user.wenHao("李四",(name)->System.out.println("你好呀，" + name));

        // 3.方法引用
        // 3.1引用静态方法
        user.wenHao("王五",User::goodAfternoon);

        // 3.2引用成员方法
        user.wenHao("赵六",user::goodMorning);

        // user.wenHao("赵六",User::goodNight);
    }
}
