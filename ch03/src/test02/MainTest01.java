package test02;

import java.util.ArrayList;
import java.util.List;

/**
 * 刚刚是我们自己定义的泛型类
 * <p>
 * 在JDK中，也提供了相关的泛型类、泛型接口、泛型方法 - List、ArrayList..
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 实例化一个List集合对象 - 如果不指定具体类型，则默认为 Object
        List list = new ArrayList();

        // 此时的集合，可以添加任意类型的数据
        list.add(100);
        list.add(true) ;
        list.add("好好学习");
        list.add(3.14) ;

        // 缺点：获取数据时，需要类型转换 - 性能
        String msg = (String)list.get(2);
        System.out.println(msg);
    }
}
