package test01.demo03;

/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化一个泛型类对象，一般要指定具体的数据类型，如果没有指定，则默认为Object
        // GenericTest gt1 = new GenericTest() ;
        // gt1.setData(100);

        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setData("好好学习") ;
        String msg = gt2.getData();
        System.out.println(msg);

        GenericTest<Integer> gt3 = new GenericTest<Integer>();
        gt3.setData(100);
        Integer score = gt3.getData();
        System.out.println(score);
    }
}
