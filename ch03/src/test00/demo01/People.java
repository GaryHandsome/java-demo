package test00.demo01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 定义主人类 - 泛型类 - 参数化不同的动物 - 表示主人可以带着各种动物去逛街
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class People<P> {

    /**
     * 定义宠物 - ？ - P - 使用泛型参数化各种动物
     */
    private P pet;

    public P getPet() {
        return pet;
    }

    /**
     * 设置主人具体带哪个动物去逛街
     *
     * @param pet
     */
    public void setPet(P pet) {
        this.pet = pet;
    }

    public People() {
    }

    /**
     * 重载构造方法，初始化主人具体带哪个动物去逛街
     *
     * @param pet
     */
    public People(P pet) {
        this.pet = pet;
    }

    /**
     * 逛街行为
     */
    public void shopping() {



        // 第一：获取类的Class对象
        Class petClass = pet.getClass();

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        try {
            // 1.获取方法对象
            Method callMethod = petClass.getMethod("call");
            Method getNameMethod = petClass.getMethod("getName");

            // 2.调用方法
            String name = (String)getNameMethod.invoke(pet);
            System.out.println("主人带宠物["+name+"]逛街");

            callMethod.invoke(pet);

        } catch (NoSuchMethodException e) {

            System.out.println("此动物不会叫，只会吼！");
        } catch (Exception e) {
            System.out.println("系统繁忙，请联系管理员");
        }
    }
}
