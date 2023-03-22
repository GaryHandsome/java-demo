package test01.demo03;

/**
 * 定义一个类，实现任意类型的数据封装 - 泛型
 *      1）只写一个类，不要写那么多的类
 *      2）获取数据时，不要类型转换
 *
 * 泛型定义在类中，则此类就变成了泛型类
 *
 *
 * 泛型的概念：泛型就是变量类型的参数化 - 使得变量的数据类型是动态的
 *
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class GenericTest<T> {
    private T data ;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
