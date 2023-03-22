package test03.demo02;

/**
 * 第一：定义泛型类 - 包含多个泛型
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class GenericTest<T1,T2> {
    private T1 data1 ;
    private T2 data2 ;


    public GenericTest() {}

    public GenericTest(T1 data1,T2 data2) {
        this.data1 = data1 ;
        this.data2 = data2 ;
    }


    public T1 getData1() {
        return data1;
    }

    public void setData1(T1 data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }
}
