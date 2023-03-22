package test01.demo02;

/**
 * 定义一个类，实现 所有 类型数据的封装
 *
 * 封装数据是方便的，但获取数据就需要类型转换
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class ObjectTest {

    /**
     * 定义 Object 类型的数据，用于封装所有类型的数据 - Object是所有对象的父类 - 父类对象可以接收所有的子类对象
     */
    private Object data ;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
