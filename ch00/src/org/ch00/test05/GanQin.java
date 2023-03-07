package org.ch00.test05;

/**
 * 钢琴
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class GanQin extends YueQi{

    /**
     * 子类重写父类的方法 - 子类实现自己应该有的功能 - 钢琴发出声音
     * 或通过子类扩展功能
     */
    public void sound() {
        super.sound();
        System.out.println("钢琴声音...");
    }
}
