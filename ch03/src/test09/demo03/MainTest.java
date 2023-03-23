package test09.demo03;


/**
 * 接口边界
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        //GenericTest<Integer> gt1 = new GenericTest<>() ;
        //GenericTest<ThreeNoImpl> gt2 = new GenericTest<>() ;

        // 接口本身
        GenericTest<IJieKou> gt3 = new GenericTest<>() ;

        // 接口的实现类
        GenericTest<OneImpl> gt4 = new GenericTest<>() ;
        GenericTest<TwoImpl> gt5 = new GenericTest<>() ;

    }
}
