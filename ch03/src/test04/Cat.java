package test04;

/**
 * 子类 - 继承泛型父类 - 同时，子类也可以定义为泛型类
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Cat<T1, T2> extends Animal<Integer> {
    private T1 data1;
    private T2 data2;

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
