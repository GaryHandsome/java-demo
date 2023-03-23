package test00.demo02;

import java.lang.reflect.Constructor;

/**
 * 泛型方法实现
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class ObjectUtil02 {
    /**
     * 基于某个类的默认构造方法实例化对象
     *
     * @param clazz
     * @return
     */
    public <T> T create(Class<T> clazz) {
        try {
            // 第一：获取类的构造方法对象 - 默认构造方法
            Constructor<T> constructor = clazz.getConstructor();
            // 第二：通过构造方法对象，实例化对象
            return constructor.newInstance();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
