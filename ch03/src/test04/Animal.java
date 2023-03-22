package test04;

/**
 * 泛型父类
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class Animal<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
