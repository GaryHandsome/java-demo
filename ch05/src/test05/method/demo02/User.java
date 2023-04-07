package test05.method.demo02;

/**
 * 用户
 *
 * @Date 2023-04-07
 * @Author zqx
 */
public class User {

    /**
     * 函数式接口作为方法参数的使用
     *
     * @param name
     * @param iWenHou
     */
    public void wenHao(String name, IWenHou iWenHou) {
        iWenHou.sayHello(name);
    }

    /**
     * 问候 - 早上好 - 成员方法
     *
     * @param name
     */
    public void goodMorning(String name) {
        System.out.println("早上好，" + name);
    }

    /**
     * 问候 - 下午好 - 静态方法
     *
     * @param name
     */
    public static void goodAfternoon(String name) {
        System.out.println("下午好," + name);
    }

    public static int goodNight() {
        System.out.println("晚安");
        return 8 ;
    }
}
