package test00.demo04;

import java.lang.reflect.Method;

/**
 * 思考：饲养员服务的对象是谁？ - 泛型 - 泛型边界（上限）
 * <p>
 * GeZi  xxx
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class SiYangYuan<T extends Animal> {
    /**
     * 喂养
     *
     * @param animal
     */
    public void weiYang(T animal) {
        System.out.println("拿出食物...");
        animal.eat();
        System.out.println("喂养完成!");
    }

    /**
     * 巡查 - 睡眠情况 - 反射解析注解
     *
     * @param animal
     */
    public void xunCha(T animal) {
        // 1.获取要操作类的 Class 对象
        Class<? extends Animal> clazz = animal.getClass();

        // 2.使用 Class 对象的API方法，获取类的信息，进而进行相关的操作

        try {
            // 2.1） 获取 sleep 方法对象
            Method sleepMethod = clazz.getMethod("sleep");

            // 2.2）判断 sleep 方法上面是否存在 ShuiMianQingKuang 注解
            boolean isExist = sleepMethod.isAnnotationPresent(ShuiMianQingKuang.class);
            if(isExist) {
                // 2.3）获取 ShuiMianQingKuang 注解
                ShuiMianQingKuang annotation = sleepMethod.getAnnotation(ShuiMianQingKuang.class);

                // 2.4）获取 ShuiMianQingKuang 注解的内容
                String shuiMianQingKuang = annotation.value();

                // 2.5）进行相关的逻辑处理
                if("失眠".equals(shuiMianQingKuang)) {
                    System.out.println("给你一颗安眠药...");
                    return ;
                }
                System.out.println("继续巡查其它问题...");
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 体检 - 健康情况 - 反射解析注解
     *
     * @param animal
     */
    public void tiJiang(T animal) {
        // 1.获取要操作类的 Class 对象
        Class<? extends Animal> clazz = animal.getClass();

        // 2.使用 Class 对象的API方法，获取类的信息，进而进行相关的操作
        // 2.1）判断动物类上面是否存在 JianKangQingKuang 注解
        boolean isExist = clazz.isAnnotationPresent(JianKangQingKuang.class);
        if(isExist) {
            // 2.2）获取 JianKangQingKuang 注解
            JianKangQingKuang annotation = clazz.getAnnotation(JianKangQingKuang.class);

            // 2.3）获取 JianKangQingKuang 注解的内容
            String jianKangQingKuang = annotation.value();

            // 2.4）进行相关的逻辑处理
            if("差".equals(jianKangQingKuang)) {
                System.out.println("身体有毛病，需要特别照看...");
                return ;
            }
            System.out.println("继续体检下一动物...");
        }
    }
}
