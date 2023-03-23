package test08;

/**
 * 宠物 - 泛型类
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class Pet<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
