package test00.demo05;

/**
 * 测试 自定义 ArrayList
 *
 * @Date 2023-03-24
 * @Author zqx
 */
public class MainTest05 {
    public static void main(String[] args) {
        // 第一：实例化 MyArrayList 对象
        MyArrayList<String> list = new MyArrayList<>();

        // 第二：操作
        // 1.添加元素
        list.add("AA");
        list.add("BB");
        list.add("CC");

        // 2.获取下标索引对应的元素
        String s1 = list.get(0);

        // 3.修改下标索引对应的元素
        String oldValue = list.set(1, "好好学习，天天向上");

        System.out.println(s1);
        System.out.println(oldValue);
        System.out.println(list);

        System.out.println("------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
