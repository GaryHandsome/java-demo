package test07;

import java.lang.reflect.Array;

/**
 * 泛型数组的使用
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class GenericTest<T> {
    /**
     * 使用泛型声明了数组 - 注意：不能实例化泛型数组
     * private T[] arr = new T[5];
     * <p>
     * 解决办法：
     * 1）setter方法
     * 2）Array.newInstance(类型的class对象,长度) ;
     */
    private T arr[];

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    /**
     * 实例化泛型数组
     */
    public void createArr(Class<?> clazz, int len) {
        Object obj = Array.newInstance(clazz, len);
        this.arr = (T[])obj ;
    }
}
