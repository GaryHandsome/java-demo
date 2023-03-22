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
public class MainTest02 {
    public static void main(String[] args) {
        // 实例化一个List集合对象 - 如果不指定具体类型，则默认为 Object
        List<String> list = new ArrayList<String>();

        // 此时的集合，可以添加任意类型的数据

        list.add("好好学习");
        list.add("天天向上");
        list.add("必须滴...");


        // 好处：规范化数据、不需要类型转换、性能上去
        String msg = list.get(2);
        System.out.println(msg);
    }
}
