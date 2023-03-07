package org.ch00.test01;

/**
 * 测试类
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第二：实例化对象
        Student zs = new Student() ;

        // 第三：初始化对象
        zs.setName("张三");
        zs.setAge(18);
        zs.setSex("男");

        // Student zs = new Student("张三",18,"男") ;

        // 第四：操作
        zs.study("Java高级",2);
        double r = zs.getHe(1,1) ;
        System.out.println(r);
    }
}
