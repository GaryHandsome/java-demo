package test00.demo04;

/**
 * 哺乳动物饲养员 - 是一个饲养员 - extends SiYangYuan
 * <p>
 * 思考：哺乳动物饲养员可以饲养鸽子、鲨鱼 ？ - 不能
 * <p>
 * 要求：哺乳动物饲养员 只能 饲养哺乳动物
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class BuRuAnimalSiYangYuan<T extends BuRuAnimal> extends SiYangYuan<BuRuAnimal> {
    /**
     * 正常情况下，子类继承父类，则拥有父类的特性
     * 同时，子类也应该扩展自己的特性
     * 在这里，只对喂养方法进行增强
     *
     * @param animal
     */
    @Override
    public void weiYang(BuRuAnimal animal) {
        System.out.println("准备哺乳动物的饲料");
        super.weiYang(animal);
    }

    // ....
}
