package test00.demo04;

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

    }


    /**
     * 体检 - 健康情况 - 反射解析注解
     *
     * @param animal
     */
    public void tiJiang(T animal) {

    }
}
