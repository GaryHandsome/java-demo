package test01.demo02;

/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        ObjectTest ot = new ObjectTest();

        // Object对象可以封装所有类型的数据
        // ot.setData(true);
        // ot.setData(100);
        // ot.setData(3.14);
        ot.setData(3.14F);

        // 缺点：获取数据时，需要类型转换
        Object data = ot.getData();
        float floatData = (float)data ;

        System.out.println(floatData + 1);

    }
}
