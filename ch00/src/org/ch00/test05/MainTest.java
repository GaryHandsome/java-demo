package org.ch00.test05;

/**
 * 多态的实现 - 面向父类实现
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化对象 - 音乐家
        YinYueJia bdf = new YinYueJia();

        // 实例化子类对象 - 吉它对象、钢琴对象
        JiTa jt = new JiTa();
        GanQin gq = new GanQin();
        YueQi xtq = new XiaoTiQin();

        // 演奏
        // bdf.yanZou(jt);
        // bdf.yanZou(gq);
        bdf.yanZou(xtq);
    }
}
