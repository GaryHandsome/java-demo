package test00.demo05;

/**
 * 测试 自定义 ArrayList
 *
 * @Date 2023-03-24
 * @Author zqx
 */
public class MainTest04 {
    public static void main(String[] args) {
        // 第一：实例化 MyArrayList 对象
        MyArrayList<String> list = new MyArrayList<>();

        // 第二：操作
        list.add("AA");
        list.add("BB");

        list.remove(0) ;

        System.out.println("集合元素有：" + list);
        System.out.println("大小：" + list.size());
        System.out.println("是否为空：" + list.isEmpty());
    }
}
