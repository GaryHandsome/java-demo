package test01.demo02;

/**
 * 等级 - 把具体的等级封装为一个对象
 *
 * @Date 2023-04-17
 * @Author zqx
 */
public class Grade {
    /**
     * 等级的描述 - 优秀、良好、....
     */
    private String value;

    // 私有化构造方法，不允许在类外实例化对象
    private Grade() {
    }

    private Grade(String value) {
        this.value = value;
    }

    // 在类的内部，实现化五个对象 - 分别表示五个等级
    public static final Grade A = new Grade("优秀");
    public static final Grade B = new Grade("良好");
    public static final Grade C = new Grade("中等");
    public static final Grade D = new Grade("合格");
    public static final Grade E = new Grade("不合格");

    @Override
    public String toString() {
        return this.value;
    }
}
