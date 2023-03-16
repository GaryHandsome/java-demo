package org.ch01.test05.tx.demo04.b;

/**
 * 思考：当前案例只有一个男孩和女孩，如果需要多个男孩和女孩，怎么办呢？
 *
 * 解决：多实例几个线程对象，并使用 notifyAll 通知所有线程
 *
 *
 * 出现BUG - 在集合为空的情况下，女孩子应该 wait ，程序不可能往下执行，不会从集合中删除数据（removeLast） ，并通知男孩子摘水果 -- 在此案例中，并不是这样的 - 虚假唤醒
 *
 * 怎么解决？ 把 if 修改为 while
 *
 * @Date 2023-03-15
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化篮子
        Box box = new Box();

        BoyThread xb = new BoyThread(box, "小白");
        BoyThread xl = new BoyThread(box, "小蓝");


        GirlThread xh = new GirlThread(box, "小花");
        GirlThread xc = new GirlThread(box, "小草");
        GirlThread xz = new GirlThread(box, "小紫");


        xb.start();
        xl.start();
        xz.start();

        xh.start();
        xc.start();
    }
}
