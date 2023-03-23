package test00.demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 泛型类 - 实例化某个类的对象
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class ObjectUtil<T> {
    /**
     * 基于某个类的默认构造方法实例化对象
     *
     * @param clazz
     * @return
     */
    public T create(Class<T> clazz) {
        T obj = null;
        try {
            // 第一：获取类的构造方法对象 - 默认构造方法
            Constructor<T> constructor = clazz.getConstructor();
            // 第二：通过构造方法对象，实例化对象
            obj = constructor.newInstance();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
