package test01.demo05;

/**
 * 等级 - 各枚举常量指定具体的中文表示
 *
 * @Date 2023-04-17
 * @Author zqx
 */
public enum Grade {
    /**
     * 枚举常量 - 当前枚举类实现化的对象
     *
     * Grade A = new Grade("优秀") {
     *     // 重写枚举类中的抽象方法
     * }
     * <p>
     * 语法：枚举名称(实参列表)
     */
    A("优秀"){
        @Override
        public String getScoreRange() {
            return "成绩>=90 and 成绩<=100";
        }
    },
    /**
     * 成绩>=80 and 成绩<90 - 等级为 B
     */
    B("良好"){
        @Override
        public String getScoreRange() {
            return "成绩>=80 and 成绩<90";
        }
    },
    C("中等"){
        @Override
        public String getScoreRange() {
            return "成绩>=70 and 成绩<80";
        }
    },
    D("合格"){
        @Override
        public String getScoreRange() {
            return "成绩>=60 and 成绩<70";
        }
    },
    E("不合格"){
        @Override
        public String getScoreRange() {
            return "成绩>=0 and 成绩<60";
        }
    };

    /**
     * 等级的中文描述 - 成员变量
     */
    private String value;

    /**
     * 枚举构造方法的访问修饰符默认为 private
     */
    Grade() {
    }

    /**
     * 重载构造方法
     *
     * @param value
     */
    Grade(String value) {
        this.value = value;
    }

    // 重写 toString 方法 - 返回枚举常量的中文表示
    @Override
    public String toString() {
        return this.value;
    }

    /**
     * 成员方法 - 对象.方法名()
     */
    public void test01() {
        System.out.println("成员方法");
    }

    /**
     * 静态方法 - 类名.方法名() ;
     */
    public static void test02() {
        System.out.println("静态方法");
    }

    /**
     * 抽象方法 - 返回各个等级的分数区间
     *
     * @return
     */
    public abstract String getScoreRange();
}
