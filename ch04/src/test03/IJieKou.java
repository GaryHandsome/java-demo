package test03;

/**
 * 注解使用在接口中
 *
 * @Date 2023-03-27
 * @Author zqx
 */
@HelloWorld
public interface IJieKou {

    /**
     * 方法
     *
     * @param name
     */
    void sayHello(@HelloWorld String name);
}
