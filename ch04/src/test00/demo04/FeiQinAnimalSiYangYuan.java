package test00.demo04;

/**
 * 飞禽动物饲养员 - 是一个饲养员 - extends SiYangYuan
 * <p>
 * 要求：飞禽动物饲养员 只能 飞禽动物
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class FeiQinAnimalSiYangYuan<T extends FeiQinAnimal> extends SiYangYuan<FeiQinAnimal> {
    /**
     * 正常情况下，子类继承父类，则拥有父类的特性
     * 同时，子类也应该扩展自己的特性
     * 在这里，只对喂养方法进行增强
     *
     * @param animal
     */
    @Override
    public void weiYang(FeiQinAnimal animal) {
        System.out.println("准备飞禽动物的饲料");
        super.weiYang(animal);
    }

    // ....
}
