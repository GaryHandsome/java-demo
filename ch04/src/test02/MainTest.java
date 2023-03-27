package test02;

import java.util.Date;

/**
 * @Date 2023-03-27
 * @Author zqx
 */
@SuppressWarnings("all")
public class MainTest {
    public static void main(String[] args) {
        Date now = new Date() ;

        // @Deprecated表示方法已经过时，可能存在案例隐患，不建议用户去使用
        // 一般，过时方法一般都会提供相关的替代
        // System.out.println(now.getYear() + 1900);

        Animal.test01();

        // 注意：在同一个类中，不显示删除线
        MainTest.test02();
    }

    @Deprecated
    public static void test02() {
        System.out.println("此方法标记为过时，不建议使用");
    }




}
