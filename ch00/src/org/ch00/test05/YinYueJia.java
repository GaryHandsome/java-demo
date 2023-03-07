package org.ch00.test05;

/**
 * 音乐家
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class YinYueJia {
    /**
     * 使用各种乐器 演奏 - 把所有的乐器抽象为父类（YueQi）
     * YueQi yq = jt = new JiTa();
     */
    public void yanZou(YueQi yq) {
        System.out.println("鞠个躬，开始演奏");
        yq.sound();
        System.out.println("结束，谢谢大家");
    }


}
