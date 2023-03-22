package test03.demo02;


/**
 * @Date 2023-03-22
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第二：实例化泛型类对象 - 并指定具体的泛型类型
        GenericTest<Integer,Double> gt1 = new GenericTest<>(100,3.14);

        GenericTest<Integer,Double> gt2 = new GenericTest<>();
        gt2.setData1(200);
        gt2.setData2(5.1);

        System.out.println(gt1.getData1() + gt1.getData2());
        System.out.println(gt2.getData1() + gt2.getData2());

    }
}
