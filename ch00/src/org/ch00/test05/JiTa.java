package org.ch00.test05;

/**
 * 吉它
 *
 * @Date 2023-03-07
 * @Author zqx
 */
public class JiTa extends YueQi{
    /**
     * 子类重写父类的方法 - 子类实现自己应该有的功能 - 吉它发出声音
     * 或通过子类扩展功能
     */
    public void sound() {
        super.sound();
        System.out.println("吉它声音...");
    }
}
