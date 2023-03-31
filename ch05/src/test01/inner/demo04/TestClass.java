package test01.inner.demo04;

/**
 * 接口另外两种特殊的用法
 * 1）接口作为方法参数的使用
 * 2）接口作为方法返回值的使用
 *
 * @Date 2023-03-31
 * @Author zqx
 */
public class TestClass {

    /**
     * 接口作为方法的参数使用
     *
     * @param iJieKou
     */
    public void wenHou(IJieKou iJieKou) {
        String msg = iJieKou.sayHello("张三");
        System.out.println(msg);
    }


    /**
     * 接口作为方法返回值的使用 - 传统用法
     *
     * @return
     */
    public IJieKou message1() {
        IJieKou ijk = new IJieKouImpl();
        return ijk;
    }

    /**
     * 接口作为方法返回值的使用 - 匿名内部类
     *
     * @return
     */
    public IJieKou message2() {

        return new IJieKou() {
            @Override
            public String sayHello(String name) {
                return "Hello," + name;
            }
        };
    }

    /**
     * 接口作为方法返回值的使用 - 匿名内部类
     *
     * @return
     */
    public IJieKou message3() {

        return name -> "Hello," + name;
    }


}
