package test03;

/**
 * 小学生
 *
 * @Date 2023-03-27
 * @Author zqx
 */
public class XiaoStudent extends Student {
    /**
     * 重写父类的方法 - 思考一下，子类的study方法是否存在@HelloWorld注解
     *
     * @param hour
     */
    public void study(int hour) {
        System.out.println("学习");
    }
}
