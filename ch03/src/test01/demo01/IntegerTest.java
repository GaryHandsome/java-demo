package test01.demo01;

/**
 * 定义一个类，实现 boolean 类型数据的封装
 *
 * 增加需求，需要对 Integer 类型的数据进行封装 - 新增一个类（IntegerTest）
 *
 * 同理，如果需求中还要继续的封装相关类型的数据，则需要新增相关的类 - 类爆炸，不便于维护
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class IntegerTest {
    /**
     * 定义 Integer 类型的数据
     */
    private Integer data ;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
