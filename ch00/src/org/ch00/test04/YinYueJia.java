package org.ch00.test04;

/**
 * 音乐家
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class YinYueJia {
    /**
     * 使用各种乐器 演奏
     */
    public void yanZou(JiTa jt) {
        System.out.println("鞠个躬，开始演奏");
        jt.sound();
        System.out.println("结束，谢谢大家");
    }

    // 方法重载
    public void yanZou(GanQin gq) {
        System.out.println("鞠个躬，开始演奏");
        gq.sound();
        System.out.println("结束，谢谢大家");
    }

    // 注意：使用方法重载虽然可以实现需求，
    // 但是每次增加新的乐器时，都必须要维护音乐家这个对象
    // 不便于程序的扩展、维护 - 多态
}
