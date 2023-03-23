package test08;

/**
 * 主人 - 泛型类
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class People<T> {

    /**
     * 定义主人所养的宠物
     *
     * 嵌套泛型：在泛型类中使用另一个泛型类 -- 泛型类People嵌套使用泛型类Pet
     *
     * 注意：在这里，泛型类Pet指定的泛型为String
     */
    private Pet<String> pet ;

    public Pet<String> getPet() {
        return pet;
    }

    public void setPet(Pet<String> pet) {
        this.pet = pet;
    }
}
