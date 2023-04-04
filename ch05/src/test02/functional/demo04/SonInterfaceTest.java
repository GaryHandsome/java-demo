package test02.functional.demo04;

/**
 * 子接口
 *
 * 注意：
 *      在Java中，类不能继承多个父类
 *      但是，接口是可以继承多个父接口
 *
 *
 *      如果继承多个接⼝，且每个接⼝都有相同的 default ⽅法，
 *      则子接口必须重写该 default 方法
 *
 *      如果继承多个接⼝，且每个接⼝都有相同的 static ⽅法，
 *      则子接口不需要重写该 static 方法
 *
 *      因为 static 方法是不会被继承到子接口中
 *
 * @Date 2023-04-04
 * @Author zqx
 */
public interface SonInterfaceTest extends FatherInterfaceTest01, FatherInterfaceTest02 {
    @Override
    default void defaultMethod() {
        System.out.println("子接口必须重写多个父接口相同名称的默认方法");
    }
}
